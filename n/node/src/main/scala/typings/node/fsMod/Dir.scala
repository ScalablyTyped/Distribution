package typings.node.fsMod

import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fs", "Dir")
@js.native
open class Dir ()
  extends StObject
     with AsyncIterable[Dirent] {
  
  /**
    * Asynchronously close the directory's underlying resource handle.
    * Subsequent reads will result in errors.
    *
    * A promise is returned that will be resolved after the resource has been
    * closed.
    * @since v12.12.0
    */
  def close(): js.Promise[Unit] = js.native
  def close(cb: NoParamCallback): Unit = js.native
  
  /**
    * Synchronously close the directory's underlying resource handle.
    * Subsequent reads will result in errors.
    * @since v12.12.0
    */
  def closeSync(): Unit = js.native
  
  /**
    * The read-only path of this directory as was provided to {@link opendir},{@link opendirSync}, or `fsPromises.opendir()`.
    * @since v12.12.0
    */
  val path: String = js.native
  
  /**
    * Asynchronously read the next directory entry via [`readdir(3)`](http://man7.org/linux/man-pages/man3/readdir.3.html) as an `fs.Dirent`.
    *
    * A promise is returned that will be resolved with an `fs.Dirent`, or `null`if there are no more directory entries to read.
    *
    * Directory entries returned by this function are in no particular order as
    * provided by the operating system's underlying directory mechanisms.
    * Entries added or removed while iterating over the directory might not be
    * included in the iteration results.
    * @since v12.12.0
    * @return containing {fs.Dirent|null}
    */
  def read(): js.Promise[Dirent | Null] = js.native
  def read(
    cb: js.Function2[
      /* err */ (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NodeJS.ErrnoException */ Any) | Null, 
      /* dirEnt */ Dirent | Null, 
      Unit
    ]
  ): Unit = js.native
  
  /**
    * Synchronously read the next directory entry as an `fs.Dirent`. See the
    * POSIX [`readdir(3)`](http://man7.org/linux/man-pages/man3/readdir.3.html) documentation for more detail.
    *
    * If there are no more directory entries to read, `null` will be returned.
    *
    * Directory entries returned by this function are in no particular order as
    * provided by the operating system's underlying directory mechanisms.
    * Entries added or removed while iterating over the directory might not be
    * included in the iteration results.
    * @since v12.12.0
    */
  def readSync(): Dirent | Null = js.native
}

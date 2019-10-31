package typings.node.fsMod

import typings.node.NodeJS.ErrnoException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A class representing a directory stream.
  */
@JSImport("fs", "Dir")
@js.native
class Dir () extends js.Object {
  val path: java.lang.String = js.native
  /**
    * Asynchronously close the directory's underlying resource handle.
    * Subsequent reads will result in errors.
    */
  def close(): js.Promise[Unit] = js.native
  def close(cb: NoParamCallback): Unit = js.native
  /**
    * Synchronously close the directory's underlying resource handle.
    * Subsequent reads will result in errors.
    */
  def closeSync(): Unit = js.native
  /**
    * Asynchronously read the next directory entry via `readdir(3)` as an `Dirent`.
    * After the read is completed, a value is returned that will be resolved with an `Dirent`, or `null` if there are no more directory entries to read.
    * Directory entries returned by this function are in no particular order as provided by the operating system's underlying directory mechanisms.
    */
  def read(): js.Promise[Dirent | Null] = js.native
  def read(cb: js.Function2[/* err */ ErrnoException | Null, /* dirEnt */ Dirent | Null, Unit]): Unit = js.native
  /**
    * Synchronously read the next directory entry via `readdir(3)` as a `Dirent`.
    * If there are no more directory entries to read, null will be returned.
    * Directory entries returned by this function are in no particular order as provided by the operating system's underlying directory mechanisms.
    */
  def readSync(): Dirent = js.native
}


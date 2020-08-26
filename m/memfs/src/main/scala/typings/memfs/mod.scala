package typings.memfs

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.memfs.anon.COPYFILEEXCL
import typings.memfs.direntMod.default
import typings.memfs.promisesMod.IPromisesAPI
import typings.memfs.statsMod.TStatNumber
import typings.memfs.volumeMod.DirectoryJSON
import typings.memfs.volumeMod.IReadStream
import typings.memfs.volumeMod.IWriteStream
import typings.memfs.volumeMod.NestedDirectoryJSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memfs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait IFs
    extends typings.memfs.volumeMod.Volume {
    var Dirent: Instantiable1[/* args (repeated) */ js.Any, default] = js.native
    var Stats: Instantiable1[/* args (repeated) */ js.Any, typings.memfs.statsMod.default[TStatNumber]] = js.native
    var _toUnixTimestamp: js.Any = js.native
    var constants: COPYFILEEXCL = js.native
    @JSName("promises")
    var promises_FIFs: IPromisesAPI = js.native
  }
  
  @js.native
  class Volume ()
    extends typings.memfs.volumeMod.Volume {
    def this(props: js.Object) = this()
  }
  
  def createFsFromVolume(vol: typings.memfs.volumeMod.Volume): IFs = js.native
  @js.native
  object Volume
    extends Instantiable0[typings.memfs.volumeMod.Volume]
       with Instantiable1[/* props */ js.Object, typings.memfs.volumeMod.Volume] {
    /**
      * Global file descriptor counter. UNIX file descriptors start from 0 and go sequentially
      * up, so here, in order not to conflict with them, we choose some big number and descrease
      * the file descriptor of every new opened file.
      * @type {number}
      * @todo This should not be static, right?
      */
    var fd: Double = js.native
    def fromJSON(json: DirectoryJSON): typings.memfs.volumeMod.Volume = js.native
    def fromJSON(json: DirectoryJSON, cwd: String): typings.memfs.volumeMod.Volume = js.native
    def fromNestedJSON(json: NestedDirectoryJSON): typings.memfs.volumeMod.Volume = js.native
    def fromNestedJSON(json: NestedDirectoryJSON, cwd: String): typings.memfs.volumeMod.Volume = js.native
  }
  
  @js.native
  object fs extends TopLevel[IFs] {
    @js.native
    class Dirent protected () extends default {
      def this(args: js.Any*) = this()
    }
    
    @js.native
    class FSWatcher ()
      extends typings.memfs.volumeMod.FSWatcher
    
    @js.native
    class ReadStream protected () extends IReadStream {
      def this(args: js.Any*) = this()
    }
    
    @js.native
    class StatWatcher ()
      extends typings.memfs.volumeMod.StatWatcher
    
    @js.native
    class Stats protected ()
      extends typings.memfs.statsMod.default[TStatNumber] {
      def this(args: js.Any*) = this()
    }
    
    @js.native
    class WriteStream protected () extends IWriteStream {
      def this(args: js.Any*) = this()
    }
    
  }
  
  @js.native
  object vol
    extends TopLevel[typings.memfs.volumeMod.Volume] {
    @js.native
    class FSWatcher ()
      extends typings.memfs.volumeMod.FSWatcher
    
    @js.native
    class ReadStream protected () extends IReadStream {
      def this(args: js.Any*) = this()
    }
    
    @js.native
    class StatWatcher ()
      extends typings.memfs.volumeMod.StatWatcher
    
    @js.native
    class WriteStream protected () extends IWriteStream {
      def this(args: js.Any*) = this()
    }
    
  }
  
}


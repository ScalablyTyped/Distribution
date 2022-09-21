package typings.memfs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.memfs.anon.COPYFILEEXCL
import typings.memfs.direntMod.default
import typings.memfs.promisesMod.IPromisesAPI
import typings.memfs.statsMod.TStatNumber
import typings.memfs.volumeMod.DirectoryJSON
import typings.memfs.volumeMod.IReadStream
import typings.memfs.volumeMod.IWriteStream
import typings.memfs.volumeMod.NestedDirectoryJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memfs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("memfs", "Volume")
  @js.native
  open class Volume ()
    extends typings.memfs.volumeMod.Volume {
    def this(props: js.Object) = this()
  }
  object Volume {
    
    @JSImport("memfs", "Volume")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Global file descriptor counter. UNIX file descriptors start from 0 and go sequentially
      * up, so here, in order not to conflict with them, we choose some big number and descrease
      * the file descriptor of every new opened file.
      * @type {number}
      * @todo This should not be static, right?
      */
    @JSImport("memfs", "Volume.fd")
    @js.native
    def fd: Double = js.native
    inline def fd_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fd")(x.asInstanceOf[js.Any])
    
    inline def fromJSON(json: DirectoryJSON): typings.memfs.volumeMod.Volume = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.memfs.volumeMod.Volume]
    inline def fromJSON(json: DirectoryJSON, cwd: String): typings.memfs.volumeMod.Volume = (^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[typings.memfs.volumeMod.Volume]
    
    inline def fromNestedJSON(json: NestedDirectoryJSON): typings.memfs.volumeMod.Volume = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNestedJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.memfs.volumeMod.Volume]
    inline def fromNestedJSON(json: NestedDirectoryJSON, cwd: String): typings.memfs.volumeMod.Volume = (^.asInstanceOf[js.Dynamic].applyDynamic("fromNestedJSON")(json.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[typings.memfs.volumeMod.Volume]
  }
  
  inline def createFsFromVolume(vol: typings.memfs.volumeMod.Volume): IFs = ^.asInstanceOf[js.Dynamic].applyDynamic("createFsFromVolume")(vol.asInstanceOf[js.Any]).asInstanceOf[IFs]
  
  object fs extends Shortcut {
    
    @JSImport("memfs", "fs")
    @js.native
    val ^ : IFs = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "fs.Dirent")
    @js.native
    open class Dirent protected () extends default {
      def this(args: Any*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "fs.FSWatcher")
    @js.native
    open class FSWatcher ()
      extends typings.memfs.volumeMod.FSWatcher
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "fs.ReadStream")
    @js.native
    open class ReadStream protected () extends IReadStream {
      def this(args: Any*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "fs.StatWatcher")
    @js.native
    open class StatWatcher ()
      extends typings.memfs.volumeMod.StatWatcher
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "fs.Stats")
    @js.native
    open class Stats protected ()
      extends typings.memfs.statsMod.default[TStatNumber] {
      def this(args: Any*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "fs.WriteStream")
    @js.native
    open class WriteStream protected () extends IWriteStream {
      def this(args: Any*) = this()
    }
    
    type _To = IFs
    
    /* This means you don't have to write `^`, but can instead just say `fs.foo` */
    override def _to: IFs = ^
  }
  
  object vol extends Shortcut {
    
    @JSImport("memfs", "vol")
    @js.native
    val ^ : typings.memfs.volumeMod.Volume = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "vol.FSWatcher")
    @js.native
    open class FSWatcher ()
      extends typings.memfs.volumeMod.FSWatcher
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "vol.ReadStream")
    @js.native
    open class ReadStream protected () extends IReadStream {
      def this(args: Any*) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "vol.StatWatcher")
    @js.native
    open class StatWatcher ()
      extends typings.memfs.volumeMod.StatWatcher
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("memfs", "vol.WriteStream")
    @js.native
    open class WriteStream protected () extends IWriteStream {
      def this(args: Any*) = this()
    }
    
    type _To = typings.memfs.volumeMod.Volume
    
    /* This means you don't have to write `^`, but can instead just say `vol.foo` */
    override def _to: typings.memfs.volumeMod.Volume = ^
  }
  
  @js.native
  trait IFs
    extends typings.memfs.volumeMod.Volume {
    
    var Dirent: Instantiable1[/* args (repeated) */ Any, default] = js.native
    
    var Stats: Instantiable1[/* args (repeated) */ Any, typings.memfs.statsMod.default[TStatNumber]] = js.native
    
    var _toUnixTimestamp: Any = js.native
    
    var constants: COPYFILEEXCL = js.native
    
    @JSName("promises")
    var promises_FIFs: IPromisesAPI = js.native
  }
}

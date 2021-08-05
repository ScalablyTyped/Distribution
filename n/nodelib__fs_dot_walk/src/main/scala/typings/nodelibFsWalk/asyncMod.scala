package typings.nodelibFsWalk

import typings.nodelibFsWalk.typesMod.Entry
import typings.nodelibFsWalk.typesMod.Errno
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object asyncMod {
  
  @JSImport("@nodelib/fs.walk/out/providers/async", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with AsyncProvider {
    def this(_root: String, _settings: typings.nodelibFsWalk.settingsMod.default) = this()
    
    /* protected */ /* CompleteClass */
    override val _reader: typings.nodelibFsWalk.readersAsyncMod.default = js.native
    
    /* private */ /* CompleteClass */
    override val _root: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override val _settings: js.Any = js.native
    
    /* private */ /* CompleteClass */
    override val _storage: js.Any = js.native
    
    /* CompleteClass */
    override def read(callback: AsyncCallback): Unit = js.native
  }
  
  type AsyncCallback = js.Function2[/* err */ Errno, /* entries */ js.Array[Entry], Unit]
  
  trait AsyncProvider extends StObject {
    
    /* protected */ val _reader: typings.nodelibFsWalk.readersAsyncMod.default
    
    /* private */ val _root: js.Any
    
    /* private */ val _settings: js.Any
    
    /* private */ val _storage: js.Any
    
    def read(callback: AsyncCallback): Unit
  }
  object AsyncProvider {
    
    inline def apply(
      _reader: typings.nodelibFsWalk.readersAsyncMod.default,
      _root: js.Any,
      _settings: js.Any,
      _storage: js.Any,
      read: AsyncCallback => Unit
    ): AsyncProvider = {
      val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _storage = _storage.asInstanceOf[js.Any], read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[AsyncProvider]
    }
    
    extension [Self <: AsyncProvider](x: Self) {
      
      inline def setRead(value: AsyncCallback => Unit): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def set_reader(value: typings.nodelibFsWalk.readersAsyncMod.default): Self = StObject.set(x, "_reader", value.asInstanceOf[js.Any])
      
      inline def set_root(value: js.Any): Self = StObject.set(x, "_root", value.asInstanceOf[js.Any])
      
      inline def set_settings(value: js.Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
      
      inline def set_storage(value: js.Any): Self = StObject.set(x, "_storage", value.asInstanceOf[js.Any])
    }
  }
}

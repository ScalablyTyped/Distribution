package typings.nodelibFsWalk

import typings.nodelibFsWalk.outTypesMod.Entry
import typings.nodelibFsWalk.outTypesMod.Errno
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersAsyncMod {
  
  @JSImport("@nodelib/fs.walk/out/providers/async", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with AsyncProvider {
    def this(_root: String, _settings: typings.nodelibFsWalk.outSettingsMod.default) = this()
    
    /* protected */ /* CompleteClass */
    override val _reader: typings.nodelibFsWalk.outReadersAsyncMod.default = js.native
    
    /* private */ /* CompleteClass */
    override val _root: Any = js.native
    
    /* private */ /* CompleteClass */
    override val _settings: Any = js.native
    
    /* private */ /* CompleteClass */
    override val _storage: Any = js.native
    
    /* CompleteClass */
    override def read(callback: AsyncCallback): Unit = js.native
  }
  
  type AsyncCallback = js.Function2[/* error */ Errno, /* entries */ js.Array[Entry], Unit]
  
  trait AsyncProvider extends StObject {
    
    /* protected */ val _reader: typings.nodelibFsWalk.outReadersAsyncMod.default
    
    /* private */ val _root: Any
    
    /* private */ val _settings: Any
    
    /* private */ val _storage: Any
    
    def read(callback: AsyncCallback): Unit
  }
  object AsyncProvider {
    
    inline def apply(
      _reader: typings.nodelibFsWalk.outReadersAsyncMod.default,
      _root: Any,
      _settings: Any,
      _storage: Any,
      read: AsyncCallback => Unit
    ): AsyncProvider = {
      val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _storage = _storage.asInstanceOf[js.Any], read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[AsyncProvider]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncProvider] (val x: Self) extends AnyVal {
      
      inline def setRead(value: AsyncCallback => Unit): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def set_reader(value: typings.nodelibFsWalk.outReadersAsyncMod.default): Self = StObject.set(x, "_reader", value.asInstanceOf[js.Any])
      
      inline def set_root(value: Any): Self = StObject.set(x, "_root", value.asInstanceOf[js.Any])
      
      inline def set_settings(value: Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
      
      inline def set_storage(value: Any): Self = StObject.set(x, "_storage", value.asInstanceOf[js.Any])
    }
  }
}

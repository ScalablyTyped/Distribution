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
    
    /* CompleteClass */
    override val _reader: typings.nodelibFsWalk.readersAsyncMod.default = js.native
    
    /* CompleteClass */
    override val _root: js.Any = js.native
    
    /* CompleteClass */
    override val _settings: js.Any = js.native
    
    /* CompleteClass */
    override val _storage: js.Any = js.native
    
    /* CompleteClass */
    override def read(callback: AsyncCallback): Unit = js.native
  }
  
  type AsyncCallback = js.Function2[/* err */ Errno, /* entries */ js.Array[Entry], Unit]
  
  trait AsyncProvider extends StObject {
    
    val _reader: typings.nodelibFsWalk.readersAsyncMod.default
    
    val _root: js.Any
    
    val _settings: js.Any
    
    val _storage: js.Any
    
    def read(callback: AsyncCallback): Unit
  }
  object AsyncProvider {
    
    @scala.inline
    def apply(
      _reader: typings.nodelibFsWalk.readersAsyncMod.default,
      _root: js.Any,
      _settings: js.Any,
      _storage: js.Any,
      read: AsyncCallback => Unit
    ): AsyncProvider = {
      val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _storage = _storage.asInstanceOf[js.Any], read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[AsyncProvider]
    }
    
    @scala.inline
    implicit class AsyncProviderMutableBuilder[Self <: AsyncProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRead(value: AsyncCallback => Unit): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_reader(value: typings.nodelibFsWalk.readersAsyncMod.default): Self = StObject.set(x, "_reader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_root(value: js.Any): Self = StObject.set(x, "_root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_settings(value: js.Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_storage(value: js.Any): Self = StObject.set(x, "_storage", value.asInstanceOf[js.Any])
    }
  }
}

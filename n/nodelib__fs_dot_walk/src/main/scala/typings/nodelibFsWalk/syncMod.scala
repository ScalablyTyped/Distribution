package typings.nodelibFsWalk

import typings.nodelibFsWalk.typesMod.Entry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syncMod {
  
  @JSImport("@nodelib/fs.walk/out/providers/sync", JSImport.Default)
  @js.native
  class default protected () extends SyncProvider {
    def this(_root: String, _settings: typings.nodelibFsWalk.settingsMod.default) = this()
  }
  
  @js.native
  trait SyncProvider extends StObject {
    
    val _reader: typings.nodelibFsWalk.readersSyncMod.default = js.native
    
    val _root: js.Any = js.native
    
    val _settings: js.Any = js.native
    
    def read(): js.Array[Entry] = js.native
  }
  object SyncProvider {
    
    @scala.inline
    def apply(
      _reader: typings.nodelibFsWalk.readersSyncMod.default,
      _root: js.Any,
      _settings: js.Any,
      read: () => js.Array[Entry]
    ): SyncProvider = {
      val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
      __obj.asInstanceOf[SyncProvider]
    }
    
    @scala.inline
    implicit class SyncProviderMutableBuilder[Self <: SyncProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRead(value: () => js.Array[Entry]): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_reader(value: typings.nodelibFsWalk.readersSyncMod.default): Self = StObject.set(x, "_reader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_root(value: js.Any): Self = StObject.set(x, "_root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_settings(value: js.Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    }
  }
}

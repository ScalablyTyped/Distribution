package typings.nodelibFsWalk

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersStreamMod {
  
  @JSImport("@nodelib/fs.walk/out/providers/stream", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with StreamProvider {
    def this(_root: String, _settings: typings.nodelibFsWalk.outSettingsMod.default) = this()
    
    /* protected */ /* CompleteClass */
    override val _reader: typings.nodelibFsWalk.outReadersAsyncMod.default = js.native
    
    /* private */ /* CompleteClass */
    override val _root: Any = js.native
    
    /* private */ /* CompleteClass */
    override val _settings: Any = js.native
    
    /* protected */ /* CompleteClass */
    override val _stream: Readable = js.native
    
    /* CompleteClass */
    override def read(): Readable = js.native
  }
  
  trait StreamProvider extends StObject {
    
    /* protected */ val _reader: typings.nodelibFsWalk.outReadersAsyncMod.default
    
    /* private */ val _root: Any
    
    /* private */ val _settings: Any
    
    /* protected */ val _stream: Readable
    
    def read(): Readable
  }
  object StreamProvider {
    
    inline def apply(
      _reader: typings.nodelibFsWalk.outReadersAsyncMod.default,
      _root: Any,
      _settings: Any,
      _stream: Readable,
      read: () => Readable
    ): StreamProvider = {
      val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _stream = _stream.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
      __obj.asInstanceOf[StreamProvider]
    }
    
    extension [Self <: StreamProvider](x: Self) {
      
      inline def setRead(value: () => Readable): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      inline def set_reader(value: typings.nodelibFsWalk.outReadersAsyncMod.default): Self = StObject.set(x, "_reader", value.asInstanceOf[js.Any])
      
      inline def set_root(value: Any): Self = StObject.set(x, "_root", value.asInstanceOf[js.Any])
      
      inline def set_settings(value: Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
      
      inline def set_stream(value: Readable): Self = StObject.set(x, "_stream", value.asInstanceOf[js.Any])
    }
  }
}

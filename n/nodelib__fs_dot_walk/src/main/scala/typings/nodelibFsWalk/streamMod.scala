package typings.nodelibFsWalk

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  @JSImport("@nodelib/fs.walk/out/providers/stream", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with StreamProvider {
    def this(_root: String, _settings: typings.nodelibFsWalk.settingsMod.default) = this()
    
    /* CompleteClass */
    override val _reader: typings.nodelibFsWalk.readersAsyncMod.default = js.native
    
    /* CompleteClass */
    override val _root: js.Any = js.native
    
    /* CompleteClass */
    override val _settings: js.Any = js.native
    
    /* CompleteClass */
    override val _stream: Readable = js.native
    
    /* CompleteClass */
    override def read(): Readable = js.native
  }
  
  trait StreamProvider extends StObject {
    
    val _reader: typings.nodelibFsWalk.readersAsyncMod.default
    
    val _root: js.Any
    
    val _settings: js.Any
    
    val _stream: Readable
    
    def read(): Readable
  }
  object StreamProvider {
    
    @scala.inline
    def apply(
      _reader: typings.nodelibFsWalk.readersAsyncMod.default,
      _root: js.Any,
      _settings: js.Any,
      _stream: Readable,
      read: () => Readable
    ): StreamProvider = {
      val __obj = js.Dynamic.literal(_reader = _reader.asInstanceOf[js.Any], _root = _root.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], _stream = _stream.asInstanceOf[js.Any], read = js.Any.fromFunction0(read))
      __obj.asInstanceOf[StreamProvider]
    }
    
    @scala.inline
    implicit class StreamProviderMutableBuilder[Self <: StreamProvider] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRead(value: () => Readable): Self = StObject.set(x, "read", js.Any.fromFunction0(value))
      
      @scala.inline
      def set_reader(value: typings.nodelibFsWalk.readersAsyncMod.default): Self = StObject.set(x, "_reader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_root(value: js.Any): Self = StObject.set(x, "_root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_settings(value: js.Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_stream(value: Readable): Self = StObject.set(x, "_stream", value.asInstanceOf[js.Any])
    }
  }
}

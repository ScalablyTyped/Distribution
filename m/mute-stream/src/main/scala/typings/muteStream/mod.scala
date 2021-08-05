package typings.muteStream

import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mute-stream", JSImport.Namespace)
  @js.native
  class ^ () extends MuteStream {
    def this(options: Options) = this()
  }
  
  @js.native
  trait MuteStream extends Duplex {
    
    var isTTY: Boolean = js.native
    
    def mute(): Unit = js.native
    
    def unmute(): Unit = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * If you are using a replacement char, and also using a prompt with a readline stream
      * (as for a Password: ***** input), then specify what the prompt is so that backspace
      * will work properly. Otherwise, pressing backspace will overwrite the prompt with the
      * replacement character, which is weird.
      */
    var prompt: js.UndefOr[String] = js.undefined
    
    /**
      * Set to a string to replace each character with the specified string when muted.
      * (So you can show **** instead of the password, for example.)
      */
    var replace: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setPrompt(value: String): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setPromptUndefined: Self = StObject.set(x, "prompt", js.undefined)
      
      inline def setReplace(value: String): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    }
  }
}

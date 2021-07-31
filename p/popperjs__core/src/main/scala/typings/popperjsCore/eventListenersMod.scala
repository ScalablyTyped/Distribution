package typings.popperjsCore

import org.scalablytyped.runtime.Shortcut
import typings.popperjsCore.popperjsCoreStrings.eventListeners
import typings.popperjsCore.typesMod.Modifier
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventListenersMod extends Shortcut {
  
  @JSImport("@popperjs/core/lib/modifiers/eventListeners", JSImport.Default)
  @js.native
  val default: Modifier[eventListeners, Options] = js.native
  
  type EventListenersModifier = Modifier[eventListeners, Options]
  
  trait Options extends StObject {
    
    var resize: Boolean
    
    var scroll: Boolean
  }
  object Options {
    
    @scala.inline
    def apply(resize: Boolean, scroll: Boolean): Options = {
      val __obj = js.Dynamic.literal(resize = resize.asInstanceOf[js.Any], scroll = scroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResize(value: Boolean): Self = StObject.set(x, "resize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScroll(value: Boolean): Self = StObject.set(x, "scroll", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Modifier[eventListeners, Options]
  
  /* This means you don't have to write `default`, but can instead just say `eventListenersMod.foo` */
  override def _to: Modifier[eventListeners, Options] = default
}

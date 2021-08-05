package typings.openseadragon.anon

import typings.openseadragon.mod.ButtonEvent
import typings.openseadragon.mod.EventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: js.UndefOr[typings.std.Element] = js.undefined
  
  var fadeDelay: js.UndefOr[Double] = js.undefined
  
  var fadeLength: js.UndefOr[Double] = js.undefined
  
  var onBlur: js.UndefOr[EventHandler[ButtonEvent]] = js.undefined
  
  var onClick: js.UndefOr[EventHandler[ButtonEvent]] = js.undefined
  
  var onEnter: js.UndefOr[EventHandler[ButtonEvent]] = js.undefined
  
  var onExit: js.UndefOr[EventHandler[ButtonEvent]] = js.undefined
  
  var onFocus: js.UndefOr[EventHandler[ButtonEvent]] = js.undefined
  
  var onPress: js.UndefOr[EventHandler[ButtonEvent]] = js.undefined
  
  var onRelease: js.UndefOr[EventHandler[ButtonEvent]] = js.undefined
  
  var srcDown: js.UndefOr[String] = js.undefined
  
  var srcGroup: js.UndefOr[String] = js.undefined
  
  var srcHover: js.UndefOr[String] = js.undefined
  
  var srcRest: js.UndefOr[String] = js.undefined
  
  var tooltip: js.UndefOr[String] = js.undefined
}
object Element {
  
  inline def apply(): Element = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Element]
  }
  
  extension [Self <: Element](x: Self) {
    
    inline def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setFadeDelay(value: Double): Self = StObject.set(x, "fadeDelay", value.asInstanceOf[js.Any])
    
    inline def setFadeDelayUndefined: Self = StObject.set(x, "fadeDelay", js.undefined)
    
    inline def setFadeLength(value: Double): Self = StObject.set(x, "fadeLength", value.asInstanceOf[js.Any])
    
    inline def setFadeLengthUndefined: Self = StObject.set(x, "fadeLength", js.undefined)
    
    inline def setOnBlur(value: ButtonEvent => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnClick(value: ButtonEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    inline def setOnEnter(value: ButtonEvent => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
    
    inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    inline def setOnExit(value: ButtonEvent => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
    
    inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    inline def setOnFocus(value: ButtonEvent => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnPress(value: ButtonEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    inline def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    inline def setOnRelease(value: ButtonEvent => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
    
    inline def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
    
    inline def setSrcDown(value: String): Self = StObject.set(x, "srcDown", value.asInstanceOf[js.Any])
    
    inline def setSrcDownUndefined: Self = StObject.set(x, "srcDown", js.undefined)
    
    inline def setSrcGroup(value: String): Self = StObject.set(x, "srcGroup", value.asInstanceOf[js.Any])
    
    inline def setSrcGroupUndefined: Self = StObject.set(x, "srcGroup", js.undefined)
    
    inline def setSrcHover(value: String): Self = StObject.set(x, "srcHover", value.asInstanceOf[js.Any])
    
    inline def setSrcHoverUndefined: Self = StObject.set(x, "srcHover", js.undefined)
    
    inline def setSrcRest(value: String): Self = StObject.set(x, "srcRest", value.asInstanceOf[js.Any])
    
    inline def setSrcRestUndefined: Self = StObject.set(x, "srcRest", js.undefined)
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}

package typings.openseadragon.anon

import typings.openseadragon.mod.ButtonEvent
import typings.openseadragon.mod.EventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Element extends StObject {
  
  var element: js.UndefOr[typings.std.Element] = js.native
  
  var fadeDelay: js.UndefOr[Double] = js.native
  
  var fadeLength: js.UndefOr[Double] = js.native
  
  var onBlur: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  
  var onClick: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  
  var onEnter: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  
  var onExit: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  
  var onFocus: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  
  var onPress: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  
  var onRelease: js.UndefOr[EventHandler[ButtonEvent]] = js.native
  
  var srcDown: js.UndefOr[String] = js.native
  
  var srcGroup: js.UndefOr[String] = js.native
  
  var srcHover: js.UndefOr[String] = js.native
  
  var srcRest: js.UndefOr[String] = js.native
  
  var tooltip: js.UndefOr[String] = js.native
}
object Element {
  
  @scala.inline
  def apply(): Element = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: typings.std.Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setFadeDelay(value: Double): Self = StObject.set(x, "fadeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeDelayUndefined: Self = StObject.set(x, "fadeDelay", js.undefined)
    
    @scala.inline
    def setFadeLength(value: Double): Self = StObject.set(x, "fadeLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFadeLengthUndefined: Self = StObject.set(x, "fadeLength", js.undefined)
    
    @scala.inline
    def setOnBlur(value: ButtonEvent => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    @scala.inline
    def setOnClick(value: ButtonEvent => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setOnEnter(value: ButtonEvent => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
    
    @scala.inline
    def setOnExit(value: ButtonEvent => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    
    @scala.inline
    def setOnFocus(value: ButtonEvent => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    @scala.inline
    def setOnPress(value: ButtonEvent => Unit): Self = StObject.set(x, "onPress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPressUndefined: Self = StObject.set(x, "onPress", js.undefined)
    
    @scala.inline
    def setOnRelease(value: ButtonEvent => Unit): Self = StObject.set(x, "onRelease", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnReleaseUndefined: Self = StObject.set(x, "onRelease", js.undefined)
    
    @scala.inline
    def setSrcDown(value: String): Self = StObject.set(x, "srcDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcDownUndefined: Self = StObject.set(x, "srcDown", js.undefined)
    
    @scala.inline
    def setSrcGroup(value: String): Self = StObject.set(x, "srcGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcGroupUndefined: Self = StObject.set(x, "srcGroup", js.undefined)
    
    @scala.inline
    def setSrcHover(value: String): Self = StObject.set(x, "srcHover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcHoverUndefined: Self = StObject.set(x, "srcHover", js.undefined)
    
    @scala.inline
    def setSrcRest(value: String): Self = StObject.set(x, "srcRest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcRestUndefined: Self = StObject.set(x, "srcRest", js.undefined)
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}

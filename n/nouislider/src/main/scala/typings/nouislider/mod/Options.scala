package typings.nouislider.mod

import typings.nouislider.nouisliderStrings.horizontal
import typings.nouislider.nouisliderStrings.lower
import typings.nouislider.nouisliderStrings.ltr
import typings.nouislider.nouisliderStrings.rtl
import typings.nouislider.nouisliderStrings.upper
import typings.nouislider.nouisliderStrings.vertical
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options
  extends StObject
     with UpdatableOptions {
  
  var animationDuration: js.UndefOr[Double] = js.undefined
  
  var ariaFormat: js.UndefOr[PartialFormatter] = js.undefined
  
  var behaviour: js.UndefOr[String] = js.undefined
  
  var connect: js.UndefOr[lower | upper | Boolean | js.Array[Boolean]] = js.undefined
  
  var cssClasses: js.UndefOr[CssClasses_] = js.undefined
  
  var cssPrefix: js.UndefOr[String] = js.undefined
  
  var direction: js.UndefOr[ltr | rtl] = js.undefined
  
  var documentElement: js.UndefOr[HTMLElement] = js.undefined
  
  var handleAttributes: js.UndefOr[js.Array[HandleAttributes]] = js.undefined
  
  var keyboardDefaultStep: js.UndefOr[Double] = js.undefined
  
  var keyboardMultiplier: js.UndefOr[Double] = js.undefined
  
  var keyboardPageMultiplier: js.UndefOr[Double] = js.undefined
  
  var keyboardSupport: js.UndefOr[Boolean] = js.undefined
  
  var orientation: js.UndefOr[vertical | horizontal] = js.undefined
  
  @JSName("range")
  var range_Options: Range
}
object Options {
  
  inline def apply(range: Range): Options = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setAnimationDurationUndefined: Self = StObject.set(x, "animationDuration", js.undefined)
    
    inline def setAriaFormat(value: PartialFormatter): Self = StObject.set(x, "ariaFormat", value.asInstanceOf[js.Any])
    
    inline def setAriaFormatUndefined: Self = StObject.set(x, "ariaFormat", js.undefined)
    
    inline def setBehaviour(value: String): Self = StObject.set(x, "behaviour", value.asInstanceOf[js.Any])
    
    inline def setBehaviourUndefined: Self = StObject.set(x, "behaviour", js.undefined)
    
    inline def setConnect(value: lower | upper | Boolean | js.Array[Boolean]): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
    
    inline def setConnectUndefined: Self = StObject.set(x, "connect", js.undefined)
    
    inline def setConnectVarargs(value: Boolean*): Self = StObject.set(x, "connect", js.Array(value*))
    
    inline def setCssClasses(value: CssClasses_): Self = StObject.set(x, "cssClasses", value.asInstanceOf[js.Any])
    
    inline def setCssClassesUndefined: Self = StObject.set(x, "cssClasses", js.undefined)
    
    inline def setCssPrefix(value: String): Self = StObject.set(x, "cssPrefix", value.asInstanceOf[js.Any])
    
    inline def setCssPrefixUndefined: Self = StObject.set(x, "cssPrefix", js.undefined)
    
    inline def setDirection(value: ltr | rtl): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDocumentElement(value: HTMLElement): Self = StObject.set(x, "documentElement", value.asInstanceOf[js.Any])
    
    inline def setDocumentElementUndefined: Self = StObject.set(x, "documentElement", js.undefined)
    
    inline def setHandleAttributes(value: js.Array[HandleAttributes]): Self = StObject.set(x, "handleAttributes", value.asInstanceOf[js.Any])
    
    inline def setHandleAttributesUndefined: Self = StObject.set(x, "handleAttributes", js.undefined)
    
    inline def setHandleAttributesVarargs(value: HandleAttributes*): Self = StObject.set(x, "handleAttributes", js.Array(value*))
    
    inline def setKeyboardDefaultStep(value: Double): Self = StObject.set(x, "keyboardDefaultStep", value.asInstanceOf[js.Any])
    
    inline def setKeyboardDefaultStepUndefined: Self = StObject.set(x, "keyboardDefaultStep", js.undefined)
    
    inline def setKeyboardMultiplier(value: Double): Self = StObject.set(x, "keyboardMultiplier", value.asInstanceOf[js.Any])
    
    inline def setKeyboardMultiplierUndefined: Self = StObject.set(x, "keyboardMultiplier", js.undefined)
    
    inline def setKeyboardPageMultiplier(value: Double): Self = StObject.set(x, "keyboardPageMultiplier", value.asInstanceOf[js.Any])
    
    inline def setKeyboardPageMultiplierUndefined: Self = StObject.set(x, "keyboardPageMultiplier", js.undefined)
    
    inline def setKeyboardSupport(value: Boolean): Self = StObject.set(x, "keyboardSupport", value.asInstanceOf[js.Any])
    
    inline def setKeyboardSupportUndefined: Self = StObject.set(x, "keyboardSupport", js.undefined)
    
    inline def setOrientation(value: vertical | horizontal): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
    
    inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}

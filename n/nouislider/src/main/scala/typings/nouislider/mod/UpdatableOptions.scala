package typings.nouislider.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatableOptions extends StObject {
  
  var animate: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[Formatter] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var margin: js.UndefOr[Double] = js.undefined
  
  var padding: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var pips: js.UndefOr[Pips] = js.undefined
  
  var range: js.UndefOr[Range] = js.undefined
  
  var snap: js.UndefOr[Boolean] = js.undefined
  
  var start: js.UndefOr[StartValues] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var tooltips: js.UndefOr[Boolean | PartialFormatter | (js.Array[Boolean | PartialFormatter])] = js.undefined
}
object UpdatableOptions {
  
  inline def apply(): UpdatableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatableOptions]
  }
  
  extension [Self <: UpdatableOptions](x: Self) {
    
    inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
    
    inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
    
    inline def setFormat(value: Formatter): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMargin(value: Double): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
    
    inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
    
    inline def setPadding(value: Double | js.Array[Double]): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setPaddingVarargs(value: Double*): Self = StObject.set(x, "padding", js.Array(value*))
    
    inline def setPips(value: Pips): Self = StObject.set(x, "pips", value.asInstanceOf[js.Any])
    
    inline def setPipsUndefined: Self = StObject.set(x, "pips", js.undefined)
    
    inline def setRange(value: Range): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    
    inline def setSnap(value: Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    inline def setStart(value: StartValues): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setStartVarargs(value: (String | Double)*): Self = StObject.set(x, "start", js.Array(value*))
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setTooltips(value: Boolean | PartialFormatter | (js.Array[Boolean | PartialFormatter])): Self = StObject.set(x, "tooltips", value.asInstanceOf[js.Any])
    
    inline def setTooltipsUndefined: Self = StObject.set(x, "tooltips", js.undefined)
    
    inline def setTooltipsVarargs(value: (Boolean | PartialFormatter)*): Self = StObject.set(x, "tooltips", js.Array(value*))
  }
}

package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDimension extends StObject {
  
  var autoFitHeight: js.UndefOr[Boolean] = js.undefined
  
  var outerHeight: js.UndefOr[Double] = js.undefined
  
  var outerWidth: js.UndefOr[Double] = js.undefined
}
object IDimension {
  
  inline def apply(): IDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDimension]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDimension] (val x: Self) extends AnyVal {
    
    inline def setAutoFitHeight(value: Boolean): Self = StObject.set(x, "autoFitHeight", value.asInstanceOf[js.Any])
    
    inline def setAutoFitHeightUndefined: Self = StObject.set(x, "autoFitHeight", js.undefined)
    
    inline def setOuterHeight(value: Double): Self = StObject.set(x, "outerHeight", value.asInstanceOf[js.Any])
    
    inline def setOuterHeightUndefined: Self = StObject.set(x, "outerHeight", js.undefined)
    
    inline def setOuterWidth(value: Double): Self = StObject.set(x, "outerWidth", value.asInstanceOf[js.Any])
    
    inline def setOuterWidthUndefined: Self = StObject.set(x, "outerWidth", js.undefined)
  }
}

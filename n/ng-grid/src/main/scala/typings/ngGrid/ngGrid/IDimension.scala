package typings.ngGrid.ngGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDimension extends StObject {
  
  var autoFitHeight: js.UndefOr[Boolean] = js.native
  
  var outerHeight: js.UndefOr[Double] = js.native
  
  var outerWidth: js.UndefOr[Double] = js.native
}
object IDimension {
  
  @scala.inline
  def apply(): IDimension = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDimension]
  }
  
  @scala.inline
  implicit class IDimensionMutableBuilder[Self <: IDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoFitHeight(value: Boolean): Self = StObject.set(x, "autoFitHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoFitHeightUndefined: Self = StObject.set(x, "autoFitHeight", js.undefined)
    
    @scala.inline
    def setOuterHeight(value: Double): Self = StObject.set(x, "outerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterHeightUndefined: Self = StObject.set(x, "outerHeight", js.undefined)
    
    @scala.inline
    def setOuterWidth(value: Double): Self = StObject.set(x, "outerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOuterWidthUndefined: Self = StObject.set(x, "outerWidth", js.undefined)
  }
}

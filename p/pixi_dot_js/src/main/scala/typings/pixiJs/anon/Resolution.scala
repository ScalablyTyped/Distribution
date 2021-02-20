package typings.pixiJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resolution extends StObject {
  
  var height: js.UndefOr[Double] = js.native
  
  var resolution: js.UndefOr[Double] = js.native
  
  var scaleMode: js.UndefOr[Double] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object Resolution {
  
  @scala.inline
  def apply(): Resolution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resolution]
  }
  
  @scala.inline
  implicit class ResolutionMutableBuilder[Self <: Resolution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    
    @scala.inline
    def setScaleMode(value: Double): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleModeUndefined: Self = StObject.set(x, "scaleMode", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}

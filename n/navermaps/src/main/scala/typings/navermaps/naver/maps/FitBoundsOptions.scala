package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FitBoundsOptions
  extends StObject
     with Margin {
  
  var maxZoom: js.UndefOr[Double] = js.undefined
}
object FitBoundsOptions {
  
  inline def apply(): FitBoundsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FitBoundsOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FitBoundsOptions] (val x: Self) extends AnyVal {
    
    inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
    
    inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
  }
}

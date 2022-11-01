package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ZoomControlOptions
  extends StObject
     with ControlOptions {
  
  var legendDisabled: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[ZoomControlStyle] = js.undefined
}
object ZoomControlOptions {
  
  inline def apply(position: Position): ZoomControlOptions = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ZoomControlOptions]
  }
  
  extension [Self <: ZoomControlOptions](x: Self) {
    
    inline def setLegendDisabled(value: Boolean): Self = StObject.set(x, "legendDisabled", value.asInstanceOf[js.Any])
    
    inline def setLegendDisabledUndefined: Self = StObject.set(x, "legendDisabled", js.undefined)
    
    inline def setStyle(value: ZoomControlStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}

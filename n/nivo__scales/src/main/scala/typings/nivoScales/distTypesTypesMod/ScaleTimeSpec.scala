package typings.nivoScales.distTypesTypesMod

import typings.nivoScales.distTypesTimeHelpersMod.TIME_PRECISION
import typings.nivoScales.nivoScalesStrings.auto
import typings.nivoScales.nivoScalesStrings.native
import typings.nivoScales.nivoScalesStrings.time
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleTimeSpec extends StObject {
  
  var format: js.UndefOr[native | String] = js.undefined
  
  var max: js.UndefOr[auto | js.Date | String] = js.undefined
  
  var min: js.UndefOr[auto | js.Date | String] = js.undefined
  
  var nice: js.UndefOr[Boolean] = js.undefined
  
  var precision: js.UndefOr[TIME_PRECISION] = js.undefined
  
  var `type`: time
  
  var useUTC: js.UndefOr[Boolean] = js.undefined
}
object ScaleTimeSpec {
  
  inline def apply(): ScaleTimeSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("time")
    __obj.asInstanceOf[ScaleTimeSpec]
  }
  
  extension [Self <: ScaleTimeSpec](x: Self) {
    
    inline def setFormat(value: native | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setMax(value: auto | js.Date | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: auto | js.Date | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setNice(value: Boolean): Self = StObject.set(x, "nice", value.asInstanceOf[js.Any])
    
    inline def setNiceUndefined: Self = StObject.set(x, "nice", js.undefined)
    
    inline def setPrecision(value: TIME_PRECISION): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setType(value: time): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUseUTC(value: Boolean): Self = StObject.set(x, "useUTC", value.asInstanceOf[js.Any])
    
    inline def setUseUTCUndefined: Self = StObject.set(x, "useUTC", js.undefined)
  }
}

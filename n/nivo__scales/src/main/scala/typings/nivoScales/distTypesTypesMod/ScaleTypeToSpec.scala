package typings.nivoScales.distTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleTypeToSpec extends StObject {
  
  var band: ScaleBandSpec
  
  var linear: ScaleLinearSpec
  
  var log: ScaleLogSpec
  
  var point: ScalePointSpec
  
  var symlog: ScaleSymlogSpec
  
  var time: ScaleTimeSpec
}
object ScaleTypeToSpec {
  
  inline def apply(
    band: ScaleBandSpec,
    linear: ScaleLinearSpec,
    log: ScaleLogSpec,
    point: ScalePointSpec,
    symlog: ScaleSymlogSpec,
    time: ScaleTimeSpec
  ): ScaleTypeToSpec = {
    val __obj = js.Dynamic.literal(band = band.asInstanceOf[js.Any], linear = linear.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], symlog = symlog.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleTypeToSpec]
  }
  
  extension [Self <: ScaleTypeToSpec](x: Self) {
    
    inline def setBand(value: ScaleBandSpec): Self = StObject.set(x, "band", value.asInstanceOf[js.Any])
    
    inline def setLinear(value: ScaleLinearSpec): Self = StObject.set(x, "linear", value.asInstanceOf[js.Any])
    
    inline def setLog(value: ScaleLogSpec): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setPoint(value: ScalePointSpec): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    inline def setSymlog(value: ScaleSymlogSpec): Self = StObject.set(x, "symlog", value.asInstanceOf[js.Any])
    
    inline def setTime(value: ScaleTimeSpec): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}

package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CRLDistributionPointsJson extends StObject {
  
  var distributionPoints: js.Array[DistributionPointJson]
}
object CRLDistributionPointsJson {
  
  inline def apply(distributionPoints: js.Array[DistributionPointJson]): CRLDistributionPointsJson = {
    val __obj = js.Dynamic.literal(distributionPoints = distributionPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[CRLDistributionPointsJson]
  }
  
  extension [Self <: CRLDistributionPointsJson](x: Self) {
    
    inline def setDistributionPoints(value: js.Array[DistributionPointJson]): Self = StObject.set(x, "distributionPoints", value.asInstanceOf[js.Any])
    
    inline def setDistributionPointsVarargs(value: DistributionPointJson*): Self = StObject.set(x, "distributionPoints", js.Array(value*))
  }
}

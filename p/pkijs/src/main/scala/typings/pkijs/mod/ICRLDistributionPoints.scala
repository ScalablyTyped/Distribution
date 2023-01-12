package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICRLDistributionPoints extends StObject {
  
  var distributionPoints: js.Array[DistributionPoint]
}
object ICRLDistributionPoints {
  
  inline def apply(distributionPoints: js.Array[DistributionPoint]): ICRLDistributionPoints = {
    val __obj = js.Dynamic.literal(distributionPoints = distributionPoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICRLDistributionPoints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICRLDistributionPoints] (val x: Self) extends AnyVal {
    
    inline def setDistributionPoints(value: js.Array[DistributionPoint]): Self = StObject.set(x, "distributionPoints", value.asInstanceOf[js.Any])
    
    inline def setDistributionPointsVarargs(value: DistributionPoint*): Self = StObject.set(x, "distributionPoints", js.Array(value*))
  }
}

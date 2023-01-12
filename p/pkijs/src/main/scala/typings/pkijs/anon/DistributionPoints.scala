package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionPoints extends StObject {
  
  var distributionPoints: js.UndefOr[String] = js.undefined
}
object DistributionPoints {
  
  inline def apply(): DistributionPoints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionPoints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DistributionPoints] (val x: Self) extends AnyVal {
    
    inline def setDistributionPoints(value: String): Self = StObject.set(x, "distributionPoints", value.asInstanceOf[js.Any])
    
    inline def setDistributionPointsUndefined: Self = StObject.set(x, "distributionPoints", js.undefined)
  }
}

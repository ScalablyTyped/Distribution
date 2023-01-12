package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IIssuingDistributionPoint extends StObject {
  
  var distributionPoint: js.UndefOr[DistributionPointName] = js.undefined
  
  var indirectCRL: Boolean
  
  var onlyContainsAttributeCerts: Boolean
  
  var onlyContainsCACerts: Boolean
  
  var onlyContainsUserCerts: Boolean
  
  var onlySomeReasons: js.UndefOr[Double] = js.undefined
}
object IIssuingDistributionPoint {
  
  inline def apply(
    indirectCRL: Boolean,
    onlyContainsAttributeCerts: Boolean,
    onlyContainsCACerts: Boolean,
    onlyContainsUserCerts: Boolean
  ): IIssuingDistributionPoint = {
    val __obj = js.Dynamic.literal(indirectCRL = indirectCRL.asInstanceOf[js.Any], onlyContainsAttributeCerts = onlyContainsAttributeCerts.asInstanceOf[js.Any], onlyContainsCACerts = onlyContainsCACerts.asInstanceOf[js.Any], onlyContainsUserCerts = onlyContainsUserCerts.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingDistributionPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IIssuingDistributionPoint] (val x: Self) extends AnyVal {
    
    inline def setDistributionPoint(value: DistributionPointName): Self = StObject.set(x, "distributionPoint", value.asInstanceOf[js.Any])
    
    inline def setDistributionPointUndefined: Self = StObject.set(x, "distributionPoint", js.undefined)
    
    inline def setDistributionPointVarargs(value: GeneralName*): Self = StObject.set(x, "distributionPoint", js.Array(value*))
    
    inline def setIndirectCRL(value: Boolean): Self = StObject.set(x, "indirectCRL", value.asInstanceOf[js.Any])
    
    inline def setOnlyContainsAttributeCerts(value: Boolean): Self = StObject.set(x, "onlyContainsAttributeCerts", value.asInstanceOf[js.Any])
    
    inline def setOnlyContainsCACerts(value: Boolean): Self = StObject.set(x, "onlyContainsCACerts", value.asInstanceOf[js.Any])
    
    inline def setOnlyContainsUserCerts(value: Boolean): Self = StObject.set(x, "onlyContainsUserCerts", value.asInstanceOf[js.Any])
    
    inline def setOnlySomeReasons(value: Double): Self = StObject.set(x, "onlySomeReasons", value.asInstanceOf[js.Any])
    
    inline def setOnlySomeReasonsUndefined: Self = StObject.set(x, "onlySomeReasons", js.undefined)
  }
}

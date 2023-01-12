package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuingDistributionPointJson extends StObject {
  
  var distributionPoint: js.UndefOr[DistributionPointNameJson] = js.undefined
  
  var indirectCRL: js.UndefOr[Boolean] = js.undefined
  
  var onlyContainsAttributeCerts: js.UndefOr[Boolean] = js.undefined
  
  var onlyContainsCACerts: js.UndefOr[Boolean] = js.undefined
  
  var onlyContainsUserCerts: js.UndefOr[Boolean] = js.undefined
  
  var onlySomeReasons: js.UndefOr[Double] = js.undefined
}
object IssuingDistributionPointJson {
  
  inline def apply(): IssuingDistributionPointJson = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IssuingDistributionPointJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IssuingDistributionPointJson] (val x: Self) extends AnyVal {
    
    inline def setDistributionPoint(value: DistributionPointNameJson): Self = StObject.set(x, "distributionPoint", value.asInstanceOf[js.Any])
    
    inline def setDistributionPointUndefined: Self = StObject.set(x, "distributionPoint", js.undefined)
    
    inline def setDistributionPointVarargs(value: GeneralNameJson*): Self = StObject.set(x, "distributionPoint", js.Array(value*))
    
    inline def setIndirectCRL(value: Boolean): Self = StObject.set(x, "indirectCRL", value.asInstanceOf[js.Any])
    
    inline def setIndirectCRLUndefined: Self = StObject.set(x, "indirectCRL", js.undefined)
    
    inline def setOnlyContainsAttributeCerts(value: Boolean): Self = StObject.set(x, "onlyContainsAttributeCerts", value.asInstanceOf[js.Any])
    
    inline def setOnlyContainsAttributeCertsUndefined: Self = StObject.set(x, "onlyContainsAttributeCerts", js.undefined)
    
    inline def setOnlyContainsCACerts(value: Boolean): Self = StObject.set(x, "onlyContainsCACerts", value.asInstanceOf[js.Any])
    
    inline def setOnlyContainsCACertsUndefined: Self = StObject.set(x, "onlyContainsCACerts", js.undefined)
    
    inline def setOnlyContainsUserCerts(value: Boolean): Self = StObject.set(x, "onlyContainsUserCerts", value.asInstanceOf[js.Any])
    
    inline def setOnlyContainsUserCertsUndefined: Self = StObject.set(x, "onlyContainsUserCerts", js.undefined)
    
    inline def setOnlySomeReasons(value: Double): Self = StObject.set(x, "onlySomeReasons", value.asInstanceOf[js.Any])
    
    inline def setOnlySomeReasonsUndefined: Self = StObject.set(x, "onlySomeReasons", js.undefined)
  }
}

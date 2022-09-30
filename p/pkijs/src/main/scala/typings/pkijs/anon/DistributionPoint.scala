package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionPoint extends StObject {
  
  var distributionPoint: js.UndefOr[String] = js.undefined
  
  var distributionPointNames: js.UndefOr[String] = js.undefined
  
  var indirectCRL: js.UndefOr[String] = js.undefined
  
  var onlyContainsAttributeCerts: js.UndefOr[String] = js.undefined
  
  var onlyContainsCACerts: js.UndefOr[String] = js.undefined
  
  var onlyContainsUserCerts: js.UndefOr[String] = js.undefined
  
  var onlySomeReasons: js.UndefOr[String] = js.undefined
}
object DistributionPoint {
  
  inline def apply(): DistributionPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionPoint]
  }
  
  extension [Self <: DistributionPoint](x: Self) {
    
    inline def setDistributionPoint(value: String): Self = StObject.set(x, "distributionPoint", value.asInstanceOf[js.Any])
    
    inline def setDistributionPointNames(value: String): Self = StObject.set(x, "distributionPointNames", value.asInstanceOf[js.Any])
    
    inline def setDistributionPointNamesUndefined: Self = StObject.set(x, "distributionPointNames", js.undefined)
    
    inline def setDistributionPointUndefined: Self = StObject.set(x, "distributionPoint", js.undefined)
    
    inline def setIndirectCRL(value: String): Self = StObject.set(x, "indirectCRL", value.asInstanceOf[js.Any])
    
    inline def setIndirectCRLUndefined: Self = StObject.set(x, "indirectCRL", js.undefined)
    
    inline def setOnlyContainsAttributeCerts(value: String): Self = StObject.set(x, "onlyContainsAttributeCerts", value.asInstanceOf[js.Any])
    
    inline def setOnlyContainsAttributeCertsUndefined: Self = StObject.set(x, "onlyContainsAttributeCerts", js.undefined)
    
    inline def setOnlyContainsCACerts(value: String): Self = StObject.set(x, "onlyContainsCACerts", value.asInstanceOf[js.Any])
    
    inline def setOnlyContainsCACertsUndefined: Self = StObject.set(x, "onlyContainsCACerts", js.undefined)
    
    inline def setOnlyContainsUserCerts(value: String): Self = StObject.set(x, "onlyContainsUserCerts", value.asInstanceOf[js.Any])
    
    inline def setOnlyContainsUserCertsUndefined: Self = StObject.set(x, "onlyContainsUserCerts", js.undefined)
    
    inline def setOnlySomeReasons(value: String): Self = StObject.set(x, "onlySomeReasons", value.asInstanceOf[js.Any])
    
    inline def setOnlySomeReasonsUndefined: Self = StObject.set(x, "onlySomeReasons", js.undefined)
  }
}

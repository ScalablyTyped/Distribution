package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CRLIssuer extends StObject {
  
  var cRLIssuer: js.UndefOr[String] = js.undefined
  
  var cRLIssuerNames: js.UndefOr[String] = js.undefined
  
  var distributionPoint: js.UndefOr[String] = js.undefined
  
  var distributionPointNames: js.UndefOr[String] = js.undefined
  
  var reasons: js.UndefOr[String] = js.undefined
}
object CRLIssuer {
  
  inline def apply(): CRLIssuer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CRLIssuer]
  }
  
  extension [Self <: CRLIssuer](x: Self) {
    
    inline def setCRLIssuer(value: String): Self = StObject.set(x, "cRLIssuer", value.asInstanceOf[js.Any])
    
    inline def setCRLIssuerNames(value: String): Self = StObject.set(x, "cRLIssuerNames", value.asInstanceOf[js.Any])
    
    inline def setCRLIssuerNamesUndefined: Self = StObject.set(x, "cRLIssuerNames", js.undefined)
    
    inline def setCRLIssuerUndefined: Self = StObject.set(x, "cRLIssuer", js.undefined)
    
    inline def setDistributionPoint(value: String): Self = StObject.set(x, "distributionPoint", value.asInstanceOf[js.Any])
    
    inline def setDistributionPointNames(value: String): Self = StObject.set(x, "distributionPointNames", value.asInstanceOf[js.Any])
    
    inline def setDistributionPointNamesUndefined: Self = StObject.set(x, "distributionPointNames", js.undefined)
    
    inline def setDistributionPointUndefined: Self = StObject.set(x, "distributionPoint", js.undefined)
    
    inline def setReasons(value: String): Self = StObject.set(x, "reasons", value.asInstanceOf[js.Any])
    
    inline def setReasonsUndefined: Self = StObject.set(x, "reasons", js.undefined)
  }
}

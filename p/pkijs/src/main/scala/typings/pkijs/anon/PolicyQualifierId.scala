package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyQualifierId extends StObject {
  
  var policyQualifierId: js.UndefOr[String] = js.undefined
  
  var qualifier: js.UndefOr[String] = js.undefined
}
object PolicyQualifierId {
  
  inline def apply(): PolicyQualifierId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyQualifierId]
  }
  
  extension [Self <: PolicyQualifierId](x: Self) {
    
    inline def setPolicyQualifierId(value: String): Self = StObject.set(x, "policyQualifierId", value.asInstanceOf[js.Any])
    
    inline def setPolicyQualifierIdUndefined: Self = StObject.set(x, "policyQualifierId", js.undefined)
    
    inline def setQualifier(value: String): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    
    inline def setQualifierUndefined: Self = StObject.set(x, "qualifier", js.undefined)
  }
}

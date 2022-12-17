package typings.pkijs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyIdentifier extends StObject {
  
  var policyIdentifier: js.UndefOr[String] = js.undefined
  
  var policyQualifiers: js.UndefOr[String] = js.undefined
}
object PolicyIdentifier {
  
  inline def apply(): PolicyIdentifier = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolicyIdentifier]
  }
  
  extension [Self <: PolicyIdentifier](x: Self) {
    
    inline def setPolicyIdentifier(value: String): Self = StObject.set(x, "policyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPolicyIdentifierUndefined: Self = StObject.set(x, "policyIdentifier", js.undefined)
    
    inline def setPolicyQualifiers(value: String): Self = StObject.set(x, "policyQualifiers", value.asInstanceOf[js.Any])
    
    inline def setPolicyQualifiersUndefined: Self = StObject.set(x, "policyQualifiers", js.undefined)
  }
}

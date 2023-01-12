package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPolicyInformation extends StObject {
  
  var policyIdentifier: String
  
  var policyQualifiers: js.UndefOr[js.Array[PolicyQualifierInfo]] = js.undefined
}
object IPolicyInformation {
  
  inline def apply(policyIdentifier: String): IPolicyInformation = {
    val __obj = js.Dynamic.literal(policyIdentifier = policyIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPolicyInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPolicyInformation] (val x: Self) extends AnyVal {
    
    inline def setPolicyIdentifier(value: String): Self = StObject.set(x, "policyIdentifier", value.asInstanceOf[js.Any])
    
    inline def setPolicyQualifiers(value: js.Array[PolicyQualifierInfo]): Self = StObject.set(x, "policyQualifiers", value.asInstanceOf[js.Any])
    
    inline def setPolicyQualifiersUndefined: Self = StObject.set(x, "policyQualifiers", js.undefined)
    
    inline def setPolicyQualifiersVarargs(value: PolicyQualifierInfo*): Self = StObject.set(x, "policyQualifiers", js.Array(value*))
  }
}

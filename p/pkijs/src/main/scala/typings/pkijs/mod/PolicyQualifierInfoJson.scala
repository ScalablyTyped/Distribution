package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolicyQualifierInfoJson extends StObject {
  
  var policyQualifierId: String
  
  var qualifier: Any
}
object PolicyQualifierInfoJson {
  
  inline def apply(policyQualifierId: String, qualifier: Any): PolicyQualifierInfoJson = {
    val __obj = js.Dynamic.literal(policyQualifierId = policyQualifierId.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyQualifierInfoJson]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolicyQualifierInfoJson] (val x: Self) extends AnyVal {
    
    inline def setPolicyQualifierId(value: String): Self = StObject.set(x, "policyQualifierId", value.asInstanceOf[js.Any])
    
    inline def setQualifier(value: Any): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
  }
}

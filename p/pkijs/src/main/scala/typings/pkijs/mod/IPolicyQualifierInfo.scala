package typings.pkijs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPolicyQualifierInfo extends StObject {
  
  var policyQualifierId: String
  
  var qualifier: SchemaType
}
object IPolicyQualifierInfo {
  
  inline def apply(policyQualifierId: String, qualifier: SchemaType): IPolicyQualifierInfo = {
    val __obj = js.Dynamic.literal(policyQualifierId = policyQualifierId.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPolicyQualifierInfo]
  }
  
  extension [Self <: IPolicyQualifierInfo](x: Self) {
    
    inline def setPolicyQualifierId(value: String): Self = StObject.set(x, "policyQualifierId", value.asInstanceOf[js.Any])
    
    inline def setQualifier(value: SchemaType): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
  }
}

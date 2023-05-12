package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGroupEvidence
  extends StObject
     with AlertEvidence {
  
  // The name of the security group.
  var displayName: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Unique identifier of the security group.
  var securityGroupId: js.UndefOr[NullableOption[String]] = js.undefined
}
object SecurityGroupEvidence {
  
  inline def apply(): SecurityGroupEvidence = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityGroupEvidence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityGroupEvidence] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: NullableOption[String]): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameNull: Self = StObject.set(x, "displayName", null)
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setSecurityGroupId(value: NullableOption[String]): Self = StObject.set(x, "securityGroupId", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdNull: Self = StObject.set(x, "securityGroupId", null)
    
    inline def setSecurityGroupIdUndefined: Self = StObject.set(x, "securityGroupId", js.undefined)
  }
}

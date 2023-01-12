package typings.parse.mod.global.Parse.Cloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validator extends StObject {
  
  var fields: js.UndefOr[ValidatorFields | js.Array[String]] = js.undefined
  
  var requireAllUserRoles: js.UndefOr[js.Array[String] | js.Function] = js.undefined
  
  var requireAnyUserRoles: js.UndefOr[js.Array[String] | js.Function] = js.undefined
  
  var requireMaster: js.UndefOr[Boolean] = js.undefined
  
  var requireUser: js.UndefOr[Boolean] = js.undefined
  
  var requireUserKeys: js.UndefOr[ValidatorFields | js.Array[String]] = js.undefined
  
  var skipWithMasterKey: js.UndefOr[Boolean] = js.undefined
  
  var validateMasterKey: js.UndefOr[Boolean] = js.undefined
}
object Validator {
  
  inline def apply(): Validator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Validator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Validator] (val x: Self) extends AnyVal {
    
    inline def setFields(value: ValidatorFields | js.Array[String]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: String*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setRequireAllUserRoles(value: js.Array[String] | js.Function): Self = StObject.set(x, "requireAllUserRoles", value.asInstanceOf[js.Any])
    
    inline def setRequireAllUserRolesUndefined: Self = StObject.set(x, "requireAllUserRoles", js.undefined)
    
    inline def setRequireAllUserRolesVarargs(value: String*): Self = StObject.set(x, "requireAllUserRoles", js.Array(value*))
    
    inline def setRequireAnyUserRoles(value: js.Array[String] | js.Function): Self = StObject.set(x, "requireAnyUserRoles", value.asInstanceOf[js.Any])
    
    inline def setRequireAnyUserRolesUndefined: Self = StObject.set(x, "requireAnyUserRoles", js.undefined)
    
    inline def setRequireAnyUserRolesVarargs(value: String*): Self = StObject.set(x, "requireAnyUserRoles", js.Array(value*))
    
    inline def setRequireMaster(value: Boolean): Self = StObject.set(x, "requireMaster", value.asInstanceOf[js.Any])
    
    inline def setRequireMasterUndefined: Self = StObject.set(x, "requireMaster", js.undefined)
    
    inline def setRequireUser(value: Boolean): Self = StObject.set(x, "requireUser", value.asInstanceOf[js.Any])
    
    inline def setRequireUserKeys(value: ValidatorFields | js.Array[String]): Self = StObject.set(x, "requireUserKeys", value.asInstanceOf[js.Any])
    
    inline def setRequireUserKeysUndefined: Self = StObject.set(x, "requireUserKeys", js.undefined)
    
    inline def setRequireUserKeysVarargs(value: String*): Self = StObject.set(x, "requireUserKeys", js.Array(value*))
    
    inline def setRequireUserUndefined: Self = StObject.set(x, "requireUser", js.undefined)
    
    inline def setSkipWithMasterKey(value: Boolean): Self = StObject.set(x, "skipWithMasterKey", value.asInstanceOf[js.Any])
    
    inline def setSkipWithMasterKeyUndefined: Self = StObject.set(x, "skipWithMasterKey", js.undefined)
    
    inline def setValidateMasterKey(value: Boolean): Self = StObject.set(x, "validateMasterKey", value.asInstanceOf[js.Any])
    
    inline def setValidateMasterKeyUndefined: Self = StObject.set(x, "validateMasterKey", js.undefined)
  }
}

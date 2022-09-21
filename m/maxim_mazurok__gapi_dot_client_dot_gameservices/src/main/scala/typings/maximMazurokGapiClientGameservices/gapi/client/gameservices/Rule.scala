package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rule extends StObject {
  
  /** Required */
  var action: js.UndefOr[String] = js.undefined
  
  /** Additional restrictions that must be met. All conditions must pass for the rule to match. */
  var conditions: js.UndefOr[js.Array[Condition]] = js.undefined
  
  /** Human-readable description of the rule. */
  var description: js.UndefOr[String] = js.undefined
  
  /** If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries. */
  var in: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The config returned to callers of CheckPolicy for any entries that match the LOG action. */
  var logConfig: js.UndefOr[js.Array[LogConfig]] = js.undefined
  
  /**
    * If one or more 'not_in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries. The format for in and not_in entries can be found at
    * in the Local IAM documentation (see go/local-iam#features).
    */
  var notIn: js.UndefOr[js.Array[String]] = js.undefined
  
  /** A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs. */
  var permissions: js.UndefOr[js.Array[String]] = js.undefined
}
object Rule {
  
  inline def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  extension [Self <: Rule](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setConditions(value: js.Array[Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIn(value: js.Array[String]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    inline def setInUndefined: Self = StObject.set(x, "in", js.undefined)
    
    inline def setInVarargs(value: String*): Self = StObject.set(x, "in", js.Array(value*))
    
    inline def setLogConfig(value: js.Array[LogConfig]): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
    
    inline def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
    
    inline def setLogConfigVarargs(value: LogConfig*): Self = StObject.set(x, "logConfig", js.Array(value*))
    
    inline def setNotIn(value: js.Array[String]): Self = StObject.set(x, "notIn", value.asInstanceOf[js.Any])
    
    inline def setNotInUndefined: Self = StObject.set(x, "notIn", js.undefined)
    
    inline def setNotInVarargs(value: String*): Self = StObject.set(x, "notIn", js.Array(value*))
    
    inline def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value*))
  }
}

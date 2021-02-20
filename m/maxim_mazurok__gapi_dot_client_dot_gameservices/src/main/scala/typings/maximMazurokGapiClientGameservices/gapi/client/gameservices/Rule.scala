package typings.maximMazurokGapiClientGameservices.gapi.client.gameservices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Rule extends StObject {
  
  /** Required */
  var action: js.UndefOr[String] = js.native
  
  /** Additional restrictions that must be met. All conditions must pass for the rule to match. */
  var conditions: js.UndefOr[js.Array[Condition]] = js.native
  
  /** Human-readable description of the rule. */
  var description: js.UndefOr[String] = js.native
  
  /** If one or more 'in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in at least one of these entries. */
  var in: js.UndefOr[js.Array[String]] = js.native
  
  /** The config returned to callers of tech.iam.IAM.CheckPolicy for any entries that match the LOG action. */
  var logConfig: js.UndefOr[js.Array[LogConfig]] = js.native
  
  /**
    * If one or more 'not_in' clauses are specified, the rule matches if the PRINCIPAL/AUTHORITY_SELECTOR is in none of the entries. The format for in and not_in entries can be found at
    * in the Local IAM documentation (see go/local-iam#features).
    */
  var notIn: js.UndefOr[js.Array[String]] = js.native
  
  /** A permission is a string of form '..' (e.g., 'storage.buckets.list'). A value of '*' matches all permissions, and a verb part of '*' (e.g., 'storage.buckets.*') matches all verbs. */
  var permissions: js.UndefOr[js.Array[String]] = js.native
}
object Rule {
  
  @scala.inline
  def apply(): Rule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rule]
  }
  
  @scala.inline
  implicit class RuleMutableBuilder[Self <: Rule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    @scala.inline
    def setConditions(value: js.Array[Condition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    @scala.inline
    def setConditionsVarargs(value: Condition*): Self = StObject.set(x, "conditions", js.Array(value :_*))
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setIn(value: js.Array[String]): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInUndefined: Self = StObject.set(x, "in", js.undefined)
    
    @scala.inline
    def setInVarargs(value: String*): Self = StObject.set(x, "in", js.Array(value :_*))
    
    @scala.inline
    def setLogConfig(value: js.Array[LogConfig]): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
    
    @scala.inline
    def setLogConfigVarargs(value: LogConfig*): Self = StObject.set(x, "logConfig", js.Array(value :_*))
    
    @scala.inline
    def setNotIn(value: js.Array[String]): Self = StObject.set(x, "notIn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotInUndefined: Self = StObject.set(x, "notIn", js.undefined)
    
    @scala.inline
    def setNotInVarargs(value: String*): Self = StObject.set(x, "notIn", js.Array(value :_*))
    
    @scala.inline
    def setPermissions(value: js.Array[String]): Self = StObject.set(x, "permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsUndefined: Self = StObject.set(x, "permissions", js.undefined)
    
    @scala.inline
    def setPermissionsVarargs(value: String*): Self = StObject.set(x, "permissions", js.Array(value :_*))
  }
}

package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReposUpdateBranchProtectionParamsRequiredStatusChecks extends StObject {
  
  var contexts: js.Array[String]
  
  var strict: Boolean
}
object ReposUpdateBranchProtectionParamsRequiredStatusChecks {
  
  @scala.inline
  def apply(contexts: js.Array[String], strict: Boolean): ReposUpdateBranchProtectionParamsRequiredStatusChecks = {
    val __obj = js.Dynamic.literal(contexts = contexts.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposUpdateBranchProtectionParamsRequiredStatusChecks]
  }
  
  @scala.inline
  implicit class ReposUpdateBranchProtectionParamsRequiredStatusChecksMutableBuilder[Self <: ReposUpdateBranchProtectionParamsRequiredStatusChecks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value :_*))
    
    @scala.inline
    def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
  }
}

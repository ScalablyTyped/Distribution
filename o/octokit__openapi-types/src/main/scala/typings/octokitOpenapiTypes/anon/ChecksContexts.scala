package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecksContexts extends StObject {
  
  /** @description The list of status checks to require in order to merge into this branch. */
  var checks: js.UndefOr[js.Array[AppidContext]] = js.undefined
  
  /**
    * @deprecated
    * @description **Deprecated**: The list of status checks to require in order to merge into this branch. If any of these checks have recently been set by a particular GitHub App, they will be required to come from that app in future for the branch to merge. Use `checks` instead of `contexts` for more fine-grained control.
    */
  var contexts: js.UndefOr[js.Array[String]] = js.undefined
  
  /** @description Require branches to be up to date before merging. */
  var strict: js.UndefOr[Boolean] = js.undefined
}
object ChecksContexts {
  
  inline def apply(): ChecksContexts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChecksContexts]
  }
  
  extension [Self <: ChecksContexts](x: Self) {
    
    inline def setChecks(value: js.Array[AppidContext]): Self = StObject.set(x, "checks", value.asInstanceOf[js.Any])
    
    inline def setChecksUndefined: Self = StObject.set(x, "checks", js.undefined)
    
    inline def setChecksVarargs(value: AppidContext*): Self = StObject.set(x, "checks", js.Array(value*))
    
    inline def setContexts(value: js.Array[String]): Self = StObject.set(x, "contexts", value.asInstanceOf[js.Any])
    
    inline def setContextsUndefined: Self = StObject.set(x, "contexts", js.undefined)
    
    inline def setContextsVarargs(value: String*): Self = StObject.set(x, "contexts", js.Array(value*))
    
    inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    
    inline def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
  }
}

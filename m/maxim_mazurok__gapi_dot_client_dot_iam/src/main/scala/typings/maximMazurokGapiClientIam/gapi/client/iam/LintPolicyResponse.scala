package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LintPolicyResponse extends StObject {
  
  /** List of lint results sorted by `severity` in descending order. */
  var lintResults: js.UndefOr[js.Array[LintResult]] = js.undefined
}
object LintPolicyResponse {
  
  inline def apply(): LintPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LintPolicyResponse]
  }
  
  extension [Self <: LintPolicyResponse](x: Self) {
    
    inline def setLintResults(value: js.Array[LintResult]): Self = StObject.set(x, "lintResults", value.asInstanceOf[js.Any])
    
    inline def setLintResultsUndefined: Self = StObject.set(x, "lintResults", js.undefined)
    
    inline def setLintResultsVarargs(value: LintResult*): Self = StObject.set(x, "lintResults", js.Array(value*))
  }
}

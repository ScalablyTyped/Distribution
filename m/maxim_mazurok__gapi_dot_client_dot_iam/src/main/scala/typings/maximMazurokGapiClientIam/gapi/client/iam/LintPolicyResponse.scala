package typings.maximMazurokGapiClientIam.gapi.client.iam

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LintPolicyResponse extends StObject {
  
  /** List of lint results sorted by `severity` in descending order. */
  var lintResults: js.UndefOr[js.Array[LintResult]] = js.undefined
}
object LintPolicyResponse {
  
  @scala.inline
  def apply(): LintPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LintPolicyResponse]
  }
  
  @scala.inline
  implicit class LintPolicyResponseMutableBuilder[Self <: LintPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLintResults(value: js.Array[LintResult]): Self = StObject.set(x, "lintResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLintResultsUndefined: Self = StObject.set(x, "lintResults", js.undefined)
    
    @scala.inline
    def setLintResultsVarargs(value: LintResult*): Self = StObject.set(x, "lintResults", js.Array(value :_*))
  }
}

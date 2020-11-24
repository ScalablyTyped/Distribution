package typings.maximMazurokGapiClientIam.gapi.client.iam

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LintPolicyResponse extends js.Object {
  
  /** List of lint results sorted by `severity` in descending order. */
  var lintResults: js.UndefOr[js.Array[LintResult]] = js.native
}
object LintPolicyResponse {
  
  @scala.inline
  def apply(): LintPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LintPolicyResponse]
  }
  
  @scala.inline
  implicit class LintPolicyResponseOps[Self <: LintPolicyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLintResultsVarargs(value: LintResult*): Self = this.set("lintResults", js.Array(value :_*))
    
    @scala.inline
    def setLintResults(value: js.Array[LintResult]): Self = this.set("lintResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLintResults: Self = this.set("lintResults", js.undefined)
  }
}

package typings.maximMazurokGapiClientFirebaserules.gapi.client.firebaserules

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestRulesetRequest extends js.Object {
  
  /** Optional `Source` to be checked for correctness. This field must not be set when the resource name refers to a `Ruleset`. */
  var source: js.UndefOr[Source] = js.native
  
  /** Inline `TestSuite` to run. */
  var testSuite: js.UndefOr[TestSuite] = js.native
}
object TestRulesetRequest {
  
  @scala.inline
  def apply(): TestRulesetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestRulesetRequest]
  }
  
  @scala.inline
  implicit class TestRulesetRequestOps[Self <: TestRulesetRequest] (val x: Self) extends AnyVal {
    
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
    def setSource(value: Source): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setTestSuite(value: TestSuite): Self = this.set("testSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestSuite: Self = this.set("testSuite", js.undefined)
  }
}

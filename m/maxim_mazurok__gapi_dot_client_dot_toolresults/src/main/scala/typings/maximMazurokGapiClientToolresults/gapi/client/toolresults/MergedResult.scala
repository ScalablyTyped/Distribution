package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MergedResult extends js.Object {
  
  /** Outcome of the resource */
  var outcome: js.UndefOr[Outcome] = js.native
  
  /** State of the resource */
  var state: js.UndefOr[String] = js.native
  
  /**
    * The combined and rolled-up result of each test suite that was run as part of this environment. Combining: When the test cases from a suite are run in different steps (sharding), the
    * results are added back together in one overview. (e.g., if shard1 has 2 failures and shard2 has 1 failure than the overview failure_count = 3). Rollup: When test cases from the same
    * suite are run multiple times (flaky), the results are combined (e.g., if testcase1.run1 fails, testcase1.run2 passes, and both testcase2.run1 and testcase2.run2 fail then the
    * overview flaky_count = 1 and failure_count = 1).
    */
  var testSuiteOverviews: js.UndefOr[js.Array[TestSuiteOverview]] = js.native
}
object MergedResult {
  
  @scala.inline
  def apply(): MergedResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MergedResult]
  }
  
  @scala.inline
  implicit class MergedResultOps[Self <: MergedResult] (val x: Self) extends AnyVal {
    
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
    def setOutcome(value: Outcome): Self = this.set("outcome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutcome: Self = this.set("outcome", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTestSuiteOverviewsVarargs(value: TestSuiteOverview*): Self = this.set("testSuiteOverviews", js.Array(value :_*))
    
    @scala.inline
    def setTestSuiteOverviews(value: js.Array[TestSuiteOverview]): Self = this.set("testSuiteOverviews", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestSuiteOverviews: Self = this.set("testSuiteOverviews", js.undefined)
  }
}

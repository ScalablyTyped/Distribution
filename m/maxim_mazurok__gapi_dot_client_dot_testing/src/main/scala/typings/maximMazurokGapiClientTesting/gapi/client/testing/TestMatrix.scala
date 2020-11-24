package typings.maximMazurokGapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TestMatrix extends js.Object {
  
  /** Information about the client which invoked the test. */
  var clientInfo: js.UndefOr[ClientInfo] = js.native
  
  /** Required. The devices the tests are being executed on. */
  var environmentMatrix: js.UndefOr[EnvironmentMatrix] = js.native
  
  /**
    * If true, only a single attempt at most will be made to run each execution/shard in the matrix. Flaky test attempts are not affected. Normally, 2 or more attempts are made if a
    * potential infrastructure issue is detected. This feature is for latency sensitive workloads. The incidence of execution failures may be significantly greater for fail-fast matrices
    * and support is more limited because of that expectation.
    */
  var failFast: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of times a TestExecution should be re-attempted if one or more of its test cases fail for any reason. The maximum number of reruns allowed is 10. Default is 0, which
    * implies no reruns.
    */
  var flakyTestAttempts: js.UndefOr[Double] = js.native
  
  /** Output only. Describes why the matrix is considered invalid. Only useful for matrices in the INVALID state. */
  var invalidMatrixDetails: js.UndefOr[String] = js.native
  
  /** Output Only. The overall outcome of the test. Only set when the test matrix state is FINISHED. */
  var outcomeSummary: js.UndefOr[String] = js.native
  
  /** The cloud project that owns the test matrix. */
  var projectId: js.UndefOr[String] = js.native
  
  /** Required. Where the results for the matrix are written. */
  var resultStorage: js.UndefOr[ResultStorage] = js.native
  
  /** Output only. Indicates the current progress of the test matrix. */
  var state: js.UndefOr[String] = js.native
  
  /** Output only. The list of test executions that the service creates for this matrix. */
  var testExecutions: js.UndefOr[js.Array[TestExecution]] = js.native
  
  /** Output only. Unique id set by the service. */
  var testMatrixId: js.UndefOr[String] = js.native
  
  /** Required. How to run the test. */
  var testSpecification: js.UndefOr[TestSpecification] = js.native
  
  /** Output only. The time this test matrix was initially created. */
  var timestamp: js.UndefOr[String] = js.native
}
object TestMatrix {
  
  @scala.inline
  def apply(): TestMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestMatrix]
  }
  
  @scala.inline
  implicit class TestMatrixOps[Self <: TestMatrix] (val x: Self) extends AnyVal {
    
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
    def setClientInfo(value: ClientInfo): Self = this.set("clientInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientInfo: Self = this.set("clientInfo", js.undefined)
    
    @scala.inline
    def setEnvironmentMatrix(value: EnvironmentMatrix): Self = this.set("environmentMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnvironmentMatrix: Self = this.set("environmentMatrix", js.undefined)
    
    @scala.inline
    def setFailFast(value: Boolean): Self = this.set("failFast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailFast: Self = this.set("failFast", js.undefined)
    
    @scala.inline
    def setFlakyTestAttempts(value: Double): Self = this.set("flakyTestAttempts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlakyTestAttempts: Self = this.set("flakyTestAttempts", js.undefined)
    
    @scala.inline
    def setInvalidMatrixDetails(value: String): Self = this.set("invalidMatrixDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInvalidMatrixDetails: Self = this.set("invalidMatrixDetails", js.undefined)
    
    @scala.inline
    def setOutcomeSummary(value: String): Self = this.set("outcomeSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutcomeSummary: Self = this.set("outcomeSummary", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setResultStorage(value: ResultStorage): Self = this.set("resultStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResultStorage: Self = this.set("resultStorage", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setTestExecutionsVarargs(value: TestExecution*): Self = this.set("testExecutions", js.Array(value :_*))
    
    @scala.inline
    def setTestExecutions(value: js.Array[TestExecution]): Self = this.set("testExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestExecutions: Self = this.set("testExecutions", js.undefined)
    
    @scala.inline
    def setTestMatrixId(value: String): Self = this.set("testMatrixId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestMatrixId: Self = this.set("testMatrixId", js.undefined)
    
    @scala.inline
    def setTestSpecification(value: TestSpecification): Self = this.set("testSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestSpecification: Self = this.set("testSpecification", js.undefined)
    
    @scala.inline
    def setTimestamp(value: String): Self = this.set("timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestamp: Self = this.set("timestamp", js.undefined)
  }
}

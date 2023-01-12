package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestMatrix extends StObject {
  
  /** Information about the client which invoked the test. */
  var clientInfo: js.UndefOr[ClientInfo] = js.undefined
  
  /** Required. The devices the tests are being executed on. */
  var environmentMatrix: js.UndefOr[EnvironmentMatrix] = js.undefined
  
  /**
    * If true, only a single attempt at most will be made to run each execution/shard in the matrix. Flaky test attempts are not affected. Normally, 2 or more attempts are made if a
    * potential infrastructure issue is detected. This feature is for latency sensitive workloads. The incidence of execution failures may be significantly greater for fail-fast matrices
    * and support is more limited because of that expectation.
    */
  var failFast: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of times a TestExecution should be re-attempted if one or more of its test cases fail for any reason. The maximum number of reruns allowed is 10. Default is 0, which
    * implies no reruns.
    */
  var flakyTestAttempts: js.UndefOr[Double] = js.undefined
  
  /** Output only. Describes why the matrix is considered invalid. Only useful for matrices in the INVALID state. */
  var invalidMatrixDetails: js.UndefOr[String] = js.undefined
  
  /** Output Only. The overall outcome of the test. Only set when the test matrix state is FINISHED. */
  var outcomeSummary: js.UndefOr[String] = js.undefined
  
  /** The cloud project that owns the test matrix. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** Required. Where the results for the matrix are written. */
  var resultStorage: js.UndefOr[ResultStorage] = js.undefined
  
  /** Output only. Indicates the current progress of the test matrix. */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. The list of test executions that the service creates for this matrix. */
  var testExecutions: js.UndefOr[js.Array[TestExecution]] = js.undefined
  
  /** Output only. Unique id set by the service. */
  var testMatrixId: js.UndefOr[String] = js.undefined
  
  /** Required. How to run the test. */
  var testSpecification: js.UndefOr[TestSpecification] = js.undefined
  
  /** Output only. The time this test matrix was initially created. */
  var timestamp: js.UndefOr[String] = js.undefined
}
object TestMatrix {
  
  inline def apply(): TestMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestMatrix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestMatrix] (val x: Self) extends AnyVal {
    
    inline def setClientInfo(value: ClientInfo): Self = StObject.set(x, "clientInfo", value.asInstanceOf[js.Any])
    
    inline def setClientInfoUndefined: Self = StObject.set(x, "clientInfo", js.undefined)
    
    inline def setEnvironmentMatrix(value: EnvironmentMatrix): Self = StObject.set(x, "environmentMatrix", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentMatrixUndefined: Self = StObject.set(x, "environmentMatrix", js.undefined)
    
    inline def setFailFast(value: Boolean): Self = StObject.set(x, "failFast", value.asInstanceOf[js.Any])
    
    inline def setFailFastUndefined: Self = StObject.set(x, "failFast", js.undefined)
    
    inline def setFlakyTestAttempts(value: Double): Self = StObject.set(x, "flakyTestAttempts", value.asInstanceOf[js.Any])
    
    inline def setFlakyTestAttemptsUndefined: Self = StObject.set(x, "flakyTestAttempts", js.undefined)
    
    inline def setInvalidMatrixDetails(value: String): Self = StObject.set(x, "invalidMatrixDetails", value.asInstanceOf[js.Any])
    
    inline def setInvalidMatrixDetailsUndefined: Self = StObject.set(x, "invalidMatrixDetails", js.undefined)
    
    inline def setOutcomeSummary(value: String): Self = StObject.set(x, "outcomeSummary", value.asInstanceOf[js.Any])
    
    inline def setOutcomeSummaryUndefined: Self = StObject.set(x, "outcomeSummary", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setResultStorage(value: ResultStorage): Self = StObject.set(x, "resultStorage", value.asInstanceOf[js.Any])
    
    inline def setResultStorageUndefined: Self = StObject.set(x, "resultStorage", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTestExecutions(value: js.Array[TestExecution]): Self = StObject.set(x, "testExecutions", value.asInstanceOf[js.Any])
    
    inline def setTestExecutionsUndefined: Self = StObject.set(x, "testExecutions", js.undefined)
    
    inline def setTestExecutionsVarargs(value: TestExecution*): Self = StObject.set(x, "testExecutions", js.Array(value*))
    
    inline def setTestMatrixId(value: String): Self = StObject.set(x, "testMatrixId", value.asInstanceOf[js.Any])
    
    inline def setTestMatrixIdUndefined: Self = StObject.set(x, "testMatrixId", js.undefined)
    
    inline def setTestSpecification(value: TestSpecification): Self = StObject.set(x, "testSpecification", value.asInstanceOf[js.Any])
    
    inline def setTestSpecificationUndefined: Self = StObject.set(x, "testSpecification", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}

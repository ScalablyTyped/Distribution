package typings.maximMazurokGapiClientTesting.gapi.client.testing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestExecution extends StObject {
  
  /** Output only. How the host machine(s) are configured. */
  var environment: js.UndefOr[Environment] = js.undefined
  
  /** Output only. Unique id set by the service. */
  var id: js.UndefOr[String] = js.undefined
  
  /** Output only. Id of the containing TestMatrix. */
  var matrixId: js.UndefOr[String] = js.undefined
  
  /** Output only. The cloud project that owns the test execution. */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** Output only. Details about the shard. */
  var shard: js.UndefOr[Shard] = js.undefined
  
  /** Output only. Indicates the current progress of the test execution (e.g., FINISHED). */
  var state: js.UndefOr[String] = js.undefined
  
  /** Output only. Additional details about the running test. */
  var testDetails: js.UndefOr[TestDetails] = js.undefined
  
  /** Output only. How to run the test. */
  var testSpecification: js.UndefOr[TestSpecification] = js.undefined
  
  /** Output only. The time this test execution was initially created. */
  var timestamp: js.UndefOr[String] = js.undefined
  
  /** Output only. Where the results for this execution are written. */
  var toolResultsStep: js.UndefOr[ToolResultsStep] = js.undefined
}
object TestExecution {
  
  inline def apply(): TestExecution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestExecution]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestExecution] (val x: Self) extends AnyVal {
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMatrixId(value: String): Self = StObject.set(x, "matrixId", value.asInstanceOf[js.Any])
    
    inline def setMatrixIdUndefined: Self = StObject.set(x, "matrixId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setShard(value: Shard): Self = StObject.set(x, "shard", value.asInstanceOf[js.Any])
    
    inline def setShardUndefined: Self = StObject.set(x, "shard", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setTestDetails(value: TestDetails): Self = StObject.set(x, "testDetails", value.asInstanceOf[js.Any])
    
    inline def setTestDetailsUndefined: Self = StObject.set(x, "testDetails", js.undefined)
    
    inline def setTestSpecification(value: TestSpecification): Self = StObject.set(x, "testSpecification", value.asInstanceOf[js.Any])
    
    inline def setTestSpecificationUndefined: Self = StObject.set(x, "testSpecification", js.undefined)
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setToolResultsStep(value: ToolResultsStep): Self = StObject.set(x, "toolResultsStep", value.asInstanceOf[js.Any])
    
    inline def setToolResultsStepUndefined: Self = StObject.set(x, "toolResultsStep", js.undefined)
  }
}

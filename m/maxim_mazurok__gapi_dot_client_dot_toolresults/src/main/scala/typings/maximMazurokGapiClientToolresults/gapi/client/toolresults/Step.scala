package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Step extends StObject {
  
  /**
    * The time when the step status was set to complete. This value will be set automatically when state transitions to COMPLETE. - In response: set if the execution state is COMPLETE. -
    * In create/update request: never set
    */
  var completionTime: js.UndefOr[Timestamp] = js.undefined
  
  /** The time when the step was created. - In response: always set - In create/update request: never set */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  
  /** A description of this tool For example: mvn clean package -D skipTests=true - In response: present if set by create/update request - In create/update request: optional */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * How much the device resource is used to perform the test. This is the device usage used for billing purpose, which is different from the run_duration, for example, infrastructure
    * failure won't be charged for device usage. PRECONDITION_FAILED will be returned if one attempts to set a device_usage on a step which already has this field set. - In response:
    * present if previously set. - In create request: optional - In update request: optional
    */
  var deviceUsageDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * If the execution containing this step has any dimension_definition set, then this field allows the child to specify the values of the dimensions. The keys must exactly match the
    * dimension_definition of the execution. For example, if the execution has `dimension_definition = ['attempt', 'device']` then a step must define values for those dimensions, eg.
    * `dimension_value = ['attempt': '1', 'device': 'Nexus 6']` If a step does not participate in one dimension of the matrix, the value for that dimension should be empty string. For
    * example, if one of the tests is executed by a runner which does not support retries, the step could have `dimension_value = ['attempt': '', 'device': 'Nexus 6']` If the step does
    * not participate in any dimensions of the matrix, it may leave dimension_value unset. A PRECONDITION_FAILED will be returned if any of the keys do not exist in the
    * dimension_definition of the execution. A PRECONDITION_FAILED will be returned if another step in this execution already has the same name and dimension_value, but differs on other
    * data fields, for example, step field is different. A PRECONDITION_FAILED will be returned if dimension_value is set, and there is a dimension_definition in the execution which is
    * not specified as one of the keys. - In response: present if set by create - In create request: optional - In update request: never set
    */
  var dimensionValue: js.UndefOr[js.Array[StepDimensionValueEntry]] = js.undefined
  
  /** Whether any of the outputs of this step are images whose thumbnails can be fetched with ListThumbnails. - In response: always set - In create/update request: never set */
  var hasImages: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Arbitrary user-supplied key/value pairs that are associated with the step. Users are responsible for managing the key namespace such that keys don't accidentally collide. An
    * INVALID_ARGUMENT will be returned if the number of labels exceeds 100 or if the length of any of the keys or values exceeds 100 characters. - In response: always set - In create
    * request: optional - In update request: optional; any new key/value pair will be added to the map, and any new value for an existing key will update that key's value
    */
  var labels: js.UndefOr[js.Array[StepLabelsEntry]] = js.undefined
  
  /**
    * Details when multiple steps are run with the same configuration as a group. These details can be used identify which group this step is part of. It also identifies the groups
    * 'primary step' which indexes all the group members. - In response: present if previously set. - In create request: optional, set iff this step was performed more than once. - In
    * update request: optional
    */
  var multiStep: js.UndefOr[MultiStep] = js.undefined
  
  /**
    * A short human-readable name to display in the UI. Maximum of 100 characters. For example: Clean build A PRECONDITION_FAILED will be returned upon creating a new step if it shares
    * its name and dimension_value with an existing step. If two steps represent a similar action, but have different dimension values, they should share the same name. For instance, if
    * the same set of tests is run on two different platforms, the two steps should have the same name. - In response: always set - In create request: always set - In update request:
    * never set
    */
  var name: js.UndefOr[String] = js.undefined
  
  /** Classification of the result, for example into SUCCESS or FAILURE - In response: present if set by create/update request - In create/update request: optional */
  var outcome: js.UndefOr[Outcome] = js.undefined
  
  /**
    * How long it took for this step to run. If unset, this is set to the difference between creation_time and completion_time when the step is set to the COMPLETE state. In some cases,
    * it is appropriate to set this value separately: For instance, if a step is created, but the operation it represents is queued for a few minutes before it executes, it would be
    * appropriate not to include the time spent queued in its run_duration. PRECONDITION_FAILED will be returned if one attempts to set a run_duration on a step which already has this
    * field set. - In response: present if previously set; always present on COMPLETE step - In create request: optional - In update request: optional
    */
  var runDuration: js.UndefOr[Duration] = js.undefined
  
  /**
    * The initial state is IN_PROGRESS. The only legal state transitions are * IN_PROGRESS -> COMPLETE A PRECONDITION_FAILED will be returned if an invalid transition is requested. It is
    * valid to create Step with a state set to COMPLETE. The state can only be set to COMPLETE once. A PRECONDITION_FAILED will be returned if the state is set to COMPLETE multiple times.
    * - In response: always set - In create/update request: optional
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * A unique identifier within a Execution for this Step. Returns INVALID_ARGUMENT if this field is set or overwritten by the caller. - In response: always set - In create/update
    * request: never set
    */
  var stepId: js.UndefOr[String] = js.undefined
  
  /** An execution of a test runner. */
  var testExecutionStep: js.UndefOr[TestExecutionStep] = js.undefined
  
  /** An execution of a tool (used for steps we don't explicitly support). */
  var toolExecutionStep: js.UndefOr[ToolExecutionStep] = js.undefined
}
object Step {
  
  inline def apply(): Step = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Step]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Step] (val x: Self) extends AnyVal {
    
    inline def setCompletionTime(value: Timestamp): Self = StObject.set(x, "completionTime", value.asInstanceOf[js.Any])
    
    inline def setCompletionTimeUndefined: Self = StObject.set(x, "completionTime", js.undefined)
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDeviceUsageDuration(value: Duration): Self = StObject.set(x, "deviceUsageDuration", value.asInstanceOf[js.Any])
    
    inline def setDeviceUsageDurationUndefined: Self = StObject.set(x, "deviceUsageDuration", js.undefined)
    
    inline def setDimensionValue(value: js.Array[StepDimensionValueEntry]): Self = StObject.set(x, "dimensionValue", value.asInstanceOf[js.Any])
    
    inline def setDimensionValueUndefined: Self = StObject.set(x, "dimensionValue", js.undefined)
    
    inline def setDimensionValueVarargs(value: StepDimensionValueEntry*): Self = StObject.set(x, "dimensionValue", js.Array(value*))
    
    inline def setHasImages(value: Boolean): Self = StObject.set(x, "hasImages", value.asInstanceOf[js.Any])
    
    inline def setHasImagesUndefined: Self = StObject.set(x, "hasImages", js.undefined)
    
    inline def setLabels(value: js.Array[StepLabelsEntry]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: StepLabelsEntry*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setMultiStep(value: MultiStep): Self = StObject.set(x, "multiStep", value.asInstanceOf[js.Any])
    
    inline def setMultiStepUndefined: Self = StObject.set(x, "multiStep", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOutcome(value: Outcome): Self = StObject.set(x, "outcome", value.asInstanceOf[js.Any])
    
    inline def setOutcomeUndefined: Self = StObject.set(x, "outcome", js.undefined)
    
    inline def setRunDuration(value: Duration): Self = StObject.set(x, "runDuration", value.asInstanceOf[js.Any])
    
    inline def setRunDurationUndefined: Self = StObject.set(x, "runDuration", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStepId(value: String): Self = StObject.set(x, "stepId", value.asInstanceOf[js.Any])
    
    inline def setStepIdUndefined: Self = StObject.set(x, "stepId", js.undefined)
    
    inline def setTestExecutionStep(value: TestExecutionStep): Self = StObject.set(x, "testExecutionStep", value.asInstanceOf[js.Any])
    
    inline def setTestExecutionStepUndefined: Self = StObject.set(x, "testExecutionStep", js.undefined)
    
    inline def setToolExecutionStep(value: ToolExecutionStep): Self = StObject.set(x, "toolExecutionStep", value.asInstanceOf[js.Any])
    
    inline def setToolExecutionStepUndefined: Self = StObject.set(x, "toolExecutionStep", js.undefined)
  }
}

package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.TopLevel
import typings.maximMazurokGapiClientMl.maximMazurokGapiClientMlStrings.GoogleCloudMlV1__Version
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1Version extends js.Object {
  
  /**
    * Optional. Accelerator config for using GPUs for online prediction (beta). Only specify this field if you have specified a Compute Engine (N1) machine type in the `machineType`
    * field. Learn more about [using GPUs for online prediction](/ml-engine/docs/machine-types-online-prediction#gpus).
    */
  var acceleratorConfig: js.UndefOr[GoogleCloudMlV1AcceleratorConfig] = js.native
  
  /**
    * Automatically scale the number of nodes used to serve the model in response to increases and decreases in traffic. Care should be taken to ramp up traffic according to the model's
    * ability to scale or you will start seeing increases in latency and 429 response codes. Note that you cannot use AutoScaling if your version uses
    * [GPUs](#Version.FIELDS.accelerator_config). Instead, you must use specify `manual_scaling`.
    */
  var autoScaling: js.UndefOr[GoogleCloudMlV1AutoScaling] = js.native
  
  /**
    * Optional. Specifies a custom container to use for serving predictions. If you specify this field, then `machineType` is required. If you specify this field, then `deploymentUri` is
    * optional. If you specify this field, then you must not specify `runtimeVersion`, `packageUris`, `framework`, `pythonVersion`, or `predictionClass`.
    */
  var container: js.UndefOr[GoogleCloudMlV1ContainerSpec] = js.native
  
  /** Output only. The time the version was created. */
  var createTime: js.UndefOr[String] = js.native
  
  /**
    * The Cloud Storage URI of a directory containing trained model artifacts to be used to create the model version. See the [guide to deploying
    * models](/ai-platform/prediction/docs/deploying-models) for more information. The total number of files under this directory must not exceed 1000. During
    * projects.models.versions.create, AI Platform Prediction copies all files from the specified directory to a location managed by the service. From then on, AI Platform Prediction uses
    * these copies of the model artifacts to serve predictions, not the original files in Cloud Storage, so this location is useful only as a historical record. If you specify container,
    * then this field is optional. Otherwise, it is required. Learn [how to use this field with a custom container](/ai-platform/prediction/docs/custom-container-requirements#artifacts).
    */
  var deploymentUri: js.UndefOr[String] = js.native
  
  /** Optional. The description specified for the version when it was created. */
  var description: js.UndefOr[String] = js.native
  
  /** Output only. The details of a failure or a cancellation. */
  var errorMessage: js.UndefOr[String] = js.native
  
  /**
    * `etag` is used for optimistic concurrency control as a way to help prevent simultaneous updates of a model from overwriting each other. It is strongly suggested that systems make
    * use of the `etag` in the read-modify-write cycle to perform model updates in order to avoid race conditions: An `etag` is returned in the response to `GetVersion`, and systems are
    * expected to put that etag in the request to `UpdateVersion` to ensure that their change will be applied to the model as intended.
    */
  var etag: js.UndefOr[String] = js.native
  
  /** Optional. Configures explainability features on the model's version. Some explanation features require additional metadata to be loaded as part of the model payload. */
  var explanationConfig: js.UndefOr[GoogleCloudMlV1ExplanationConfig] = js.native
  
  /**
    * Optional. The machine learning framework AI Platform uses to train this version of the model. Valid values are `TENSORFLOW`, `SCIKIT_LEARN`, `XGBOOST`. If you do not specify a
    * framework, AI Platform will analyze files in the deployment_uri to determine a framework. If you choose `SCIKIT_LEARN` or `XGBOOST`, you must also set the runtime version of the
    * model to 1.4 or greater. Do **not** specify a framework if you're deploying a [custom prediction routine](/ai-platform/prediction/docs/custom-prediction-routines) or if you're using
    * a [custom container](/ai-platform/prediction/docs/use-custom-container).
    */
  var framework: js.UndefOr[String] = js.native
  
  /**
    * Output only. If true, this version will be used to handle prediction requests that do not specify a version. You can change the default version by calling
    * projects.methods.versions.setDefault.
    */
  var isDefault: js.UndefOr[Boolean] = js.native
  
  /**
    * Optional. One or more labels that you can add, to organize your model versions. Each label is a key-value pair, where both the key and the value are arbitrary strings that you
    * supply. For more information, see the documentation on using labels.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ GoogleCloudMlV1__Version with TopLevel[js.Any]
  ] = js.native
  
  /** Output only. The time the version was last used for prediction. */
  var lastUseTime: js.UndefOr[String] = js.native
  
  /**
    * Optional. The type of machine on which to serve the model. Currently only applies to online prediction service. If this field is not specified, it defaults to `mls1-c1-m2`. Online
    * prediction supports the following machine types: * `mls1-c1-m2` * `mls1-c4-m2` * `n1-standard-2` * `n1-standard-4` * `n1-standard-8` * `n1-standard-16` * `n1-standard-32` *
    * `n1-highmem-2` * `n1-highmem-4` * `n1-highmem-8` * `n1-highmem-16` * `n1-highmem-32` * `n1-highcpu-2` * `n1-highcpu-4` * `n1-highcpu-8` * `n1-highcpu-16` * `n1-highcpu-32`
    * `mls1-c4-m2` is in beta. All other machine types are generally available. Learn more about the [differences between machine types](/ml-engine/docs/machine-types-online-prediction).
    */
  var machineType: js.UndefOr[String] = js.native
  
  /**
    * Manually select the number of nodes to use for serving the model. You should generally use `auto_scaling` with an appropriate `min_nodes` instead, but this option is available if
    * you want more predictable billing. Beware that latency and error rates will increase if the traffic exceeds that capability of the system to serve it based on the selected number of
    * nodes.
    */
  var manualScaling: js.UndefOr[GoogleCloudMlV1ManualScaling] = js.native
  
  /** Required. The name specified for the version when it was created. The version name must be unique within the model it is created in. */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Optional. Cloud Storage paths (`gs://…`) of packages for [custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines) or [scikit-learn pipelines with custom
    * code](/ml-engine/docs/scikit/exporting-for-prediction#custom-pipeline-code). For a custom prediction routine, one of these packages must contain your Predictor class (see
    * [`predictionClass`](#Version.FIELDS.prediction_class)). Additionally, include any dependencies used by your Predictor or scikit-learn pipeline uses that are not already included in
    * your selected [runtime version](/ml-engine/docs/tensorflow/runtime-version-list). If you specify this field, you must also set [`runtimeVersion`](#Version.FIELDS.runtime_version) to
    * 1.4 or greater.
    */
  var packageUris: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Optional. The fully qualified name (module_name.class_name) of a class that implements the Predictor interface described in this reference field. The module containing this class
    * should be included in a package provided to the [`packageUris` field](#Version.FIELDS.package_uris). Specify this field if and only if you are deploying a [custom prediction routine
    * (beta)](/ml-engine/docs/tensorflow/custom-prediction-routines). If you specify this field, you must set [`runtimeVersion`](#Version.FIELDS.runtime_version) to 1.4 or greater and you
    * must set `machineType` to a [legacy (MLS1) machine type](/ml-engine/docs/machine-types-online-prediction). The following code sample provides the Predictor interface: class
    * Predictor(object): """Interface for constructing custom predictors.""" def predict(self, instances, **kwargs): """Performs custom prediction. Instances are the decoded values from
    * the request. They have already been deserialized from JSON. Args: instances: A list of prediction input instances. **kwargs: A dictionary of keyword args provided as additional
    * fields on the predict request body. Returns: A list of outputs containing the prediction results. This list must be JSON serializable. """ raise NotImplementedError() @classmethod
    * def from_path(cls, model_dir): """Creates an instance of Predictor using the given path. Loading of the predictor should be done in this method. Args: model_dir: The local directory
    * that contains the exported model file along with any additional files uploaded when creating the version resource. Returns: An instance implementing this Predictor class. """ raise
    * NotImplementedError() Learn more about [the Predictor interface and custom prediction routines](/ml-engine/docs/tensorflow/custom-prediction-routines).
    */
  var predictionClass: js.UndefOr[String] = js.native
  
  /**
    * Required. The version of Python used in prediction. The following Python versions are available: * Python '3.7' is available when `runtime_version` is set to '1.15' or later. *
    * Python '3.5' is available when `runtime_version` is set to a version from '1.4' to '1.14'. * Python '2.7' is available when `runtime_version` is set to '1.15' or earlier. Read more
    * about the Python versions available for [each runtime version](/ml-engine/docs/runtime-version-list).
    */
  var pythonVersion: js.UndefOr[String] = js.native
  
  /**
    * Optional. *Only* specify this field in a projects.models.versions.patch request. Specifying it in a projects.models.versions.create request has no effect. Configures the
    * request-response pair logging on predictions from this Version.
    */
  var requestLoggingConfig: js.UndefOr[GoogleCloudMlV1RequestLoggingConfig] = js.native
  
  /**
    * Optional. Specifies paths on a custom container's HTTP server where AI Platform Prediction sends certain requests. If you specify this field, then you must also specify the
    * `container` field. If you specify the `container` field and do not specify this field, it defaults to the following: ```json { "predict":
    * "/v1/models/MODEL/versions/VERSION:predict", "health": "/v1/models/MODEL/versions/VERSION" } ``` See RouteMap for more details about these default values.
    */
  var routes: js.UndefOr[GoogleCloudMlV1RouteMap] = js.native
  
  /**
    * Required. The AI Platform runtime version to use for this deployment. For more information, see the [runtime version list](/ml-engine/docs/runtime-version-list) and [how to manage
    * runtime versions](/ml-engine/docs/versioning).
    */
  var runtimeVersion: js.UndefOr[String] = js.native
  
  /**
    * Optional. Specifies the service account for resource access control. If you specify this field, then you must also specify either the `containerSpec` or the `predictionClass` field.
    * Learn more about [using a custom service account](/ai-platform/prediction/docs/custom-service-account).
    */
  var serviceAccount: js.UndefOr[String] = js.native
  
  /** Output only. The state of a version. */
  var state: js.UndefOr[String] = js.native
}
object GoogleCloudMlV1Version {
  
  @scala.inline
  def apply(): GoogleCloudMlV1Version = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1Version]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1VersionOps[Self <: GoogleCloudMlV1Version] (val x: Self) extends AnyVal {
    
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
    def setAcceleratorConfig(value: GoogleCloudMlV1AcceleratorConfig): Self = this.set("acceleratorConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceleratorConfig: Self = this.set("acceleratorConfig", js.undefined)
    
    @scala.inline
    def setAutoScaling(value: GoogleCloudMlV1AutoScaling): Self = this.set("autoScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoScaling: Self = this.set("autoScaling", js.undefined)
    
    @scala.inline
    def setContainer(value: GoogleCloudMlV1ContainerSpec): Self = this.set("container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    
    @scala.inline
    def setCreateTime(value: String): Self = this.set("createTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateTime: Self = this.set("createTime", js.undefined)
    
    @scala.inline
    def setDeploymentUri(value: String): Self = this.set("deploymentUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeploymentUri: Self = this.set("deploymentUri", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setExplanationConfig(value: GoogleCloudMlV1ExplanationConfig): Self = this.set("explanationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplanationConfig: Self = this.set("explanationConfig", js.undefined)
    
    @scala.inline
    def setFramework(value: String): Self = this.set("framework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFramework: Self = this.set("framework", js.undefined)
    
    @scala.inline
    def setIsDefault(value: Boolean): Self = this.set("isDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDefault: Self = this.set("isDefault", js.undefined)
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ GoogleCloudMlV1__Version with TopLevel[js.Any]
    ): Self = this.set("labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabels: Self = this.set("labels", js.undefined)
    
    @scala.inline
    def setLastUseTime(value: String): Self = this.set("lastUseTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastUseTime: Self = this.set("lastUseTime", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    
    @scala.inline
    def setManualScaling(value: GoogleCloudMlV1ManualScaling): Self = this.set("manualScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManualScaling: Self = this.set("manualScaling", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPackageUrisVarargs(value: String*): Self = this.set("packageUris", js.Array(value :_*))
    
    @scala.inline
    def setPackageUris(value: js.Array[String]): Self = this.set("packageUris", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageUris: Self = this.set("packageUris", js.undefined)
    
    @scala.inline
    def setPredictionClass(value: String): Self = this.set("predictionClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePredictionClass: Self = this.set("predictionClass", js.undefined)
    
    @scala.inline
    def setPythonVersion(value: String): Self = this.set("pythonVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePythonVersion: Self = this.set("pythonVersion", js.undefined)
    
    @scala.inline
    def setRequestLoggingConfig(value: GoogleCloudMlV1RequestLoggingConfig): Self = this.set("requestLoggingConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestLoggingConfig: Self = this.set("requestLoggingConfig", js.undefined)
    
    @scala.inline
    def setRoutes(value: GoogleCloudMlV1RouteMap): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
    
    @scala.inline
    def setRuntimeVersion(value: String): Self = this.set("runtimeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeVersion: Self = this.set("runtimeVersion", js.undefined)
    
    @scala.inline
    def setServiceAccount(value: String): Self = this.set("serviceAccount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAccount: Self = this.set("serviceAccount", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}

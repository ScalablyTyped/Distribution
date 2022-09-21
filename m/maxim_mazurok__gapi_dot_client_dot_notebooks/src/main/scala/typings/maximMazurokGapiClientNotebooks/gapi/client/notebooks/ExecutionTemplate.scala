package typings.maximMazurokGapiClientNotebooks.gapi.client.notebooks

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionTemplate extends StObject {
  
  /** Configuration (count and accelerator type) for hardware running notebook execution. */
  var acceleratorConfig: js.UndefOr[SchedulerAcceleratorConfig] = js.undefined
  
  /**
    * Container Image URI to a DLVM Example: 'gcr.io/deeplearning-platform-release/base-cu100' More examples can be found at:
    * https://cloud.google.com/ai-platform/deep-learning-containers/docs/choosing-container
    */
  var containerImageUri: js.UndefOr[String] = js.undefined
  
  /** Parameters used in Dataproc JobType executions. */
  var dataprocParameters: js.UndefOr[DataprocParameters] = js.undefined
  
  /**
    * Path to the notebook file to execute. Must be in a Google Cloud Storage bucket. Format: `gs://{bucket_name}/{folder}/{notebook_file_name}` Ex:
    * `gs://notebook_user/scheduled_notebooks/sentiment_notebook.ipynb`
    */
  var inputNotebookFile: js.UndefOr[String] = js.undefined
  
  /** The type of Job to be used on this execution. */
  var jobType: js.UndefOr[String] = js.undefined
  
  /** Name of the kernel spec to use. This must be specified if the kernel spec name on the execution target does not match the name in the input notebook file. */
  var kernelSpec: js.UndefOr[String] = js.undefined
  
  /**
    * Labels for execution. If execution is scheduled, a field included will be 'nbs-scheduled'. Otherwise, it is an immediate execution, and an included field will be 'nbs-immediate'.
    * Use fields to efficiently index between various types of executions.
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientNotebooks.maximMazurokGapiClientNotebooksStrings.ExecutionTemplate & TopLevel[Any]
  ] = js.undefined
  
  /**
    * Specifies the type of virtual machine to use for your training job's master worker. You must specify this field when `scaleTier` is set to `CUSTOM`. You can use certain Compute
    * Engine machine types directly in this field. The following types are supported: - `n1-standard-4` - `n1-standard-8` - `n1-standard-16` - `n1-standard-32` - `n1-standard-64` -
    * `n1-standard-96` - `n1-highmem-2` - `n1-highmem-4` - `n1-highmem-8` - `n1-highmem-16` - `n1-highmem-32` - `n1-highmem-64` - `n1-highmem-96` - `n1-highcpu-16` - `n1-highcpu-32` -
    * `n1-highcpu-64` - `n1-highcpu-96` Alternatively, you can use the following legacy machine types: - `standard` - `large_model` - `complex_model_s` - `complex_model_m` -
    * `complex_model_l` - `standard_gpu` - `complex_model_m_gpu` - `complex_model_l_gpu` - `standard_p100` - `complex_model_m_p100` - `standard_v100` - `large_model_v100` -
    * `complex_model_m_v100` - `complex_model_l_v100` Finally, if you want to use a TPU for training, specify `cloud_tpu` in this field. Learn more about the [special configuration
    * options for training with TPU](https://cloud.google.com/ai-platform/training/docs/using-tpus#configuring_a_custom_tpu_machine).
    */
  var masterType: js.UndefOr[String] = js.undefined
  
  /** Path to the notebook folder to write to. Must be in a Google Cloud Storage bucket path. Format: `gs://{bucket_name}/{folder}` Ex: `gs://notebook_user/scheduled_notebooks` */
  var outputNotebookFolder: js.UndefOr[String] = js.undefined
  
  /** Parameters used within the 'input_notebook_file' notebook. */
  var parameters: js.UndefOr[String] = js.undefined
  
  /**
    * Parameters to be overridden in the notebook during execution. Ref https://papermill.readthedocs.io/en/latest/usage-parameterize.html on how to specifying parameters in the input
    * notebook and pass them here in an YAML file. Ex: `gs://notebook_user/scheduled_notebooks/sentiment_notebook_params.yaml`
    */
  var paramsYamlFile: js.UndefOr[String] = js.undefined
  
  /** Required. Scale tier of the hardware used for notebook execution. DEPRECATED Will be discontinued. As right now only CUSTOM is supported. */
  var scaleTier: js.UndefOr[String] = js.undefined
  
  /** The email address of a service account to use when running the execution. You must have the `iam.serviceAccounts.actAs` permission for the specified service account. */
  var serviceAccount: js.UndefOr[String] = js.undefined
  
  /** The name of a Vertex AI [Tensorboard] resource to which this execution will upload Tensorboard logs. Format: `projects/{project}/locations/{location}/tensorboards/{tensorboard}` */
  var tensorboard: js.UndefOr[String] = js.undefined
  
  /** Parameters used in Vertex AI JobType executions. */
  var vertexAiParameters: js.UndefOr[VertexAIParameters] = js.undefined
}
object ExecutionTemplate {
  
  inline def apply(): ExecutionTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecutionTemplate]
  }
  
  extension [Self <: ExecutionTemplate](x: Self) {
    
    inline def setAcceleratorConfig(value: SchedulerAcceleratorConfig): Self = StObject.set(x, "acceleratorConfig", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorConfigUndefined: Self = StObject.set(x, "acceleratorConfig", js.undefined)
    
    inline def setContainerImageUri(value: String): Self = StObject.set(x, "containerImageUri", value.asInstanceOf[js.Any])
    
    inline def setContainerImageUriUndefined: Self = StObject.set(x, "containerImageUri", js.undefined)
    
    inline def setDataprocParameters(value: DataprocParameters): Self = StObject.set(x, "dataprocParameters", value.asInstanceOf[js.Any])
    
    inline def setDataprocParametersUndefined: Self = StObject.set(x, "dataprocParameters", js.undefined)
    
    inline def setInputNotebookFile(value: String): Self = StObject.set(x, "inputNotebookFile", value.asInstanceOf[js.Any])
    
    inline def setInputNotebookFileUndefined: Self = StObject.set(x, "inputNotebookFile", js.undefined)
    
    inline def setJobType(value: String): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "jobType", js.undefined)
    
    inline def setKernelSpec(value: String): Self = StObject.set(x, "kernelSpec", value.asInstanceOf[js.Any])
    
    inline def setKernelSpecUndefined: Self = StObject.set(x, "kernelSpec", js.undefined)
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientNotebooks.maximMazurokGapiClientNotebooksStrings.ExecutionTemplate & TopLevel[Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setMasterType(value: String): Self = StObject.set(x, "masterType", value.asInstanceOf[js.Any])
    
    inline def setMasterTypeUndefined: Self = StObject.set(x, "masterType", js.undefined)
    
    inline def setOutputNotebookFolder(value: String): Self = StObject.set(x, "outputNotebookFolder", value.asInstanceOf[js.Any])
    
    inline def setOutputNotebookFolderUndefined: Self = StObject.set(x, "outputNotebookFolder", js.undefined)
    
    inline def setParameters(value: String): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParamsYamlFile(value: String): Self = StObject.set(x, "paramsYamlFile", value.asInstanceOf[js.Any])
    
    inline def setParamsYamlFileUndefined: Self = StObject.set(x, "paramsYamlFile", js.undefined)
    
    inline def setScaleTier(value: String): Self = StObject.set(x, "scaleTier", value.asInstanceOf[js.Any])
    
    inline def setScaleTierUndefined: Self = StObject.set(x, "scaleTier", js.undefined)
    
    inline def setServiceAccount(value: String): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setTensorboard(value: String): Self = StObject.set(x, "tensorboard", value.asInstanceOf[js.Any])
    
    inline def setTensorboardUndefined: Self = StObject.set(x, "tensorboard", js.undefined)
    
    inline def setVertexAiParameters(value: VertexAIParameters): Self = StObject.set(x, "vertexAiParameters", value.asInstanceOf[js.Any])
    
    inline def setVertexAiParametersUndefined: Self = StObject.set(x, "vertexAiParameters", js.undefined)
  }
}

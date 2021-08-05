package typings.maximMazurokGapiClientMl.gapi.client.ml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudMlV1PredictionInput extends StObject {
  
  /**
    * Optional. Number of records per batch, defaults to 64. The service will buffer batch_size number of records in memory before invoking one Tensorflow prediction call internally. So
    * take the record size and memory available into consideration when setting this parameter.
    */
  var batchSize: js.UndefOr[String] = js.undefined
  
  /** Required. The format of the input data files. */
  var dataFormat: js.UndefOr[String] = js.undefined
  
  /** Required. The Cloud Storage location of the input data files. May contain wildcards. */
  var inputPaths: js.UndefOr[js.Array[String]] = js.undefined
  
  /** Optional. The maximum number of workers to be used for parallel processing. Defaults to 10 if not specified. */
  var maxWorkerCount: js.UndefOr[String] = js.undefined
  
  /** Use this field if you want to use the default version for the specified model. The string must use the following format: `"projects/YOUR_PROJECT/models/YOUR_MODEL"` */
  var modelName: js.UndefOr[String] = js.undefined
  
  /** Optional. Format of the output data files, defaults to JSON. */
  var outputDataFormat: js.UndefOr[String] = js.undefined
  
  /** Required. The output Google Cloud Storage location. */
  var outputPath: js.UndefOr[String] = js.undefined
  
  /** Required. The Google Compute Engine region to run the prediction job in. See the available regions for AI Platform services. */
  var region: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The AI Platform runtime version to use for this batch prediction. If not set, AI Platform will pick the runtime version used during the CreateVersion request for this
    * model version, or choose the latest stable version when model version information is not available such as when the model is specified by uri.
    */
  var runtimeVersion: js.UndefOr[String] = js.undefined
  
  /**
    * Optional. The name of the signature defined in the SavedModel to use for this job. Please refer to [SavedModel](https://tensorflow.github.io/serving/serving_basic.html) for
    * information about how to use signatures. Defaults to [DEFAULT_SERVING_SIGNATURE_DEF_KEY](https://www.tensorflow.org/api_docs/python/tf/saved_model/signature_constants) , which is
    * "serving_default".
    */
  var signatureName: js.UndefOr[String] = js.undefined
  
  /** Use this field if you want to specify a Google Cloud Storage path for the model to use. */
  var uri: js.UndefOr[String] = js.undefined
  
  /**
    * Use this field if you want to specify a version of the model to use. The string is formatted the same way as `model_version`, with the addition of the version information:
    * `"projects/YOUR_PROJECT/models/YOUR_MODEL/versions/YOUR_VERSION"`
    */
  var versionName: js.UndefOr[String] = js.undefined
}
object GoogleCloudMlV1PredictionInput {
  
  inline def apply(): GoogleCloudMlV1PredictionInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1PredictionInput]
  }
  
  extension [Self <: GoogleCloudMlV1PredictionInput](x: Self) {
    
    inline def setBatchSize(value: String): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setDataFormat(value: String): Self = StObject.set(x, "dataFormat", value.asInstanceOf[js.Any])
    
    inline def setDataFormatUndefined: Self = StObject.set(x, "dataFormat", js.undefined)
    
    inline def setInputPaths(value: js.Array[String]): Self = StObject.set(x, "inputPaths", value.asInstanceOf[js.Any])
    
    inline def setInputPathsUndefined: Self = StObject.set(x, "inputPaths", js.undefined)
    
    inline def setInputPathsVarargs(value: String*): Self = StObject.set(x, "inputPaths", js.Array(value :_*))
    
    inline def setMaxWorkerCount(value: String): Self = StObject.set(x, "maxWorkerCount", value.asInstanceOf[js.Any])
    
    inline def setMaxWorkerCountUndefined: Self = StObject.set(x, "maxWorkerCount", js.undefined)
    
    inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "modelName", js.undefined)
    
    inline def setOutputDataFormat(value: String): Self = StObject.set(x, "outputDataFormat", value.asInstanceOf[js.Any])
    
    inline def setOutputDataFormatUndefined: Self = StObject.set(x, "outputDataFormat", js.undefined)
    
    inline def setOutputPath(value: String): Self = StObject.set(x, "outputPath", value.asInstanceOf[js.Any])
    
    inline def setOutputPathUndefined: Self = StObject.set(x, "outputPath", js.undefined)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setRuntimeVersion(value: String): Self = StObject.set(x, "runtimeVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionUndefined: Self = StObject.set(x, "runtimeVersion", js.undefined)
    
    inline def setSignatureName(value: String): Self = StObject.set(x, "signatureName", value.asInstanceOf[js.Any])
    
    inline def setSignatureNameUndefined: Self = StObject.set(x, "signatureName", js.undefined)
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
    
    inline def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
    
    inline def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
  }
}

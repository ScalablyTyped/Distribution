package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunPipelineRequest extends StObject {
  
  /**
    * User-defined labels to associate with the returned operation. These labels are not propagated to any Google Cloud Platform resources used by the operation, and can be modified at
    * any time. To associate labels with resources created while executing the operation, see the appropriate resource message (for example, `VirtualMachine`).
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** Required. The description of the pipeline to run. */
  var pipeline: js.UndefOr[Pipeline] = js.undefined
  
  /**
    * The name of an existing Pub/Sub topic. The server will publish messages to this topic whenever the status of the operation changes. The Life Sciences Service Agent account must have
    * publisher permissions to the specified topic or notifications will not be sent.
    */
  var pubSubTopic: js.UndefOr[String] = js.undefined
}
object RunPipelineRequest {
  
  inline def apply(): RunPipelineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunPipelineRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunPipelineRequest] (val x: Self) extends AnyVal {
    
    inline def setLabels(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setPipeline(value: Pipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
    
    inline def setPubSubTopic(value: String): Self = StObject.set(x, "pubSubTopic", value.asInstanceOf[js.Any])
    
    inline def setPubSubTopicUndefined: Self = StObject.set(x, "pubSubTopic", js.undefined)
  }
}

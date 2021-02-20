package typings.maximMazurokGapiClientLifesciences.gapi.client.lifesciences

import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunPipelineRequest extends StObject {
  
  /**
    * User-defined labels to associate with the returned operation. These labels are not propagated to any Google Cloud Platform resources used by the operation, and can be modified at
    * any time. To associate labels with resources created while executing the operation, see the appropriate resource message (for example, `VirtualMachine`).
    */
  var labels: js.UndefOr[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in string ]: string}
    */ typings.maximMazurokGapiClientLifesciences.maximMazurokGapiClientLifesciencesStrings.RunPipelineRequest with TopLevel[js.Any]
  ] = js.native
  
  /** Required. The description of the pipeline to run. */
  var pipeline: js.UndefOr[Pipeline] = js.native
}
object RunPipelineRequest {
  
  @scala.inline
  def apply(): RunPipelineRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunPipelineRequest]
  }
  
  @scala.inline
  implicit class RunPipelineRequestMutableBuilder[Self <: RunPipelineRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLabels(
      value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in string ]: string}
      */ typings.maximMazurokGapiClientLifesciences.maximMazurokGapiClientLifesciencesStrings.RunPipelineRequest with TopLevel[js.Any]
    ): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    @scala.inline
    def setPipeline(value: Pipeline): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
  }
}

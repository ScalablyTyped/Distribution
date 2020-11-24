package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeidentifyDatasetRequest extends js.Object {
  
  /** Deidentify configuration. */
  var config: js.UndefOr[DeidentifyConfig] = js.native
  
  /**
    * The name of the dataset resource to create and write the redacted data to. * The destination dataset must not exist. * The destination dataset must be in the same project and
    * location as the source dataset. De-identifying data across multiple projects or locations is not supported.
    */
  var destinationDataset: js.UndefOr[String] = js.native
}
object DeidentifyDatasetRequest {
  
  @scala.inline
  def apply(): DeidentifyDatasetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeidentifyDatasetRequest]
  }
  
  @scala.inline
  implicit class DeidentifyDatasetRequestOps[Self <: DeidentifyDatasetRequest] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: DeidentifyConfig): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setDestinationDataset(value: String): Self = this.set("destinationDataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationDataset: Self = this.set("destinationDataset", js.undefined)
  }
}

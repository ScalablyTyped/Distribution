package typings.maximMazurokGapiClientHealthcare.gapi.client.healthcare

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeidentifyDatasetRequest extends StObject {
  
  /** Deidentify configuration. */
  var config: js.UndefOr[DeidentifyConfig] = js.undefined
  
  /**
    * The name of the dataset resource to create and write the redacted data to. * The destination dataset must not exist. * The destination dataset must be in the same project and
    * location as the source dataset. De-identifying data across multiple projects or locations is not supported.
    */
  var destinationDataset: js.UndefOr[String] = js.undefined
}
object DeidentifyDatasetRequest {
  
  @scala.inline
  def apply(): DeidentifyDatasetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeidentifyDatasetRequest]
  }
  
  @scala.inline
  implicit class DeidentifyDatasetRequestMutableBuilder[Self <: DeidentifyDatasetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfig(value: DeidentifyConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    @scala.inline
    def setDestinationDataset(value: String): Self = StObject.set(x, "destinationDataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationDatasetUndefined: Self = StObject.set(x, "destinationDataset", js.undefined)
  }
}

package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportProductSetsInputConfig extends StObject {
  
  /** The Google Cloud Storage location for a csv file which preserves a list of ImportProductSetRequests in each line. */
  var gcsSource: js.UndefOr[ImportProductSetsGcsSource] = js.native
}
object ImportProductSetsInputConfig {
  
  @scala.inline
  def apply(): ImportProductSetsInputConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportProductSetsInputConfig]
  }
  
  @scala.inline
  implicit class ImportProductSetsInputConfigMutableBuilder[Self <: ImportProductSetsInputConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGcsSource(value: ImportProductSetsGcsSource): Self = StObject.set(x, "gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsSourceUndefined: Self = StObject.set(x, "gcsSource", js.undefined)
  }
}

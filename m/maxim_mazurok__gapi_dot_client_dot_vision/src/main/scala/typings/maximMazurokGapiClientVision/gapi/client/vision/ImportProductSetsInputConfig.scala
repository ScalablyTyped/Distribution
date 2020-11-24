package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportProductSetsInputConfig extends js.Object {
  
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
  implicit class ImportProductSetsInputConfigOps[Self <: ImportProductSetsInputConfig] (val x: Self) extends AnyVal {
    
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
    def setGcsSource(value: ImportProductSetsGcsSource): Self = this.set("gcsSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsSource: Self = this.set("gcsSource", js.undefined)
  }
}

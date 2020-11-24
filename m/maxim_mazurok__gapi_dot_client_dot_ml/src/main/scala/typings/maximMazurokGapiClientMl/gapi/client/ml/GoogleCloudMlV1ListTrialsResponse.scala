package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1ListTrialsResponse extends js.Object {
  
  /** The trials associated with the study. */
  var trials: js.UndefOr[js.Array[GoogleCloudMlV1Trial]] = js.native
}
object GoogleCloudMlV1ListTrialsResponse {
  
  @scala.inline
  def apply(): GoogleCloudMlV1ListTrialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ListTrialsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ListTrialsResponseOps[Self <: GoogleCloudMlV1ListTrialsResponse] (val x: Self) extends AnyVal {
    
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
    def setTrialsVarargs(value: GoogleCloudMlV1Trial*): Self = this.set("trials", js.Array(value :_*))
    
    @scala.inline
    def setTrials(value: js.Array[GoogleCloudMlV1Trial]): Self = this.set("trials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrials: Self = this.set("trials", js.undefined)
  }
}

package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1ListOptimalTrialsResponse extends js.Object {
  
  /**
    * The pareto-optimal trials for multiple objective study or the optimal trial for single objective study. The definition of pareto-optimal can be checked in wiki page.
    * https://en.wikipedia.org/wiki/Pareto_efficiency
    */
  var trials: js.UndefOr[js.Array[GoogleCloudMlV1Trial]] = js.native
}
object GoogleCloudMlV1ListOptimalTrialsResponse {
  
  @scala.inline
  def apply(): GoogleCloudMlV1ListOptimalTrialsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ListOptimalTrialsResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ListOptimalTrialsResponseOps[Self <: GoogleCloudMlV1ListOptimalTrialsResponse] (val x: Self) extends AnyVal {
    
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

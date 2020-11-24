package typings.maximMazurokGapiClientMl.gapi.client.ml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudMlV1ListStudiesResponse extends js.Object {
  
  /** The studies associated with the project. */
  var studies: js.UndefOr[js.Array[GoogleCloudMlV1Study]] = js.native
}
object GoogleCloudMlV1ListStudiesResponse {
  
  @scala.inline
  def apply(): GoogleCloudMlV1ListStudiesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudMlV1ListStudiesResponse]
  }
  
  @scala.inline
  implicit class GoogleCloudMlV1ListStudiesResponseOps[Self <: GoogleCloudMlV1ListStudiesResponse] (val x: Self) extends AnyVal {
    
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
    def setStudiesVarargs(value: GoogleCloudMlV1Study*): Self = this.set("studies", js.Array(value :_*))
    
    @scala.inline
    def setStudies(value: js.Array[GoogleCloudMlV1Study]): Self = this.set("studies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStudies: Self = this.set("studies", js.undefined)
  }
}

package typings.maximMazurokGapiClientSmartdevicemanagement.gapi.client.smartdevicemanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleHomeEnterpriseSdmV1ListStructuresResponse extends js.Object {
  
  /** The pagination token to retrieve the next page of results. If this field is omitted, there are no subsequent pages. */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The list of structures. */
  var structures: js.UndefOr[js.Array[GoogleHomeEnterpriseSdmV1Structure]] = js.native
}
object GoogleHomeEnterpriseSdmV1ListStructuresResponse {
  
  @scala.inline
  def apply(): GoogleHomeEnterpriseSdmV1ListStructuresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleHomeEnterpriseSdmV1ListStructuresResponse]
  }
  
  @scala.inline
  implicit class GoogleHomeEnterpriseSdmV1ListStructuresResponseOps[Self <: GoogleHomeEnterpriseSdmV1ListStructuresResponse] (val x: Self) extends AnyVal {
    
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
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setStructuresVarargs(value: GoogleHomeEnterpriseSdmV1Structure*): Self = this.set("structures", js.Array(value :_*))
    
    @scala.inline
    def setStructures(value: js.Array[GoogleHomeEnterpriseSdmV1Structure]): Self = this.set("structures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStructures: Self = this.set("structures", js.undefined)
  }
}

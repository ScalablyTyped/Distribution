package typings.maximMazurokGapiClientLicensing.gapi.client.licensing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LicenseAssignmentList extends js.Object {
  
  /** ETag of the resource. */
  var etag: js.UndefOr[String] = js.native
  
  /** The LicenseAssignments in this page of results. */
  var items: js.UndefOr[js.Array[LicenseAssignment]] = js.native
  
  /** Identifies the resource as a collection of LicenseAssignments. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The token that you must submit in a subsequent request to retrieve additional license results matching your query parameters. The `maxResults` query string is related to the
    * `nextPageToken` since `maxResults` determines how many entries are returned on each next page.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object LicenseAssignmentList {
  
  @scala.inline
  def apply(): LicenseAssignmentList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LicenseAssignmentList]
  }
  
  @scala.inline
  implicit class LicenseAssignmentListOps[Self <: LicenseAssignmentList] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: LicenseAssignment*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[LicenseAssignment]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}

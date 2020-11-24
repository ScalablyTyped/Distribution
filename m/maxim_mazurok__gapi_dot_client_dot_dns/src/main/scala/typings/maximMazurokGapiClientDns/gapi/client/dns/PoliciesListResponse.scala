package typings.maximMazurokGapiClientDns.gapi.client.dns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PoliciesListResponse extends js.Object {
  
  var header: js.UndefOr[ResponseHeader] = js.native
  
  /** Type of resource. */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The presence of this field indicates that there exist more results following your last page of results in pagination order. To fetch them, make another list request using this value
    * as your page token. In this way you can retrieve the complete contents of even very large collections one page at a time. However, if the contents of the collection change between
    * the first and last paginated list request, the set of all elements returned will be an inconsistent view of the collection. There is no way to retrieve a consistent snapshot of a
    * collection larger than the maximum page size.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** The policy resources. */
  var policies: js.UndefOr[js.Array[Policy]] = js.native
}
object PoliciesListResponse {
  
  @scala.inline
  def apply(): PoliciesListResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoliciesListResponse]
  }
  
  @scala.inline
  implicit class PoliciesListResponseOps[Self <: PoliciesListResponse] (val x: Self) extends AnyVal {
    
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
    def setHeader(value: ResponseHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: Policy*): Self = this.set("policies", js.Array(value :_*))
    
    @scala.inline
    def setPolicies(value: js.Array[Policy]): Self = this.set("policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
  }
}

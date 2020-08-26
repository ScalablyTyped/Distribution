package typings.naverWhale.whale.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAllDetails extends js.Object {
  /** Optional. Restricts the retrieved cookies to those whose domains match or are subdomains of this one.  */
  var domain: js.UndefOr[String] = js.native
  /** Optional. Filters the cookies by name.  */
  var name: js.UndefOr[String] = js.native
  /** Optional. Restricts the retrieved cookies to those whose path exactly matches this string.  */
  var path: js.UndefOr[String] = js.native
  /** Optional. Filters the cookies by their Secure property.  */
  var secure: js.UndefOr[Boolean] = js.native
  /** Optional. Filters out session vs. persistent cookies.  */
  var session: js.UndefOr[Boolean] = js.native
  /** Optional. The cookie store to retrieve cookies from. If omitted, the current execution context's cookie store will be used.  */
  var storeId: js.UndefOr[String] = js.native
  /** Optional. Restricts the retrieved cookies to those that would match the given URL.  */
  var url: js.UndefOr[String] = js.native
}

object GetAllDetails {
  @scala.inline
  def apply(): GetAllDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAllDetails]
  }
  @scala.inline
  implicit class GetAllDetailsOps[Self <: GetAllDetails] (val x: Self) extends AnyVal {
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
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    @scala.inline
    def setSession(value: Boolean): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setStoreId(value: String): Self = this.set("storeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStoreId: Self = this.set("storeId", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
  
}


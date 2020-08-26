package typings.phaser.Phaser.Types.Loader

import typings.phaser.integer
import typings.std.XMLHttpRequestResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XHRSettingsObject extends js.Object {
  /**
    * Should the XHR request use async or not?
    */
  var async: js.UndefOr[Boolean] = js.native
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var header: js.UndefOr[String] = js.native
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var headerValue: js.UndefOr[String] = js.native
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var headers: js.UndefOr[js.Object] = js.native
  /**
    * Provide a custom mime-type to use instead of the default.
    */
  var overrideMimeType: js.UndefOr[String] = js.native
  /**
    * Optional password for the XHR request.
    */
  var password: js.UndefOr[String] = js.native
  /**
    * This value is used to populate the XHR `setRequestHeader` and is undefined by default.
    */
  var requestedWith: js.UndefOr[String] = js.native
  /**
    * The response type of the XHR request, i.e. `blob`, `text`, etc.
    */
  var responseType: XMLHttpRequestResponseType = js.native
  /**
    * Optional XHR timeout value.
    */
  var timeout: js.UndefOr[integer] = js.native
  /**
    * Optional username for the XHR request.
    */
  var user: js.UndefOr[String] = js.native
  /**
    * The withCredentials property indicates whether or not cross-site Access-Control requests should be made using credentials such as cookies, authorization headers or TLS client certificates. Setting withCredentials has no effect on same-site requests.
    */
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object XHRSettingsObject {
  @scala.inline
  def apply(responseType: XMLHttpRequestResponseType): XHRSettingsObject = {
    val __obj = js.Dynamic.literal(responseType = responseType.asInstanceOf[js.Any])
    __obj.asInstanceOf[XHRSettingsObject]
  }
  @scala.inline
  implicit class XHRSettingsObjectOps[Self <: XHRSettingsObject] (val x: Self) extends AnyVal {
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
    def setResponseType(value: XMLHttpRequestResponseType): Self = this.set("responseType", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsync(value: Boolean): Self = this.set("async", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsync: Self = this.set("async", js.undefined)
    @scala.inline
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHeaderValue(value: String): Self = this.set("headerValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaderValue: Self = this.set("headerValue", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setOverrideMimeType(value: String): Self = this.set("overrideMimeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideMimeType: Self = this.set("overrideMimeType", js.undefined)
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    @scala.inline
    def setRequestedWith(value: String): Self = this.set("requestedWith", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedWith: Self = this.set("requestedWith", js.undefined)
    @scala.inline
    def setTimeout(value: integer): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}


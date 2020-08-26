package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebApp extends MobileApp {
  // The web app URL.
  var appUrl: js.UndefOr[String] = js.native
  // Whether or not to use managed browser. This property is only applicable for Android and IOS.
  var useManagedBrowser: js.UndefOr[Boolean] = js.native
}

object WebApp {
  @scala.inline
  def apply(): WebApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebApp]
  }
  @scala.inline
  implicit class WebAppOps[Self <: WebApp] (val x: Self) extends AnyVal {
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
    def setAppUrl(value: String): Self = this.set("appUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAppUrl: Self = this.set("appUrl", js.undefined)
    @scala.inline
    def setUseManagedBrowser(value: Boolean): Self = this.set("useManagedBrowser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseManagedBrowser: Self = this.set("useManagedBrowser", js.undefined)
  }
  
}


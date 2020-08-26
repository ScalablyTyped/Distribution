package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WindowsInformationProtectionApp extends js.Object {
  // If true, app is denied protection or exemption.
  var denied: js.UndefOr[Boolean] = js.native
  // The app's description.
  var description: js.UndefOr[String] = js.native
  // App display name.
  var displayName: js.UndefOr[String] = js.native
  // The product name.
  var productName: js.UndefOr[String] = js.native
  // The publisher name
  var publisherName: js.UndefOr[String] = js.native
}

object WindowsInformationProtectionApp {
  @scala.inline
  def apply(): WindowsInformationProtectionApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WindowsInformationProtectionApp]
  }
  @scala.inline
  implicit class WindowsInformationProtectionAppOps[Self <: WindowsInformationProtectionApp] (val x: Self) extends AnyVal {
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
    def setDenied(value: Boolean): Self = this.set("denied", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDenied: Self = this.set("denied", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    @scala.inline
    def setProductName(value: String): Self = this.set("productName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductName: Self = this.set("productName", js.undefined)
    @scala.inline
    def setPublisherName(value: String): Self = this.set("publisherName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePublisherName: Self = this.set("publisherName", js.undefined)
  }
  
}


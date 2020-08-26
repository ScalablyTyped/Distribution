package typings.officeJsPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "hyperlink.toJSON()". */
@js.native
trait HyperlinkData extends js.Object {
  /**
    *
    * Gets the address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var address: js.UndefOr[String] = js.native
  /**
    *
    * Gets the description of a hyperlink. Read-only.
    *
    * [Api set:  1.1]
    */
  var description: js.UndefOr[String] = js.native
  /**
    *
    * Gets the extra URL request information used to resolve the hyperlink's URL. Read-only.
    *
    * [Api set:  1.1]
    */
  var extraInfo: js.UndefOr[String] = js.native
  /**
    *
    * Gets the sub-address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var subAddress: js.UndefOr[String] = js.native
}

object HyperlinkData {
  @scala.inline
  def apply(): HyperlinkData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperlinkData]
  }
  @scala.inline
  implicit class HyperlinkDataOps[Self <: HyperlinkData] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExtraInfo(value: String): Self = this.set("extraInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraInfo: Self = this.set("extraInfo", js.undefined)
    @scala.inline
    def setSubAddress(value: String): Self = this.set("subAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubAddress: Self = this.set("subAddress", js.undefined)
  }
  
}


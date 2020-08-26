package typings.officeJs.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Hyperlink Collection.
  *
  * [Api set:  1.1]
  */
@js.native
trait HyperlinkCollectionLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var address: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the description of a hyperlink. Read-only.
    *
    * [Api set:  1.1]
    */
  var description: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the extra URL request information used to resolve the hyperlink's URL. Read-only.
    *
    * [Api set:  1.1]
    */
  var extraInfo: js.UndefOr[Boolean] = js.native
  /**
    *
    * For EACH ITEM in the collection: Gets the sub-address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var subAddress: js.UndefOr[Boolean] = js.native
}

object HyperlinkCollectionLoadOptions {
  @scala.inline
  def apply(): HyperlinkCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperlinkCollectionLoadOptions]
  }
  @scala.inline
  implicit class HyperlinkCollectionLoadOptionsOps[Self <: HyperlinkCollectionLoadOptions] (val x: Self) extends AnyVal {
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
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setAddress(value: Boolean): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setDescription(value: Boolean): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setExtraInfo(value: Boolean): Self = this.set("extraInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraInfo: Self = this.set("extraInfo", js.undefined)
    @scala.inline
    def setSubAddress(value: Boolean): Self = this.set("subAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubAddress: Self = this.set("subAddress", js.undefined)
  }
  
}


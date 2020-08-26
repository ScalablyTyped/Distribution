package typings.nodeHueApi.mod

import typings.nodeHueApi.anon.Description
import typings.nodeHueApi.anon.Major
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBridgeDescription extends js.Object {
  var icons: js.UndefOr[js.Array[IBridgeIcon]] = js.native
  var manufacturer: String = js.native
  var model: Description = js.native
  var name: String = js.native
  var url: String = js.native
  var version: Major = js.native
}

object IBridgeDescription {
  @scala.inline
  def apply(manufacturer: String, model: Description, name: String, url: String, version: Major): IBridgeDescription = {
    val __obj = js.Dynamic.literal(manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBridgeDescription]
  }
  @scala.inline
  implicit class IBridgeDescriptionOps[Self <: IBridgeDescription] (val x: Self) extends AnyVal {
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
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: Description): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersion(value: Major): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setIconsVarargs(value: IBridgeIcon*): Self = this.set("icons", js.Array(value :_*))
    @scala.inline
    def setIcons(value: js.Array[IBridgeIcon]): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
  }
  
}


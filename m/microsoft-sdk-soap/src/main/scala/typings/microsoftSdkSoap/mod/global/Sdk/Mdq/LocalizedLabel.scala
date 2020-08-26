package typings.microsoftSdkSoap.mod.global.Sdk.Mdq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalizedLabel extends js.Object {
  var HasChanged: Boolean = js.native
  var IsManaged: Boolean = js.native
  var Label: String = js.native
  var LangaugeCode: Double = js.native
  var MetadataId: String = js.native
}

object LocalizedLabel {
  @scala.inline
  def apply(HasChanged: Boolean, IsManaged: Boolean, Label: String, LangaugeCode: Double, MetadataId: String): LocalizedLabel = {
    val __obj = js.Dynamic.literal(HasChanged = HasChanged.asInstanceOf[js.Any], IsManaged = IsManaged.asInstanceOf[js.Any], Label = Label.asInstanceOf[js.Any], LangaugeCode = LangaugeCode.asInstanceOf[js.Any], MetadataId = MetadataId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalizedLabel]
  }
  @scala.inline
  implicit class LocalizedLabelOps[Self <: LocalizedLabel] (val x: Self) extends AnyVal {
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
    def setHasChanged(value: Boolean): Self = this.set("HasChanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsManaged(value: Boolean): Self = this.set("IsManaged", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("Label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLangaugeCode(value: Double): Self = this.set("LangaugeCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadataId(value: String): Self = this.set("MetadataId", value.asInstanceOf[js.Any])
  }
  
}


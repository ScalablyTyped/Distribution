package typings.onfleetNodeOnfleet.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnfleetMetadata extends js.Object {
  var name: String = js.native
  var subtype: js.UndefOr[MetadataSubType] = js.native
  var `type`: MetadataType = js.native
  var value: js.Any = js.native
  var visibility: js.UndefOr[js.Array[MetadataVisibility]] = js.native
}

object OnfleetMetadata {
  @scala.inline
  def apply(name: String, `type`: MetadataType, value: js.Any): OnfleetMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetMetadata]
  }
  @scala.inline
  implicit class OnfleetMetadataOps[Self <: OnfleetMetadata] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: MetadataType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubtype(value: MetadataSubType): Self = this.set("subtype", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtype: Self = this.set("subtype", js.undefined)
    @scala.inline
    def setVisibilityVarargs(value: MetadataVisibility*): Self = this.set("visibility", js.Array(value :_*))
    @scala.inline
    def setVisibility(value: js.Array[MetadataVisibility]): Self = this.set("visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("visibility", js.undefined)
  }
  
}


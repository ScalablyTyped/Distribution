package typings.atOnfleetNodeDashOnfleet.metadataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnfleetMetadata extends js.Object {
  var name: String
  var subtype: js.UndefOr[MetadataSubType] = js.undefined
  var `type`: MetadataType
  var value: js.Any
  var visibility: js.UndefOr[js.Array[MetadataVisibility]] = js.undefined
}

object OnfleetMetadata {
  @scala.inline
  def apply(
    name: String,
    `type`: MetadataType,
    value: js.Any,
    subtype: MetadataSubType = null,
    visibility: js.Array[MetadataVisibility] = null
  ): OnfleetMetadata = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (subtype != null) __obj.updateDynamic("subtype")(subtype.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnfleetMetadata]
  }
}


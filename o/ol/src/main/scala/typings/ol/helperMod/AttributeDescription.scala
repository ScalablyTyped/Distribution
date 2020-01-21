package typings.ol.helperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeDescription extends js.Object {
  var name: String
  var size: Double
  var `type`: js.UndefOr[AttributeType] = js.undefined
}

object AttributeDescription {
  @scala.inline
  def apply(name: String, size: Double, `type`: AttributeType = null): AttributeDescription = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeDescription]
  }
}


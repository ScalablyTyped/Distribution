package typings.mjml.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MJMLJsonObject extends js.Object {
  var attributes: js.Object
  var children: js.UndefOr[js.Array[MJMLJsonObject]] = js.undefined
  var content: js.UndefOr[String] = js.undefined
  var tagName: String
}

object MJMLJsonObject {
  @scala.inline
  def apply(
    attributes: js.Object,
    tagName: String,
    children: js.Array[MJMLJsonObject] = null,
    content: String = null
  ): MJMLJsonObject = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[MJMLJsonObject]
  }
}


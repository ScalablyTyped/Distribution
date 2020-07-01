package typings.nodeJose.anon

import typings.nodeJose.nodeJoseStrings.DEF
import typings.nodeJose.nodeJoseStrings.compact
import typings.nodeJose.nodeJoseStrings.flattened
import typings.nodeJose.nodeJoseStrings.general
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentAlg extends js.Object {
  var contentAlg: js.UndefOr[String] = js.undefined
  var fields: js.UndefOr[js.Object] = js.undefined
  var format: js.UndefOr[general | compact | flattened] = js.undefined
  var protect: js.UndefOr[String | js.Array[String]] = js.undefined
  var zip: js.UndefOr[Boolean | DEF] = js.undefined
}

object ContentAlg {
  @scala.inline
  def apply(
    contentAlg: String = null,
    fields: js.Object = null,
    format: general | compact | flattened = null,
    protect: String | js.Array[String] = null,
    zip: Boolean | DEF = null
  ): ContentAlg = {
    val __obj = js.Dynamic.literal()
    if (contentAlg != null) __obj.updateDynamic("contentAlg")(contentAlg.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (protect != null) __obj.updateDynamic("protect")(protect.asInstanceOf[js.Any])
    if (zip != null) __obj.updateDynamic("zip")(zip.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentAlg]
  }
}


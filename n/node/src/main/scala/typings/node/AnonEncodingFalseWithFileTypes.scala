package typings.node

import typings.node.nodeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingFalseWithFileTypes extends js.Object {
  var encoding: js.UndefOr[java.lang.String | Null] = js.undefined
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object AnonEncodingFalseWithFileTypes {
  @scala.inline
  def apply(encoding: java.lang.String = null, withFileTypes: `false` = null): AnonEncodingFalseWithFileTypes = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncodingFalseWithFileTypes]
  }
}


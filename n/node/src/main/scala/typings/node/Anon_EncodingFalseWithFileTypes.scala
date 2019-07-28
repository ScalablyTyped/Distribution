package typings.node

import typings.node.nodeNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFalseWithFileTypes extends js.Object {
  var encoding: js.UndefOr[java.lang.String | Null] = js.undefined
  var withFileTypes: js.UndefOr[`false`] = js.undefined
}

object Anon_EncodingFalseWithFileTypes {
  @scala.inline
  def apply(encoding: java.lang.String = null, withFileTypes: `false` = null): Anon_EncodingFalseWithFileTypes = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (withFileTypes != null) __obj.updateDynamic("withFileTypes")(withFileTypes)
    __obj.asInstanceOf[Anon_EncodingFalseWithFileTypes]
  }
}


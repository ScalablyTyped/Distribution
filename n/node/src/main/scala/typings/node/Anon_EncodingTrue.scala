package typings.node

import typings.node.nodeNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingTrue extends js.Object {
  var encoding: js.UndefOr[java.lang.String | Null] = js.undefined
  var withFileTypes: `true`
}

object Anon_EncodingTrue {
  @scala.inline
  def apply(withFileTypes: `true`, encoding: java.lang.String = null): Anon_EncodingTrue = {
    val __obj = js.Dynamic.literal(withFileTypes = withFileTypes.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncodingTrue]
  }
}


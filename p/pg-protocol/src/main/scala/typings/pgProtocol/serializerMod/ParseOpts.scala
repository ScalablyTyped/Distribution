package typings.pgProtocol.serializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOpts extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var text: String
  var types: js.UndefOr[js.Array[Double]] = js.undefined
}

object ParseOpts {
  @scala.inline
  def apply(text: String, name: String = null, types: js.Array[Double] = null): ParseOpts = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOpts]
  }
}


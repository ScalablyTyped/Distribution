package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingNull extends js.Object {
  var encoding: js.UndefOr[Null] = js.undefined
  var flag: js.UndefOr[java.lang.String | Double] = js.undefined
}

object AnonEncodingNull {
  @scala.inline
  def apply(encoding: js.UndefOr[scala.Nothing] = js.undefined, flag: java.lang.String | Double = null): AnonEncodingNull = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(encoding)) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncodingNull]
  }
}


package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFlagNull extends js.Object {
  var encoding: js.UndefOr[java.lang.String | Null] = js.undefined
  var flag: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EncodingFlagNull {
  @scala.inline
  def apply(encoding: java.lang.String = null, flag: java.lang.String = null): Anon_EncodingFlagNull = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    __obj.asInstanceOf[Anon_EncodingFlagNull]
  }
}


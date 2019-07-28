package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFlagNullNumber extends js.Object {
  var encoding: js.UndefOr[Null] = js.undefined
  var flag: js.UndefOr[java.lang.String | Double] = js.undefined
}

object Anon_EncodingFlagNullNumber {
  @scala.inline
  def apply(encoding: Null = null, flag: java.lang.String | Double = null): Anon_EncodingFlagNullNumber = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncodingFlagNullNumber]
  }
}


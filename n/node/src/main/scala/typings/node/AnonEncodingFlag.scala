package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEncodingFlag extends js.Object {
  var encoding: java.lang.String
  var flag: js.UndefOr[java.lang.String] = js.undefined
}

object AnonEncodingFlag {
  @scala.inline
  def apply(encoding: java.lang.String, flag: java.lang.String = null): AnonEncodingFlag = {
    val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
    if (flag != null) __obj.updateDynamic("flag")(flag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEncodingFlag]
  }
}


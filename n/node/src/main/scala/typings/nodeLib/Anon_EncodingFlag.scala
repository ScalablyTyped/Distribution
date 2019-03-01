package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFlag extends js.Object {
  var encoding: js.UndefOr[scala.Null] = js.undefined
  var flag: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EncodingFlag {
  @scala.inline
  def apply(encoding: scala.Null = null, flag: java.lang.String = null): Anon_EncodingFlag = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    __obj.asInstanceOf[Anon_EncodingFlag]
  }
}


package typings
package mzLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EncodingFlagModeNull extends js.Object {
  var encoding: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var flag: js.UndefOr[java.lang.String] = js.undefined
  var mode: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object Anon_EncodingFlagModeNull {
  @scala.inline
  def apply(
    encoding: java.lang.String = null,
    flag: java.lang.String = null,
    mode: scala.Double | java.lang.String = null
  ): Anon_EncodingFlagModeNull = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EncodingFlagModeNull]
  }
}


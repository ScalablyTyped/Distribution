package typings
package mzLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var encoding: js.UndefOr[mzLib.mzLibStrings.buffer | scala.Null] = js.undefined
  var flag: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Buffer {
  @scala.inline
  def apply(encoding: mzLib.mzLibStrings.buffer = null, flag: java.lang.String = null): Anon_Buffer = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    __obj.asInstanceOf[Anon_Buffer]
  }
}


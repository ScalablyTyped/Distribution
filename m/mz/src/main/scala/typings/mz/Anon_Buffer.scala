package typings.mz

import typings.mz.mzStrings.buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buffer extends js.Object {
  var encoding: js.UndefOr[buffer | Null] = js.undefined
  var flag: js.UndefOr[String] = js.undefined
}

object Anon_Buffer {
  @scala.inline
  def apply(encoding: buffer = null, flag: String = null): Anon_Buffer = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (flag != null) __obj.updateDynamic("flag")(flag)
    __obj.asInstanceOf[Anon_Buffer]
  }
}


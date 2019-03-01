package typings
package onionooLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var accept: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var reject: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object Anon_Accept {
  @scala.inline
  def apply(accept: js.Array[java.lang.String] = null, reject: js.Array[java.lang.String] = null): Anon_Accept = {
    val __obj = js.Dynamic.literal()
    if (accept != null) __obj.updateDynamic("accept")(accept)
    if (reject != null) __obj.updateDynamic("reject")(reject)
    __obj.asInstanceOf[Anon_Accept]
  }
}


package typings
package pdfkitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Origin extends js.Object {
  var origin: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Anon_Origin {
  @scala.inline
  def apply(origin: js.Array[scala.Double] = null): Anon_Origin = {
    val __obj = js.Dynamic.literal()
    if (origin != null) __obj.updateDynamic("origin")(origin)
    __obj.asInstanceOf[Anon_Origin]
  }
}


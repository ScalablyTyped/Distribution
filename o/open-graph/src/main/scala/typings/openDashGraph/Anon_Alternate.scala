package typings.openDashGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alternate extends js.Object {
  /** An array of other locales this page is available in. */
  var alternate: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Anon_Alternate {
  @scala.inline
  def apply(alternate: String | js.Array[String] = null): Anon_Alternate = {
    val __obj = js.Dynamic.literal()
    if (alternate != null) __obj.updateDynamic("alternate")(alternate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alternate]
  }
}


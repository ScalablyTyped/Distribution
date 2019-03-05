package typings
package openDashGraphLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alternate extends js.Object {
  /** An array of other locales this page is available in. */
  var alternate: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object Anon_Alternate {
  @scala.inline
  def apply(alternate: java.lang.String | js.Array[java.lang.String] = null): Anon_Alternate = {
    val __obj = js.Dynamic.literal()
    if (alternate != null) __obj.updateDynamic("alternate")(alternate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Alternate]
  }
}


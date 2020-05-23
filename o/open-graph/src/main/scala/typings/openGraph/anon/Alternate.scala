package typings.openGraph.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Alternate extends js.Object {
  /** An array of other locales this page is available in. */
  var alternate: js.UndefOr[String | js.Array[String]] = js.undefined
}

object Alternate {
  @scala.inline
  def apply(alternate: String | js.Array[String] = null): Alternate = {
    val __obj = js.Dynamic.literal()
    if (alternate != null) __obj.updateDynamic("alternate")(alternate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alternate]
  }
}


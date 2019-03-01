package typings
package memjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expires extends js.Object {
  var expires: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Expires {
  @scala.inline
  def apply(expires: scala.Int | scala.Double = null): Anon_Expires = {
    val __obj = js.Dynamic.literal()
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Expires]
  }
}


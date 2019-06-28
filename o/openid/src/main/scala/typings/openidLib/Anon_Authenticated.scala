package typings
package openidLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authenticated extends js.Object {
  var authenticated: scala.Boolean
  var claimedIdentifier: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Authenticated {
  @scala.inline
  def apply(authenticated: scala.Boolean, claimedIdentifier: java.lang.String = null): Anon_Authenticated = {
    val __obj = js.Dynamic.literal(authenticated = authenticated)
    if (claimedIdentifier != null) __obj.updateDynamic("claimedIdentifier")(claimedIdentifier)
    __obj.asInstanceOf[Anon_Authenticated]
  }
}


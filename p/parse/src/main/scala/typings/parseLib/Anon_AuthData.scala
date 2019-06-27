package typings
package parseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthData extends js.Object {
  var authData: js.UndefOr[parseLib.ParseNs.AuthData] = js.undefined
}

object Anon_AuthData {
  @scala.inline
  def apply(authData: parseLib.ParseNs.AuthData = null): Anon_AuthData = {
    val __obj = js.Dynamic.literal()
    if (authData != null) __obj.updateDynamic("authData")(authData)
    __obj.asInstanceOf[Anon_AuthData]
  }
}


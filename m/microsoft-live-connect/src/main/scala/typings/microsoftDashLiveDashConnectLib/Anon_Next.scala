package typings
package microsoftDashLiveDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Next extends js.Object {
  /**
    * Path string for the next set of results.
    */
  var next: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Path string for the previous set of results.
    */
  var previous: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Next {
  @scala.inline
  def apply(next: java.lang.String = null, previous: java.lang.String = null): Anon_Next = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(next)
    if (previous != null) __obj.updateDynamic("previous")(previous)
    __obj.asInstanceOf[Anon_Next]
  }
}


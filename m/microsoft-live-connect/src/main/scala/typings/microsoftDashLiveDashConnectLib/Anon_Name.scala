package typings
package microsoftDashLiveDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  /**
    * The name of the user's work position, or null if the name of the
    * work position is not specified.
    */
  var name: java.lang.String
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[Anon_Name]
  }
}


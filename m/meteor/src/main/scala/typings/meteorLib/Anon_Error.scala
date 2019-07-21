package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: js.UndefOr[js.Any] = js.undefined
  var userId: java.lang.String
}

object Anon_Error {
  @scala.inline
  def apply(userId: java.lang.String, error: js.Any = null): Anon_Error = {
    val __obj = js.Dynamic.literal(userId = userId)
    if (error != null) __obj.updateDynamic("error")(error)
    __obj.asInstanceOf[Anon_Error]
  }
}


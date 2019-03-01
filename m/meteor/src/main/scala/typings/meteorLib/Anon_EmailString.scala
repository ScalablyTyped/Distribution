package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmailString extends js.Object {
  var email: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EmailString {
  @scala.inline
  def apply(email: java.lang.String = null): Anon_EmailString = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    __obj.asInstanceOf[Anon_EmailString]
  }
}


package typings
package mjmlDashReactLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.Array[stdLib.Error]
  var html: java.lang.String
}

object Anon_Errors {
  @scala.inline
  def apply(errors: js.Array[stdLib.Error], html: java.lang.String): Anon_Errors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("errors")(errors)
    __obj.updateDynamic("html")(html)
    __obj.asInstanceOf[Anon_Errors]
  }
}


package typings.mjmlDashReact

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Errors extends js.Object {
  var errors: js.Array[Error]
  var html: String
}

object Anon_Errors {
  @scala.inline
  def apply(errors: js.Array[Error], html: String): Anon_Errors = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Errors]
  }
}


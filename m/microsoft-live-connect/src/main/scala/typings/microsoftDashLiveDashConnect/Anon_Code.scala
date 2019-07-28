package typings.microsoftDashLiveDashConnect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  /**
    * The error code.
    */
  var code: String
  /**
    * The error message.
    */
  var message: String
}

object Anon_Code {
  @scala.inline
  def apply(code: String, message: String): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[Anon_Code]
  }
}


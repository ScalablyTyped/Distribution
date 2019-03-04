package typings
package microsoftDashLiveDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Code extends js.Object {
  /**
    * The error code.
    */
  var code: java.lang.String
  /**
    * The error message.
    */
  var message: java.lang.String
}

object Anon_Code {
  @scala.inline
  def apply(code: java.lang.String, message: java.lang.String): Anon_Code = {
    val __obj = js.Dynamic.literal(code = code, message = message)
  
    __obj.asInstanceOf[Anon_Code]
  }
}


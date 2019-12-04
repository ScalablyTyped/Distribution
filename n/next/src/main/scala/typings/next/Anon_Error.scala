package typings.next

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error extends js.Object {
  var error: Error
}

object Anon_Error {
  @scala.inline
  def apply(error: Error): Anon_Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Error]
  }
}


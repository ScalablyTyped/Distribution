package typings.negotiator

import typings.negotiator.negotiatorMod.Headers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Headers extends js.Object {
  var headers: Headers
}

object Anon_Headers {
  @scala.inline
  def apply(headers: Headers): Anon_Headers = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Headers]
  }
}


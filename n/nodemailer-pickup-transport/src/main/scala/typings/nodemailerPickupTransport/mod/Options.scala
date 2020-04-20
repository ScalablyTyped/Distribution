package typings.nodemailerPickupTransport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var directory: String
}

object Options {
  @scala.inline
  def apply(directory: String): Options = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}


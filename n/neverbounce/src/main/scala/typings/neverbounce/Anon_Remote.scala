package typings.neverbounce

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Remote extends js.Object {
  var remote: String
  var supplied: String
}

object Anon_Remote {
  @scala.inline
  def apply(remote: String, supplied: String): Anon_Remote = {
    val __obj = js.Dynamic.literal(remote = remote, supplied = supplied)
  
    __obj.asInstanceOf[Anon_Remote]
  }
}


package typings.atOctokitRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var accept: String
  var `user-agent`: String
}

object Anon_Accept {
  @scala.inline
  def apply(accept: String, `user-agent`: String): Anon_Accept = {
    val __obj = js.Dynamic.literal(accept = accept)
    __obj.updateDynamic("user-agent")(`user-agent`)
    __obj.asInstanceOf[Anon_Accept]
  }
}


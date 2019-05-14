package typings
package atOctokitEndpointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var accept: java.lang.String
  var `user-agent`: java.lang.String
}

object Anon_Accept {
  @scala.inline
  def apply(accept: java.lang.String, `user-agent`: java.lang.String): Anon_Accept = {
    val __obj = js.Dynamic.literal(accept = accept)
    __obj.updateDynamic("user-agent")(`user-agent`)
    __obj.asInstanceOf[Anon_Accept]
  }
}


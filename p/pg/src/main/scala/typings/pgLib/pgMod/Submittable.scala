package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Submittable extends js.Object {
  def submit(connection: Connection): scala.Unit
}

object Submittable {
  @scala.inline
  def apply(submit: Connection => scala.Unit): Submittable = {
    val __obj = js.Dynamic.literal(submit = js.Any.fromFunction1(submit))
  
    __obj.asInstanceOf[Submittable]
  }
}


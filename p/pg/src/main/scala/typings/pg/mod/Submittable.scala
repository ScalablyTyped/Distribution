package typings.pg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Submittable extends js.Object {
  def submit(connection: Connection): Unit
}

object Submittable {
  @scala.inline
  def apply(submit: Connection => Unit): Submittable = {
    val __obj = js.Dynamic.literal(submit = js.Any.fromFunction1(submit))
    __obj.asInstanceOf[Submittable]
  }
}


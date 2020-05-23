package typings.nivoAnnotations.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Abs extends js.Object {
  var abs: Double | String
}

object Abs {
  @scala.inline
  def apply(abs: Double | String): Abs = {
    val __obj = js.Dynamic.literal(abs = abs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abs]
  }
}


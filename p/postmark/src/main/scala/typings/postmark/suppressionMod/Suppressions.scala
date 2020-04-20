package typings.postmark.suppressionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Suppressions extends js.Object {
  var Suppressions: js.Array[Suppression]
}

object Suppressions {
  @scala.inline
  def apply(Suppressions: js.Array[Suppression]): Suppressions = {
    val __obj = js.Dynamic.literal(Suppressions = Suppressions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Suppressions]
  }
}


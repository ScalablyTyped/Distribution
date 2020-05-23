package typings.ow.modifiersMod

import typings.ow.predicatesMod.Predicates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Modifiers extends js.Object {
  /**
    Make the following predicate optional so it doesn't fail when the value is `undefined`.
    */
  val optional: Predicates
}

object Modifiers {
  @scala.inline
  def apply(optional: Predicates): Modifiers = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any])
    __obj.asInstanceOf[Modifiers]
  }
}


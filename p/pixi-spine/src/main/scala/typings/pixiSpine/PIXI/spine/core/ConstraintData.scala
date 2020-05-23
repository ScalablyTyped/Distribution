package typings.pixiSpine.PIXI.spine.core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConstraintData extends js.Object {
  var name: String
  var order: Double
  var skinRequired: Boolean
}

object ConstraintData {
  @scala.inline
  def apply(name: String, order: Double, skinRequired: Boolean): ConstraintData = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], skinRequired = skinRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConstraintData]
  }
}


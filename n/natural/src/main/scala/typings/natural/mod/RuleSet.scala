package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleSet extends js.Object {
  var rules: js.Array[TransformationRule]
}

object RuleSet {
  @scala.inline
  def apply(rules: js.Array[TransformationRule]): RuleSet = {
    val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RuleSet]
  }
}


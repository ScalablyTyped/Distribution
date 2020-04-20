package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformationRule extends js.Object {
  var literal: js.Array[String]
  var new_category: String
  var old_category: String
  var predicate: Predicate
  @JSName("apply")
  def apply(tagged_sentence: js.Array[js.Array[String]], position: Double): Unit
}

object TransformationRule {
  @scala.inline
  def apply(
    apply: (js.Array[js.Array[String]], Double) => Unit,
    literal: js.Array[String],
    new_category: String,
    old_category: String,
    predicate: Predicate
  ): TransformationRule = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction2(apply), literal = literal.asInstanceOf[js.Any], new_category = new_category.asInstanceOf[js.Any], old_category = old_category.asInstanceOf[js.Any], predicate = predicate.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformationRule]
  }
}


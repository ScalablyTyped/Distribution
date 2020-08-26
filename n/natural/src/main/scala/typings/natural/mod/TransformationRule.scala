package typings.natural.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransformationRule extends js.Object {
  var literal: js.Array[String] = js.native
  var new_category: String = js.native
  var old_category: String = js.native
  var predicate: Predicate = js.native
  @JSName("apply")
  def apply(tagged_sentence: js.Array[js.Array[String]], position: Double): Unit = js.native
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
  @scala.inline
  implicit class TransformationRuleOps[Self <: TransformationRule] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApply(value: (js.Array[js.Array[String]], Double) => Unit): Self = this.set("apply", js.Any.fromFunction2(value))
    @scala.inline
    def setLiteralVarargs(value: String*): Self = this.set("literal", js.Array(value :_*))
    @scala.inline
    def setLiteral(value: js.Array[String]): Self = this.set("literal", value.asInstanceOf[js.Any])
    @scala.inline
    def setNew_category(value: String): Self = this.set("new_category", value.asInstanceOf[js.Any])
    @scala.inline
    def setOld_category(value: String): Self = this.set("old_category", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredicate(value: Predicate): Self = this.set("predicate", value.asInstanceOf[js.Any])
  }
  
}


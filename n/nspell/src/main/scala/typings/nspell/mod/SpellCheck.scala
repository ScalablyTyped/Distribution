package typings.nspell.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Returned by NSpell.spell with the following properties:
  * @param correct - Whether word is correctly spelled
  * @param - forbidden - Whether word is actually correct, but forbidden from showing up as such (often by the users wish)
  * @param warn - Whether word is correct, but should trigger a warning (rarely used in dictionaries)
  */
@js.native
trait SpellCheck extends js.Object {
  var correct: Boolean = js.native
  var forbidden: Boolean = js.native
  var warn: Boolean = js.native
}

object SpellCheck {
  @scala.inline
  def apply(correct: Boolean, forbidden: Boolean, warn: Boolean): SpellCheck = {
    val __obj = js.Dynamic.literal(correct = correct.asInstanceOf[js.Any], forbidden = forbidden.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpellCheck]
  }
  @scala.inline
  implicit class SpellCheckOps[Self <: SpellCheck] (val x: Self) extends AnyVal {
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
    def setCorrect(value: Boolean): Self = this.set("correct", value.asInstanceOf[js.Any])
    @scala.inline
    def setForbidden(value: Boolean): Self = this.set("forbidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarn(value: Boolean): Self = this.set("warn", value.asInstanceOf[js.Any])
  }
  
}


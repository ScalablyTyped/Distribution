package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ability extends js.Object {
  var descriptions: Translations = js.native
  var index_number: Double = js.native
  var names: Translations = js.native
}

object Ability {
  @scala.inline
  def apply(descriptions: Translations, index_number: Double, names: Translations): Ability = {
    val __obj = js.Dynamic.literal(descriptions = descriptions.asInstanceOf[js.Any], index_number = index_number.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ability]
  }
  @scala.inline
  implicit class AbilityOps[Self <: Ability] (val x: Self) extends AnyVal {
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
    def setDescriptions(value: Translations): Self = this.set("descriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex_number(value: Double): Self = this.set("index_number", value.asInstanceOf[js.Any])
    @scala.inline
    def setNames(value: Translations): Self = this.set("names", value.asInstanceOf[js.Any])
  }
  
}


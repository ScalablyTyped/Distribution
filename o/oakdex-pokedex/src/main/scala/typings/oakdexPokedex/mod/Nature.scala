package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Nature extends js.Object {
  var decreased_stat: String | Null = js.native
  var disliked_flavor: String | Null = js.native
  var favorite_flavor: String | Null = js.native
  var increased_stat: String | Null = js.native
  var names: Translations = js.native
}

object Nature {
  @scala.inline
  def apply(names: Translations): Nature = {
    val __obj = js.Dynamic.literal(names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[Nature]
  }
  @scala.inline
  implicit class NatureOps[Self <: Nature] (val x: Self) extends AnyVal {
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
    def setNames(value: Translations): Self = this.set("names", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecreased_stat(value: String): Self = this.set("decreased_stat", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecreased_statNull: Self = this.set("decreased_stat", null)
    @scala.inline
    def setDisliked_flavor(value: String): Self = this.set("disliked_flavor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisliked_flavorNull: Self = this.set("disliked_flavor", null)
    @scala.inline
    def setFavorite_flavor(value: String): Self = this.set("favorite_flavor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFavorite_flavorNull: Self = this.set("favorite_flavor", null)
    @scala.inline
    def setIncreased_stat(value: String): Self = this.set("increased_stat", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncreased_statNull: Self = this.set("increased_stat", null)
  }
  
}


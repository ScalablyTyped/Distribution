package typings.oakdexPokedex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Region extends js.Object {
  var locations: js.Array[Location] = js.native
  var names: Translations = js.native
}

object Region {
  @scala.inline
  def apply(locations: js.Array[Location], names: Translations): Region = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  @scala.inline
  implicit class RegionOps[Self <: Region] (val x: Self) extends AnyVal {
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
    def setLocationsVarargs(value: Location*): Self = this.set("locations", js.Array(value :_*))
    @scala.inline
    def setLocations(value: js.Array[Location]): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def setNames(value: Translations): Self = this.set("names", value.asInstanceOf[js.Any])
  }
  
}


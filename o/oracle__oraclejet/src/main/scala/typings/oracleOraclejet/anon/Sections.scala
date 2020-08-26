package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sections extends js.Object {
  var items: Boolean = js.native
  var sections: String = js.native
  var title: String = js.native
}

object Sections {
  @scala.inline
  def apply(items: Boolean, sections: String, title: String): Sections = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sections]
  }
  @scala.inline
  implicit class SectionsOps[Self <: Sections] (val x: Self) extends AnyVal {
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
    def setItems(value: Boolean): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setSections(value: String): Self = this.set("sections", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}


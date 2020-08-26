package typings.oracleOraclejet.ojlegendMod.ojLegend

import typings.oracleOraclejet.anon.Sections
import typings.oracleOraclejet.anon.TextString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
@js.native
trait SectionContext extends js.Object {
  var getItems: TextString = js.native
  var getSection: Sections = js.native
  var items: js.Array[js.Object] = js.native
  var sections: js.Array[js.Object] = js.native
  var title: String = js.native
}

object SectionContext {
  @scala.inline
  def apply(
    getItems: TextString,
    getSection: Sections,
    items: js.Array[js.Object],
    sections: js.Array[js.Object],
    title: String
  ): SectionContext = {
    val __obj = js.Dynamic.literal(getItems = getItems.asInstanceOf[js.Any], getSection = getSection.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SectionContext]
  }
  @scala.inline
  implicit class SectionContextOps[Self <: SectionContext] (val x: Self) extends AnyVal {
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
    def setGetItems(value: TextString): Self = this.set("getItems", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetSection(value: Sections): Self = this.set("getSection", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: js.Object*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[js.Object]): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setSectionsVarargs(value: js.Object*): Self = this.set("sections", js.Array(value :_*))
    @scala.inline
    def setSections(value: js.Array[js.Object]): Self = this.set("sections", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
  }
  
}


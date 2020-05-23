package typings.oracleOraclejet.ojlegendMod.ojLegend

import typings.oracleOraclejet.anon.Sections
import typings.oracleOraclejet.anon.TextString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait SectionContext extends js.Object {
  var getItems: TextString
  var getSection: Sections
  var items: js.Array[js.Object]
  var sections: js.Array[js.Object]
  var title: String
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
}


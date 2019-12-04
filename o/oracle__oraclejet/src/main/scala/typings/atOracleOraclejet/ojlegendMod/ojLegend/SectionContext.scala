package typings.atOracleOraclejet.ojlegendMod.ojLegend

import typings.atOracleOraclejet.Anon_Items
import typings.atOracleOraclejet.Anon_Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait SectionContext extends js.Object {
  var getItems: Anon_Text
  var getSection: Anon_Items
  var items: js.Array[js.Object]
  var sections: js.Array[js.Object]
  var title: String
}

object SectionContext {
  @scala.inline
  def apply(
    getItems: Anon_Text,
    getSection: Anon_Items,
    items: js.Array[js.Object],
    sections: js.Array[js.Object],
    title: String
  ): SectionContext = {
    val __obj = js.Dynamic.literal(getItems = getItems.asInstanceOf[js.Any], getSection = getSection.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], sections = sections.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SectionContext]
  }
}


package typings
package atOracleOraclejetLib.ojlegendMod.ojLegendNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait SectionContext extends js.Object {
  var getItems: atOracleOraclejetLib.Anon_Text
  var getSection: atOracleOraclejetLib.Anon_Items
  var items: js.Array[js.Object]
  var sections: js.Array[js.Object]
  var title: java.lang.String
}

object SectionContext {
  @scala.inline
  def apply(
    getItems: atOracleOraclejetLib.Anon_Text,
    getSection: atOracleOraclejetLib.Anon_Items,
    items: js.Array[js.Object],
    sections: js.Array[js.Object],
    title: java.lang.String
  ): SectionContext = {
    val __obj = js.Dynamic.literal(getItems = getItems, getSection = getSection, items = items, sections = sections, title = title)
  
    __obj.asInstanceOf[SectionContext]
  }
}


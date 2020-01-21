package typings.oracleOraclejet.ojlistviewMod.ojListView

import typings.oracleOraclejet.oracleOraclejetStrings.after
import typings.oracleOraclejet.oracleOraclejetStrings.before
import typings.oracleOraclejet.oracleOraclejetStrings.inside
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemsDropContext extends js.Object {
  var item: Element
  var position: before | after | inside
  var reorder: Boolean
}

object ItemsDropContext {
  @scala.inline
  def apply(item: Element, position: before | after | inside, reorder: Boolean): ItemsDropContext = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reorder = reorder.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ItemsDropContext]
  }
}


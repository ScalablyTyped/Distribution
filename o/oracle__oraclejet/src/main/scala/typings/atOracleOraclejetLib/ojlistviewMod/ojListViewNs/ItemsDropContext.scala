package typings
package atOracleOraclejetLib.ojlistviewMod.ojListViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemsDropContext extends js.Object {
  var item: stdLib.Element
  var position: atOracleOraclejetLib.atOracleOraclejetLibStrings.before | atOracleOraclejetLib.atOracleOraclejetLibStrings.after | atOracleOraclejetLib.atOracleOraclejetLibStrings.inside
  var reorder: scala.Boolean
}

object ItemsDropContext {
  @scala.inline
  def apply(
    item: stdLib.Element,
    position: atOracleOraclejetLib.atOracleOraclejetLibStrings.before | atOracleOraclejetLib.atOracleOraclejetLibStrings.after | atOracleOraclejetLib.atOracleOraclejetLibStrings.inside,
    reorder: scala.Boolean
  ): ItemsDropContext = {
    val __obj = js.Dynamic.literal(item = item, position = position.asInstanceOf[js.Any], reorder = reorder)
  
    __obj.asInstanceOf[ItemsDropContext]
  }
}


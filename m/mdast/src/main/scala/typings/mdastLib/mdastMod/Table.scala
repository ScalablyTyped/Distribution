package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Table extends Parent {
  var align: js.UndefOr[js.Array[AlignType]] = js.undefined
  @JSName("children")
  var children_Table: js.Array[TableContent]
  @JSName("type")
  var type_Table: mdastLib.mdastLibStrings.table
}


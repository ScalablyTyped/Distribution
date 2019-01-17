package typings
package atOracleOraclejetLib.ojdatagridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojDataGridSettableProperties[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var bandingInterval: atOracleOraclejetLib.Anon_Column
  var cell: atOracleOraclejetLib.Anon_ClassName[K, D]
  var currentCell: atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.CurrentCell[K] | scala.Null
  var data: (atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null
  var dnd: atOracleOraclejetLib.Anon_Reorder
  var editMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellNavigation | atOracleOraclejetLib.atOracleOraclejetLibStrings.cellEdit
  var gridlines: atOracleOraclejetLib.Anon_Hidden
  var header: atOracleOraclejetLib.Anon_ColumnColumnEnd[K, D]
  var scrollPolicy: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll | atOracleOraclejetLib.atOracleOraclejetLibStrings.scroll
  var scrollPolicyOptions: atOracleOraclejetLib.Anon_MaxColumnCount
  var scrollPosition: atOracleOraclejetLib.Anon_ColumnIndex[K]
  var selection: js.Array[atOracleOraclejetLib.ojdatagridMod.ojDataGridNs.Selection[K]]
  var selectionMode: atOracleOraclejetLib.Anon_Cell
  @JSName("translations")
  var translations_ojDataGridSettableProperties: atOracleOraclejetLib.Anon_AccessibleActionableMode
}


package typings
package atOracleOraclejetLib.ojlistviewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojListViewSettableProperties[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentSettableProperties {
  var as: java.lang.String
  var currentItem: K
  var data: atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]
  var dnd: atOracleOraclejetLib.Anon_DragDropReorder
  var drillMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.collapsible | atOracleOraclejetLib.atOracleOraclejetLibStrings.none
  var expanded: atOracleOraclejetLib.ojkeysetMod.KeySet[K]
  val firstSelectedItem: atOracleOraclejetLib.Anon_DataKey[K, D]
  var groupHeaderPosition: atOracleOraclejetLib.atOracleOraclejetLibStrings.static | atOracleOraclejetLib.atOracleOraclejetLibStrings.sticky
  var item: atOracleOraclejetLib.Anon_Focusable[K, D]
  var scrollPolicy: atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.loadMoreOnScroll
  var scrollPolicyOptions: atOracleOraclejetLib.Anon_FetchSize
  var scrollPosition: atOracleOraclejetLib.Anon_IndexKey[K]
  var selection: js.Array[K]
  var selectionMode: atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.single | atOracleOraclejetLib.atOracleOraclejetLibStrings.multiple
  var selectionRequired: scala.Boolean
  @JSName("translations")
  var translations_ojListViewSettableProperties: atOracleOraclejetLib.Anon_AccessibleNavigateSkipItems
}


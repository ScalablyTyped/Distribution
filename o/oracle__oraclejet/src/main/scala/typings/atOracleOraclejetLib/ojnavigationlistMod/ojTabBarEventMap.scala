package typings
package atOracleOraclejetLib.ojnavigationlistMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojTabBarEventMap[K, D]
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentEventMap[ojTabBarSettableProperties[K, D]] {
  var asChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String]
  var currentItemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_]
  var dataChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[(atOracleOraclejetLib.ojdataproviderMod.DataProvider[K, D]) | scala.Null]
  var displayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.all | atOracleOraclejetLib.atOracleOraclejetLibStrings.icons
  ]
  var edgeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.top | atOracleOraclejetLib.atOracleOraclejetLibStrings.bottom | atOracleOraclejetLib.atOracleOraclejetLibStrings.start | atOracleOraclejetLib.atOracleOraclejetLibStrings.end
  ]
  var itemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_ContextRendererSelectableBoolean[K, D]]
  var ojAnimateEnd: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojAnimateEnd
  var ojAnimateStart: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojAnimateStart
  var ojBeforeCurrentItem: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojBeforeCurrentItem
  var ojBeforeDeselect: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojBeforeDeselect
  var ojBeforeRemove: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojBeforeRemove
  var ojBeforeSelect: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojBeforeSelect
  var ojDeselect: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojDeselect
  var ojRemove: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojRemove
  var ojReorder: atOracleOraclejetLib.ojnavigationlistMod.ojTabBarNs.ojReorder
  var overflowChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.popup | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden
  ]
  var reorderableChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.enabled | atOracleOraclejetLib.atOracleOraclejetLibStrings.disabled
  ]
  var selectionChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[_]
  var truncationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.none | atOracleOraclejetLib.atOracleOraclejetLibStrings.progressive
  ]
}


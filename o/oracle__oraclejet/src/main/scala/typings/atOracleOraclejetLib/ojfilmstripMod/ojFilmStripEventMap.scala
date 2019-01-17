package typings
package atOracleOraclejetLib.ojfilmstripMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojFilmStripEventMap
  extends atOracleOraclejetLib.atOracleOraclejetMod.baseComponentEventMap[ojFilmStripSettableProperties] {
  var arrowPlacementChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.adjacent | atOracleOraclejetLib.atOracleOraclejetLibStrings.overlay
  ]
  var arrowVisibilityChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.visible | atOracleOraclejetLib.atOracleOraclejetLibStrings.hidden | atOracleOraclejetLib.atOracleOraclejetLibStrings.hover | atOracleOraclejetLib.atOracleOraclejetLibStrings.auto
  ]
  var currentItemChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[atOracleOraclejetLib.Anon_Id]
  var loopingChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.off | atOracleOraclejetLib.atOracleOraclejetLibStrings.page
  ]
  var maxItemsPerPageChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[scala.Double]
  var orientationChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.horizontal | atOracleOraclejetLib.atOracleOraclejetLibStrings.vertical
  ]
}


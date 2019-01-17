package typings
package atOracleOraclejetLib.ojcolorpaletteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ojColorPaletteEventMap
  extends atOracleOraclejetLib.ojeditablevalueMod.editableValueEventMap[
      atOracleOraclejetLib.ojcolorMod.namespaced, 
      ojColorPaletteSettableProperties, 
      atOracleOraclejetLib.ojcolorMod.namespaced, 
      atOracleOraclejetLib.ojcolorMod.namespaced
    ] {
  var labelDisplayChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.auto | atOracleOraclejetLib.atOracleOraclejetLibStrings.off
  ]
  var labelledByChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[java.lang.String | scala.Null]
  var layoutChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.grid | atOracleOraclejetLib.atOracleOraclejetLibStrings.list
  ]
  @JSName("ojAnimateEnd")
  var ojAnimateEnd_ojColorPaletteEventMap: atOracleOraclejetLib.ojcolorpaletteMod.ojColorPaletteNs.ojAnimateEnd
  @JSName("ojAnimateStart")
  var ojAnimateStart_ojColorPaletteEventMap: atOracleOraclejetLib.ojcolorpaletteMod.ojColorPaletteNs.ojAnimateStart
  var paletteChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[js.Array[atOracleOraclejetLib.Anon_ColorLabel]]
  var swatchSizeChanged: atOracleOraclejetLib.atOracleOraclejetMod.JetElementCustomEvent[
    atOracleOraclejetLib.atOracleOraclejetLibStrings.xs | atOracleOraclejetLib.atOracleOraclejetLibStrings.sm | atOracleOraclejetLib.atOracleOraclejetLibStrings.lg
  ]
}


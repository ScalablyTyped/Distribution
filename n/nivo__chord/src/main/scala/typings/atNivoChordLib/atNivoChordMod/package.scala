package typings
package atNivoChordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoChordMod {
  type ChordArcMouseHandler = js.Function2[
    /* arc */ ArcData, 
    /* event */ reactLib.reactMod.MouseEvent[js.Any, reactLib.NativeMouseEvent], 
    scala.Unit
  ]
  type ChordCanvasProps = CommonChordProps with atNivoChordLib.Anon_PixelRatio
  type ChordProps = CommonChordProps with atNivoCoreLib.atNivoCoreMod.MotionProps with atNivoChordLib.Anon_OnRibbonClick
  type ChordRibbonMouseHandler = js.Function2[
    /* ribbon */ RibbonData, 
    /* event */ reactLib.reactMod.MouseEvent[js.Any, reactLib.NativeMouseEvent], 
    scala.Unit
  ]
  type LabelAccessor = js.Function1[
    /* datum */ atNivoChordLib.Omit[ArcData, atNivoChordLib.atNivoChordLibStrings.label], 
    java.lang.String
  ]
  type ValueFormatter = js.Function1[
    /* datum */ atNivoChordLib.Omit[
      ArcData, 
      atNivoChordLib.atNivoChordLibStrings.formattedValue | atNivoChordLib.atNivoChordLibStrings.label
    ], 
    java.lang.String | scala.Double
  ]
}

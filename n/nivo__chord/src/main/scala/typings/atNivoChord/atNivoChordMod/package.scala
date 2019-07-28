package typings.atNivoChord

import typings.atNivoChord.Anon_OnRibbonClick
import typings.atNivoChord.Anon_PixelRatio
import typings.atNivoChord.Omit
import typings.atNivoChord.atNivoChordStrings.formattedValue
import typings.atNivoChord.atNivoChordStrings.label
import typings.atNivoCore.atNivoCoreMod.MotionProps
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoChordMod {
  type ChordArcMouseHandler = js.Function2[/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent], Unit]
  type ChordCanvasProps = CommonChordProps with Anon_PixelRatio
  type ChordProps = CommonChordProps with MotionProps with Anon_OnRibbonClick
  type ChordRibbonMouseHandler = js.Function2[/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent], Unit]
  type LabelAccessor = js.Function1[/* datum */ Omit[ArcData, label], String]
  type ValueFormatter = js.Function1[/* datum */ Omit[ArcData, formattedValue | label], String | Double]
}

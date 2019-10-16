package typings.atNivoChord

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoChordMod {
  import typings.atNivoChord.OmitArcDataformattedValuelabel
  import typings.atNivoChord.OmitArcDatalabel
  import typings.react.NativeMouseEvent
  import typings.react.reactMod.MouseEvent

  type ChordArcMouseHandler = js.Function2[/* arc */ ArcData, /* event */ MouseEvent[js.Any, NativeMouseEvent], Unit]
  type ChordRibbonMouseHandler = js.Function2[/* ribbon */ RibbonData, /* event */ MouseEvent[js.Any, NativeMouseEvent], Unit]
  type LabelAccessor = js.Function1[/* datum */ OmitArcDatalabel, String]
  type ValueFormatter = js.Function1[/* datum */ OmitArcDataformattedValuelabel, String | Double]
}

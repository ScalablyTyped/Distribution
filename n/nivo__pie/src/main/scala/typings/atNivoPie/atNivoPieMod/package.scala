package typings.atNivoPie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoPieMod {
  import typings.atNivoCore.atNivoCoreMod.MotionProps
  import typings.atNivoCore.atNivoCoreMod.SvgDefsAndFill
  import typings.atNivoPie.Anon_BorderColor
  import typings.atNivoPie.Anon_Color
  import typings.atNivoPie.Anon_PixelRatio
  import typings.std.Partial

  type AccessorFunc = js.Function1[/* datum */ PieDatum, String]
  type CommonPieProps = MotionProps with Partial[Anon_BorderColor]
  type PieCanvasProps = Data with CommonPieProps with Partial[Anon_PixelRatio]
  type PieDatumWithColor = PieDatum with Anon_Color
  type PieSvgProps = Data with CommonPieProps with SvgDefsAndFill[PieDatum]
  type ValueFormatter = js.Function1[/* value */ Double, String | Double]
}

package typings
package atNivoPieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoPieMod {
  type AccessorFunc = js.Function1[/* datum */ PieDatum, java.lang.String]
  type CommonPieProps = atNivoCoreLib.atNivoCoreMod.MotionProps with stdLib.Partial[atNivoPieLib.Anon_BorderColor]
  type PieCanvasProps = Data with CommonPieProps with stdLib.Partial[atNivoPieLib.Anon_PixelRatio]
  type PieDatumWithColor = PieDatum with atNivoPieLib.Anon_Color
  type PieSvgProps = Data with CommonPieProps with atNivoCoreLib.atNivoCoreMod.SvgDefsAndFill[PieDatum]
  type ValueFormatter = js.Function1[/* value */ scala.Double, java.lang.String | scala.Double]
}

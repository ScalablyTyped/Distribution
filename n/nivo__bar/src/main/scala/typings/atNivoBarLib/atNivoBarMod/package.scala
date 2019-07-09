package typings
package atNivoBarLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoBarMod {
  type AccessorFunc = js.Function1[/* datum */ BarDatum, java.lang.String]
  type Axis = stdLib.Partial[atNivoBarLib.Anon_Bottom]
  type BarCanvasProps = Data with BarProps with stdLib.Partial[atNivoBarLib.Anon_OnClick]
  type BarClickHandler = js.Function2[
    /* datum */ BarExtendedDatum, 
    /* event */ reactLib.reactMod.MouseEvent[stdLib.HTMLCanvasElement, reactLib.NativeMouseEvent], 
    scala.Unit
  ]
  type BarCustomLayer = js.Function1[/* props */ js.Any, reactLib.reactMod.ReactNode]
  type BarDatum = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  type BarDatumWithColor = BarDatum with atNivoBarLib.Anon_Color
  type BarProps = stdLib.Partial[atNivoBarLib.Anon_Auto]
  type BarSvgProps = Data with BarProps with atNivoCoreLib.atNivoCoreMod.MotionProps with atNivoCoreLib.atNivoCoreMod.SvgDefsAndFill[BarDatum] with stdLib.Partial[atNivoBarLib.Anon_Datum]
  type IndexByFunc = js.Function1[/* datum */ BarDatum, java.lang.String | scala.Double]
  type LabelFormatter = js.Function1[/* label */ java.lang.String | scala.Double, java.lang.String | scala.Double]
  type Layer = BarLayerType | BarCustomLayer
  type TooltipProp = reactLib.reactMod.StatelessComponent[BarExtendedDatum]
  type ValueFormatter = js.Function1[/* value */ scala.Double, java.lang.String | scala.Double]
}

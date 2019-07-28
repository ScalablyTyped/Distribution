package typings.atNivoBar

import org.scalablytyped.runtime.StringDictionary
import typings.atNivoBar.Anon_Auto
import typings.atNivoBar.Anon_Bottom
import typings.atNivoBar.Anon_Color
import typings.atNivoBar.Anon_Datum
import typings.atNivoBar.Anon_OnClick
import typings.atNivoCore.atNivoCoreMod.MotionProps
import typings.atNivoCore.atNivoCoreMod.SvgDefsAndFill
import typings.react.NativeMouseEvent
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
import typings.react.reactMod.StatelessComponent
import typings.std.HTMLCanvasElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoBarMod {
  type AccessorFunc = js.Function1[/* datum */ BarDatum, String]
  type Axis = Partial[Anon_Bottom]
  type BarCanvasProps = Data with BarProps with Partial[Anon_OnClick]
  type BarClickHandler = js.Function2[
    /* datum */ BarExtendedDatum, 
    /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent], 
    Unit
  ]
  type BarCustomLayer = js.Function1[/* props */ js.Any, ReactNode]
  type BarDatum = StringDictionary[String | Double]
  type BarDatumWithColor = BarDatum with Anon_Color
  type BarProps = Partial[Anon_Auto]
  type BarSvgProps = Data with BarProps with MotionProps with SvgDefsAndFill[BarDatum] with Partial[Anon_Datum]
  type IndexByFunc = js.Function1[/* datum */ BarDatum, String | Double]
  type LabelFormatter = js.Function1[/* label */ String | Double, String | Double]
  type Layer = BarLayerType | BarCustomLayer
  type TooltipProp = StatelessComponent[BarExtendedDatum]
  type ValueFormatter = js.Function1[/* value */ Double, String | Double]
}

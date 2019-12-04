package typings.atNivoBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoBarMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.react.reactMod.MouseEvent
  import typings.react.reactMod.NativeMouseEvent
  import typings.react.reactMod.ReactNode
  import typings.react.reactMod.StatelessComponent
  import typings.std.HTMLCanvasElement

  type AccessorFunc = js.Function1[/* datum */ BarDatum, String]
  type BarClickHandler = js.Function2[
    /* datum */ BarExtendedDatum, 
    /* event */ MouseEvent[HTMLCanvasElement, NativeMouseEvent], 
    Unit
  ]
  type BarCustomLayer = js.Function1[/* props */ js.Any, ReactNode]
  type BarDatum = StringDictionary[String | Double]
  type IndexByFunc = js.Function1[/* datum */ BarDatum, String | Double]
  type LabelFormatter = js.Function1[/* label */ String | Double, String | Double]
  type Layer = BarLayerType | BarCustomLayer
  type TooltipProp = StatelessComponent[BarExtendedDatum]
  type ValueFormatter = js.Function1[/* value */ Double, String | Double]
}

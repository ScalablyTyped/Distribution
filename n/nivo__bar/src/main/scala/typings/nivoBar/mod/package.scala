package typings.nivoBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AccessorFunc = js.Function1[/* datum */ typings.nivoBar.mod.BarDatum, java.lang.String]
  type BarClickHandler = js.Function2[
    /* datum */ typings.nivoBar.mod.BarExtendedDatum, 
    /* event */ typings.react.mod.MouseEvent[typings.std.HTMLCanvasElement, typings.react.mod.NativeMouseEvent], 
    scala.Unit
  ]
  type BarCustomLayer = js.Function1[/* props */ js.Any, typings.react.mod.ReactNode]
  type BarDatum = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
  type IndexByFunc = js.Function1[/* datum */ typings.nivoBar.mod.BarDatum, java.lang.String | scala.Double]
  type LabelFormatter = js.Function1[/* label */ java.lang.String | scala.Double, java.lang.String | scala.Double]
  type Layer = typings.nivoBar.mod.BarLayerType | typings.nivoBar.mod.BarCustomLayer
  type TooltipProp = typings.react.mod.StatelessComponent[typings.nivoBar.mod.BarExtendedDatum]
  type ValueFormatter = js.Function1[/* value */ scala.Double, java.lang.String | scala.Double]
}

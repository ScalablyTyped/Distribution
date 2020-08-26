package typings.nivoBar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AccessorFunc = js.Function1[/* datum */ typings.nivoBar.mod.BarDatum, java.lang.String]
  type BarCustomLayer = js.Function1[/* props */ js.Any, typings.react.mod.ReactNode]
  type BarDatum = org.scalablytyped.runtime.StringDictionary[typings.nivoBar.mod.Value]
  type BarMouseEventHandler[T] = js.Function2[
    /* datum */ typings.nivoBar.mod.BarExtendedDatum, 
    /* event */ typings.react.mod.MouseEvent[T, typings.react.mod.NativeMouseEvent], 
    scala.Unit
  ]
  type IndexByFunc = js.Function1[/* datum */ typings.nivoBar.mod.BarDatum, java.lang.String | scala.Double]
  type LabelFormatter = js.Function1[/* label */ java.lang.String | scala.Double, java.lang.String | scala.Double]
  type Layer = typings.nivoBar.mod.BarLayerType | typings.nivoBar.mod.BarCustomLayer
  type TooltipProp = typings.react.mod.StatelessComponent[typings.nivoBar.mod.BarExtendedDatum]
  type Value = java.lang.String | scala.Double
  type ValueFormatter = js.Function1[/* value */ scala.Double, java.lang.String | scala.Double]
}

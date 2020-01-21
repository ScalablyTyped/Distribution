package typings.nivoSankey

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AccessorFunc = js.Function1[/* datum */ typings.nivoSankey.mod.SankeyNodeDatum, java.lang.String]
  type LabelFormatter = js.Function1[/* label */ java.lang.String | scala.Double, java.lang.String | scala.Double]
  type SankeyMouseHandler = js.Function2[
    /* data */ typings.nivoSankey.mod.SankeyNodeDatum | typings.nivoSankey.mod.SankeyLinkDatum, 
    /* event */ typings.react.mod.MouseEvent[typings.std.Element, typings.react.mod.NativeMouseEvent], 
    scala.Unit
  ]
  type SankeySortFunction = js.Function2[
    /* nodeA */ typings.nivoSankey.mod.SankeyDataNode, 
    /* nodeB */ typings.nivoSankey.mod.SankeyDataNode, 
    scala.Double
  ]
  type TooltipFormat = js.Function1[/* value */ scala.Double, typings.react.mod.ReactNode]
  type TooltipRenderer[T] = js.Function1[/* data */ T, typings.react.mod.ReactNode]
}

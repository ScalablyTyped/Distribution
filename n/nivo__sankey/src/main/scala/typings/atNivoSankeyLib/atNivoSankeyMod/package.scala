package typings
package atNivoSankeyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoSankeyMod {
  type AccessorFunc = js.Function1[/* datum */ SankeyNodeDatum, java.lang.String]
  type LabelFormatter = js.Function1[/* label */ java.lang.String | scala.Double, java.lang.String | scala.Double]
  type SankeyMouseHandler = js.Function2[
    /* data */ SankeyNodeDatum | SankeyLinkDatum, 
    /* event */ reactLib.reactMod.MouseEvent[reactLib.Element, reactLib.NativeMouseEvent], 
    scala.Unit
  ]
  type SankeyProps = stdLib.Partial[atNivoSankeyLib.Anon_Align]
  type SankeySortFunction = js.Function2[/* nodeA */ SankeyDataNode, /* nodeB */ SankeyDataNode, scala.Double]
  type TooltipFormat = js.Function1[/* value */ scala.Double, reactLib.reactMod.ReactNode]
  type TooltipRenderer[T] = js.Function1[/* data */ T, reactLib.reactMod.ReactNode]
}

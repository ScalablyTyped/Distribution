package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcDrawersCanvasDrawerMod {
  type CanvasDrawStep = js.Function3[
    /* context */ d3DashShapeLib.d3DashShapeMod.Global.CanvasRenderingContext2D, 
    /* data */ js.Array[js.Any], 
    /* attrToAppliedProjector */ plottableLib.buildSrcCoreInterfacesMod.AttributeToAppliedProjector, 
    scala.Unit
  ]
}

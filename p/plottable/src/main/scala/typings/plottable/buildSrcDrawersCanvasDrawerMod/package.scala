package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcDrawersCanvasDrawerMod {
  import typings.plottable.buildSrcCoreInterfacesMod.AttributeToAppliedProjector
  import typings.std.CanvasRenderingContext2D

  type CanvasDrawStep = js.Function3[
    /* context */ CanvasRenderingContext2D, 
    /* data */ js.Array[js.Any], 
    /* attrToAppliedProjector */ AttributeToAppliedProjector, 
    Unit
  ]
}

package typings.plottable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object canvasDrawerMod {
  type CanvasDrawStep = js.Function3[
    /* context */ typings.std.CanvasRenderingContext2D, 
    /* data */ js.Array[js.Any], 
    /* attrToAppliedProjector */ typings.plottable.interfacesMod.AttributeToAppliedProjector, 
    scala.Unit
  ]
}

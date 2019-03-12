package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcDrawersCanvasDrawerMod {
  type CanvasDrawStep = js.Function3[
    /* context */ stdLib.CanvasRenderingContext2D, 
    /* data */ js.Array[js.Any], 
    /* attrToAppliedProjector */ plottableLib.buildSrcCoreInterfacesMod.AttributeToAppliedProjector, 
    scala.Unit
  ]
}

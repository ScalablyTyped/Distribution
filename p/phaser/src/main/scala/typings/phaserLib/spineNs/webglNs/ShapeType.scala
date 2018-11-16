package typings
package phaserLib.spineNs.webglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ShapeType extends js.Object

@JSGlobal("spine.webgl.ShapeType")
@js.native
object ShapeType extends js.Object {
  @js.native
  sealed trait Filled
    extends phaserLib.spineNs.webglNs.ShapeType
  
  @js.native
  sealed trait Line
    extends phaserLib.spineNs.webglNs.ShapeType
  
  @js.native
  sealed trait Point
    extends phaserLib.spineNs.webglNs.ShapeType
  
  /* 4 */ val Filled: Filled with scala.Double = js.native
  /* 1 */ val Line: Line with scala.Double = js.native
  /* 0 */ val Point: Point with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.spineNs.webglNs.ShapeType with scala.Double] = js.native
}


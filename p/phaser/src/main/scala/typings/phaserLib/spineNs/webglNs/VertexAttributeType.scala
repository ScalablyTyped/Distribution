package typings
package phaserLib.spineNs.webglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VertexAttributeType extends js.Object

@JSGlobal("spine.webgl.VertexAttributeType")
@js.native
object VertexAttributeType extends js.Object {
  @js.native
  sealed trait Float
    extends phaserLib.spineNs.webglNs.VertexAttributeType
  
  /* 0 */ val Float: Float with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.spineNs.webglNs.VertexAttributeType with scala.Double] = js.native
}


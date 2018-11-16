package typings
package phaserLib.spineNs.webglNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ResizeMode extends js.Object

@JSGlobal("spine.webgl.ResizeMode")
@js.native
object ResizeMode extends js.Object {
  @js.native
  sealed trait Expand
    extends phaserLib.spineNs.webglNs.ResizeMode
  
  @js.native
  sealed trait Fit
    extends phaserLib.spineNs.webglNs.ResizeMode
  
  @js.native
  sealed trait Stretch
    extends phaserLib.spineNs.webglNs.ResizeMode
  
  /* 1 */ val Expand: Expand with scala.Double = js.native
  /* 2 */ val Fit: Fit with scala.Double = js.native
  /* 0 */ val Stretch: Stretch with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.spineNs.webglNs.ResizeMode with scala.Double] = js.native
}


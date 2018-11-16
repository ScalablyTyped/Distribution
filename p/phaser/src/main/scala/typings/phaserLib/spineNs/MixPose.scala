package typings
package phaserLib.spineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MixPose extends js.Object

@JSGlobal("spine.MixPose")
@js.native
object MixPose extends js.Object {
  @js.native
  sealed trait current
    extends phaserLib.spineNs.MixPose
  
  @js.native
  sealed trait currentLayered
    extends phaserLib.spineNs.MixPose
  
  @js.native
  sealed trait setup
    extends phaserLib.spineNs.MixPose
  
  /* 1 */ val current: current with scala.Double = js.native
  /* 2 */ val currentLayered: currentLayered with scala.Double = js.native
  /* 0 */ val setup: setup with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[phaserLib.spineNs.MixPose with scala.Double] = js.native
}


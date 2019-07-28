package typings.navermaps.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Animation extends js.Object

/**
  * Members
  */
@JSGlobal("naver.maps.Animation")
@js.native
object Animation extends js.Object {
  @js.native
  sealed trait BOUNCE extends Animation
  
  @js.native
  sealed trait DROP extends Animation
  
  /* 1 */ val BOUNCE: typings.navermaps.naverNs.mapsNs.Animation.BOUNCE with Double = js.native
  /* 0 */ val DROP: typings.navermaps.naverNs.mapsNs.Animation.DROP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Animation with Double] = js.native
}


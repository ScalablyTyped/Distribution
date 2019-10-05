package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointingIcon extends js.Object

@JSGlobal("naver.maps.PointingIcon")
@js.native
object PointingIcon extends js.Object {
  @js.native
  sealed trait BLOCK_ARROW extends PointingIcon
  
  @js.native
  sealed trait CIRCLE extends PointingIcon
  
  @js.native
  sealed trait DIAMOND extends PointingIcon
  
  @js.native
  sealed trait OPEN_ARROW extends PointingIcon
  
  /* 0 */ val BLOCK_ARROW: typings.navermaps.naver.maps.PointingIcon.BLOCK_ARROW with Double = js.native
  /* 1 */ val CIRCLE: typings.navermaps.naver.maps.PointingIcon.CIRCLE with Double = js.native
  /* 2 */ val DIAMOND: typings.navermaps.naver.maps.PointingIcon.DIAMOND with Double = js.native
  /* 1 */ val OPEN_ARROW: typings.navermaps.naver.maps.PointingIcon.OPEN_ARROW with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointingIcon with Double] = js.native
}


package typings.navermaps.naver.maps

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PointingIcon with Double] = js.native
  /* 0 */ @js.native
  object BLOCK_ARROW extends TopLevel[BLOCK_ARROW with Double]
  
  /* 1 */ @js.native
  object CIRCLE extends TopLevel[CIRCLE with Double]
  
  /* 2 */ @js.native
  object DIAMOND extends TopLevel[DIAMOND with Double]
  
  /* 1 */ @js.native
  object OPEN_ARROW extends TopLevel[OPEN_ARROW with Double]
  
}


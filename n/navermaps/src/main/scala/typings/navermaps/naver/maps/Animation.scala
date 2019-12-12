package typings.navermaps.naver.maps

import org.scalablytyped.runtime.TopLevel
import typings.navermaps.naver.maps.Animation.BOUNCE
import typings.navermaps.naver.maps.Animation.DROP
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Animation with Double] = js.native
  /* 1 */ @js.native
  object BOUNCE extends TopLevel[BOUNCE with Double]
  
  /* 0 */ @js.native
  object DROP extends TopLevel[DROP with Double]
  
}


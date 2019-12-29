package typings.navermaps.naver.maps.drawing

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrawingEvent extends js.Object

@JSGlobal("naver.maps.drawing.DrawingEvent")
@js.native
object DrawingEvent extends js.Object {
  @js.native
  sealed trait ADD extends DrawingEvent
  
  @js.native
  sealed trait Added extends DrawingEvent
  
  @js.native
  sealed trait REMOVE extends DrawingEvent
  
  @js.native
  sealed trait Removed extends DrawingEvent
  
  @js.native
  sealed trait SELECT extends DrawingEvent
  
  @js.native
  sealed trait Selected extends DrawingEvent
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DrawingEvent with Double] = js.native
  /* 0 */ @js.native
  object ADD extends TopLevel[ADD with Double]
  
  /* 3 */ @js.native
  object Added extends TopLevel[Added with Double]
  
  /* 1 */ @js.native
  object REMOVE extends TopLevel[REMOVE with Double]
  
  /* 4 */ @js.native
  object Removed extends TopLevel[Removed with Double]
  
  /* 2 */ @js.native
  object SELECT extends TopLevel[SELECT with Double]
  
  /* 5 */ @js.native
  object Selected extends TopLevel[Selected with Double]
  
}


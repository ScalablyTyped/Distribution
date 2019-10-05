package typings.navermaps.naver.maps.drawing

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
  
  /* 0 */ val ADD: typings.navermaps.naver.maps.drawing.DrawingEvent.ADD with Double = js.native
  /* 3 */ val Added: typings.navermaps.naver.maps.drawing.DrawingEvent.Added with Double = js.native
  /* 1 */ val REMOVE: typings.navermaps.naver.maps.drawing.DrawingEvent.REMOVE with Double = js.native
  /* 4 */ val Removed: typings.navermaps.naver.maps.drawing.DrawingEvent.Removed with Double = js.native
  /* 2 */ val SELECT: typings.navermaps.naver.maps.drawing.DrawingEvent.SELECT with Double = js.native
  /* 5 */ val Selected: typings.navermaps.naver.maps.drawing.DrawingEvent.Selected with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DrawingEvent with Double] = js.native
}


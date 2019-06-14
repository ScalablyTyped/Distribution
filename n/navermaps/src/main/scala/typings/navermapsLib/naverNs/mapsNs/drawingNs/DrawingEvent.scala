package typings
package navermapsLib.naverNs.mapsNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrawingEvent extends js.Object

@JSGlobal("naver.maps.drawing.DrawingEvent")
@js.native
object DrawingEvent extends js.Object {
  @js.native
  sealed trait ADD
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingEvent
  
  @js.native
  sealed trait Added
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingEvent
  
  @js.native
  sealed trait REMOVE
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingEvent
  
  @js.native
  sealed trait Removed
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingEvent
  
  @js.native
  sealed trait SELECT
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingEvent
  
  @js.native
  sealed trait Selected
    extends navermapsLib.naverNs.mapsNs.drawingNs.DrawingEvent
  
  /* 0 */ val ADD: ADD with scala.Double = js.native
  /* 3 */ val Added: Added with scala.Double = js.native
  /* 1 */ val REMOVE: REMOVE with scala.Double = js.native
  /* 4 */ val Removed: Removed with scala.Double = js.native
  /* 2 */ val SELECT: SELECT with scala.Double = js.native
  /* 5 */ val Selected: Selected with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[navermapsLib.naverNs.mapsNs.drawingNs.DrawingEvent with scala.Double] = js.native
}


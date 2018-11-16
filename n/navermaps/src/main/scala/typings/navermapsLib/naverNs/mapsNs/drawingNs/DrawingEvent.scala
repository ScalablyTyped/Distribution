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
  
  val ADD: ADD with java.lang.String = js.native
  val Added: Added with java.lang.String = js.native
  val REMOVE: REMOVE with java.lang.String = js.native
  val Removed: Removed with java.lang.String = js.native
  val SELECT: SELECT with java.lang.String = js.native
  val Selected: Selected with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[navermapsLib.naverNs.mapsNs.drawingNs.DrawingEvent with java.lang.String] = js.native
}


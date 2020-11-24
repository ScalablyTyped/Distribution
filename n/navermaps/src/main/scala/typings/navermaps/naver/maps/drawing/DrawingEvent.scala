package typings.navermaps.naver.maps.drawing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}

package typings
package olLib.renderEventTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EventType extends js.Object

@JSImport("ol/render/EventType", "EventType")
@js.native
object EventType extends js.Object {
  @js.native
  sealed trait POSTCOMPOSE
    extends olLib.renderEventTypeMod.EventType
  
  @js.native
  sealed trait PRECOMPOSE
    extends olLib.renderEventTypeMod.EventType
  
  @js.native
  sealed trait RENDER
    extends olLib.renderEventTypeMod.EventType
  
  @js.native
  sealed trait RENDERCOMPLETE
    extends olLib.renderEventTypeMod.EventType
  
}


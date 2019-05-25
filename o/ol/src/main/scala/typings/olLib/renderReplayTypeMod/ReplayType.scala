package typings
package olLib.renderReplayTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReplayType extends js.Object

@JSImport("ol/render/ReplayType", "ReplayType")
@js.native
object ReplayType extends js.Object {
  @js.native
  sealed trait CIRCLE
    extends olLib.renderReplayTypeMod.ReplayType
  
  @js.native
  sealed trait DEFAULT
    extends olLib.renderReplayTypeMod.ReplayType
  
  @js.native
  sealed trait IMAGE
    extends olLib.renderReplayTypeMod.ReplayType
  
  @js.native
  sealed trait LINE_STRING
    extends olLib.renderReplayTypeMod.ReplayType
  
  @js.native
  sealed trait POLYGON
    extends olLib.renderReplayTypeMod.ReplayType
  
  @js.native
  sealed trait TEXT
    extends olLib.renderReplayTypeMod.ReplayType
  
}


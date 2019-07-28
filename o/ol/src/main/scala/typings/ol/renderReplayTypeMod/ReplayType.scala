package typings.ol.renderReplayTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReplayType extends js.Object

@JSImport("ol/render/ReplayType", "ReplayType")
@js.native
object ReplayType extends js.Object {
  @js.native
  sealed trait CIRCLE extends ReplayType
  
  @js.native
  sealed trait DEFAULT extends ReplayType
  
  @js.native
  sealed trait IMAGE extends ReplayType
  
  @js.native
  sealed trait LINE_STRING extends ReplayType
  
  @js.native
  sealed trait POLYGON extends ReplayType
  
  @js.native
  sealed trait TEXT extends ReplayType
  
}


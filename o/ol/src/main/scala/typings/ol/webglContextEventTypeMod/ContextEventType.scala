package typings.ol.webglContextEventTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContextEventType extends js.Object

@JSImport("ol/webgl/ContextEventType", "ContextEventType")
@js.native
object ContextEventType extends js.Object {
  @js.native
  sealed trait LOST extends ContextEventType
  
  @js.native
  sealed trait RESTORED extends ContextEventType
  
}


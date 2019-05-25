package typings
package olLib.webglContextEventTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContextEventType extends js.Object

@JSImport("ol/webgl/ContextEventType", "ContextEventType")
@js.native
object ContextEventType extends js.Object {
  @js.native
  sealed trait LOST
    extends olLib.webglContextEventTypeMod.ContextEventType
  
  @js.native
  sealed trait RESTORED
    extends olLib.webglContextEventTypeMod.ContextEventType
  
}


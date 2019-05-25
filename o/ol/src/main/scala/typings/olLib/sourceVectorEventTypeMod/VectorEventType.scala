package typings
package olLib.sourceVectorEventTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VectorEventType extends js.Object

@JSImport("ol/source/VectorEventType", "VectorEventType")
@js.native
object VectorEventType extends js.Object {
  @js.native
  sealed trait ADDFEATURE
    extends olLib.sourceVectorEventTypeMod.VectorEventType
  
  @js.native
  sealed trait CHANGEFEATURE
    extends olLib.sourceVectorEventTypeMod.VectorEventType
  
  @js.native
  sealed trait CLEAR
    extends olLib.sourceVectorEventTypeMod.VectorEventType
  
  @js.native
  sealed trait REMOVEFEATURE
    extends olLib.sourceVectorEventTypeMod.VectorEventType
  
}


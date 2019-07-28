package typings.ol.sourceVectorEventTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VectorEventType extends js.Object

@JSImport("ol/source/VectorEventType", "VectorEventType")
@js.native
object VectorEventType extends js.Object {
  @js.native
  sealed trait ADDFEATURE extends VectorEventType
  
  @js.native
  sealed trait CHANGEFEATURE extends VectorEventType
  
  @js.native
  sealed trait CLEAR extends VectorEventType
  
  @js.native
  sealed trait REMOVEFEATURE extends VectorEventType
  
}


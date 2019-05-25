package typings
package olLib.collectionEventTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CollectionEventType extends js.Object

@JSImport("ol/CollectionEventType", "CollectionEventType")
@js.native
object CollectionEventType extends js.Object {
  @js.native
  sealed trait ADD
    extends olLib.collectionEventTypeMod.CollectionEventType
  
  @js.native
  sealed trait REMOVE
    extends olLib.collectionEventTypeMod.CollectionEventType
  
}


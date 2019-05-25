package typings
package olLib.collectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Collection", "CollectionEvent")
@js.native
class CollectionEvent[T] ()
  extends olLib.eventsEventMod.default {
  var element: T = js.native
}


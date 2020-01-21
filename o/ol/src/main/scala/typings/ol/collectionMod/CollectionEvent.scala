package typings.ol.collectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Collection", "CollectionEvent")
@js.native
class CollectionEvent[T] ()
  extends typings.ol.eventMod.default {
  var element: T = js.native
  var index: Double = js.native
}


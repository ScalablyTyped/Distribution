package typings.ol.collectionMod

import typings.ol.collectionEventTypeMod.CollectionEventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/Collection", "CollectionEvent")
@js.native
class CollectionEvent[T] protected ()
  extends typings.ol.eventMod.default {
  def this(`type`: CollectionEventType) = this()
  def this(`type`: CollectionEventType, opt_element: T) = this()
  def this(`type`: CollectionEventType, opt_element: T, opt_index: Double) = this()
  def this(`type`: CollectionEventType, opt_element: js.UndefOr[scala.Nothing], opt_index: Double) = this()
  
  /**
    * The element that is added to or removed from the collection.
    */
  var element: T = js.native
  
  /**
    * The index of the added or removed element.
    */
  var index: Double = js.native
}

package typings.openlayers.global.ol

import typings.openlayers.mod.Collection.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("ol.Collection")
@js.native
/**
  * @classdesc
  * An expanded version of standard JS Array, adding convenience methods for
  * manipulation. Add and remove changes to the Collection trigger a Collection
  * event. Note that this does not cover changes to the objects _within_ the
  * Collection; they trigger events on the appropriate object, not on the
  * Collection as a whole.
  *
  * @fires ol.Collection.Event
  * @param opt_array Array.
  * @template T
  * @api stable
  */
open class Collection[T] ()
  extends typings.openlayers.mod.Collection[T] {
  def this(opt_array: js.Array[T]) = this()
}
object Collection {
  
  /**
    * @classdesc
    * Events emitted by {@link ol.Collection} instances are instances of this
    * type.
    *
    * @param type Type.
    * @param opt_element Element.
    */
  @JSGlobal("ol.Collection.Event")
  @js.native
  open class Event protected ()
    extends typings.openlayers.mod.Collection.Event {
    /**
      * @classdesc
      * Events emitted by {@link ol.Collection} instances are instances of this
      * type.
      *
      * @param type Type.
      * @param opt_element Element.
      */
    def this(`type`: EventType) = this()
    def this(`type`: EventType, opt_element: Any) = this()
  }
}

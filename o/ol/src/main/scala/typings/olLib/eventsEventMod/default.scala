package typings
package olLib.eventsEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * Stripped down implementation of the W3C DOM Level 2 Event interface.
  * @see {@link https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-interface}
  *
  * This implementation only provides `type` and `target` properties, and
  * `stopPropagation` and `preventDefault` methods. It is meant as base class
  * for higher level events defined in the library, and works with
  * {@link ol.events.EventTarget}.
  *
  * @param type Type.
  */
@JSImport("ol/events/Event", JSImport.Default)
@js.native
class default protected ()
  extends openlayersLib.openlayersMod.eventsNs.Event {
  /**
    * @classdesc
    * Stripped down implementation of the W3C DOM Level 2 Event interface.
    * @see {@link https://www.w3.org/TR/DOM-Level-2-Events/events.html#Events-interface}
    *
    * This implementation only provides `type` and `target` properties, and
    * `stopPropagation` and `preventDefault` methods. It is meant as base class
    * for higher level events defined in the library, and works with
    * {@link ol.events.EventTarget}.
    *
    * @param type Type.
    */
  def this(`type`: java.lang.String) = this()
}


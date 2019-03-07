package typings
package olLib.eventsEventTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @classdesc
  * A simplified implementation of the W3C DOM Level 2 EventTarget interface.
  * @see {@link https://www.w3.org/TR/2000/REC-DOM-Level-2-Events-20001113/events.html#Events-EventTarget}
  *
  * There are two important simplifications compared to the specification:
  *
  * 1. The handling of `useCapture` in `addEventListener` and
  *    `removeEventListener`. There is no real capture model.
  * 2. The handling of `stopPropagation` and `preventDefault` on `dispatchEvent`.
  *    There is no event target hierarchy. When a listener calls
  *    `stopPropagation` or `preventDefault` on an event object, it means that no
  *    more listeners after this one will be called. Same as when the listener
  *    returns false.
  *
  */
@JSImport("ol/events/EventTarget", JSImport.Default)
@js.native
/**
  * @classdesc
  * A simplified implementation of the W3C DOM Level 2 EventTarget interface.
  * @see {@link https://www.w3.org/TR/2000/REC-DOM-Level-2-Events-20001113/events.html#Events-EventTarget}
  *
  * There are two important simplifications compared to the specification:
  *
  * 1. The handling of `useCapture` in `addEventListener` and
  *    `removeEventListener`. There is no real capture model.
  * 2. The handling of `stopPropagation` and `preventDefault` on `dispatchEvent`.
  *    There is no event target hierarchy. When a listener calls
  *    `stopPropagation` or `preventDefault` on an event object, it means that no
  *    more listeners after this one will be called. Same as when the listener
  *    returns false.
  *
  */
class default ()
  extends openlayersLib.openlayersMod.eventsNs.EventTarget


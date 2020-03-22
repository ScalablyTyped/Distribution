package typings.openfin.externalApplicationExternalApplicationMod

import typings.openfin.baseMod.EmitterBase
import typings.openfin.externalApplicationMod.ExternalApplicationEvents
import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/external-application/external-application", "ExternalApplication")
@js.native
class ExternalApplication protected () extends EmitterBase[ExternalApplicationEvents] {
  def this(wire: typings.openfin.transportMod.default, identity: Identity) = this()
  /**
    * Adds a listener to the end of the listeners array for the specified event.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - Called whenever an event of the specified type occurs.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function addListener
    * @memberof ExternalApplication
    * @instance
    * @tutorial ExternalApplication.EventEmitter
    */
  /**
    * Adds a listener to the end of the listeners array for the specified event.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - Called whenever an event of the specified type occurs.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function on
    * @memberof ExternalApplication
    * @instance
    * @tutorial ExternalApplication.EventEmitter
    */
  /**
    * Adds a one time listener for the event. The listener is invoked only the first time the event is fired, after which it is removed.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - The callback function.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function once
    * @memberof ExternalApplication
    * @instance
    * @tutorial ExternalApplication.EventEmitter
    */
  /**
    * Adds a listener to the beginning of the listeners array for the specified event.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - The callback function.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function prependListener
    * @memberof ExternalApplication
    * @instance
    * @tutorial ExternalApplication.EventEmitter
    */
  /**
    * Adds a one time listener for the event. The listener is invoked only the first time the event is fired, after which it is removed.
    * The listener is added to the beginning of the listeners array.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - The callback function.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function prependOnceListener
    * @memberof ExternalApplication
    * @instance
    * @tutorial ExternalApplication.EventEmitter
    */
  /**
    * Remove a listener from the listener array for the specified event.
    * Caution: Calling this method changes the array indices in the listener array behind the listener.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - The callback function.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function removeListener
    * @memberof ExternalApplication
    * @instance
    * @tutorial ExternalApplication.EventEmitter
    */
  /**
    * Removes all listeners, or those of the specified event.
    * @param { string | symbol } [eventType]  - The type of the event.
    * @return {Promise.<this>}
    * @function removeAllListeners
    * @memberof ExternalApplication
    * @instance
    * @tutorial ExternalApplication.EventEmitter
    */
  /**
    * Retrieves information about the external application.
    * @return {Promise.<ExternalApplicationInfo>}
    * @tutorial ExternalApplication.getInfo
    */
  def getInfo(): js.Promise[ExternalApplicationInfo] = js.native
}


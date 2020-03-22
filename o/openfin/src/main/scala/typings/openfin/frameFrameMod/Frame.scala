package typings.openfin.frameFrameMod

import typings.openfin.baseMod.EmitterBase
import typings.openfin.frameMod.FrameEvents
import typings.openfin.identityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openfin/_v2/api/frame/frame", "_Frame")
@js.native
class Frame protected () extends EmitterBase[FrameEvents] {
  def this(wire: typings.openfin.transportMod.default, identity: Identity) = this()
  /**
    * Adds the listener function to the end of the listeners array for the specified event type.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - Called whenever an event of the specified type occurs.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function addListener
    * @memberof Frame
    * @instance
    * @tutorial Frame.EventEmitter
    */
  /**
    * Adds a listener to the end of the listeners array for the specified event.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - Called whenever an event of the specified type occurs.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function on
    * @memberof Frame
    * @instance
    * @tutorial Frame.EventEmitter
    */
  /**
    * Adds a one time listener for the event. The listener is invoked only the first time the event is fired, after which it is removed.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - The callback function.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function once
    * @memberof Frame
    * @instance
    * @tutorial Frame.EventEmitter
    */
  /**
    * Adds a listener to the beginning of the listeners array for the specified event.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - The callback function.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function prependListener
    * @memberof Frame
    * @instance
    * @tutorial Frame.EventEmitter
    */
  /**
    * Adds a one time listener for the event. The listener is invoked only the first time the event is fired, after which it is removed.
    * The listener is added to the beginning of the listeners array.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - The callback function.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function prependOnceListener
    * @memberof Frame
    * @instance
    * @tutorial Frame.EventEmitter
    */
  /**
    * Remove a listener from the listener array for the specified event.
    * Caution: Calling this method changes the array indices in the listener array behind the listener.
    * @param { string | symbol } eventType  - The type of the event.
    * @param { Function } listener - The callback function.
    * @param { SubOptions } [options] - Option to support event timestamps.
    * @return {Promise.<this>}
    * @function removeListener
    * @memberof Frame
    * @instance
    * @tutorial Frame.EventEmitter
    */
  /**
    * Removes all listeners, or those of the specified event.
    * @param { string | symbol } [eventType]  - The type of the event.
    * @return {Promise.<this>}
    * @function removeAllListeners
    * @memberof Frame
    * @instance
    * @tutorial Frame.EventEmitter
    */
  /**
    * Returns a frame info object for the represented frame
    * @return {Promise.<FrameInfo>}
    * @tutorial Frame.getInfo
    */
  def getInfo(): js.Promise[FrameInfo] = js.native
  /**
    * Returns a frame info object representing the window that the referenced iframe is
    * currently embedded in
    * @return {Promise.<FrameInfo>}
    * @tutorial Frame.getParentWindow
    */
  def getParentWindow(): js.Promise[FrameInfo] = js.native
}


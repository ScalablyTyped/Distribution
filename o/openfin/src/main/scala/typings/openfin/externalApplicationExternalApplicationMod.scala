package typings.openfin

import typings.openfin.baseMod.Base
import typings.openfin.baseMod.EmitterBase
import typings.openfin.externalApplicationMod.ExternalApplicationEvents
import typings.openfin.identityMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object externalApplicationExternalApplicationMod {
  
  @JSImport("openfin/_v2/api/external-application/external-application", JSImport.Default)
  @js.native
  class default () extends ExternalApplicationModule
  
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
  
  trait ExternalApplicationInfo extends StObject {
    
    var parent: Identity
  }
  object ExternalApplicationInfo {
    
    @scala.inline
    def apply(parent: Identity): ExternalApplicationInfo = {
      val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternalApplicationInfo]
    }
    
    @scala.inline
    implicit class ExternalApplicationInfoMutableBuilder[Self <: ExternalApplicationInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParent(value: Identity): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ExternalApplicationModule extends Base {
    
    /**
      * Asynchronously returns an External Application object that represents an external application.
      * <br>It is possible to wrap a process that does not yet exist, (for example, to listen for startup-related events)
      * provided its uuid is already known.
      * @param {string} uuid The UUID of the external application to be wrapped
      * @return {Promise.<ExternalApplication>}
      * @tutorial ExternalApplication.wrap
      * @static
      */
    def wrap(uuid: String): js.Promise[ExternalApplication] = js.native
    
    /**
      * Synchronously returns an External Application object that represents an external application.
      * <br>It is possible to wrap a process that does not yet exist, (for example, to listen for startup-related events)
      * provided its uuid is already known.
      * @param {string} uuid The UUID of the external application to be wrapped
      * @return {ExternalApplication}
      * @tutorial ExternalApplication.wrapSync
      * @static
      */
    def wrapSync(uuid: String): ExternalApplication = js.native
  }
}

package typings.openfin

import typings.openfin.baseMod.Base
import typings.openfin.baseMod.EmitterBase
import typings.openfin.frameMod.FrameEvents
import typings.openfin.identityMod.Identity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object frameFrameMod {
  
  @JSImport("openfin/_v2/api/frame/frame", JSImport.Default)
  @js.native
  open class default () extends FrameModule
  
  @JSImport("openfin/_v2/api/frame/frame", "_Frame")
  @js.native
  open class Frame protected () extends EmitterBase[FrameEvents] {
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.openfin.openfinStrings.window
    - typings.openfin.openfinStrings.iframe
    - typings.openfin.openfinStrings.`external connection`
    - typings.openfin.openfinStrings.view
    - typings.openfin.openfinStrings.unknown
  */
  trait EntityType extends StObject
  object EntityType {
    
    inline def `external connection`: typings.openfin.openfinStrings.`external connection` = ("external connection").asInstanceOf[typings.openfin.openfinStrings.`external connection`]
    
    inline def iframe: typings.openfin.openfinStrings.iframe = "iframe".asInstanceOf[typings.openfin.openfinStrings.iframe]
    
    inline def unknown: typings.openfin.openfinStrings.unknown = "unknown".asInstanceOf[typings.openfin.openfinStrings.unknown]
    
    inline def view: typings.openfin.openfinStrings.view = "view".asInstanceOf[typings.openfin.openfinStrings.view]
    
    inline def window: typings.openfin.openfinStrings.window = "window".asInstanceOf[typings.openfin.openfinStrings.window]
  }
  
  trait FrameInfo extends StObject {
    
    var entityType: EntityType
    
    var name: String
    
    var parent: Identity
    
    var uuid: String
  }
  object FrameInfo {
    
    inline def apply(entityType: EntityType, name: String, parent: Identity, uuid: String): FrameInfo = {
      val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrameInfo]
    }
    
    extension [Self <: FrameInfo](x: Self) {
      
      inline def setEntityType(value: EntityType): Self = StObject.set(x, "entityType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Identity): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FrameModule extends Base {
    
    /**
      * Asynchronously returns a reference to the current frame
      * @return {Promise.<_Frame>}
      * @tutorial Frame.getCurrent
      * @static
      */
    def getCurrent(): js.Promise[Frame] = js.native
    
    /**
      * Synchronously returns a reference to the current frame
      * @return {_Frame}
      * @tutorial Frame.getCurrentSync
      * @static
      */
    def getCurrentSync(): Frame = js.native
    
    /**
      * Asynchronously returns a reference to the specified frame. The frame does not have to exist
      * @param {Identity} identity - the identity of the frame you want to wrap
      * @return {Promise.<_Frame>}
      * @tutorial Frame.wrap
      * @static
      */
    def wrap(identity: Identity): js.Promise[Frame] = js.native
    
    /**
      * Synchronously returns a reference to the specified frame. The frame does not have to exist
      * @param {Identity} identity - the identity of the frame you want to wrap
      * @return {_Frame}
      * @tutorial Frame.wrapSync
      * @static
      */
    def wrapSync(identity: Identity): Frame = js.native
  }
}

package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.propertychange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ol/Object", JSImport.Namespace)
@js.native
object objectMod extends js.Object {
  
  def getChangeEventType(key: String): String = js.native
  
  @js.native
  trait BaseObject
    extends typings.ol.observableMod.default {
    
    /**
      * Gets a value.
      */
    def get(key: String): js.Any = js.native
    
    /**
      * Get a list of object property names.
      */
    def getKeys(): js.Array[String] = js.native
    
    /**
      * Get an object of all property names and values.
      */
    def getProperties(): StringDictionary[js.Any] = js.native
    
    def hasProperties(): Boolean = js.native
    
    def notify(key: String, oldValue: js.Any): Unit = js.native
    
    @JSName("on")
    def on_propertychange(`type`: propertychange, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    @JSName("once")
    def once_propertychange(`type`: propertychange, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    
    /**
      * Sets a value.
      */
    def set(key: String, value: js.Any): Unit = js.native
    def set(key: String, value: js.Any, opt_silent: Boolean): Unit = js.native
    
    /**
      * Sets a collection of key-value pairs.  Note that this changes any existing
      * properties and adds new ones (it does not remove any existing properties).
      */
    def setProperties(values: StringDictionary[js.Any]): Unit = js.native
    def setProperties(values: StringDictionary[js.Any], opt_silent: Boolean): Unit = js.native
    
    @JSName("un")
    def un_propertychange(`type`: propertychange, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    
    /**
      * Unsets a property.
      */
    def unset(key: String): Unit = js.native
    def unset(key: String, opt_silent: Boolean): Unit = js.native
  }
  
  @js.native
  class ObjectEvent protected ()
    extends typings.ol.eventMod.default {
    def this(`type`: String, key: String, oldValue: js.Any) = this()
    
    /**
      * The name of the property whose value is changing.
      */
    var key: String = js.native
    
    /**
      * The old value. To get the new value use e.target.get(e.key) where
      * e is the event object.
      */
    var oldValue: js.Any = js.native
  }
  
  @js.native
  class default () extends BaseObject {
    def this(opt_values: StringDictionary[js.Any]) = this()
  }
}

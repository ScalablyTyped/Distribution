package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.eventsMod.EventsKey
import typings.ol.olStrings.propertychange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/Object", JSImport.Namespace)
@js.native
object objectMod extends js.Object {
  @js.native
  trait BaseObject
    extends typings.ol.observableMod.default {
    def get(key: String): js.Any = js.native
    def getKeys(): js.Array[String] = js.native
    def getProperties(): StringDictionary[js.Any] = js.native
    def notify(key: String, oldValue: js.Any): Unit = js.native
    @JSName("on")
    def on_propertychange(`type`: propertychange, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    @JSName("once")
    def once_propertychange(`type`: propertychange, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
    def set(key: String, value: js.Any): Unit = js.native
    def set(key: String, value: js.Any, opt_silent: Boolean): Unit = js.native
    def setProperties(values: StringDictionary[js.Any]): Unit = js.native
    def setProperties(values: StringDictionary[js.Any], opt_silent: Boolean): Unit = js.native
    @JSName("un")
    def un_propertychange(`type`: propertychange, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
    def unset(key: String): Unit = js.native
    def unset(key: String, opt_silent: Boolean): Unit = js.native
  }
  
  @js.native
  class ObjectEvent ()
    extends typings.ol.eventMod.default {
    var key: String = js.native
    var oldValue: js.Any = js.native
  }
  
  @js.native
  class default () extends BaseObject {
    def this(opt_values: StringDictionary[js.Any]) = this()
  }
  
  def getChangeEventType(key: String): String = js.native
}


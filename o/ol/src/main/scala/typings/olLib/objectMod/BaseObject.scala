package typings
package olLib.objectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseObject
  extends olLib.observableMod.default {
  def get(key: java.lang.String): js.Any = js.native
  def getKeys(): js.Array[java.lang.String] = js.native
  def getProperties(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  def notify(key: java.lang.String, oldValue: js.Any): scala.Unit = js.native
  @JSName("on")
  def on_propertychange(
    `type`: olLib.olLibStrings.propertychange,
    listener: js.Function1[/* evt */ ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  @JSName("once")
  def once_propertychange(
    `type`: olLib.olLibStrings.propertychange,
    listener: js.Function1[/* evt */ ObjectEvent, scala.Unit]
  ): olLib.eventsMod.EventsKey = js.native
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any, opt_silent: scala.Boolean): scala.Unit = js.native
  def setProperties(values: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def setProperties(values: org.scalablytyped.runtime.StringDictionary[js.Any], opt_silent: scala.Boolean): scala.Unit = js.native
  @JSName("un")
  def un_propertychange(
    `type`: olLib.olLibStrings.propertychange,
    listener: js.Function1[/* evt */ ObjectEvent, scala.Unit]
  ): scala.Unit = js.native
  def unset(key: java.lang.String): scala.Unit = js.native
  def unset(key: java.lang.String, opt_silent: scala.Boolean): scala.Unit = js.native
}


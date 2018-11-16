package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
   * Classes
   */
// KVO
@JSGlobal("naver.maps.KVO")
@js.native
class KVO () extends js.Object {
  def addListener(eventName: js.Any, listener: js.Function0[_]): MapEventListener = js.native
  def addListenerOnce(eventName: js.Any, listener: js.Function0[_]): MapEventListener = js.native
  def bindTo(key: java.lang.String, target: KVO): scala.Unit = js.native
  def bindTo(key: java.lang.String, target: KVO, targetKey: java.lang.String): scala.Unit = js.native
  def clearListeners(eventName: java.lang.String): scala.Unit = js.native
  def get(key: java.lang.String): js.Any = js.native
  def hasListener(eventName: java.lang.String): scala.Boolean = js.native
  def removeListener(listeners: js.Array[MapEventListener]): scala.Unit = js.native
  def removeListener(listeners: MapEventListener): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def set(key: java.lang.String, value: js.Any, silently: scala.Boolean): scala.Unit = js.native
  def setValues(properties: js.Any): scala.Unit = js.native
  def trigger(eventName: java.lang.String): scala.Unit = js.native
  def trigger(eventName: java.lang.String, eventObject: js.Any): scala.Unit = js.native
  def unbind(key: java.lang.String): scala.Unit = js.native
  def unbindAll(): scala.Unit = js.native
}


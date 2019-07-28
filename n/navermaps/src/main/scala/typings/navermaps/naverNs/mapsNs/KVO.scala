package typings.navermaps.naverNs.mapsNs

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
  def bindTo(key: String, target: KVO): Unit = js.native
  def bindTo(key: String, target: KVO, targetKey: String): Unit = js.native
  def clearListeners(eventName: String): Unit = js.native
  def get(key: String): js.Any = js.native
  def hasListener(eventName: String): Boolean = js.native
  def removeListener(listeners: js.Array[MapEventListener]): Unit = js.native
  def removeListener(listeners: MapEventListener): Unit = js.native
  def set(key: String, value: js.Any): Unit = js.native
  def set(key: String, value: js.Any, silently: Boolean): Unit = js.native
  def setValues(properties: js.Any): Unit = js.native
  def trigger(eventName: String): Unit = js.native
  def trigger(eventName: String, eventObject: js.Any): Unit = js.native
  def unbind(key: String): Unit = js.native
  def unbindAll(): Unit = js.native
}


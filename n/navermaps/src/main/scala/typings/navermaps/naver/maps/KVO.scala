package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Classes
  */
// KVO
@js.native
trait KVO extends StObject {
  
  def addListener(eventName: Any, listener: js.Function0[Any]): MapEventListener = js.native
  
  def addListenerOnce(eventName: Any, listener: js.Function0[Any]): MapEventListener = js.native
  
  def bindTo(key: String, target: KVO): Unit = js.native
  def bindTo(key: String, target: KVO, targetKey: String): Unit = js.native
  
  def clearListeners(eventName: String): Unit = js.native
  
  def get(key: String): Any = js.native
  
  def hasListener(eventName: String): Boolean = js.native
  
  def removeListener(listeners: js.Array[MapEventListener]): Unit = js.native
  def removeListener(listeners: MapEventListener): Unit = js.native
  
  def set(key: String, value: Any): Unit = js.native
  def set(key: String, value: Any, silently: Boolean): Unit = js.native
  
  def setValues(properties: Any): Unit = js.native
  
  def trigger(eventName: String): Unit = js.native
  def trigger(eventName: String, eventObject: Any): Unit = js.native
  
  def unbind(key: String): Unit = js.native
  
  def unbindAll(): Unit = js.native
}

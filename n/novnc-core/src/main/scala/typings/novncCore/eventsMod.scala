package typings.novncCore

import typings.std.Element
import typings.std.Event
import typings.std.Touch
import typings.std.TouchList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventsMod {
  
  @JSImport("novnc-core/lib/util/events", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getPointerEvent(event: Event): TouchList | js.Array[Touch] = ^.asInstanceOf[js.Dynamic].applyDynamic("getPointerEvent")(event.asInstanceOf[js.Any]).asInstanceOf[TouchList | js.Array[Touch]]
  
  inline def releaseCapture(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseCapture")().asInstanceOf[Unit]
  
  inline def setCapture(el: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setCapture")(el.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def stopEvent(event: Event): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("stopEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
}

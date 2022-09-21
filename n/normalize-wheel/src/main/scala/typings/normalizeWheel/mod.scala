package typings.normalizeWheel

import typings.normalizeWheel.anon.PixelX
import typings.normalizeWheel.normalizeWheelStrings.DOMMouseScroll
import typings.normalizeWheel.normalizeWheelStrings.mousewheel
import typings.normalizeWheel.normalizeWheelStrings.wheel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(event: Any): PixelX = ^.asInstanceOf[js.Dynamic].apply(event.asInstanceOf[js.Any]).asInstanceOf[PixelX]
  
  @JSImport("normalize-wheel", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getEventType(): wheel | mousewheel | DOMMouseScroll = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventType")().asInstanceOf[wheel | mousewheel | DOMMouseScroll]
}

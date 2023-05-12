package typings.officeUiFabricReact

import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsListUtilsScrollMod {
  
  @JSImport("office-ui-fabric-react/lib/components/List/utils/scroll", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getScrollHeight(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollHeight")().asInstanceOf[Double]
  inline def getScrollHeight(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollHeight")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getScrollHeight(el: Window): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollHeight")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getScrollYPosition(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollYPosition")().asInstanceOf[Double]
  inline def getScrollYPosition(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollYPosition")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getScrollYPosition(el: Window): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScrollYPosition")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def setScrollYPosition(el: HTMLElement, pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setScrollYPosition")(el.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setScrollYPosition(el: Window, pos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setScrollYPosition")(el.asInstanceOf[js.Any], pos.asInstanceOf[js.Any])).asInstanceOf[Unit]
}

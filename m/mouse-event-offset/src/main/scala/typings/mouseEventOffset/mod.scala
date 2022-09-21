package typings.mouseEventOffset

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.TouchEvent
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(e: MouseEvent[Element, NativeMouseEvent]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  inline def apply(e: MouseEvent[Element, NativeMouseEvent], element: HTMLElement): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  inline def apply(e: TouchEvent[Element]): js.Tuple2[Double, Double] = ^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Double, Double]]
  inline def apply(e: TouchEvent[Element], element: HTMLElement): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].apply(e.asInstanceOf[js.Any], element.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  @JSImport("mouse-event-offset", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}

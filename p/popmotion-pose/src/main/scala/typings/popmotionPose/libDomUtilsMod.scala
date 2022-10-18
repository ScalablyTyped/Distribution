package typings.popmotionPose

import org.scalablytyped.runtime.StringDictionary
import typings.std.DOMRect
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomUtilsMod {
  
  @JSImport("popmotion-pose/lib/dom/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def measureWithoutTransform(element: HTMLElement): DOMRect = ^.asInstanceOf[js.Dynamic].applyDynamic("measureWithoutTransform")(element.asInstanceOf[js.Any]).asInstanceOf[DOMRect]
  
  inline def resolveProp(target: Any, props: StringDictionary[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveProp")(target.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Any]
}

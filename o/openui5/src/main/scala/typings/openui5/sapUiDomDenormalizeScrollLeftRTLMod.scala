package typings.openui5

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiDomDenormalizeScrollLeftRTLMod {
  
  @JSImport("sap/ui/dom/denormalizeScrollLeftRTL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /**
    * The distance from the leftmost position to which the element should be scrolled
    */
  iNormalizedScrollLeft: int,
    /**
    * The DOM Element to which scrollLeft will be applied
    */
  oDomRef: Element
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iNormalizedScrollLeft.asInstanceOf[js.Any], oDomRef.asInstanceOf[js.Any])).asInstanceOf[int]
}

package typings.openui5

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiDomDenormalizeScrollBeginRTLMod {
  
  @JSImport("sap/ui/dom/denormalizeScrollBeginRTL", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /**
    * The distance from the rightmost position to which the element should be scrolled
    */
  iNormalizedScrollBegin: int,
    /**
    * The DOM Element to which scrollLeft will be applied
    */
  oDomRef: Element
  ): int = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(iNormalizedScrollBegin.asInstanceOf[js.Any], oDomRef.asInstanceOf[js.Any])).asInstanceOf[int]
}

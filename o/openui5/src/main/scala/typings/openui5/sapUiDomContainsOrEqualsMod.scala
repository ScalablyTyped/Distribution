package typings.openui5

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiDomContainsOrEqualsMod {
  
  @JSImport("sap/ui/dom/containsOrEquals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /**
    * The container element
    */
  oDomRefContainer: Element,
    /**
    * The child element (must not be a text node, must be an element)
    */
  oDomRefChild: Element
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(oDomRefContainer.asInstanceOf[js.Any], oDomRefChild.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

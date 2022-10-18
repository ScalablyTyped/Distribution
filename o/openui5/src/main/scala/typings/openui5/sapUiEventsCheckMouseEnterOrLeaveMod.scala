package typings.openui5

import typings.openui5.jQuery.Event
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiEventsCheckMouseEnterOrLeaveMod {
  
  @JSImport("sap/ui/events/checkMouseEnterOrLeave", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    /**
    * The Mouse Event
    */
  oEvent: Event,
    /**
    * The domref of the element to check
    */
  oDomRef: Element
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(oEvent.asInstanceOf[js.Any], oDomRef.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}

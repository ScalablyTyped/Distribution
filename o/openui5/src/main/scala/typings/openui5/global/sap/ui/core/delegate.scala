package typings.openui5.global.sap.ui.core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object delegate {
  
  @JSGlobal("sap.ui.core.delegate.ItemNavigation")
  @js.native
  class ItemNavigation protected ()
    extends StObject
       with typings.openui5.sap.ui.core.delegate.ItemNavigation {
    /**
      * Creates an <code>ItemNavigation</code> delegate that can be attached to controls
      * requiringcapabilities for keyboard navigation between items.
      * @param oDomRef The root DOM reference that includes all items
      * @param aItemDomRefs Array of DOM references representing the items for the navigation
      * @param bNotInTabChain Whether the selected element should be in the tab chain or not
      */
    def this(
      oDomRef: typings.openui5.sap.ui.core.Element,
      aItemDomRefs: js.Array[typings.openui5.sap.ui.core.Element]
    ) = this()
    def this(
      oDomRef: typings.openui5.sap.ui.core.Element,
      aItemDomRefs: js.Array[typings.openui5.sap.ui.core.Element],
      bNotInTabChain: Boolean
    ) = this()
  }
  
  @JSGlobal("sap.ui.core.delegate.ScrollEnablement")
  @js.native
  class ScrollEnablement ()
    extends StObject
       with typings.openui5.sap.ui.core.delegate.ScrollEnablement
}

package typings.openui5.sapUiCoreLibraryMod

import typings.openui5.sapUiCoreControlMod.default
import typings.openui5.sapUiCoreLibraryMod.aria.HasPopup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IColumnHeaderMenu extends StObject {
  
  var __implements__sap_ui_core_IColumnHeaderMenu: Boolean
  
  /**
    * @SINCE 1.98.0
    * @EXPERIMENTAL (since 1.98)
    *
    * Returns the sap.ui.core.aria.HasPopup<\code> type of the menu.
    *
    * @returns sap.ui.core.aria.HasPopup<\code> type of the menu
    */
  def getAriaHasPopupType(): HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String)
  
  /**
    * @SINCE 1.98.0
    * @EXPERIMENTAL (since 1.98)
    *
    * Opens the menu using the column header.
    */
  def openBy(/**
    * Specifies the control where the menu is placed.
    */
  oControl: default): Unit
}
object IColumnHeaderMenu {
  
  inline def apply(
    __implements__sap_ui_core_IColumnHeaderMenu: Boolean,
    getAriaHasPopupType: () => HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String),
    openBy: default => Unit
  ): IColumnHeaderMenu = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_core_IColumnHeaderMenu = __implements__sap_ui_core_IColumnHeaderMenu.asInstanceOf[js.Any], getAriaHasPopupType = js.Any.fromFunction0(getAriaHasPopupType), openBy = js.Any.fromFunction1(openBy))
    __obj.asInstanceOf[IColumnHeaderMenu]
  }
  
  extension [Self <: IColumnHeaderMenu](x: Self) {
    
    inline def setGetAriaHasPopupType(
      value: () => HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String)
    ): Self = StObject.set(x, "getAriaHasPopupType", js.Any.fromFunction0(value))
    
    inline def setOpenBy(value: default => Unit): Self = StObject.set(x, "openBy", js.Any.fromFunction1(value))
    
    inline def set__implements__sap_ui_core_IColumnHeaderMenu(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_core_IColumnHeaderMenu", value.asInstanceOf[js.Any])
  }
}

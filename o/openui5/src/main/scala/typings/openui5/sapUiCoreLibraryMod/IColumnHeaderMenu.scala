package typings.openui5.sapUiCoreLibraryMod

import typings.openui5.sapUiCoreControlMod.default
import typings.openui5.sapUiCoreLibraryMod.aria.HasPopup
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColumnHeaderMenu extends StObject {
  
  var __implements__sap_ui_core_IColumnHeaderMenu: Boolean = js.native
  
  /**
    * @since 1.98.0
    * @experimental (since 1.98)
    *
    * Returns the sap.ui.core.aria.HasPopup<\code> type of the menu.
    *
    * @returns sap.ui.core.aria.HasPopup<\code> type of the menu
    */
  def getAriaHasPopupType(): HasPopup | (/* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof aria.HasPopup * / any */ String) = js.native
  
  /**
    * @since 1.98
    * @experimental (since 1.98)
    *
    * Opens the menu using the column header.
    */
  def openBy(/**
    * Specifies the element where the menu is placed.
    */
  oAnchor: default): Unit = js.native
  def openBy(/**
    * Specifies the element where the menu is placed.
    */
  oAnchor: HTMLElement): Unit = js.native
}

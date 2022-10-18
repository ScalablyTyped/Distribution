package typings.openui5.sapUiCoreLibraryMod

import typings.openui5.jQuery.Event
import typings.openui5.sapUiCoreElementMod.default
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContextMenu extends StObject {
  
  var __implements__sap_ui_core_IContextMenu: Boolean = js.native
  
  def openAsContextMenu(
    /**
    * An `oncontextmenu` event object or an object with properties left, top, offsetX, offsetY
    */
  oEvent: js.Object,
    /**
    * The element which will get the focus back again after the menu was closed
    */
  oOpenerRef: default
  ): Unit = js.native
  def openAsContextMenu(
    /**
    * An `oncontextmenu` event object or an object with properties left, top, offsetX, offsetY
    */
  oEvent: js.Object,
    /**
    * The element which will get the focus back again after the menu was closed
    */
  oOpenerRef: HTMLElement
  ): Unit = js.native
  /**
    * Opens the control by given opener ref.
    */
  def openAsContextMenu(
    /**
    * An `oncontextmenu` event object or an object with properties left, top, offsetX, offsetY
    */
  oEvent: Event,
    /**
    * The element which will get the focus back again after the menu was closed
    */
  oOpenerRef: default
  ): Unit = js.native
  def openAsContextMenu(
    /**
    * An `oncontextmenu` event object or an object with properties left, top, offsetX, offsetY
    */
  oEvent: Event,
    /**
    * The element which will get the focus back again after the menu was closed
    */
  oOpenerRef: HTMLElement
  ): Unit = js.native
}

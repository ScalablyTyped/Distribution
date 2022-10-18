package typings.openui5

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCommonsMenuItemBaseMod {
  
  @JSImport("sap/ui/commons/MenuItemBase", JSImport.Default)
  @js.native
  /**
    * Abstract base class `MenuItemBase` for menu item elements. Please use concrete subclasses.
    */
  open class default ()
    extends typings.openui5.sapUiUnifiedMenuItemBaseMod.default {
    def this(/**
      * Initial settings for the new control
      */
    mSettings: MenuItemBaseSettings) = this()
    def this(/**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: String,
      /**
      * Initial settings for the new control
      */
    mSettings: MenuItemBaseSettings
    ) = this()
    def this(
      /**
      * Id for the new control, generated automatically if no id is given
      */
    sId: Unit,
      /**
      * Initial settings for the new control
      */
    mSettings: MenuItemBaseSettings
    ) = this()
  }
  
  type MenuItemBase = typings.openui5.sapUiUnifiedMenuItemBaseMod.default
  
  type MenuItemBaseSettings = typings.openui5.sapUiUnifiedMenuItemBaseMod.MenuItemBaseSettings
}

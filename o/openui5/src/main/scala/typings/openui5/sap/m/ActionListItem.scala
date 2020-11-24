package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionListItem extends ListItemBase {
  
  /**
    * Determines item specific modeActionListItems are not selectable because they are command controls
    * (like Button or Link) so triggering the associated command, rather than selection isappropriate to
    * happen upon user action on these items. By overwriting isSelectable (inherited from ListItemBase) we
    * exclude the item from processingspecific to selectable list-items.
    */
  def getMode(): Unit = js.native
  
  /**
    * Gets current value of property <code>text</code>.Defines the text that appears in the control.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  
  /**
    * Sets a new value for property <code>text</code>.Defines the text that appears in the control.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): ActionListItem = js.native
}

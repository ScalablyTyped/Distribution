package typings.openui5.sap.m

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ActionListItem")
@js.native
class ActionListItem protected () extends ListItemBase {
  /**
    * Constructor for a new ActionListItem.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId Id for the new control, generated automatically if no id is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
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


package typings.openui5.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.ActionSelect")
@js.native
class ActionSelect protected () extends Select {
  /**
    * Constructor for a new ActionSelect.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some button into the association <code>buttons</code>.
    * @param vButton the buttons to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addButton(vButton: js.Any): ActionSelect = js.native
  def addButton(vButton: Button): ActionSelect = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>buttons</code>.
    */
  def getButtons(): js.Array[_] = js.native
  /**
    * Remove all buttons from the ActionSelect.
    * @returns An array with the ids of the removed elements (might be empty).
    */
  def removeAllButtons(): js.Array[String] = js.native
  def removeButton(vButton: String): String = js.native
  /**
    * Button to be removed from the ActionSelect content.
    * @param vButton The button to remove or its index or id.
    * @returns The id of the removed button or null.
    */
  def removeButton(vButton: Double): String = js.native
  def removeButton(vButton: Button): String = js.native
}


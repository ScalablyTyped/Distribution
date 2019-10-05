package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.Tile")
@js.native
class Tile protected () extends Control {
  /**
    * Constructor for a new Tile.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>press</code> event of this
    * <code>sap.m.Tile</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Tile</code> itself.Tap event is raised if the user taps or clicks the control.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Tile</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPress(oData: js.Any, fnFunction: js.Any): Tile = js.native
  def attachPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Tile = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>press</code> event of this
    * <code>sap.m.Tile</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPress(fnFunction: js.Any, oListener: js.Any): Tile = js.native
  /**
    * Fires event <code>press</code> to attached listeners.
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePress(mArguments: js.Any): Tile = js.native
  /**
    * Gets current value of property <code>removable</code>.Determines whether the tile is movable within
    * the surrounding tile container. The remove event is fired by the tile container.Default value is
    * <code>true</code>.
    * @returns Value of property <code>removable</code>
    */
  def getRemovable(): Boolean = js.native
  /**
    * Sets a new value for property <code>removable</code>.Determines whether the tile is movable within
    * the surrounding tile container. The remove event is fired by the tile container.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bRemovable New value for property <code>removable</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRemovable(bRemovable: Boolean): Tile = js.native
}


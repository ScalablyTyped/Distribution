package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.PagingButton")
@js.native
class PagingButton protected () extends Control {
  /**
    * Constructor for a new PagingButton.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>positionChange</code> event of this
    * <code>sap.m.PagingButton</code>.When called, the context of the event handler (its
    * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
    * to this <code>sap.m.PagingButton</code> itself.Fired when the current position is changed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.PagingButton</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPositionChange(oData: js.Any, fnFunction: js.Any): PagingButton = js.native
  def attachPositionChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): PagingButton = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>positionChange</code> event of this
    * <code>sap.m.PagingButton</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPositionChange(fnFunction: js.Any, oListener: js.Any): PagingButton = js.native
  /**
    * Fires event <code>positionChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>newPosition</code> of type <code>int</code>The number of the new
    * position.</li><li><code>oldPosition</code> of type <code>int</code>The number of the old
    * position.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePositionChange(mArguments: js.Any): PagingButton = js.native
  /**
    * Gets current value of property <code>count</code>.Determines the total count of items/entities that
    * the control navigates through.The minimum number of items/entities is 1.Default value is
    * <code>1</code>.
    * @returns Value of property <code>count</code>
    */
  def getCount(): Double = js.native
  /**
    * Gets current value of property <code>nextButtonTooltip</code>.Determines the tooltip of the next
    * button.Default value is <code></code>.
    * @since 1.36
    * @returns Value of property <code>nextButtonTooltip</code>
    */
  def getNextButtonTooltip(): String = js.native
  /**
    * Gets current value of property <code>position</code>.Determines the current position in the
    * items/entities that the control navigates through.Starting (minimum) number is 1.Default value is
    * <code>1</code>.
    * @returns Value of property <code>position</code>
    */
  def getPosition(): Double = js.native
  /**
    * Gets current value of property <code>previousButtonTooltip</code>.Determines the tooltip of the
    * previous button.Default value is <code></code>.
    * @since 1.36
    * @returns Value of property <code>previousButtonTooltip</code>
    */
  def getPreviousButtonTooltip(): String = js.native
}


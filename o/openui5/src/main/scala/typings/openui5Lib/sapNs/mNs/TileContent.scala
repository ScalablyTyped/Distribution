package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.TileContent")
@js.native
class TileContent protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
         * Constructor for a new sap.m.TileContent control.Accepts an object literal <code>mSettings</code>
         * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
         * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
         * settings object.
         * @param sId id for the new control, generated automatically if no id is given
         * @param mSettings initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new sap.m.TileContent control.Accepts an object literal <code>mSettings</code>
         * that defines initialproperty values, aggregated and associated objects as well as event handlers.See
         * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
         * settings object.
         * @param sId id for the new control, generated automatically if no id is given
         * @param mSettings initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Destroys the content in the aggregation <code>content</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyContent(): TileContent = js.native
  /**
         * Gets content of aggregation <code>content</code>.The switchable view that depends on the tile type.
        */
  def getContent(): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
         * Gets current value of property <code>disabled</code>.Disables control if true.Default value is
         * <code>false</code>.
         * @since 1.23
         * @returns Value of property <code>disabled</code>
        */
  def getDisabled(): scala.Boolean = js.native
  /**
         * Gets current value of property <code>footer</code>.The footer text of the tile.
         * @returns Value of property <code>footer</code>
        */
  def getFooter(): java.lang.String = js.native
  /**
         * Gets current value of property <code>frameType</code>.The frame type: 1x1 or 2x1.Default value is
         * <code>Auto</code>.
         * @since 1.25
         * @returns Value of property <code>frameType</code>
        */
  def getFrameType(): FrameType = js.native
  /**
         * Gets current value of property <code>size</code>.Updates the size of the tile. If it is not set,
         * then the default size is applied based on the device tile.Default value is <code>Auto</code>.
         * @returns Value of property <code>size</code>
        */
  def getSize(): Size = js.native
  /**
         * Gets current value of property <code>unit</code>.The percent sign, the currency symbol, or the unit
         * of measure.
         * @returns Value of property <code>unit</code>
        */
  def getUnit(): java.lang.String = js.native
  /**
         * Sets the aggregated <code>content</code>.
         * @param oContent The content to set
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): TileContent = js.native
  /**
         * Sets a new value for property <code>disabled</code>.Disables control if true.When called with a
         * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
         * restored.Default value is <code>false</code>.
         * @since 1.23
         * @param bDisabled New value for property <code>disabled</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setDisabled(bDisabled: scala.Boolean): TileContent = js.native
  /**
         * Sets a new value for property <code>footer</code>.The footer text of the tile.When called with a
         * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
         * restored.
         * @param sFooter New value for property <code>footer</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setFooter(sFooter: java.lang.String): TileContent = js.native
  /**
         * Sets a new value for property <code>frameType</code>.The frame type: 1x1 or 2x1.When called with a
         * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
         * restored.Default value is <code>Auto</code>.
         * @since 1.25
         * @param sFrameType New value for property <code>frameType</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setFrameType(sFrameType: FrameType): TileContent = js.native
  /**
         * Setter for protected property to enable or disable footer rendering. This function does not
         * invalidate the control.
         * @param value is used to if the footer is rendered or not
         * @returns this to allow method chaining
        */
  def setRenderFooter(value: scala.Boolean): TileContent = js.native
  /**
         * Sets a new value for property <code>size</code>.Updates the size of the tile. If it is not set, then
         * the default size is applied based on the device tile.When called with a value of <code>null</code>
         * or <code>undefined</code>, the default value of the property will be restored.Default value is
         * <code>Auto</code>.
         * @param sSize New value for property <code>size</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setSize(sSize: Size): TileContent = js.native
  /**
         * Sets a new value for property <code>unit</code>.The percent sign, the currency symbol, or the unit
         * of measure.When called with a value of <code>null</code> or <code>undefined</code>, the default
         * value of the property will be restored.
         * @param sUnit New value for property <code>unit</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setUnit(sUnit: java.lang.String): TileContent = js.native
}


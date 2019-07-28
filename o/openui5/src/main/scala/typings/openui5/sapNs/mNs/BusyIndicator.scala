package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import typings.openui5.sapNs.uiNs.coreNs.TextDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.BusyIndicator")
@js.native
class BusyIndicator protected () extends Control {
  /**
    * Constructor for a new BusyIndicator.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): BusyIndicator = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): BusyIndicator = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    * @since 1.27.0
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets current value of property <code>customIcon</code>.Icon URL if an icon is used as the busy
    * indicator.Default value is <code></code>.
    * @returns Value of property <code>customIcon</code>
    */
  def getCustomIcon(): js.Any = js.native
  /**
    * Gets current value of property <code>customIconDensityAware</code>.If this is set to false, the src
    * image will be loaded directly without attemptingto fetch the density perfect image for high density
    * device.By default, this is set to true but then one or more requests are sent to the server,trying
    * to get the density perfect version of the specified image.If bandwidth is the key for the
    * application, set this value to false.Default value is <code>true</code>.
    * @returns Value of property <code>customIconDensityAware</code>
    */
  def getCustomIconDensityAware(): Boolean = js.native
  /**
    * Gets current value of property <code>customIconHeight</code>.Height of the provided icon. By default
    * 44px are used.Default value is <code>44px</code>.
    * @returns Value of property <code>customIconHeight</code>
    */
  def getCustomIconHeight(): js.Any = js.native
  /**
    * Gets current value of property <code>customIconRotationSpeed</code>.Defines the rotation speed of
    * the given image.If a .gif is used, the speed has to be set to 0.The unit is in ms.<b>Note:</b>
    * Values are considered valid when greater than or equal to 0.If invalid value is provided the speed
    * defaults to 0.Default value is <code>1000</code>.
    * @returns Value of property <code>customIconRotationSpeed</code>
    */
  def getCustomIconRotationSpeed(): Double = js.native
  /**
    * Gets current value of property <code>customIconWidth</code>.Width of the provided icon. By default
    * 44px are used.Default value is <code>44px</code>.
    * @returns Value of property <code>customIconWidth</code>
    */
  def getCustomIconWidth(): js.Any = js.native
  /**
    * Gets current value of property <code>design</code>.Setting this property will not have any effect on
    * the appearance of the BusyIndicatorin versions greater than or equal to 1.32.1Default value is
    * <code>auto</code>.
    * @returns Value of property <code>design</code>
    */
  def getDesign(): String = js.native
  /**
    * Gets current value of property <code>size</code>.Defines the size of the busy indicator.The
    * animation consists of three circles, each of which will be this size.Therefore the total width of
    * the control amounts to three times the given size.Default value is <code>1rem</code>.
    * @returns Value of property <code>size</code>
    */
  def getSize(): js.Any = js.native
  /**
    * Gets current value of property <code>text</code>.Defines text to be displayed below the busy
    * indicator.It can be used to inform the user of the current operation.Default value is <code></code>.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  /**
    * Gets current value of property <code>textDirection</code>.Options for the text direction are RTL and
    * LTR.Alternatively, the control can inherit the text direction from its parent container.Default
    * value is <code>Inherit</code>.
    * @returns Value of property <code>textDirection</code>
    */
  def getTextDirection(): TextDirection = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @since 1.27.0
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  /**
    * Sets a new value for property <code>customIcon</code>.Icon URL if an icon is used as the busy
    * indicator.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code></code>.
    * @param sCustomIcon New value for property <code>customIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomIcon(sCustomIcon: js.Any): BusyIndicator = js.native
  /**
    * Sets a new value for property <code>customIconDensityAware</code>.If this is set to false, the src
    * image will be loaded directly without attemptingto fetch the density perfect image for high density
    * device.By default, this is set to true but then one or more requests are sent to the server,trying
    * to get the density perfect version of the specified image.If bandwidth is the key for the
    * application, set this value to false.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bCustomIconDensityAware New value for property <code>customIconDensityAware</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomIconDensityAware(bCustomIconDensityAware: Boolean): BusyIndicator = js.native
  /**
    * Sets a new value for property <code>customIconHeight</code>.Height of the provided icon. By default
    * 44px are used.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>44px</code>.
    * @param sCustomIconHeight New value for property <code>customIconHeight</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomIconHeight(sCustomIconHeight: js.Any): BusyIndicator = js.native
  /**
    * Sets a new value for property <code>customIconRotationSpeed</code>.Defines the rotation speed of the
    * given image.If a .gif is used, the speed has to be set to 0.The unit is in ms.<b>Note:</b> Values
    * are considered valid when greater than or equal to 0.If invalid value is provided the speed defaults
    * to 0.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>1000</code>.
    * @param iCustomIconRotationSpeed New value for property <code>customIconRotationSpeed</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomIconRotationSpeed(iCustomIconRotationSpeed: Double): BusyIndicator = js.native
  /**
    * Sets a new value for property <code>customIconWidth</code>.Width of the provided icon. By default
    * 44px are used.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>44px</code>.
    * @param sCustomIconWidth New value for property <code>customIconWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomIconWidth(sCustomIconWidth: js.Any): BusyIndicator = js.native
  /**
    * Sets a new value for property <code>design</code>.Setting this property will not have any effect on
    * the appearance of the BusyIndicatorin versions greater than or equal to 1.32.1When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>auto</code>.
    * @param sDesign New value for property <code>design</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDesign(sDesign: String): BusyIndicator = js.native
  /**
    * Sets a new value for property <code>size</code>.Defines the size of the busy indicator.The animation
    * consists of three circles, each of which will be this size.Therefore the total width of the control
    * amounts to three times the given size.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>1rem</code>.
    * @param sSize New value for property <code>size</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSize(sSize: js.Any): BusyIndicator = js.native
  /**
    * Sets a new value for property <code>text</code>.Defines text to be displayed below the busy
    * indicator.It can be used to inform the user of the current operation.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): BusyIndicator = js.native
  /**
    * Sets a new value for property <code>textDirection</code>.Options for the text direction are RTL and
    * LTR.Alternatively, the control can inherit the text direction from its parent container.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>Inherit</code>.
    * @param sTextDirection New value for property <code>textDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTextDirection(sTextDirection: TextDirection): BusyIndicator = js.native
}


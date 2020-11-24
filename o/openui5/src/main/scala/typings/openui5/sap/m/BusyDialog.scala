package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BusyDialog extends Control {
  
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): BusyDialog = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): BusyDialog = js.native
  
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>close</code> event of this
    * <code>sap.m.BusyDialog</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.BusyDialog</code> itself.Fires when the busy dialog is closed.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.BusyDialog</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachClose(oData: js.Any, fnFunction: js.Any): BusyDialog = js.native
  def attachClose(oData: js.Any, fnFunction: js.Any, oListener: js.Any): BusyDialog = js.native
  
  /**
    * Closes the BusyDialog.
    */
  def close(): BusyDialog = js.native
  
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>close</code> event of this
    * <code>sap.m.BusyDialog</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachClose(fnFunction: js.Any, oListener: js.Any): BusyDialog = js.native
  
  /**
    * Fires event <code>close</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>cancelPressed</code> of type <code>boolean</code>Indicates if the close
    * events are triggered by a user, pressing a cancel button or because the operation was
    * terminated.This parameter is set to true if the close event is fired by user interaction.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireClose(mArguments: js.Any): BusyDialog = js.native
  
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  
  /**
    * Gets current value of property <code>cancelButtonText</code>.The text of the cancel button. The
    * default text is "Cancel" (translated to the respective language).Default value is <code></code>.
    * @returns Value of property <code>cancelButtonText</code>
    */
  def getCancelButtonText(): String = js.native
  
  /**
    * Gets current value of property <code>customIcon</code>.Icon, used from the BusyIndicator. This icon
    * is invisible in iOS platform and it is density aware. You can use the density convention (@2, @1.5,
    * etc.) to provide higher resolution image for higher density screens.Default value is <code></code>.
    * @returns Value of property <code>customIcon</code>
    */
  def getCustomIcon(): js.Any = js.native
  
  /**
    * Gets current value of property <code>customIconDensityAware</code>.If this is set to
    * <code>false</code>, the source image will be loaded directly without attempting to fetch the density
    * perfect image for high density devices.By default, this is set to <code>true</code> but then one or
    * more requests are sent trying to get the density perfect version of the image.If bandwidth is the
    * key for the application, set this value to <code>false</code>.Default value is <code>true</code>.
    * @returns Value of property <code>customIconDensityAware</code>
    */
  def getCustomIconDensityAware(): Boolean = js.native
  
  /**
    * Gets current value of property <code>customIconHeight</code>.Height of the provided icon with
    * default value "44px".Default value is <code>44px</code>.
    * @returns Value of property <code>customIconHeight</code>
    */
  def getCustomIconHeight(): js.Any = js.native
  
  /**
    * Gets current value of property <code>customIconRotationSpeed</code>.Defines the rotation speed of
    * the given image. If GIF file is used, the speed has to be set to 0. The value is in
    * milliseconds.Default value is <code>1000</code>.
    * @returns Value of property <code>customIconRotationSpeed</code>
    */
  def getCustomIconRotationSpeed(): Double = js.native
  
  /**
    * Gets current value of property <code>customIconWidth</code>.Width of the provided icon with default
    * value "44px".Default value is <code>44px</code>.
    * @returns Value of property <code>customIconWidth</code>
    */
  def getCustomIconWidth(): js.Any = js.native
  
  /**
    * Gets current value of property <code>showCancelButton</code>.Indicates if the cancel button will be
    * rendered inside the busy dialog. The default value is set to <code>false</code>.Default value is
    * <code>false</code>.
    * @returns Value of property <code>showCancelButton</code>
    */
  def getShowCancelButton(): Boolean = js.native
  
  /**
    * Gets current value of property <code>text</code>.Optional text displayed inside the dialog.Default
    * value is <code></code>.
    * @returns Value of property <code>text</code>
    */
  def getText(): String = js.native
  
  /**
    * Gets current value of property <code>title</code>.Sets the title of the BusyDialog. The default
    * value is an empty string.Default value is <code></code>.
    * @returns Value of property <code>title</code>
    */
  def getTitle(): String = js.native
  
  /**
    * Opens the BusyDialog.
    */
  def open(): BusyDialog = js.native
  
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  
  /**
    * Sets a new value for property <code>cancelButtonText</code>.The text of the cancel button. The
    * default text is "Cancel" (translated to the respective language).When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sCancelButtonText New value for property <code>cancelButtonText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCancelButtonText(sCancelButtonText: String): BusyDialog = js.native
  
  /**
    * Sets a new value for property <code>customIcon</code>.Icon, used from the BusyIndicator. This icon
    * is invisible in iOS platform and it is density aware. You can use the density convention (@2, @1.5,
    * etc.) to provide higher resolution image for higher density screens.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @param sCustomIcon New value for property <code>customIcon</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomIcon(sCustomIcon: js.Any): BusyDialog = js.native
  
  /**
    * Sets a new value for property <code>customIconDensityAware</code>.If this is set to
    * <code>false</code>, the source image will be loaded directly without attempting to fetch the density
    * perfect image for high density devices.By default, this is set to <code>true</code> but then one or
    * more requests are sent trying to get the density perfect version of the image.If bandwidth is the
    * key for the application, set this value to <code>false</code>.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @param bCustomIconDensityAware New value for property <code>customIconDensityAware</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomIconDensityAware(bCustomIconDensityAware: Boolean): BusyDialog = js.native
  
  /**
    * Sets a new value for property <code>customIconHeight</code>.Height of the provided icon with default
    * value "44px".When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>44px</code>.
    * @param sCustomIconHeight New value for property <code>customIconHeight</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomIconHeight(sCustomIconHeight: js.Any): BusyDialog = js.native
  
  /**
    * Sets a new value for property <code>customIconRotationSpeed</code>.Defines the rotation speed of the
    * given image. If GIF file is used, the speed has to be set to 0. The value is in milliseconds.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>1000</code>.
    * @param iCustomIconRotationSpeed New value for property <code>customIconRotationSpeed</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomIconRotationSpeed(iCustomIconRotationSpeed: Double): BusyDialog = js.native
  
  /**
    * Sets a new value for property <code>customIconWidth</code>.Width of the provided icon with default
    * value "44px".When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>44px</code>.
    * @param sCustomIconWidth New value for property <code>customIconWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setCustomIconWidth(sCustomIconWidth: js.Any): BusyDialog = js.native
  
  /**
    * Sets a new value for property <code>showCancelButton</code>.Indicates if the cancel button will be
    * rendered inside the busy dialog. The default value is set to <code>false</code>.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bShowCancelButton New value for property <code>showCancelButton</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowCancelButton(bShowCancelButton: Boolean): BusyDialog = js.native
  
  /**
    * Sets a new value for property <code>text</code>.Optional text displayed inside the dialog.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code></code>.
    * @param sText New value for property <code>text</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setText(sText: String): BusyDialog = js.native
  
  /**
    * Sets a new value for property <code>title</code>.Sets the title of the BusyDialog. The default value
    * is an empty string.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code></code>.
    * @param sTitle New value for property <code>title</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setTitle(sTitle: String): BusyDialog = js.native
}

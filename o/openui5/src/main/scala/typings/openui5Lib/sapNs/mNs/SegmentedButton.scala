package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.SegmentedButton")
@js.native
class SegmentedButton protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
         * Constructor for a new SegmentedButton.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new SegmentedButton.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
         * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): SegmentedButton = js.native
  /**
         * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
         * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addAriaDescribedBy(vAriaDescribedBy: openui5Lib.sapNs.uiNs.coreNs.Control): SegmentedButton = js.native
  /**
         * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
         * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): SegmentedButton = js.native
  /**
         * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
         * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): SegmentedButton = js.native
  /**
         * Adds some button to the aggregation <code>buttons</code>.
         * @param oButton the button to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addButton(oButton: Button): SegmentedButton = js.native
  /**
         * Adds some item to the aggregation <code>items</code>.
         * @since 1.28
         * @param oItem the item to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addItem(oItem: SegmentedButtonItem): SegmentedButton = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
         * <code>sap.m.SegmentedButton</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.SegmentedButton</code> itself.Fires when the user selects a button, which
         * returns the ID and button object.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.SegmentedButton</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachSelect(oData: js.Any, fnFunction: js.Any): SegmentedButton = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
         * <code>sap.m.SegmentedButton</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.SegmentedButton</code> itself.Fires when the user selects a button, which
         * returns the ID and button object.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.SegmentedButton</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SegmentedButton = js.native
  /**
         * Binds aggregation <code>items</code> to model data.See {@link
         * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
         * of the possible properties of <code>oBindingInfo</code>.
         * @since 1.28
         * @param oBindingInfo The binding information
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def bindItems(oBindingInfo: js.Any): SegmentedButton = js.native
  /**
         * Binds property <code>selectedKey</code> to model data.See {@link
         * sap.ui.base.ManagedObject#bindProperty ManagedObject.bindProperty} for a detailed description of the
         * possible properties of <code>oBindingInfo</code>
         * @since 1.28.0
         * @param oBindingInfo The binding information
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def bindSelectedKey(oBindingInfo: js.Any): SegmentedButton = js.native
  /**
         * Adds a Button with a text as title, an URI for an icon, enabled and textDirection.Only one is
         * allowed.
         * @since 1.28.0
         * @param sText Defines the title text of the newly created Button
         * @param sURI Icon to be displayed as graphical element within the Button.        Density related
         * image will be loaded if image with density awareness name in format
         * [imageName]@[densityValue].[extension] is provided.
         * @param bEnabled Enables the control (default is true). Buttons that are disabled have other colors
         * than enabled ones, depending on custom settings.
         * @param sTextDirection Element's text directionality with enumerated options
         * @returns The created Button
        */
  def createButton(sText: java.lang.String, sURI: js.Any, bEnabled: scala.Boolean): Button = js.native
  /**
         * Adds a Button with a text as title, an URI for an icon, enabled and textDirection.Only one is
         * allowed.
         * @since 1.28.0
         * @param sText Defines the title text of the newly created Button
         * @param sURI Icon to be displayed as graphical element within the Button.        Density related
         * image will be loaded if image with density awareness name in format
         * [imageName]@[densityValue].[extension] is provided.
         * @param bEnabled Enables the control (default is true). Buttons that are disabled have other colors
         * than enabled ones, depending on custom settings.
         * @param sTextDirection Element's text directionality with enumerated options
         * @returns The created Button
        */
  def createButton(
    sText: java.lang.String,
    sURI: js.Any,
    bEnabled: scala.Boolean,
    sTextDirection: openui5Lib.sapNs.uiNs.coreNs.TextDirection
  ): Button = js.native
  /**
         * Destroys all the buttons in the aggregation <code>buttons</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyButtons(): SegmentedButton = js.native
  /**
         * Destroys all the items in the aggregation <code>items</code>.
         * @since 1.28
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyItems(): SegmentedButton = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
         * <code>sap.m.SegmentedButton</code>.The passed function and listener object must match the ones used
         * for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachSelect(fnFunction: js.Any, oListener: js.Any): SegmentedButton = js.native
  /**
         * Fires event <code>select</code> to attached listeners.Expects the following event
         * parameters:<ul><li><code>button</code> of type <code>sap.m.Button</code>Reference to the button,
         * that has been selected.</li><li><code>id</code> of type <code>string</code>ID of the button, which
         * has been selected.</li><li><code>key</code> of type <code>string</code>Key of the button, which has
         * been selected. This property is only filled when the control is initiated with the items
         * aggregation.</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireSelect(mArguments: js.Any): SegmentedButton = js.native
  /**
         * Returns array of IDs of the elements which are the current targets of the association
         * <code>ariaDescribedBy</code>.
        */
  def getAriaDescribedBy(): js.Array[_] = js.native
  /**
         * Returns array of IDs of the elements which are the current targets of the association
         * <code>ariaLabelledBy</code>.
        */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
         * Gets content of aggregation <code>buttons</code>.The buttons of the SegmentedButton control. The
         * items set in this aggregation are used as an interface for the buttons displayed by the control.
         * Only the properties ID, icon, text, enabled and textDirections of the Button control are evaluated.
         * Setting other properties of the button will have no effect. Alternatively, you can use the
         * createButton method to add buttons.
        */
  def getButtons(): js.Array[Button] = js.native
  /**
         * Gets current value of property <code>enabled</code>.Disables all the buttons in the SegmentedButton
         * control. When disabled all the buttons look grey and you cannot focus or click on them.Default value
         * is <code>true</code>.
         * @returns Value of property <code>enabled</code>
        */
  def getEnabled(): scala.Boolean = js.native
  /**
         * Gets content of aggregation <code>items</code>.Aggregation of items to be displayed. The items set
         * in this aggregation are used as an interface for the buttons displayed by the control.The "items"
         * and "buttons" aggregations should NOT be used simultaneously as it causes the control to work
         * incorrectly.
         * @since 1.28
        */
  def getItems(): js.Array[SegmentedButtonItem] = js.native
  /**
         * ID of the element which is the current target of the association <code>selectedButton</code>, or
         * <code>null</code>.
        */
  def getSelectedButton(): js.Any = js.native
  /**
         * Gets current value of property <code>width</code>.Defines the width of the SegmentedButton control.
         * If not set, it uses the minimum required width to make all buttons inside of the same size (based on
         * the biggest button).
         * @returns Value of property <code>width</code>
        */
  def getWidth(): js.Any = js.native
  /**
         * Checks for the provided <code>sap.m.Button</code> in the aggregation <code>buttons</code>.and
         * returns its index if found or -1 otherwise.
         * @param oButton The button whose index is looked for
         * @returns The index of the provided control in the aggregation if found, or -1 otherwise
        */
  def indexOfButton(oButton: Button): scala.Double = js.native
  /**
         * Checks for the provided <code>sap.m.SegmentedButtonItem</code> in the aggregation
         * <code>items</code>.and returns its index if found or -1 otherwise.
         * @since 1.28
         * @param oItem The item whose index is looked for
         * @returns The index of the provided control in the aggregation if found, or -1 otherwise
        */
  def indexOfItem(oItem: SegmentedButtonItem): scala.Double = js.native
  /**
         * Inserts a button into the aggregation <code>buttons</code>.
         * @param oButton the button to insert; if empty, nothing is inserted
         * @param iIndex the <code>0</code>-based index the button should be inserted at; for             a
         * negative value of <code>iIndex</code>, the button is inserted at position 0; for a value            
         * greater than the current size of the aggregation, the button is inserted at             the last
         * position
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def insertButton(oButton: Button, iIndex: scala.Double): SegmentedButton = js.native
  /**
         * Inserts a item into the aggregation <code>items</code>.
         * @since 1.28
         * @param oItem the item to insert; if empty, nothing is inserted
         * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
         * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
         * greater than the current size of the aggregation, the item is inserted at             the last
         * position
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def insertItem(oItem: SegmentedButtonItem, iIndex: scala.Double): SegmentedButton = js.native
  /**
         * Removes all the controls in the association named <code>ariaDescribedBy</code>.
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllAriaDescribedBy(): js.Array[_] = js.native
  /**
         * Removes all the controls in the association named <code>ariaLabelledBy</code>.
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  /**
         * Removes all the controls from the aggregation <code>buttons</code>.Additionally, it unregisters them
         * from the hosting UIArea.
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllButtons(): js.Array[Button] = js.native
  /**
         * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
         * from the hosting UIArea.
         * @since 1.28
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllItems(): js.Array[SegmentedButtonItem] = js.native
  /**
         * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
         * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
         * @returns The removed ariaDescribedBy or <code>null</code>
        */
  def removeAriaDescribedBy(vAriaDescribedBy: js.Any): js.Any = js.native
  /**
         * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
         * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
         * @returns The removed ariaDescribedBy or <code>null</code>
        */
  def removeAriaDescribedBy(vAriaDescribedBy: openui5Lib.sapNs.uiNs.coreNs.Control): js.Any = js.native
  /**
         * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
         * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
         * @returns The removed ariaDescribedBy or <code>null</code>
        */
  def removeAriaDescribedBy(vAriaDescribedBy: scala.Double): js.Any = js.native
  /**
         * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
         * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
         * @returns The removed ariaLabelledBy or <code>null</code>
        */
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
         * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
         * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
         * @returns The removed ariaLabelledBy or <code>null</code>
        */
  def removeAriaLabelledBy(vAriaLabelledBy: openui5Lib.sapNs.uiNs.coreNs.Control): js.Any = js.native
  /**
         * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
         * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
         * @returns The removed ariaLabelledBy or <code>null</code>
        */
  def removeAriaLabelledBy(vAriaLabelledBy: scala.Double): js.Any = js.native
  /**
         * Removes a button from the aggregation <code>buttons</code>.
         * @param vButton The button to remove or its index or id
         * @returns The removed button or <code>null</code>
        */
  def removeButton(vButton: java.lang.String): Button = js.native
  /**
         * Removes a button from the aggregation <code>buttons</code>.
         * @param vButton The button to remove or its index or id
         * @returns The removed button or <code>null</code>
        */
  def removeButton(vButton: Button): Button = js.native
  /**
         * Removes a button from the aggregation <code>buttons</code>.
         * @param vButton The button to remove or its index or id
         * @returns The removed button or <code>null</code>
        */
  def removeButton(vButton: scala.Double): Button = js.native
  /**
         * Removes a item from the aggregation <code>items</code>.
         * @since 1.28
         * @param vItem The item to remove or its index or id
         * @returns The removed item or <code>null</code>
        */
  def removeItem(vItem: java.lang.String): SegmentedButtonItem = js.native
  /**
         * Removes a item from the aggregation <code>items</code>.
         * @since 1.28
         * @param vItem The item to remove or its index or id
         * @returns The removed item or <code>null</code>
        */
  def removeItem(vItem: SegmentedButtonItem): SegmentedButtonItem = js.native
  /**
         * Removes a item from the aggregation <code>items</code>.
         * @since 1.28
         * @param vItem The item to remove or its index or id
         * @returns The removed item or <code>null</code>
        */
  def removeItem(vItem: scala.Double): SegmentedButtonItem = js.native
  /**
         * Sets a new value for property <code>enabled</code>.Disables all the buttons in the SegmentedButton
         * control. When disabled all the buttons look grey and you cannot focus or click on them.When called
         * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
         * be restored.Default value is <code>true</code>.
         * @param bEnabled New value for property <code>enabled</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setEnabled(bEnabled: scala.Boolean): SegmentedButton = js.native
  /**
         * Setter for association <code>selectedButton</code>.
         * @param vButton New value for association <code>setSelectedButton</code>   A sap.m.Button instance
         * which becomes the new target of this <code>selectedButton</code> association.   Alternatively, the
         * ID of a sap.m.Button instance may be given as a string.   If the value of null, undefined, or an
         * empty string is provided the first item will be selected.
         * @returns <code>this</code> this pointer for chaining
        */
  def setSelectedButton(vButton: java.lang.String): SegmentedButton = js.native
  /**
         * Setter for association <code>selectedButton</code>.
         * @param vButton New value for association <code>setSelectedButton</code>   A sap.m.Button instance
         * which becomes the new target of this <code>selectedButton</code> association.   Alternatively, the
         * ID of a sap.m.Button instance may be given as a string.   If the value of null, undefined, or an
         * empty string is provided the first item will be selected.
         * @returns <code>this</code> this pointer for chaining
        */
  def setSelectedButton(vButton: js.Any): SegmentedButton = js.native
  /**
         * Setter for association <code>selectedButton</code>.
         * @param vButton New value for association <code>setSelectedButton</code>   A sap.m.Button instance
         * which becomes the new target of this <code>selectedButton</code> association.   Alternatively, the
         * ID of a sap.m.Button instance may be given as a string.   If the value of null, undefined, or an
         * empty string is provided the first item will be selected.
         * @returns <code>this</code> this pointer for chaining
        */
  def setSelectedButton(vButton: Button): SegmentedButton = js.native
  /**
         * Sets a new value for property <code>width</code>.Defines the width of the SegmentedButton control.
         * If not set, it uses the minimum required width to make all buttons inside of the same size (based on
         * the biggest button).When called with a value of <code>null</code> or <code>undefined</code>, the
         * default value of the property will be restored.
         * @param sWidth New value for property <code>width</code>
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def setWidth(sWidth: js.Any): SegmentedButton = js.native
  /**
         * Unbinds aggregation <code>items</code> from model data.
         * @since 1.28
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def unbindItems(): SegmentedButton = js.native
  /**
         * Unbinds property <code>selectedKey</code> from model data.
         * @since 1.28.0
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def unbindSelectedKey(): SegmentedButton = js.native
}


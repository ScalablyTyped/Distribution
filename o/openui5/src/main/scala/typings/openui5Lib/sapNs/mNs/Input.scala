package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.Input")
@js.native
class Input protected () extends InputBase {
  /**
    * Constructor for a new Input.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Adds some suggestionColumn to the aggregation <code>suggestionColumns</code>.
    * @since 1.21.1
    * @param oSuggestionColumn the suggestionColumn to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSuggestionColumn(oSuggestionColumn: Column): Input = js.native
  /**
    * Adds some suggestionItem to the aggregation <code>suggestionItems</code>.
    * @since 1.16.1
    * @param oSuggestionItem the suggestionItem to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSuggestionItem(oSuggestionItem: openui5Lib.sapNs.uiNs.coreNs.Item): Input = js.native
  /**
    * Adds some suggestionRow to the aggregation <code>suggestionRows</code>.
    * @since 1.21.1
    * @param oSuggestionRow the suggestionRow to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSuggestionRow(oSuggestionRow: ColumnListItem): Input = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>liveChange</code> event of this
    * <code>sap.m.Input</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Input</code> itself.This event is fired when the value of the input is changed - e.g. at
    * each keypress
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Input</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachLiveChange(oData: js.Any, fnFunction: js.Any): Input = js.native
  def attachLiveChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Input = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>submit</code> event of this
    * <code>sap.m.Input</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Input</code> itself.This event is fired when user presses the <code>Enter</code> key on
    * the input.<b>Note:</b>The event is fired independent of whether there was a change before or not. If
    * a change was performed the event is fired after the change event.The event is also fired when an
    * item of the select list is selected via <code>Enter</code>.The event is only fired on an input which
    * allows text input (<code>editable</code>, <code>enabled</code> and not <code>valueHelpOnly</code>).
    * @since 1.33.0
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Input</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSubmit(oData: js.Any, fnFunction: js.Any): Input = js.native
  def attachSubmit(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Input = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>suggest</code> event of this
    * <code>sap.m.Input</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Input</code> itself.This event is fired when user types in the input and showSuggestion
    * is set to true. Changing the suggestItems aggregation will show the suggestions within a popup.
    * @since 1.16.1
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Input</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSuggest(oData: js.Any, fnFunction: js.Any): Input = js.native
  def attachSuggest(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Input = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>suggestionItemSelected</code> event of
    * this <code>sap.m.Input</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Input</code> itself.This event is fired when suggestionItem shown in suggestion popup
    * are selected. This event is only fired when showSuggestion is set to true and there are
    * suggestionItems shown in the suggestion popup.
    * @since 1.16.3
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Input</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSuggestionItemSelected(oData: js.Any, fnFunction: js.Any): Input = js.native
  def attachSuggestionItemSelected(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Input = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>valueHelpRequest</code> event of this
    * <code>sap.m.Input</code>.When called, the context of the event handler (its <code>this</code>) will
    * be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Input</code> itself.When the value help indicator is clicked, this event will be fired.
    * @since 1.16
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Input</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachValueHelpRequest(oData: js.Any, fnFunction: js.Any): Input = js.native
  def attachValueHelpRequest(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Input = js.native
  /**
    * Binds aggregation <code>suggestionColumns</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @since 1.21.1
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindSuggestionColumns(oBindingInfo: js.Any): Input = js.native
  /**
    * Binds aggregation <code>suggestionRows</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @since 1.21.1
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindSuggestionRows(oBindingInfo: js.Any): Input = js.native
  /**
    * Destroys all the suggestionColumns in the aggregation <code>suggestionColumns</code>.
    * @since 1.21.1
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySuggestionColumns(): Input = js.native
  /**
    * Destroys all the suggestionItems in the aggregation <code>suggestionItems</code>.
    * @since 1.16.1
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySuggestionItems(): Input = js.native
  /**
    * Destroys all the suggestionRows in the aggregation <code>suggestionRows</code>.
    * @since 1.21.1
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySuggestionRows(): Input = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>liveChange</code> event of this
    * <code>sap.m.Input</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachLiveChange(fnFunction: js.Any, oListener: js.Any): Input = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>submit</code> event of this
    * <code>sap.m.Input</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @since 1.33.0
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSubmit(fnFunction: js.Any, oListener: js.Any): Input = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>suggest</code> event of this
    * <code>sap.m.Input</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @since 1.16.1
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSuggest(fnFunction: js.Any, oListener: js.Any): Input = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>suggestionItemSelected</code> event of
    * this <code>sap.m.Input</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.16.3
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSuggestionItemSelected(fnFunction: js.Any, oListener: js.Any): Input = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>valueHelpRequest</code> event of this
    * <code>sap.m.Input</code>.The passed function and listener object must match the ones used for event
    * registration.
    * @since 1.16
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachValueHelpRequest(fnFunction: js.Any, oListener: js.Any): Input = js.native
  /**
    * Fires event <code>liveChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>value</code> of type <code>string</code>The new value of the
    * input.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireLiveChange(mArguments: js.Any): Input = js.native
  /**
    * Fires event <code>submit</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>value</code> of type <code>string</code>The new value of the
    * input.</li></ul>
    * @since 1.33.0
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSubmit(mArguments: js.Any): Input = js.native
  /**
    * Fires event <code>suggest</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>suggestValue</code> of type <code>string</code>The current value which has
    * been typed in the input.</li><li><code>suggestionColumns</code> of type
    * <code>sap.m.ListBase</code>The suggestion list is passed to this event for convenience. If you use
    * list-based or tabular suggestions, fill the suggestionList with the items you want to suggest.
    * Otherwise, directly add the suggestions to the "suggestionItems" aggregation of the input
    * control.</li></ul>
    * @since 1.16.1
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSuggest(mArguments: js.Any): Input = js.native
  /**
    * Fires event <code>suggestionItemSelected</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>selectedItem</code> of type <code>sap.ui.core.Item</code>This is the item
    * selected in the suggestion popup for one and two-value suggestions. For tabular suggestions, this
    * value will not be set.</li><li><code>selectedRow</code> of type
    * <code>sap.m.ColumnListItem</code>This is the row selected in the tabular suggestion popup
    * represented as a ColumnListItem. For one and two-value suggestions, this value will not be set.Note:
    * The row result function to select a result value for the string is already executed at this time. To
    * pick different value for the input field or to do follow up steps after the item has been
    * selected.</li></ul>
    * @since 1.16.3
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSuggestionItemSelected(mArguments: js.Any): Input = js.native
  /**
    * Fires event <code>valueHelpRequest</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>fromSuggestions</code> of type <code>boolean</code>The event parameter is
    * set to true, when the button at the end of the suggestion table is clicked, otherwise false. It can
    * be used to determine whether the "value help" trigger or the "show all items" trigger has been
    * pressed.</li></ul>
    * @since 1.16
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireValueHelpRequest(mArguments: js.Any): Input = js.native
  /**
    * Gets current value of property <code>dateFormat</code>.Only used if type=date and no datepicker is
    * available.The data is displayed and the user input is parsed according to this format.NOTE: The
    * value property is always of the form RFC 3339 (YYYY-MM-dd).Default value is <code>YYYY-MM-dd</code>.
    * @returns Value of property <code>dateFormat</code>
    */
  def getDateFormat(): java.lang.String = js.native
  /**
    * Gets current value of property <code>description</code>.The description is a text after the input
    * field, e.g. units of measurement, currencies.
    * @returns Value of property <code>description</code>
    */
  def getDescription(): java.lang.String = js.native
  /**
    * Gets current value of property <code>fieldWidth</code>.This property only takes effect if the
    * description property is set. It controls the distribution of space between the input field and the
    * description text. The default value is 50% leaving the other 50% for the description.Default value
    * is <code>50%</code>.
    * @returns Value of property <code>fieldWidth</code>
    */
  def getFieldWidth(): js.Any = js.native
  /**
    * Gets current value of property <code>filterSuggests</code>.Defines whether to filter the provided
    * suggestions before showing them to the user.Default value is <code>true</code>.
    * @returns Value of property <code>filterSuggests</code>
    */
  def getFilterSuggests(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>maxLength</code>.Maximum number of characters. Value '0' means
    * the feature is switched off.This parameter is not compatible with the input type
    * <code>sap.m.InputType.Number</code>.If the input type is set to <code>Number</code>, the
    * <code>maxLength</code> value is ignored.Default value is <code>0</code>.
    * @returns Value of property <code>maxLength</code>
    */
  def getMaxLength(): scala.Double = js.native
  /**
    * Gets current value of property <code>maxSuggestionWidth</code>.If set, the value of this parameter
    * will control the horizontal size of the suggestion list to display more data. This allows suggestion
    * lists to be wider than the input field if there is enough space available. By default, the
    * suggestion list is always as wide as the input field.Note: The value will be ignored if the actual
    * width of the input field is larger than the specified parameter value.
    * @since 1.21.1
    * @returns Value of property <code>maxSuggestionWidth</code>
    */
  def getMaxSuggestionWidth(): js.Any = js.native
  /**
    * Gets current value of property <code>showSuggestion</code>.If this is set to true, suggest event is
    * fired when user types in the input. Changing the suggestItems aggregation in suggest event listener
    * will show suggestions within a popup. When runs on phone, input will first open a dialog where the
    * input and suggestions are shown. When runs on a tablet, the suggestions are shown in a popup next to
    * the input.Default value is <code>false</code>.
    * @since 1.16.1
    * @returns Value of property <code>showSuggestion</code>
    */
  def getShowSuggestion(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>showTableSuggestionValueHelp</code>.For tabular suggestions,
    * this flag will show/hide the button at the end of the suggestion table that triggers the event
    * "valueHelpRequest" when pressed. The default value is true.NOTE: If suggestions are not tabular or
    * no suggestions are used, the button will not be displayed and this flag is without effect.Default
    * value is <code>true</code>.
    * @since 1.22.1
    * @returns Value of property <code>showTableSuggestionValueHelp</code>
    */
  def getShowTableSuggestionValueHelp(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>showValueHelp</code>.If set to true, a value help indicator
    * will be displayed inside the control. When clicked the event "valueHelpRequest" will be
    * fired.Default value is <code>false</code>.
    * @since 1.16
    * @returns Value of property <code>showValueHelp</code>
    */
  def getShowValueHelp(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>startSuggestion</code>.Minimum length of the entered text in
    * input before suggest event is fired. The default value is 1 which means the suggest event is fired
    * after user types in input. When it's set to 0, suggest event is fired when input with no text gets
    * focus.Default value is <code>1</code>.
    * @since 1.21.2
    * @returns Value of property <code>startSuggestion</code>
    */
  def getStartSuggestion(): scala.Double = js.native
  /**
    * Gets content of aggregation <code>suggestionColumns</code>.The suggestionColumns and suggestionRows
    * are for tabular input suggestions. This aggregation allows for binding the table columns; for more
    * details see the aggregation "suggestionRows".
    * @since 1.21.1
    */
  def getSuggestionColumns(): js.Array[Column] = js.native
  /**
    * Gets content of aggregation <code>suggestionItems</code>.SuggestItems are the items which will be
    * shown in the suggestion popup. Changing this aggregation (by calling addSuggestionItem,
    * insertSuggestionItem, removeSuggestionItem, removeAllSuggestionItems, destroySuggestionItems) after
    * input is rendered will open/close the suggestion popup. o display suggestions with two text values,
    * it is also possible to add sap.ui.core/ListItems as SuggestionItems (since 1.21.1). For the selected
    * ListItem, only the first value is returned to the input field.
    * @since 1.16.1
    */
  def getSuggestionItems(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Item] = js.native
  /**
    * Gets content of aggregation <code>suggestionRows</code>.The suggestionColumns and suggestionRows are
    * for tabular input suggestions. This aggregation allows for binding the table cells.The items of this
    * aggregation are to be bound directly or to set in the suggest event method.Note: If this aggregation
    * is filled, the aggregation suggestionItems will be ignored.
    * @since 1.21.1
    */
  def getSuggestionRows(): js.Array[ColumnListItem] = js.native
  /**
    * Gets current value of property <code>type</code>.HTML type of the internal <code>input</code> tag
    * (e.g. Text, Number, Email, Phone).The particular effect of this property differs depending on the
    * browser and the current language settings,especially for the type Number.<br>This parameter is
    * intended to be used with touch devices that use different soft keyboard layouts depending on the
    * given input type.<br>Only the default value <code>sap.m.InputType.Text</code> may be used in
    * combination with data model formats.<code>sap.ui.model</code> defines extended formats that are
    * mostly incompatible with normal HTMLrepresentations for numbers and dates.Default value is
    * <code>Text</code>.
    * @returns Value of property <code>type</code>
    */
  def getType(): InputType = js.native
  /**
    * Gets current value of property <code>valueHelpOnly</code>.If set to true, direct text input is
    * disabled and the control will trigger the event "valueHelpRequest" for all user interactions. The
    * properties "showValueHelp", "editable", and "enabled" must be set to true, otherwise the property
    * will have no effectDefault value is <code>false</code>.
    * @since 1.21.0
    * @returns Value of property <code>valueHelpOnly</code>
    */
  def getValueHelpOnly(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>valueLiveUpdate</code>.Indicates when the value gets updated
    * with the user changes: At each keystroke (true) or first when the user presses enter or tabs out
    * (false).Default value is <code>false</code>.
    * @since 1.24
    * @returns Value of property <code>valueLiveUpdate</code>
    */
  def getValueLiveUpdate(): scala.Boolean = js.native
  /**
    * Checks for the provided <code>sap.m.Column</code> in the aggregation
    * <code>suggestionColumns</code>.and returns its index if found or -1 otherwise.
    * @since 1.21.1
    * @param oSuggestionColumn The suggestionColumn whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfSuggestionColumn(oSuggestionColumn: Column): scala.Double = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Item</code> in the aggregation
    * <code>suggestionItems</code>.and returns its index if found or -1 otherwise.
    * @since 1.16.1
    * @param oSuggestionItem The suggestionItem whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfSuggestionItem(oSuggestionItem: openui5Lib.sapNs.uiNs.coreNs.Item): scala.Double = js.native
  /**
    * Checks for the provided <code>sap.m.ColumnListItem</code> in the aggregation
    * <code>suggestionRows</code>.and returns its index if found or -1 otherwise.
    * @since 1.21.1
    * @param oSuggestionRow The suggestionRow whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfSuggestionRow(oSuggestionRow: ColumnListItem): scala.Double = js.native
  /**
    * Inserts a suggestionColumn into the aggregation <code>suggestionColumns</code>.
    * @since 1.21.1
    * @param oSuggestionColumn the suggestionColumn to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the suggestionColumn should be inserted at; for        
    *     a negative value of <code>iIndex</code>, the suggestionColumn is inserted at position 0; for a
    * value             greater than the current size of the aggregation, the suggestionColumn is inserted
    * at             the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSuggestionColumn(oSuggestionColumn: Column, iIndex: scala.Double): Input = js.native
  /**
    * Inserts a suggestionItem into the aggregation <code>suggestionItems</code>.
    * @since 1.16.1
    * @param oSuggestionItem the suggestionItem to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the suggestionItem should be inserted at; for          
    *   a negative value of <code>iIndex</code>, the suggestionItem is inserted at position 0; for a value
    *             greater than the current size of the aggregation, the suggestionItem is inserted at     
    *        the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSuggestionItem(oSuggestionItem: openui5Lib.sapNs.uiNs.coreNs.Item, iIndex: scala.Double): Input = js.native
  /**
    * Inserts a suggestionRow into the aggregation <code>suggestionRows</code>.
    * @since 1.21.1
    * @param oSuggestionRow the suggestionRow to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the suggestionRow should be inserted at; for           
    *  a negative value of <code>iIndex</code>, the suggestionRow is inserted at position 0; for a value  
    *           greater than the current size of the aggregation, the suggestionRow is inserted at        
    *     the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSuggestionRow(oSuggestionRow: ColumnListItem, iIndex: scala.Double): Input = js.native
  /**
    * Fire valueHelpRequest event on tap
    * @param oEvent undefined
    */
  def ontap(oEvent: js.Any): scala.Unit = js.native
  /**
    * Removes all the controls from the aggregation <code>suggestionColumns</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @since 1.21.1
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSuggestionColumns(): js.Array[Column] = js.native
  /**
    * Removes all the controls from the aggregation <code>suggestionItems</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @since 1.16.1
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSuggestionItems(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Item] = js.native
  /**
    * Removes all the controls from the aggregation <code>suggestionRows</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @since 1.21.1
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSuggestionRows(): js.Array[ColumnListItem] = js.native
  def removeSuggestionColumn(vSuggestionColumn: java.lang.String): Column = js.native
  def removeSuggestionColumn(vSuggestionColumn: Column): Column = js.native
  /**
    * Removes a suggestionColumn from the aggregation <code>suggestionColumns</code>.
    * @since 1.21.1
    * @param vSuggestionColumn The suggestionColumn to remove or its index or id
    * @returns The removed suggestionColumn or <code>null</code>
    */
  def removeSuggestionColumn(vSuggestionColumn: scala.Double): Column = js.native
  def removeSuggestionItem(vSuggestionItem: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Item = js.native
  def removeSuggestionItem(vSuggestionItem: openui5Lib.sapNs.uiNs.coreNs.Item): openui5Lib.sapNs.uiNs.coreNs.Item = js.native
  /**
    * Removes a suggestionItem from the aggregation <code>suggestionItems</code>.
    * @since 1.16.1
    * @param vSuggestionItem The suggestionItem to remove or its index or id
    * @returns The removed suggestionItem or <code>null</code>
    */
  def removeSuggestionItem(vSuggestionItem: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Item = js.native
  def removeSuggestionRow(vSuggestionRow: java.lang.String): ColumnListItem = js.native
  def removeSuggestionRow(vSuggestionRow: ColumnListItem): ColumnListItem = js.native
  /**
    * Removes a suggestionRow from the aggregation <code>suggestionRows</code>.
    * @since 1.21.1
    * @param vSuggestionRow The suggestionRow to remove or its index or id
    * @returns The removed suggestionRow or <code>null</code>
    */
  def removeSuggestionRow(vSuggestionRow: scala.Double): ColumnListItem = js.native
  /**
    * Sets a new value for property <code>dateFormat</code>.Only used if type=date and no datepicker is
    * available.The data is displayed and the user input is parsed according to this format.NOTE: The
    * value property is always of the form RFC 3339 (YYYY-MM-dd).When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>YYYY-MM-dd</code>.
    * @param sDateFormat New value for property <code>dateFormat</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDateFormat(sDateFormat: java.lang.String): Input = js.native
  /**
    * Sets a new value for property <code>description</code>.The description is a text after the input
    * field, e.g. units of measurement, currencies.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sDescription New value for property <code>description</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDescription(sDescription: java.lang.String): Input = js.native
  /**
    * Sets a new value for property <code>fieldWidth</code>.This property only takes effect if the
    * description property is set. It controls the distribution of space between the input field and the
    * description text. The default value is 50% leaving the other 50% for the description.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>50%</code>.
    * @param sFieldWidth New value for property <code>fieldWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFieldWidth(sFieldWidth: js.Any): Input = js.native
  /**
    * Sets a custom filter function for suggestions. The default is to check whether the first item text
    * begins with the typed value. For one and two-value suggestions this callback function will operate
    * on sap.ui.core.Item types, for tabular suggestions the function will operate on sap.m.ColumnListItem
    * types.
    * @since 1.16.1
    * @param fnFilter The filter function is called when displaying suggestion items and has two input
    * parameters: the first one is the string that is currently typed in the input field and the second
    * one is the item that is being filtered. Returning true will add this item to the popup, returning
    * false will not display it.
    * @returns this pointer for chaining
    */
  def setFilterFunction(fnFilter: js.Any): Input = js.native
  /**
    * Sets a new value for property <code>filterSuggests</code>.Defines whether to filter the provided
    * suggestions before showing them to the user.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bFilterSuggests New value for property <code>filterSuggests</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFilterSuggests(bFilterSuggests: scala.Boolean): Input = js.native
  /**
    * Sets a new value for property <code>maxLength</code>.Maximum number of characters. Value '0' means
    * the feature is switched off.This parameter is not compatible with the input type
    * <code>sap.m.InputType.Number</code>.If the input type is set to <code>Number</code>, the
    * <code>maxLength</code> value is ignored.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>0</code>.
    * @param iMaxLength New value for property <code>maxLength</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxLength(iMaxLength: scala.Double): Input = js.native
  /**
    * Sets a new value for property <code>maxSuggestionWidth</code>.If set, the value of this parameter
    * will control the horizontal size of the suggestion list to display more data. This allows suggestion
    * lists to be wider than the input field if there is enough space available. By default, the
    * suggestion list is always as wide as the input field.Note: The value will be ignored if the actual
    * width of the input field is larger than the specified parameter value.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.21.1
    * @param sMaxSuggestionWidth New value for property <code>maxSuggestionWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxSuggestionWidth(sMaxSuggestionWidth: js.Any): Input = js.native
  /**
    * Sets a custom result filter function for tabular suggestions to select the text that is passed to
    * the input field. Default is to check whether the first cell with a "text" property begins with the
    * typed value. For one value and two-value suggestions this callback function is not called.
    * @since 1.21.1
    * @param fnFilter The result function is called with one parameter: the sap.m.ColumnListItem that is
    * selected. The function must return a result string that will be displayed as the input field's
    * value.
    * @returns this pointer for chaining
    */
  def setRowResultFunction(fnFilter: js.Any): Input = js.native
  /**
    * Sets a new value for property <code>showSuggestion</code>.If this is set to true, suggest event is
    * fired when user types in the input. Changing the suggestItems aggregation in suggest event listener
    * will show suggestions within a popup. When runs on phone, input will first open a dialog where the
    * input and suggestions are shown. When runs on a tablet, the suggestions are shown in a popup next to
    * the input.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>false</code>.
    * @since 1.16.1
    * @param bShowSuggestion New value for property <code>showSuggestion</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowSuggestion(bShowSuggestion: scala.Boolean): Input = js.native
  /**
    * Sets a new value for property <code>showTableSuggestionValueHelp</code>.For tabular suggestions,
    * this flag will show/hide the button at the end of the suggestion table that triggers the event
    * "valueHelpRequest" when pressed. The default value is true.NOTE: If suggestions are not tabular or
    * no suggestions are used, the button will not be displayed and this flag is without effect.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>true</code>.
    * @since 1.22.1
    * @param bShowTableSuggestionValueHelp New value for property
    * <code>showTableSuggestionValueHelp</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowTableSuggestionValueHelp(bShowTableSuggestionValueHelp: scala.Boolean): Input = js.native
  /**
    * Sets a new value for property <code>showValueHelp</code>.If set to true, a value help indicator will
    * be displayed inside the control. When clicked the event "valueHelpRequest" will be fired.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>false</code>.
    * @since 1.16
    * @param bShowValueHelp New value for property <code>showValueHelp</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowValueHelp(bShowValueHelp: scala.Boolean): Input = js.native
  /**
    * Sets a new value for property <code>startSuggestion</code>.Minimum length of the entered text in
    * input before suggest event is fired. The default value is 1 which means the suggest event is fired
    * after user types in input. When it's set to 0, suggest event is fired when input with no text gets
    * focus.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>1</code>.
    * @since 1.21.2
    * @param iStartSuggestion New value for property <code>startSuggestion</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStartSuggestion(iStartSuggestion: scala.Double): Input = js.native
  /**
    * Sets a new value for property <code>type</code>.HTML type of the internal <code>input</code> tag
    * (e.g. Text, Number, Email, Phone).The particular effect of this property differs depending on the
    * browser and the current language settings,especially for the type Number.<br>This parameter is
    * intended to be used with touch devices that use different soft keyboard layouts depending on the
    * given input type.<br>Only the default value <code>sap.m.InputType.Text</code> may be used in
    * combination with data model formats.<code>sap.ui.model</code> defines extended formats that are
    * mostly incompatible with normal HTMLrepresentations for numbers and dates.When called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Text</code>.
    * @param sType New value for property <code>type</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setType(sType: InputType): Input = js.native
  /**
    * Sets a new value for property <code>valueHelpOnly</code>.If set to true, direct text input is
    * disabled and the control will trigger the event "valueHelpRequest" for all user interactions. The
    * properties "showValueHelp", "editable", and "enabled" must be set to true, otherwise the property
    * will have no effectWhen called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>false</code>.
    * @since 1.21.0
    * @param bValueHelpOnly New value for property <code>valueHelpOnly</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueHelpOnly(bValueHelpOnly: scala.Boolean): Input = js.native
  /**
    * Sets a new value for property <code>valueLiveUpdate</code>.Indicates when the value gets updated
    * with the user changes: At each keystroke (true) or first when the user presses enter or tabs out
    * (false).When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>false</code>.
    * @since 1.24
    * @param bValueLiveUpdate New value for property <code>valueLiveUpdate</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValueLiveUpdate(bValueLiveUpdate: scala.Boolean): Input = js.native
  /**
    * Defines the width of the input. Default value is 100%
    * @param sWidth undefined
    */
  def setWidth(sWidth: java.lang.String): js.Any = js.native
  /**
    * Unbinds aggregation <code>suggestionColumns</code> from model data.
    * @since 1.21.1
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindSuggestionColumns(): Input = js.native
  /**
    * Unbinds aggregation <code>suggestionRows</code> from model data.
    * @since 1.21.1
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindSuggestionRows(): Input = js.native
}


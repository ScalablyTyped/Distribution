package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchField extends Control {
  /**
    * Adds some ariaDescribedBy into the association <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy the ariaDescribedBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaDescribedBy(vAriaDescribedBy: js.Any): SearchField = js.native
  def addAriaDescribedBy(vAriaDescribedBy: Control): SearchField = js.native
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): SearchField = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): SearchField = js.native
  /**
    * Adds some suggestionItem to the aggregation <code>suggestionItems</code>.
    * @since 1.34
    * @param oSuggestionItem the suggestionItem to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addSuggestionItem(oSuggestionItem: SuggestionItem): SearchField = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>liveChange</code> event of this
    * <code>sap.m.SearchField</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.SearchField</code> itself.This event is fired when the value of the search field is
    * changed by a user - e.g. at each key press. Do not invalidate or re-render a focused search field,
    * especially during the liveChange event.
    * @since 1.9.1
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SearchField</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachLiveChange(oData: js.Any, fnFunction: js.Any): SearchField = js.native
  def attachLiveChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SearchField = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>search</code> event of this
    * <code>sap.m.SearchField</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.SearchField</code> itself.Event which is fired when the user triggers a search.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SearchField</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSearch(oData: js.Any, fnFunction: js.Any): SearchField = js.native
  def attachSearch(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SearchField = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>suggest</code> event of this
    * <code>sap.m.SearchField</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.SearchField</code> itself.This event is fired when the search field is initially focused
    * or its value is changed by the user.This event means that suggestion data should be updated, in case
    * if suggestions are used.Use the value parameter to create new suggestions for it.
    * @since 1.34
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.SearchField</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSuggest(oData: js.Any, fnFunction: js.Any): SearchField = js.native
  def attachSuggest(oData: js.Any, fnFunction: js.Any, oListener: js.Any): SearchField = js.native
  /**
    * Binds property <code>value</code> to model data.See {@link sap.ui.base.ManagedObject#bindProperty
    * ManagedObject.bindProperty} for a detailed description of the possible properties of
    * <code>oBindingInfo</code>
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindValue(oBindingInfo: js.Any): SearchField = js.native
  /**
    * Destroys all the suggestionItems in the aggregation <code>suggestionItems</code>.
    * @since 1.34
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySuggestionItems(): SearchField = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>liveChange</code> event of this
    * <code>sap.m.SearchField</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.9.1
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachLiveChange(fnFunction: js.Any, oListener: js.Any): SearchField = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>search</code> event of this
    * <code>sap.m.SearchField</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSearch(fnFunction: js.Any, oListener: js.Any): SearchField = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>suggest</code> event of this
    * <code>sap.m.SearchField</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.34
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSuggest(fnFunction: js.Any, oListener: js.Any): SearchField = js.native
  /**
    * Fires event <code>liveChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>newValue</code> of type <code>string</code>Current search string.</li></ul>
    * @since 1.9.1
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireLiveChange(mArguments: js.Any): SearchField = js.native
  /**
    * Fires event <code>search</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>query</code> of type <code>string</code>The search query
    * string.</li><li><code>suggestionItem</code> of type <code>sap.m.SuggestionItem</code>Suggestion list
    * item in case if the user has selected an item from the suggestions
    * list.</li><li><code>refreshButtonPressed</code> of type <code>boolean</code>Indicates if the user
    * pressed the refresh icon.</li><li><code>clearButtonPressed</code> of type
    * <code>boolean</code>Indicates if the user pressed the clear icon.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSearch(mArguments: js.Any): SearchField = js.native
  /**
    * Fires event <code>suggest</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>suggestValue</code> of type <code>string</code>Current search string of the
    * search field.</li></ul>
    * @since 1.34
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSuggest(mArguments: js.Any): SearchField = js.native
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
    * Gets current value of property <code>enableSuggestions</code>.If true, a <code>suggest</code> event
    * is fired when user types in the input and when the input is focused.On a phone device, a full screen
    * dialog with suggestions is always shown even if the suggestions list is empty.Default value is
    * <code>false</code>.
    * @since 1.34
    * @returns Value of property <code>enableSuggestions</code>
    */
  def getEnableSuggestions(): Boolean = js.native
  /**
    * Gets current value of property <code>enabled</code>.Boolean property to enable the control (default
    * is true).Default value is <code>true</code>.
    * @returns Value of property <code>enabled</code>
    */
  def getEnabled(): Boolean = js.native
  /**
    * Gets current value of property <code>maxLength</code>.Maximum number of characters. Value '0' means
    * the feature is switched off.Default value is <code>0</code>.
    * @returns Value of property <code>maxLength</code>
    */
  def getMaxLength(): Double = js.native
  /**
    * Gets current value of property <code>placeholder</code>.Text shown when no value available. Default
    * placeholder text is the word "Search" in the current local language (if supported) or in English.
    * @returns Value of property <code>placeholder</code>
    */
  def getPlaceholder(): String = js.native
  /**
    * Function returns DOM element which acts as reference point for the opening suggestion menu
    * @since 1.34
    * @returns the DOM element at which to open the suggestion list
    */
  def getPopupAnchorDomRef(): js.Any = js.native
  /**
    * Gets current value of property <code>refreshButtonTooltip</code>.Tooltip text of the refresh button.
    * If it is not set, the tooltip of the SearchField (if any) is displayed. Tooltips are not displayed
    * on touch devices.
    * @since 1.16
    * @returns Value of property <code>refreshButtonTooltip</code>
    */
  def getRefreshButtonTooltip(): String = js.native
  /**
    * Gets current value of property <code>selectOnFocus</code>.Normally, search text is selected for copy
    * when the SearchField is focused by keyboard navigation. If an application re-renders the SearchField
    * during the liveChange event, set this property to false to disable text selection by focus.Default
    * value is <code>true</code>.
    * @since 1.20
    * @returns Value of property <code>selectOnFocus</code>
    */
  def getSelectOnFocus(): Boolean = js.native
  /**
    * Gets current value of property <code>showMagnifier</code>.Set to false to hide the magnifier
    * icon.Default value is <code>true</code>.
    * @returns Value of property <code>showMagnifier</code>
    */
  def getShowMagnifier(): Boolean = js.native
  /**
    * Gets current value of property <code>showRefreshButton</code>.Set to true to display a refresh
    * button in place of the search icon. By pressing the refresh button or F5 key on keyboard, the user
    * can reload the results list without changing the search string.Default value is <code>false</code>.
    * @since 1.16
    * @returns Value of property <code>showRefreshButton</code>
    */
  def getShowRefreshButton(): Boolean = js.native
  /**
    * Gets current value of property <code>showSearchButton</code>.Set to true to show the search button
    * with the magnifier icon.If false, both the search and refresh buttons are not displayed even if the
    * "showRefreshButton" property is true.Default value is <code>true</code>.
    * @since 1.23
    * @returns Value of property <code>showSearchButton</code>
    */
  def getShowSearchButton(): Boolean = js.native
  /**
    * Gets content of aggregation <code>suggestionItems</code>.<code>SuggestionItems</code> are the items
    * which will be shown in the suggestions list.The following properties can be
    * used:<ul><li><code>key</code> is not displayed and may be used as internal technical
    * field</li><li><code>text</code> is displayed as normal suggestion
    * text</li><li><code>icon</code></li><li><code>description</code> - additional text may be used to
    * visually display search item type or category</li></ul>
    * @since 1.34
    */
  def getSuggestionItems(): js.Array[SuggestionItem] = js.native
  /**
    * Gets current value of property <code>value</code>.Input Value.
    * @returns Value of property <code>value</code>
    */
  def getValue(): String = js.native
  /**
    * Gets current value of property <code>width</code>.Defines the CSS width of the input. If not set,
    * width is 100%.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Checks for the provided <code>sap.m.SuggestionItem</code> in the aggregation
    * <code>suggestionItems</code>.and returns its index if found or -1 otherwise.
    * @since 1.34
    * @param oSuggestionItem The suggestionItem whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfSuggestionItem(oSuggestionItem: SuggestionItem): Double = js.native
  /**
    * Inserts a suggestionItem into the aggregation <code>suggestionItems</code>.
    * @since 1.34
    * @param oSuggestionItem the suggestionItem to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the suggestionItem should be inserted at; for          
    *   a negative value of <code>iIndex</code>, the suggestionItem is inserted at position 0; for a value
    *             greater than the current size of the aggregation, the suggestionItem is inserted at     
    *        the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertSuggestionItem(oSuggestionItem: SuggestionItem, iIndex: Double): SearchField = js.native
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
    * Removes all the controls from the aggregation <code>suggestionItems</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @since 1.34
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllSuggestionItems(): js.Array[SuggestionItem] = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaDescribedBy from the association named <code>ariaDescribedBy</code>.
    * @param vAriaDescribedBy The ariaDescribedBy to be removed or its index or ID
    * @returns The removed ariaDescribedBy or <code>null</code>
    */
  def removeAriaDescribedBy(vAriaDescribedBy: Double): js.Any = js.native
  def removeAriaDescribedBy(vAriaDescribedBy: Control): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  def removeSuggestionItem(vSuggestionItem: String): SuggestionItem = js.native
  /**
    * Removes a suggestionItem from the aggregation <code>suggestionItems</code>.
    * @since 1.34
    * @param vSuggestionItem The suggestionItem to remove or its index or id
    * @returns The removed suggestionItem or <code>null</code>
    */
  def removeSuggestionItem(vSuggestionItem: Double): SuggestionItem = js.native
  def removeSuggestionItem(vSuggestionItem: SuggestionItem): SuggestionItem = js.native
  /**
    * Sets a new value for property <code>enableSuggestions</code>.If true, a <code>suggest</code> event
    * is fired when user types in the input and when the input is focused.On a phone device, a full screen
    * dialog with suggestions is always shown even if the suggestions list is empty.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @since 1.34
    * @param bEnableSuggestions New value for property <code>enableSuggestions</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnableSuggestions(bEnableSuggestions: Boolean): SearchField = js.native
  /**
    * Sets a new value for property <code>enabled</code>.Boolean property to enable the control (default
    * is true).When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @param bEnabled New value for property <code>enabled</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnabled(bEnabled: Boolean): SearchField = js.native
  /**
    * Sets a new value for property <code>maxLength</code>.Maximum number of characters. Value '0' means
    * the feature is switched off.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>0</code>.
    * @param iMaxLength New value for property <code>maxLength</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMaxLength(iMaxLength: Double): SearchField = js.native
  /**
    * Sets a new value for property <code>placeholder</code>.Text shown when no value available. Default
    * placeholder text is the word "Search" in the current local language (if supported) or in
    * English.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sPlaceholder New value for property <code>placeholder</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPlaceholder(sPlaceholder: String): SearchField = js.native
  /**
    * Sets a new value for property <code>refreshButtonTooltip</code>.Tooltip text of the refresh button.
    * If it is not set, the tooltip of the SearchField (if any) is displayed. Tooltips are not displayed
    * on touch devices.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @since 1.16
    * @param sRefreshButtonTooltip New value for property <code>refreshButtonTooltip</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRefreshButtonTooltip(sRefreshButtonTooltip: String): SearchField = js.native
  /**
    * Sets a new value for property <code>selectOnFocus</code>.Normally, search text is selected for copy
    * when the SearchField is focused by keyboard navigation. If an application re-renders the SearchField
    * during the liveChange event, set this property to false to disable text selection by focus.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>true</code>.
    * @since 1.20
    * @param bSelectOnFocus New value for property <code>selectOnFocus</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSelectOnFocus(bSelectOnFocus: Boolean): SearchField = js.native
  /**
    * Sets a new value for property <code>showMagnifier</code>.Set to false to hide the magnifier
    * icon.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>true</code>.
    * @param bShowMagnifier New value for property <code>showMagnifier</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowMagnifier(bShowMagnifier: Boolean): SearchField = js.native
  /**
    * Sets a new value for property <code>showRefreshButton</code>.Set to true to display a refresh button
    * in place of the search icon. By pressing the refresh button or F5 key on keyboard, the user can
    * reload the results list without changing the search string.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @since 1.16
    * @param bShowRefreshButton New value for property <code>showRefreshButton</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowRefreshButton(bShowRefreshButton: Boolean): SearchField = js.native
  /**
    * Sets a new value for property <code>showSearchButton</code>.Set to true to show the search button
    * with the magnifier icon.If false, both the search and refresh buttons are not displayed even if the
    * "showRefreshButton" property is true.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @since 1.23
    * @param bShowSearchButton New value for property <code>showSearchButton</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowSearchButton(bShowSearchButton: Boolean): SearchField = js.native
  /**
    * Sets a new value for property <code>value</code>.Input Value.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sValue New value for property <code>value</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setValue(sValue: String): SearchField = js.native
  /**
    * Sets a new value for property <code>width</code>.Defines the CSS width of the input. If not set,
    * width is 100%.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): SearchField = js.native
  def suggest(bShow: js.Any): SearchField = js.native
  /**
    * Toggle visibility of the suggestion list.
    * @since 1.34
    * @param bShow set to <code>true</code> to display suggestions and <code>false</code> to hide them.
    * Default value is <code>true</code>.An empty suggestion list is not shown on desktop and tablet
    * devices.<br>This method may be called only as a response to the <code>suggest</code> event to ensure
    * that the suggestion list is shownat the moment when the user expects it.
    * @returns <code>this</code> to allow method chaining
    */
  def suggest(bShow: Boolean): SearchField = js.native
  /**
    * Unbinds property <code>value</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindValue(): SearchField = js.native
}


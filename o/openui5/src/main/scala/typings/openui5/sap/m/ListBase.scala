package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Control
import typings.openui5.sap.ui.core.delegate.ItemNavigation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBase extends Control {
  /**
    * Adds some ariaLabelledBy into the association <code>ariaLabelledBy</code>.
    * @since 1.28.0
    * @param vAriaLabelledBy the ariaLabelledBy to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAriaLabelledBy(vAriaLabelledBy: js.Any): ListBase = js.native
  def addAriaLabelledBy(vAriaLabelledBy: Control): ListBase = js.native
  /**
    * Adds some item to the aggregation <code>items</code>.
    * @param oItem the item to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addItem(oItem: ListItemBase): ListBase = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>delete</code> event of this
    * <code>sap.m.ListBase</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.ListBase</code> itself.Fires when delete icon is pressed by user.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ListBase</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachDelete(oData: js.Any, fnFunction: js.Any): ListBase = js.native
  def attachDelete(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>growingFinished</code> event of this
    * <code>sap.m.ListBase</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.ListBase</code> itself.Fires after the new growing chunk has been fetched from the model
    * and processed by the control.
    * @since 1.16
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ListBase</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachGrowingFinished(oData: js.Any, fnFunction: js.Any): ListBase = js.native
  def attachGrowingFinished(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>growingStarted</code> event of this
    * <code>sap.m.ListBase</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.ListBase</code> itself.Fires before the new growing chunk is requested from the model.
    * @since 1.16
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ListBase</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachGrowingStarted(oData: js.Any, fnFunction: js.Any): ListBase = js.native
  def attachGrowingStarted(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>itemPress</code> event of this
    * <code>sap.m.ListBase</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.ListBase</code> itself.Fires when an item is pressed unless the item's <code>type</code>
    * property is <code>Inactive</code>.
    * @since 1.20
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ListBase</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachItemPress(oData: js.Any, fnFunction: js.Any): ListBase = js.native
  def attachItemPress(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>select</code> event of this
    * <code>sap.m.ListBase</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.ListBase</code> itself.Fires when selection is changed via user interaction. In
    * <code>MultiSelect</code> mode, this event is also fired on deselection.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ListBase</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelect(oData: js.Any, fnFunction: js.Any): ListBase = js.native
  def attachSelect(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>selectionChange</code> event of this
    * <code>sap.m.ListBase</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.ListBase</code> itself.Fires when selection is changed via user interaction inside the
    * control.
    * @since 1.16
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ListBase</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSelectionChange(oData: js.Any, fnFunction: js.Any): ListBase = js.native
  def attachSelectionChange(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>swipe</code> event of this
    * <code>sap.m.ListBase</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.ListBase</code> itself.Fires after user's swipe action and before the
    * <code>swipeContent</code> is shown. On the <code>swipe</code> event handler,
    * <code>swipeContent</code> can be changed according to the swiped item.Calling the
    * <code>preventDefault</code> method of the event cancels the swipe action.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ListBase</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachSwipe(oData: js.Any, fnFunction: js.Any): ListBase = js.native
  def attachSwipe(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>updateFinished</code> event of this
    * <code>sap.m.ListBase</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.ListBase</code> itself.Fires after <code>items</code> binding is updated and processed
    * by the control.
    * @since 1.16.3
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ListBase</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachUpdateFinished(oData: js.Any, fnFunction: js.Any): ListBase = js.native
  def attachUpdateFinished(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>updateStarted</code> event of this
    * <code>sap.m.ListBase</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.ListBase</code> itself.Fires before <code>items</code> binding is updated (e.g. sorting,
    * filtering)<b>Note:</b> Event handler should not invalidate the control.
    * @since 1.16.3
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.ListBase</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachUpdateStarted(oData: js.Any, fnFunction: js.Any): ListBase = js.native
  def attachUpdateStarted(oData: js.Any, fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Binds aggregation <code>items</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindItems(oBindingInfo: js.Any): ListBase = js.native
  /**
    * Destroys the headerToolbar in the aggregation <code>headerToolbar</code>.
    * @since 1.16
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyHeaderToolbar(): ListBase = js.native
  /**
    * Destroys the infoToolbar in the aggregation <code>infoToolbar</code>.
    * @since 1.16
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyInfoToolbar(): ListBase = js.native
  /**
    * Destroys all the items in the aggregation <code>items</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyItems(): ListBase = js.native
  /**
    * Destroys the swipeContent in the aggregation <code>swipeContent</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroySwipeContent(): ListBase = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>delete</code> event of this
    * <code>sap.m.ListBase</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachDelete(fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>growingFinished</code> event of this
    * <code>sap.m.ListBase</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.16
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachGrowingFinished(fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>growingStarted</code> event of this
    * <code>sap.m.ListBase</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.16
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachGrowingStarted(fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>itemPress</code> event of this
    * <code>sap.m.ListBase</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.20
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachItemPress(fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>select</code> event of this
    * <code>sap.m.ListBase</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelect(fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>selectionChange</code> event of this
    * <code>sap.m.ListBase</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.16
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSelectionChange(fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>swipe</code> event of this
    * <code>sap.m.ListBase</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachSwipe(fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>updateFinished</code> event of this
    * <code>sap.m.ListBase</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.16.3
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachUpdateFinished(fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>updateStarted</code> event of this
    * <code>sap.m.ListBase</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @since 1.16.3
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachUpdateStarted(fnFunction: js.Any, oListener: js.Any): ListBase = js.native
  /**
    * Fires event <code>delete</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>listItem</code> of type <code>sap.m.ListItemBase</code>The item which fired
    * the delete event.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireDelete(mArguments: js.Any): ListBase = js.native
  /**
    * Fires event <code>growingFinished</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>actual</code> of type <code>int</code>Actual number of
    * items.</li><li><code>total</code> of type <code>int</code>Total number of items.</li></ul>
    * @since 1.16
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireGrowingFinished(mArguments: js.Any): ListBase = js.native
  /**
    * Fires event <code>growingStarted</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>actual</code> of type <code>int</code>Actual number of
    * items.</li><li><code>total</code> of type <code>int</code>Total number of items.</li></ul>
    * @since 1.16
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireGrowingStarted(mArguments: js.Any): ListBase = js.native
  /**
    * Fires event <code>itemPress</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>listItem</code> of type <code>sap.m.ListItemBase</code>The item which fired
    * the pressed event.</li><li><code>srcControl</code> of type <code>sap.ui.core.Control</code>The
    * control which caused the press event within the container.</li></ul>
    * @since 1.20
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireItemPress(mArguments: js.Any): ListBase = js.native
  /**
    * Fires event <code>select</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>listItem</code> of type <code>sap.m.ListItemBase</code>The item which fired
    * the select event.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelect(mArguments: js.Any): ListBase = js.native
  /**
    * Fires event <code>selectionChange</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>listItem</code> of type <code>sap.m.ListItemBase</code>The item whose
    * selection has changed. In <code>MultiSelect</code> mode, only the up-most selected item is returned.
    * This parameter can be used for single-selection modes.</li><li><code>listItems</code> of type
    * <code>sap.m.ListItemBase[]</code>Array of items whose selection has changed. This parameter can be
    * used for <code>MultiSelect</code> mode.</li><li><code>selected</code> of type
    * <code>boolean</code>Indicates whether the <code>listItem</code> parameter is selected or
    * not.</li></ul>
    * @since 1.16
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireSelectionChange(mArguments: js.Any): ListBase = js.native
  /**
    * Fires event <code>swipe</code> to attached listeners.Listeners may prevent the default action of
    * this event by using the <code>preventDefault</code>-method on the event object.Expects the following
    * event parameters:<ul><li><code>listItem</code> of type <code>sap.m.ListItemBase</code>The item which
    * fired the swipe.</li><li><code>swipeContent</code> of type
    * <code>sap.ui.core.Control</code>Aggregated <code>swipeContent</code> control that is shown on the
    * right hand side of the item.</li><li><code>srcControl</code> of type
    * <code>sap.ui.core.Control</code>Holds which control caused the swipe event within the
    * item.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Whether or not to prevent the default action
    */
  def fireSwipe(mArguments: js.Any): Boolean = js.native
  /**
    * Fires event <code>updateFinished</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>reason</code> of type <code>string</code>The reason of the update, e.g.
    * Binding, Filter, Sort, Growing, Change, Refresh, Context.</li><li><code>actual</code> of type
    * <code>int</code>Actual number of items.</li><li><code>total</code> of type <code>int</code>The total
    * count of bound items. This can be used if the <code>growing</code> property is set to
    * <code>true</code>.</li></ul>
    * @since 1.16.3
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireUpdateFinished(mArguments: js.Any): ListBase = js.native
  /**
    * Fires event <code>updateStarted</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>reason</code> of type <code>string</code>The reason of the update, e.g.
    * Binding, Filter, Sort, Growing, Change, Refresh, Context.</li><li><code>actual</code> of type
    * <code>int</code>Actual number of items.</li><li><code>total</code> of type <code>int</code>The total
    * count of bound items. This can be used if the <code>growing</code> property is set to
    * <code>true</code>.</li></ul>
    * @since 1.16.3
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireUpdateStarted(mArguments: js.Any): ListBase = js.native
  /**
    * Returns array of IDs of the elements which are the current targets of the association
    * <code>ariaLabelledBy</code>.
    * @since 1.28.0
    */
  def getAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Gets current value of property <code>enableBusyIndicator</code>.When this property is set to
    * <code>true</code>, the control will automatically display a busy indicator when it detects that data
    * is being loaded. This busy indicator blocks the interaction with the items until data loading is
    * finished.By default, the busy indicator will be shown after one second. This behavior can be
    * customized by setting the <code>busyIndicatorDelay</code> property.Default value is
    * <code>true</code>.
    * @since 1.20.2
    * @returns Value of property <code>enableBusyIndicator</code>
    */
  def getEnableBusyIndicator(): Boolean = js.native
  /**
    * Gets current value of property <code>footerText</code>.Defines the footer text that appears in the
    * control.
    * @returns Value of property <code>footerText</code>
    */
  def getFooterText(): String = js.native
  /**
    * Gets current value of property <code>growing</code>.If set to <code>true</code>, enables the growing
    * feature of the control to load more items by requesting from the model.<b>Note:</b>: This feature
    * only works when an <code>items</code> aggregation is bound. Growing must not be used together with
    * two-way binding.Default value is <code>false</code>.
    * @since 1.16.0
    * @returns Value of property <code>growing</code>
    */
  def getGrowing(): Boolean = js.native
  /**
    * Gets current value of property <code>growingDirection</code>.Defines the direction of the growing
    * feature.If set to <code>Downwards</code> the user has to scroll down to load more items or the
    * growing button is displayed at the bottom.If set to <code>Upwards</code> the user has to scroll up
    * to load more items or the growing button is displayed at the top.Default value is
    * <code>Downwards</code>.
    * @since 1.40.0
    * @returns Value of property <code>growingDirection</code>
    */
  def getGrowingDirection(): ListGrowingDirection = js.native
  /**
    * Returns growing information as object with "actual" and "total" keys.Note: This function returns
    * "null" if "growing" feature is disabled.
    * @since 1.16
    */
  def getGrowingInfo(): js.Any = js.native
  /**
    * Gets current value of property <code>growingScrollToLoad</code>.If set to true, the user can scroll
    * down/up to load more items. Otherwise a growing button is displayed at the bottom/top of the
    * control.<b>Note:</b> This property can only be used if the <code>growing</code> property is set to
    * <code>true</code> and only if there is one instance of <code>sap.m.List</code> or
    * <code>sap.m.Table</code> inside the scrollable scroll container (e.g
    * <code>sap.m.Page</code>).Default value is <code>false</code>.
    * @since 1.16.0
    * @returns Value of property <code>growingScrollToLoad</code>
    */
  def getGrowingScrollToLoad(): Boolean = js.native
  /**
    * Gets current value of property <code>growingThreshold</code>.Defines the number of items to be
    * requested from the model for each grow.This property can only be used if the <code>growing</code>
    * property is set to <code>true</code>.Default value is <code>20</code>.
    * @since 1.16.0
    * @returns Value of property <code>growingThreshold</code>
    */
  def getGrowingThreshold(): Double = js.native
  /**
    * Gets current value of property <code>growingTriggerText</code>.Defines the text displayed on the
    * growing button. The default is a translated text ("More") coming from the message bundle.This
    * property can only be used if the <code>growing</code> property is set to <code>true</code>.
    * @since 1.16.0
    * @returns Value of property <code>growingTriggerText</code>
    */
  def getGrowingTriggerText(): String = js.native
  /**
    * Gets current value of property <code>headerDesign</code>.Defines the header style of the control.
    * Possible values are <code>Standard</code> and <code>Plain</code>.Default value is
    * <code>Standard</code>.
    * @since 1.14
    * @returns Value of property <code>headerDesign</code>
    */
  def getHeaderDesign(): ListHeaderDesign = js.native
  /**
    * Gets current value of property <code>headerText</code>.Defines the header text that appears in the
    * control.<b>Note:</b> If <code>headerToolbar</code> aggregation is set, then this property is
    * ignored.
    * @returns Value of property <code>headerText</code>
    */
  def getHeaderText(): String = js.native
  /**
    * Gets content of aggregation <code>headerToolbar</code>.The header area can be used as a toolbar to
    * add extra controls for user interactions.<b>Note:</b> When set, this overwrites the
    * <code>headerText</code> property.
    * @since 1.16
    */
  def getHeaderToolbar(): Toolbar = js.native
  /**
    * Gets current value of property <code>includeItemInSelection</code>.Defines whether the items are
    * selectable by clicking on the item itself (<code>true</code>) rather than having to set the
    * selection control first.<b>Note:</b> The <code>SingleSelectMaster</code> mode also provides this
    * functionality by default.Default value is <code>false</code>.
    * @returns Value of property <code>includeItemInSelection</code>
    */
  def getIncludeItemInSelection(): Boolean = js.native
  /**
    * Gets content of aggregation <code>infoToolbar</code>.A toolbar that is placed below the header to
    * show extra information to the user.
    * @since 1.16
    */
  def getInfoToolbar(): Toolbar = js.native
  /**
    * Gets current value of property <code>inset</code>.Defines the indentation of the container. Setting
    * it to <code>true</code> indents the list.Default value is <code>false</code>.
    * @returns Value of property <code>inset</code>
    */
  def getInset(): Boolean = js.native
  /**
    * Returns ItemNavigation for controls uses List
    * @since 1.16.5
    */
  def getItemNavigation(): ItemNavigation | js.Any = js.native
  /**
    * Gets content of aggregation <code>items</code>.Defines the items contained within this control.
    */
  def getItems(): js.Array[ListItemBase] = js.native
  /**
    * Gets current value of property <code>keyboardMode</code>.Defines keyboard handling behavior of the
    * control.Default value is <code>Navigation</code>.
    * @since 1.38.0
    * @returns Value of property <code>keyboardMode</code>
    */
  def getKeyboardMode(): ListKeyboardMode = js.native
  /**
    * Returns the last list mode, the mode that is renderedThis can be used to detect mode changes during
    * rendering
    */
  def getLastMode(): Unit = js.native
  /**
    * Gets current value of property <code>mode</code>.Defines the mode of the control (e.g.
    * <code>None</code>, <code>SingleSelect</code>, <code>MultiSelect</code>, <code>Delete</code>).Default
    * value is <code>None</code>.
    * @returns Value of property <code>mode</code>
    */
  def getMode(): ListMode = js.native
  /**
    * Gets current value of property <code>modeAnimationOn</code>.Defines if animations will be shown
    * while switching between modes.Default value is <code>true</code>.
    * @returns Value of property <code>modeAnimationOn</code>
    */
  def getModeAnimationOn(): Boolean = js.native
  /**
    * Gets current value of property <code>noDataText</code>.This text is displayed when the control
    * contains no items.
    * @returns Value of property <code>noDataText</code>
    */
  def getNoDataText(): String = js.native
  /**
    * Gets current value of property <code>rememberSelections</code>.If set to true, this control
    * remembers and retains the selection of the items after a binding update has been performed (e.g.
    * sorting, filtering).<b>Note:</b> This feature works only if two-way data binding for the
    * <code>selected</code> property of the item is not used. It also needs to be turned off if the
    * binding context of the item does not always point to the same entry in the model, for example, if
    * the order of the data in the <code>JSONModel</code> is changed.Default value is <code>true</code>.
    * @since 1.16.6
    * @returns Value of property <code>rememberSelections</code>
    */
  def getRememberSelections(): Boolean = js.native
  /**
    * Returns the binding contexts of the selected items.Note: This method returns an empty array if no
    * databinding is used.
    * @since 1.18.6
    * @param bAll Set true to include even invisible selected items(e.g. the selections from the previous
    * filters).        Note: In single selection modes, only the last selected item's binding context is
    * returned in array.
    */
  def getSelectedContexts(bAll: Boolean): js.Array[_] = js.native
  /**
    * Returns selected list item. When no item is selected, "null" is returned. When "multi-selection" is
    * enabled and multiple items are selected, only the up-most selected item is returned.
    */
  def getSelectedItem(): ListItemBase = js.native
  /**
    * Returns an array containing the selected list items. If no items are selected, an empty array is
    * returned.
    */
  def getSelectedItems(): js.Array[ListItemBase] = js.native
  /**
    * Gets current value of property <code>showNoData</code>.Defines whether or not the text specified in
    * the <code>noDataText</code> property is displayed.Default value is <code>true</code>.
    * @returns Value of property <code>showNoData</code>
    */
  def getShowNoData(): Boolean = js.native
  /**
    * Gets current value of property <code>showSeparators</code>.Defines which item separator style will
    * be used.Default value is <code>All</code>.
    * @returns Value of property <code>showSeparators</code>
    */
  def getShowSeparators(): ListSeparators = js.native
  /**
    * Gets current value of property <code>showUnread</code>.Activates the unread indicator for all items,
    * if set to <code>true</code>.Default value is <code>false</code>.
    * @returns Value of property <code>showUnread</code>
    */
  def getShowUnread(): Boolean = js.native
  /**
    * Gets content of aggregation <code>swipeContent</code>.User can swipe to bring in this control on the
    * right hand side of an item.<b>Note:</b> For non-touch devices, this functionality is ignored.
    */
  def getSwipeContent(): Control = js.native
  /**
    * Gets current value of property <code>swipeDirection</code>.Defines the direction of the swipe
    * movement (e.g LeftToRight, RightToLeft, Both) to display the control defined in the
    * <code>swipeContent</code> aggregation.Default value is <code>Both</code>.
    * @returns Value of property <code>swipeDirection</code>
    */
  def getSwipeDirection(): SwipeDirection = js.native
  /**
    * Returns swiped list item. When no item is swiped, "null" is returned.
    */
  def getSwipedItem(): ListItemBase = js.native
  /**
    * Gets current value of property <code>width</code>.Sets the width of the control.Default value is
    * <code>100%</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Checks for the provided <code>sap.m.ListItemBase</code> in the aggregation <code>items</code>.and
    * returns its index if found or -1 otherwise.
    * @param oItem The item whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfItem(oItem: ListItemBase): Double = js.native
  /**
    * Inserts a item into the aggregation <code>items</code>.
    * @param oItem the item to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the item should be inserted at; for             a
    * negative value of <code>iIndex</code>, the item is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the item is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertItem(oItem: ListItemBase, iIndex: Double): ListBase = js.native
  /**
    * Removes all the controls in the association named <code>ariaLabelledBy</code>.
    * @since 1.28.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAriaLabelledBy(): js.Array[_] = js.native
  /**
    * Removes all the controls from the aggregation <code>items</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllItems(): js.Array[ListItemBase] = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: js.Any): js.Any = js.native
  /**
    * Removes an ariaLabelledBy from the association named <code>ariaLabelledBy</code>.
    * @since 1.28.0
    * @param vAriaLabelledBy The ariaLabelledBy to be removed or its index or ID
    * @returns The removed ariaLabelledBy or <code>null</code>
    */
  def removeAriaLabelledBy(vAriaLabelledBy: Double): js.Any = js.native
  def removeAriaLabelledBy(vAriaLabelledBy: Control): js.Any = js.native
  def removeItem(vItem: String): ListItemBase = js.native
  /**
    * Removes a item from the aggregation <code>items</code>.
    * @param vItem The item to remove or its index or id
    * @returns The removed item or <code>null</code>
    */
  def removeItem(vItem: Double): ListItemBase = js.native
  def removeItem(vItem: ListItemBase): ListItemBase = js.native
  /**
    * Removes visible selections of the current selection mode.
    * @param bAll Since version 1.16.3. This control keeps old selections after filter or sorting. Set
    * this parameter "true" to remove all selections.
    */
  def removeSelections(bAll: Boolean): ListBase = js.native
  /**
    * Select all items in "MultiSelection" mode.
    * @since 1.16
    */
  def selectAll(): ListBase = js.native
  /**
    * Sets a new value for property <code>enableBusyIndicator</code>.When this property is set to
    * <code>true</code>, the control will automatically display a busy indicator when it detects that data
    * is being loaded. This busy indicator blocks the interaction with the items until data loading is
    * finished.By default, the busy indicator will be shown after one second. This behavior can be
    * customized by setting the <code>busyIndicatorDelay</code> property.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @since 1.20.2
    * @param bEnableBusyIndicator New value for property <code>enableBusyIndicator</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setEnableBusyIndicator(bEnableBusyIndicator: Boolean): ListBase = js.native
  /**
    * Sets a new value for property <code>footerText</code>.Defines the footer text that appears in the
    * control.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sFooterText New value for property <code>footerText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFooterText(sFooterText: String): ListBase = js.native
  /**
    * Sets a new value for property <code>growing</code>.If set to <code>true</code>, enables the growing
    * feature of the control to load more items by requesting from the model.<b>Note:</b>: This feature
    * only works when an <code>items</code> aggregation is bound. Growing must not be used together with
    * two-way binding.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>false</code>.
    * @since 1.16.0
    * @param bGrowing New value for property <code>growing</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setGrowing(bGrowing: Boolean): ListBase = js.native
  /**
    * Sets a new value for property <code>growingDirection</code>.Defines the direction of the growing
    * feature.If set to <code>Downwards</code> the user has to scroll down to load more items or the
    * growing button is displayed at the bottom.If set to <code>Upwards</code> the user has to scroll up
    * to load more items or the growing button is displayed at the top.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Downwards</code>.
    * @since 1.40.0
    * @param sGrowingDirection New value for property <code>growingDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setGrowingDirection(sGrowingDirection: ListGrowingDirection): ListBase = js.native
  /**
    * Sets a new value for property <code>growingScrollToLoad</code>.If set to true, the user can scroll
    * down/up to load more items. Otherwise a growing button is displayed at the bottom/top of the
    * control.<b>Note:</b> This property can only be used if the <code>growing</code> property is set to
    * <code>true</code> and only if there is one instance of <code>sap.m.List</code> or
    * <code>sap.m.Table</code> inside the scrollable scroll container (e.g <code>sap.m.Page</code>).When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>false</code>.
    * @since 1.16.0
    * @param bGrowingScrollToLoad New value for property <code>growingScrollToLoad</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setGrowingScrollToLoad(bGrowingScrollToLoad: Boolean): ListBase = js.native
  /**
    * Sets a new value for property <code>growingThreshold</code>.Defines the number of items to be
    * requested from the model for each grow.This property can only be used if the <code>growing</code>
    * property is set to <code>true</code>.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>20</code>.
    * @since 1.16.0
    * @param iGrowingThreshold New value for property <code>growingThreshold</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setGrowingThreshold(iGrowingThreshold: Double): ListBase = js.native
  /**
    * Sets a new value for property <code>growingTriggerText</code>.Defines the text displayed on the
    * growing button. The default is a translated text ("More") coming from the message bundle.This
    * property can only be used if the <code>growing</code> property is set to <code>true</code>.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.
    * @since 1.16.0
    * @param sGrowingTriggerText New value for property <code>growingTriggerText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setGrowingTriggerText(sGrowingTriggerText: String): ListBase = js.native
  /**
    * Sets a new value for property <code>headerDesign</code>.Defines the header style of the control.
    * Possible values are <code>Standard</code> and <code>Plain</code>.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>Standard</code>.
    * @since 1.14
    * @param sHeaderDesign New value for property <code>headerDesign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeaderDesign(sHeaderDesign: ListHeaderDesign): ListBase = js.native
  /**
    * Sets a new value for property <code>headerText</code>.Defines the header text that appears in the
    * control.<b>Note:</b> If <code>headerToolbar</code> aggregation is set, then this property is
    * ignored.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sHeaderText New value for property <code>headerText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeaderText(sHeaderText: String): ListBase = js.native
  /**
    * Sets the aggregated <code>headerToolbar</code>.
    * @since 1.16
    * @param oHeaderToolbar The headerToolbar to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeaderToolbar(oHeaderToolbar: Toolbar): ListBase = js.native
  /**
    * Sets a new value for property <code>includeItemInSelection</code>.Defines whether the items are
    * selectable by clicking on the item itself (<code>true</code>) rather than having to set the
    * selection control first.<b>Note:</b> The <code>SingleSelectMaster</code> mode also provides this
    * functionality by default.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>false</code>.
    * @param bIncludeItemInSelection New value for property <code>includeItemInSelection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIncludeItemInSelection(bIncludeItemInSelection: Boolean): ListBase = js.native
  /**
    * Sets the aggregated <code>infoToolbar</code>.
    * @since 1.16
    * @param oInfoToolbar The infoToolbar to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInfoToolbar(oInfoToolbar: Toolbar): ListBase = js.native
  /**
    * Sets a new value for property <code>inset</code>.Defines the indentation of the container. Setting
    * it to <code>true</code> indents the list.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param bInset New value for property <code>inset</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setInset(bInset: Boolean): ListBase = js.native
  /**
    * Sets a new value for property <code>keyboardMode</code>.Defines keyboard handling behavior of the
    * control.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>Navigation</code>.
    * @since 1.38.0
    * @param sKeyboardMode New value for property <code>keyboardMode</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setKeyboardMode(sKeyboardMode: ListKeyboardMode): ListBase = js.native
  /**
    * Sets a new value for property <code>mode</code>.Defines the mode of the control (e.g.
    * <code>None</code>, <code>SingleSelect</code>, <code>MultiSelect</code>, <code>Delete</code>).When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>None</code>.
    * @param sMode New value for property <code>mode</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMode(sMode: ListMode): ListBase = js.native
  /**
    * Sets a new value for property <code>modeAnimationOn</code>.Defines if animations will be shown while
    * switching between modes.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>true</code>.
    * @param bModeAnimationOn New value for property <code>modeAnimationOn</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setModeAnimationOn(bModeAnimationOn: Boolean): ListBase = js.native
  /**
    * Sets a new value for property <code>noDataText</code>.This text is displayed when the control
    * contains no items.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.
    * @param sNoDataText New value for property <code>noDataText</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setNoDataText(sNoDataText: String): ListBase = js.native
  /**
    * Sets a new value for property <code>rememberSelections</code>.If set to true, this control remembers
    * and retains the selection of the items after a binding update has been performed (e.g. sorting,
    * filtering).<b>Note:</b> This feature works only if two-way data binding for the
    * <code>selected</code> property of the item is not used. It also needs to be turned off if the
    * binding context of the item does not always point to the same entry in the model, for example, if
    * the order of the data in the <code>JSONModel</code> is changed.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>true</code>.
    * @since 1.16.6
    * @param bRememberSelections New value for property <code>rememberSelections</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRememberSelections(bRememberSelections: Boolean): ListBase = js.native
  /**
    * Selects or deselects the given list item.
    * @param oListItem The list item whose selection to be changed. This parameter is mandatory.
    * @param bSelect Sets selected status of the list item. Default value is true.
    */
  def setSelectedItem(oListItem: ListItemBase, bSelect: Boolean): ListBase = js.native
  /**
    * Sets a list item to be selected by id. In single mode the method removes the previous selection.
    * @param sId The id of the list item whose selection to be changed.
    * @param bSelect Sets selected status of the list item. Default value is true.
    */
  def setSelectedItemById(sId: String, bSelect: Boolean): ListBase = js.native
  /**
    * Sets a new value for property <code>showNoData</code>.Defines whether or not the text specified in
    * the <code>noDataText</code> property is displayed.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bShowNoData New value for property <code>showNoData</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowNoData(bShowNoData: Boolean): ListBase = js.native
  /**
    * Sets a new value for property <code>showSeparators</code>.Defines which item separator style will be
    * used.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>All</code>.
    * @param sShowSeparators New value for property <code>showSeparators</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowSeparators(sShowSeparators: ListSeparators): ListBase = js.native
  /**
    * Sets a new value for property <code>showUnread</code>.Activates the unread indicator for all items,
    * if set to <code>true</code>.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>false</code>.
    * @param bShowUnread New value for property <code>showUnread</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowUnread(bShowUnread: Boolean): ListBase = js.native
  /**
    * Sets the aggregated <code>swipeContent</code>.
    * @param oSwipeContent The swipeContent to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSwipeContent(oSwipeContent: Control): ListBase = js.native
  /**
    * Sets a new value for property <code>swipeDirection</code>.Defines the direction of the swipe
    * movement (e.g LeftToRight, RightToLeft, Both) to display the control defined in the
    * <code>swipeContent</code> aggregation.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Both</code>.
    * @param sSwipeDirection New value for property <code>swipeDirection</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSwipeDirection(sSwipeDirection: SwipeDirection): ListBase = js.native
  /**
    * Sets a new value for property <code>width</code>.Sets the width of the control.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>100%</code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): ListBase = js.native
  /**
    * After swipeContent is shown, user can interact with this control(e.g Tap). After interaction is
    * done, you can/should use this method to hide swipeContent from screen.Note: If users try to tap
    * inside of the list but outside of the swipeContent then control hides automatically.
    * @param oCallback This callback function is called with two parameters(swipedListItem and
    * swipedContent) after swipe-out animation is finished.
    */
  def swipeOut(oCallback: js.Any): ListBase = js.native
  /**
    * Unbinds aggregation <code>items</code> from model data.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindItems(): ListBase = js.native
}


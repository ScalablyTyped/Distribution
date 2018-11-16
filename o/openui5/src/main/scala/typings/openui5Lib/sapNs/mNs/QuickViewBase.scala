package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.QuickViewBase")
@js.native
class QuickViewBase protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
         * Constructor for a new QuickViewBase.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String) = this()
  /**
         * Constructor for a new QuickViewBase.Accepts an object literal <code>mSettings</code> that defines
         * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
         * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
         * object.
         * @param sId ID for the new control, generated automatically if no ID is given
         * @param mSettings Initial settings for the new control
        */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
         * Adds some page to the aggregation <code>pages</code>.
         * @param oPage the page to add; if empty, nothing is inserted
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def addPage(oPage: QuickViewPage): QuickViewBase = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>afterNavigate</code> event of this
         * <code>sap.m.QuickViewBase</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.QuickViewBase</code> itself.The event is fired when navigation between two pages
         * has completed.In case of animated transitions this event is fired with some delayafter the
         * "navigate" event.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.QuickViewBase</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachAfterNavigate(oData: js.Any, fnFunction: js.Any): QuickViewBase = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>afterNavigate</code> event of this
         * <code>sap.m.QuickViewBase</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.QuickViewBase</code> itself.The event is fired when navigation between two pages
         * has completed.In case of animated transitions this event is fired with some delayafter the
         * "navigate" event.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.QuickViewBase</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachAfterNavigate(oData: js.Any, fnFunction: js.Any, oListener: js.Any): QuickViewBase = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>navigate</code> event of this
         * <code>sap.m.QuickViewBase</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.QuickViewBase</code> itself.The event is fired when navigation between two pages
         * has been triggered.The transition (if any) to the new page has not started yet.This event can be
         * aborted by the application with preventDefault(),which means that there will be no navigation.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.QuickViewBase</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachNavigate(oData: js.Any, fnFunction: js.Any): QuickViewBase = js.native
  /**
         * Attaches event handler <code>fnFunction</code> to the <code>navigate</code> event of this
         * <code>sap.m.QuickViewBase</code>.When called, the context of the event handler (its
         * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
         * to this <code>sap.m.QuickViewBase</code> itself.The event is fired when navigation between two pages
         * has been triggered.The transition (if any) to the new page has not started yet.This event can be
         * aborted by the application with preventDefault(),which means that there will be no navigation.
         * @param oData An application-specific payload object that will be passed to the event handler along
         * with the event object when firing the event
         * @param fnFunction The function to be called when the event occurs
         * @param oListener Context object to call the event handler with. Defaults to this
         * <code>sap.m.QuickViewBase</code> itself
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def attachNavigate(oData: js.Any, fnFunction: js.Any, oListener: js.Any): QuickViewBase = js.native
  /**
         * Binds aggregation <code>pages</code> to model data.See {@link
         * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
         * of the possible properties of <code>oBindingInfo</code>.
         * @param oBindingInfo The binding information
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def bindPages(oBindingInfo: js.Any): QuickViewBase = js.native
  /**
         * Destroys all the pages in the aggregation <code>pages</code>.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def destroyPages(): QuickViewBase = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>afterNavigate</code> event of this
         * <code>sap.m.QuickViewBase</code>.The passed function and listener object must match the ones used
         * for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachAfterNavigate(fnFunction: js.Any, oListener: js.Any): QuickViewBase = js.native
  /**
         * Detaches event handler <code>fnFunction</code> from the <code>navigate</code> event of this
         * <code>sap.m.QuickViewBase</code>.The passed function and listener object must match the ones used
         * for event registration.
         * @param fnFunction The function to be called, when the event occurs
         * @param oListener Context object on which the given function had to be called
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def detachNavigate(fnFunction: js.Any, oListener: js.Any): QuickViewBase = js.native
  /**
         * Fires event <code>afterNavigate</code> to attached listeners.Expects the following event
         * parameters:<ul><li><code>from</code> of type <code>sap.ui.core.Control</code>Determines the page,
         * which has been displayed before navigation.</li><li><code>fromId</code> of type
         * <code>string</code>Determines the ID of the page, which has been displayed before
         * navigation.</li><li><code>to</code> of type <code>sap.ui.core.Control</code>Determines the page,
         * which is now displayed after navigation.</li><li><code>toId</code> of type
         * <code>string</code>Determines the ID of the page, which is now displayed after
         * navigation.</li><li><code>firstTime</code> of type <code>boolean</code>Determines whether the "to"
         * page (a control with the ID of the page, which has been navigated to) has not been
         * displayed/navigated to before.</li><li><code>isTo</code> of type <code>boolean</code>Determines
         * whether this was a forward navigation.</li><li><code>isBack</code> of type
         * <code>boolean</code>Determines whether this was a back navigation.</li><li><code>isBackToTop</code>
         * of type <code>boolean</code>Determines whether this was a navigation to the root
         * page.</li><li><code>isBackToPage</code> of type <code>boolean</code>Determines whether this was a
         * navigation to a specific page.</li><li><code>direction</code> of type <code>string</code>Determines 
         * how the navigation was triggered, possible values are"to", "back", "backToPage", and
         * "backToTop".</li><li><code>isTopPage</code> of type <code>boolean</code>Determines whether this is a
         * navigation to the top page.</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def fireAfterNavigate(mArguments: js.Any): QuickViewBase = js.native
  /**
         * Fires event <code>navigate</code> to attached listeners.Listeners may prevent the default action of
         * this event by using the <code>preventDefault</code>-method on the event object.Expects the following
         * event parameters:<ul><li><code>from</code> of type <code>sap.ui.core.Control</code>The page which
         * was displayed before the current navigation.</li><li><code>fromId</code> of type
         * <code>string</code>The ID of the page which was displayed before the current
         * navigation.</li><li><code>to</code> of type <code>sap.ui.core.Control</code>The page which will be
         * displayed after the current navigation.</li><li><code>toId</code> of type <code>string</code>The ID
         * of the page which will be displayed after the current navigation.</li><li><code>firstTime</code> of
         * type <code>boolean</code>Determines whether the "to" page (a control with the ID of the pagewhich is
         * currently navigated to) has not been displayed/navigated to before.</li><li><code>isTo</code> of
         * type <code>boolean</code>Determines whether this is a forward
         * navigation.</li><li><code>isBack</code> of type <code>boolean</code>Determines whether this is a
         * back navigation.</li><li><code>isBackToTop</code> of type <code>boolean</code>Determines  whether
         * this is a navigation to the root page.</li><li><code>isBackToPage</code> of type
         * <code>boolean</code>Determines whether this was a navigation to a specific
         * page.</li><li><code>direction</code> of type <code>string</code>Determines how the navigation was
         * triggered, possible values are"to", "back", "backToPage", and "backToTop".</li></ul>
         * @param mArguments The arguments to pass along with the event
         * @returns Whether or not to prevent the default action
        */
  def fireNavigate(mArguments: js.Any): scala.Boolean = js.native
  /**
         * Gets content of aggregation <code>pages</code>.Displays a page header, object icon or image, object
         * name with short description,and object information divided in groups
        */
  def getPages(): js.Array[QuickViewPage] = js.native
  /**
         * Checks for the provided <code>sap.m.QuickViewPage</code> in the aggregation <code>pages</code>.and
         * returns its index if found or -1 otherwise.
         * @param oPage The page whose index is looked for
         * @returns The index of the provided control in the aggregation if found, or -1 otherwise
        */
  def indexOfPage(oPage: QuickViewPage): scala.Double = js.native
  /**
         * Inserts a page into the aggregation <code>pages</code>.
         * @param oPage the page to insert; if empty, nothing is inserted
         * @param iIndex the <code>0</code>-based index the page should be inserted at; for             a
         * negative value of <code>iIndex</code>, the page is inserted at position 0; for a value            
         * greater than the current size of the aggregation, the page is inserted at             the last
         * position
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def insertPage(oPage: QuickViewPage, iIndex: scala.Double): QuickViewBase = js.native
  /**
         * Navigates to the previous page if there is such.
        */
  def navigateBack(): scala.Unit = js.native
  /**
         * Removes all the controls from the aggregation <code>pages</code>.Additionally, it unregisters them
         * from the hosting UIArea.
         * @returns An array of the removed elements (might be empty)
        */
  def removeAllPages(): js.Array[QuickViewPage] = js.native
  /**
         * Removes a page from the aggregation <code>pages</code>.
         * @param vPage The page to remove or its index or id
         * @returns The removed page or <code>null</code>
        */
  def removePage(vPage: java.lang.String): QuickViewPage = js.native
  /**
         * Removes a page from the aggregation <code>pages</code>.
         * @param vPage The page to remove or its index or id
         * @returns The removed page or <code>null</code>
        */
  def removePage(vPage: QuickViewPage): QuickViewPage = js.native
  /**
         * Removes a page from the aggregation <code>pages</code>.
         * @param vPage The page to remove or its index or id
         * @returns The removed page or <code>null</code>
        */
  def removePage(vPage: scala.Double): QuickViewPage = js.native
  /**
         * Unbinds aggregation <code>pages</code> from model data.
         * @returns Reference to <code>this</code> in order to allow method chaining
        */
  def unbindPages(): QuickViewBase = js.native
}


package typings.openui5.sapNs.mNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.Carousel")
@js.native
class Carousel protected () extends Control {
  /**
    * Constructor for a new Carousel.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some page to the aggregation <code>pages</code>.
    * @param oPage the page to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addPage(oPage: Control): Carousel = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>loadPage</code> event of this
    * <code>sap.m.Carousel</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Carousel</code> itself.Carousel requires a new page to be loaded. This event may be used
    * to fill the content of that page
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Carousel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachLoadPage(oData: js.Any, fnFunction: js.Any): Carousel = js.native
  def attachLoadPage(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Carousel = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>pageChanged</code> event of this
    * <code>sap.m.Carousel</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Carousel</code> itself.This event is fired after a carousel swipe has been completed. It
    * is triggered both by physical swipe events and through API carousel manipulations such as calling
    * 'next', 'previous' or 'setActivePageId' functions.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Carousel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachPageChanged(oData: js.Any, fnFunction: js.Any): Carousel = js.native
  def attachPageChanged(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Carousel = js.native
  /**
    * Attaches event handler <code>fnFunction</code> to the <code>unloadPage</code> event of this
    * <code>sap.m.Carousel</code>.When called, the context of the event handler (its <code>this</code>)
    * will be bound to <code>oListener</code> if specified, otherwise it will be bound to this
    * <code>sap.m.Carousel</code> itself.Carousel does not display a page any longer and unloads it. This
    * event may be used to clean up the content of that page.
    * @param oData An application-specific payload object that will be passed to the event handler along
    * with the event object when firing the event
    * @param fnFunction The function to be called when the event occurs
    * @param oListener Context object to call the event handler with. Defaults to this
    * <code>sap.m.Carousel</code> itself
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def attachUnloadPage(oData: js.Any, fnFunction: js.Any): Carousel = js.native
  def attachUnloadPage(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Carousel = js.native
  /**
    * Destroys all the pages in the aggregation <code>pages</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyPages(): Carousel = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>loadPage</code> event of this
    * <code>sap.m.Carousel</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachLoadPage(fnFunction: js.Any, oListener: js.Any): Carousel = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>pageChanged</code> event of this
    * <code>sap.m.Carousel</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachPageChanged(fnFunction: js.Any, oListener: js.Any): Carousel = js.native
  /**
    * Detaches event handler <code>fnFunction</code> from the <code>unloadPage</code> event of this
    * <code>sap.m.Carousel</code>.The passed function and listener object must match the ones used for
    * event registration.
    * @param fnFunction The function to be called, when the event occurs
    * @param oListener Context object on which the given function had to be called
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def detachUnloadPage(fnFunction: js.Any, oListener: js.Any): Carousel = js.native
  /**
    * Fires event <code>loadPage</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>pageId</code> of type <code>string</code>Id of the page which will be
    * loaded</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireLoadPage(mArguments: js.Any): Carousel = js.native
  /**
    * Fires event <code>pageChanged</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>oldActivePageId</code> of type <code>string</code>Id of the page which was
    * active before the page change.</li><li><code>newActivePageId</code> of type <code>string</code>Id of
    * the page which is active after the page change.</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def firePageChanged(mArguments: js.Any): Carousel = js.native
  /**
    * Fires event <code>unloadPage</code> to attached listeners.Expects the following event
    * parameters:<ul><li><code>pageId</code> of type <code>string</code>Id of the page which will be
    * unloaded</li></ul>
    * @param mArguments The arguments to pass along with the event
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def fireUnloadPage(mArguments: js.Any): Carousel = js.native
  /**
    * ID of the element which is the current target of the association <code>activePage</code>, or
    * <code>null</code>.
    */
  def getActivePage(): js.Any = js.native
  /**
    * Gets current value of property <code>busyIndicatorSize</code>.Size of the busy indicators which can
    * be displayed in the carousel.Default value is <code>6em</code>.
    * @returns Value of property <code>busyIndicatorSize</code>
    */
  def getBusyIndicatorSize(): js.Any = js.native
  /**
    * Gets current value of property <code>height</code>.The height of the carousel. Note that when a
    * percentage value is used, the height of the surrounding container must be defined.Default value is
    * <code>100%</code>.
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  /**
    * Gets current value of property <code>loop</code>.Defines whether the carousel should loop, i.e show
    * the first page after the last page is reached and vice versa.Default value is <code>false</code>.
    * @returns Value of property <code>loop</code>
    */
  def getLoop(): Boolean = js.native
  /**
    * Gets current value of property <code>pageIndicatorPlacement</code>.Defines where the carousel's page
    * indicator is displayed. Possible values are sap.m.PlacementType.Top, sap.m.PlacementType.Bottom.
    * Other values are ignored and the default value will be applied. The default value is
    * sap.m.PlacementType.Bottom.Default value is <code>Bottom</code>.
    * @returns Value of property <code>pageIndicatorPlacement</code>
    */
  def getPageIndicatorPlacement(): PlacementType = js.native
  /**
    * Gets content of aggregation <code>pages</code>.The content which the carousel displays.
    */
  def getPages(): js.Array[Control] = js.native
  /**
    * Gets current value of property <code>showBusyIndicator</code>.Show or hide busy indicator in the
    * carousel when loading pages after swipe.Default value is <code>true</code>.
    * @returns Value of property <code>showBusyIndicator</code>
    */
  def getShowBusyIndicator(): Boolean = js.native
  /**
    * Gets current value of property <code>showPageIndicator</code>.Show or hide carousel's page
    * indicator.Default value is <code>true</code>.
    * @returns Value of property <code>showPageIndicator</code>
    */
  def getShowPageIndicator(): Boolean = js.native
  /**
    * Gets current value of property <code>width</code>.The width of the carousel. Note that when a
    * percentage value is used, the height of the surrounding container must be defined.Default value is
    * <code>100%</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>pages</code>.and
    * returns its index if found or -1 otherwise.
    * @param oPage The page whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfPage(oPage: Control): Double = js.native
  /**
    * Inserts a page into the aggregation <code>pages</code>.
    * @param oPage the page to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the page should be inserted at; for             a
    * negative value of <code>iIndex</code>, the page is inserted at position 0; for a value            
    * greater than the current size of the aggregation, the page is inserted at             the last
    * position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertPage(oPage: Control, iIndex: Double): Carousel = js.native
  /**
    * Call this method to display the next page (corresponds to a swipe right). Returns 'this' for method
    * chaining.
    */
  def next(): Carousel = js.native
  /**
    * Call this method to display the previous page (corresponds to a swipe left). Returns 'this' for
    * method chaining.
    */
  def previous(): Carousel = js.native
  /**
    * Removes all the controls from the aggregation <code>pages</code>.Additionally, it unregisters them
    * from the hosting UIArea.
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllPages(): js.Array[Control] = js.native
  def removePage(vPage: String): Control = js.native
  /**
    * Removes a page from the aggregation <code>pages</code>.
    * @param vPage The page to remove or its index or id
    * @returns The removed page or <code>null</code>
    */
  def removePage(vPage: Double): Control = js.native
  def removePage(vPage: Control): Control = js.native
  /**
    * Sets the associated <code>activePage</code>.
    * @param oActivePage ID of an element which becomes the new target of this activePage association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setActivePage(oActivePage: js.Any): Carousel = js.native
  def setActivePage(oActivePage: Control): Carousel = js.native
  /**
    * Sets a new value for property <code>busyIndicatorSize</code>.Size of the busy indicators which can
    * be displayed in the carousel.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>6em</code>.
    * @param sBusyIndicatorSize New value for property <code>busyIndicatorSize</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setBusyIndicatorSize(sBusyIndicatorSize: js.Any): Carousel = js.native
  /**
    * Sets a new value for property <code>height</code>.The height of the carousel. Note that when a
    * percentage value is used, the height of the surrounding container must be defined.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>100%</code>.
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): Carousel = js.native
  /**
    * Sets a new value for property <code>loop</code>.Defines whether the carousel should loop, i.e show
    * the first page after the last page is reached and vice versa.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>false</code>.
    * @param bLoop New value for property <code>loop</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setLoop(bLoop: Boolean): Carousel = js.native
  /**
    * Sets a new value for property <code>pageIndicatorPlacement</code>.Defines where the carousel's page
    * indicator is displayed. Possible values are sap.m.PlacementType.Top, sap.m.PlacementType.Bottom.
    * Other values are ignored and the default value will be applied. The default value is
    * sap.m.PlacementType.Bottom.When called with a value of <code>null</code> or <code>undefined</code>,
    * the default value of the property will be restored.Default value is <code>Bottom</code>.
    * @param sPageIndicatorPlacement New value for property <code>pageIndicatorPlacement</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPageIndicatorPlacement(sPageIndicatorPlacement: PlacementType): Carousel = js.native
  /**
    * Sets a new value for property <code>showBusyIndicator</code>.Show or hide busy indicator in the
    * carousel when loading pages after swipe.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bShowBusyIndicator New value for property <code>showBusyIndicator</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowBusyIndicator(bShowBusyIndicator: Boolean): Carousel = js.native
  /**
    * Sets a new value for property <code>showPageIndicator</code>.Show or hide carousel's page
    * indicator.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.Default value is <code>true</code>.
    * @param bShowPageIndicator New value for property <code>showPageIndicator</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setShowPageIndicator(bShowPageIndicator: Boolean): Carousel = js.native
  /**
    * Sets a new value for property <code>width</code>.The width of the carousel. Note that when a
    * percentage value is used, the height of the surrounding container must be defined.When called with a
    * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>100%</code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Carousel = js.native
}


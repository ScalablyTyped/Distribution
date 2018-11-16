package typings
package openui5Lib.sapNs.uiNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.Splitter")
@js.native
class Splitter protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
           * Constructor for a new Splitter.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId id for the new control, generated automatically if no id is given
           * @param mSettings initial settings for the new control
          */
  def this(sId: java.lang.String) = this()
  /**
           * Constructor for a new Splitter.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId id for the new control, generated automatically if no id is given
           * @param mSettings initial settings for the new control
          */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
           * Adds some contentArea to the aggregation <code>contentAreas</code>.
           * @param oContentArea the contentArea to add; if empty, nothing is inserted
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def addContentArea(oContentArea: openui5Lib.sapNs.uiNs.coreNs.Control): Splitter = js.native
  /**
           * Attaches event handler <code>fnFunction</code> to the <code>resize</code> event of this
           * <code>sap.ui.layout.Splitter</code>.When called, the context of the event handler (its
           * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
           * to this <code>sap.ui.layout.Splitter</code> itself.Event is fired when contents are resized.
           * @param oData An application-specific payload object that will be passed to the event handler along
           * with the event object when firing the event
           * @param fnFunction The function to be called when the event occurs
           * @param oListener Context object to call the event handler with. Defaults to this
           * <code>sap.ui.layout.Splitter</code> itself
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def attachResize(oData: js.Any, fnFunction: js.Any): Splitter = js.native
  /**
           * Attaches event handler <code>fnFunction</code> to the <code>resize</code> event of this
           * <code>sap.ui.layout.Splitter</code>.When called, the context of the event handler (its
           * <code>this</code>) will be bound to <code>oListener</code> if specified, otherwise it will be bound
           * to this <code>sap.ui.layout.Splitter</code> itself.Event is fired when contents are resized.
           * @param oData An application-specific payload object that will be passed to the event handler along
           * with the event object when firing the event
           * @param fnFunction The function to be called when the event occurs
           * @param oListener Context object to call the event handler with. Defaults to this
           * <code>sap.ui.layout.Splitter</code> itself
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def attachResize(oData: js.Any, fnFunction: js.Any, oListener: js.Any): Splitter = js.native
  /**
           * Destroys all the contentAreas in the aggregation <code>contentAreas</code>.
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def destroyContentAreas(): Splitter = js.native
  /**
           * Detaches event handler <code>fnFunction</code> from the <code>resize</code> event of this
           * <code>sap.ui.layout.Splitter</code>.The passed function and listener object must match the ones used
           * for event registration.
           * @param fnFunction The function to be called, when the event occurs
           * @param oListener Context object on which the given function had to be called
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def detachResize(fnFunction: js.Any, oListener: js.Any): Splitter = js.native
  /**
           * Disables the resize handler for this control, this leads to an automatic resize ofthe contents
           * whenever the control changes its size. The resize handler is enabledin every control instance by
           * default.For performance reasons this behavior can be disabled by calling disableAutoResize()
           * @param bTemporarily Only disable autoResize temporarily (used for live resize), so that the previous
           * status can be restored afterwards
          */
  def disableAutoResize(bTemporarily: scala.Boolean): scala.Unit = js.native
  /**
           * Disables the resizing of the Splitter contents via keyboard. This changes the Splitter barsto
           * non-focussable elements.
          */
  def disableKeyboardSupport(): scala.Unit = js.native
  /**
           * Disables recalculation and resize of the splitter contents while dragging the splitter bar.This
           * means that the contents are resized only once after moving the splitter bar.
          */
  def disableLiveResize(): scala.Unit = js.native
  /**
           * Enables the resize handler for this control, this leads to an automatic resize ofthe contents
           * whenever the control changes its size. The resize handler is enabledin every control instance by
           * default.For performance reasons this behavior can be disabled by calling disableAutoResize()
           * @param bTemporarily Only enables autoResize if it was previously disabled temporarily (used for live
           * resize)
          */
  def enableAutoResize(bTemporarily: scala.Boolean): scala.Unit = js.native
  /**
           * Enables the resizing of the Splitter contents via keyboard. This makes the Splitter barsfocussable
           * elements.
          */
  def enableKeyboardSupport(): scala.Unit = js.native
  /**
           * Enables recalculation and resize of the splitter contents while dragging the splitter bar.This means
           * that the contents are resized several times per second when moving the splitter bar.
          */
  def enableLiveResize(): scala.Unit = js.native
  /**
           * Fires event <code>resize</code> to attached listeners.Expects the following event
           * parameters:<ul><li><code>id</code> of type <code>string</code>The ID of the splitter control. The
           * splitter control can also be accessed by calling getSource() on the
           * event.</li><li><code>oldSizes</code> of type <code>int[]</code>An array of values representing the
           * old (pixel-)sizes of the splitter contents</li><li><code>newSizes</code> of type
           * <code>int[]</code>An array of values representing the new (pixel-)sizes of the splitter
           * contents</li></ul>
           * @param mArguments The arguments to pass along with the event
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def fireResize(mArguments: js.Any): Splitter = js.native
  /**
           * Returns the current actual content sizes as pixel value - these values can change with everyresize.
           * @returns Array of px values that correspond to the content area sizes
          */
  def getCalculatedSizes(): js.Array[stdLib.Number] = js.native
  /**
           * Gets content of aggregation <code>contentAreas</code>.The content areas to be split. The control
           * will show n-1 splitter bars between n controls in this aggregation.
          */
  def getContentAreas(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
           * Gets current value of property <code>height</code>.The height of the controlDefault value is
           * <code>100%</code>.
           * @returns Value of property <code>height</code>
          */
  def getHeight(): js.Any = js.native
  /**
           * Gets current value of property <code>orientation</code>.Whether to split the contents horizontally
           * (default) or vertically.Default value is <code>Horizontal</code>.
           * @returns Value of property <code>orientation</code>
          */
  def getOrientation(): openui5Lib.sapNs.uiNs.coreNs.Orientation = js.native
  /**
           * Gets current value of property <code>width</code>.The width of the controlDefault value is
           * <code>100%</code>.
           * @returns Value of property <code>width</code>
          */
  def getWidth(): js.Any = js.native
  /**
           * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation
           * <code>contentAreas</code>.and returns its index if found or -1 otherwise.
           * @param oContentArea The contentArea whose index is looked for
           * @returns The index of the provided control in the aggregation if found, or -1 otherwise
          */
  def indexOfContentArea(oContentArea: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Double = js.native
  /**
           * Inserts a contentArea into the aggregation <code>contentAreas</code>.
           * @param oContentArea the contentArea to insert; if empty, nothing is inserted
           * @param iIndex the <code>0</code>-based index the contentArea should be inserted at; for            
           * a negative value of <code>iIndex</code>, the contentArea is inserted at position 0; for a value     
           *        greater than the current size of the aggregation, the contentArea is inserted at            
           * the last position
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def insertContentArea(oContentArea: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): Splitter = js.native
  /**
           * Removes all the controls from the aggregation <code>contentAreas</code>.Additionally, it unregisters
           * them from the hosting UIArea.
           * @returns An array of the removed elements (might be empty)
          */
  def removeAllContentAreas(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
           * Removes a contentArea from the aggregation <code>contentAreas</code>.
           * @param vContentArea The contentArea to remove or its index or id
           * @returns The removed contentArea or <code>null</code>
          */
  def removeContentArea(vContentArea: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
           * Removes a contentArea from the aggregation <code>contentAreas</code>.
           * @param vContentArea The contentArea to remove or its index or id
           * @returns The removed contentArea or <code>null</code>
          */
  def removeContentArea(vContentArea: openui5Lib.sapNs.uiNs.coreNs.Control): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
           * Removes a contentArea from the aggregation <code>contentAreas</code>.
           * @param vContentArea The contentArea to remove or its index or id
           * @returns The removed contentArea or <code>null</code>
          */
  def removeContentArea(vContentArea: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
           * Sets a new value for property <code>height</code>.The height of the controlWhen called with a value
           * of <code>null</code> or <code>undefined</code>, the default value of the property will be
           * restored.Default value is <code>100%</code>.
           * @param sHeight New value for property <code>height</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setHeight(sHeight: js.Any): Splitter = js.native
  /**
           * Sets a new value for property <code>orientation</code>.Whether to split the contents horizontally
           * (default) or vertically.When called with a value of <code>null</code> or <code>undefined</code>, the
           * default value of the property will be restored.Default value is <code>Horizontal</code>.
           * @param sOrientation New value for property <code>orientation</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setOrientation(sOrientation: openui5Lib.sapNs.uiNs.coreNs.Orientation): Splitter = js.native
  /**
           * Sets a new value for property <code>width</code>.The width of the controlWhen called with a value of
           * <code>null</code> or <code>undefined</code>, the default value of the property will be
           * restored.Default value is <code>100%</code>.
           * @param sWidth New value for property <code>width</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setWidth(sWidth: js.Any): Splitter = js.native
  /**
           * This method  triggers a resize on the Splitter - meaning it forces the Splitter to recalculateall
           * sizes.This method should only be used in rare cases, for example when the CSS that defines the
           * sizesof the splitter bars changes without triggering a rerendering of the splitter.
           * @param forceDirectly Do not delay the resize, trigger it right now.
          */
  def triggerResize(forceDirectly: scala.Boolean): scala.Unit = js.native
}


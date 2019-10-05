package typings.openui5.sap.ui.layout

import typings.openui5.sap.ui.core.Control
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.ResponsiveSplitter")
@js.native
class ResponsiveSplitter protected () extends Control {
  /**
    * Constructor for a new ResponsiveSplitter.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Destroys the rootPaneContainer in the aggregation <code>rootPaneContainer</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyRootPaneContainer(): ResponsiveSplitter = js.native
  /**
    * ID of the element which is the current target of the association <code>defaultPane</code>, or
    * <code>null</code>.
    */
  def getDefaultPane(): js.Any = js.native
  /**
    * Gets current value of property <code>height</code>.The height of the controlDefault value is
    * <code>100%</code>.
    * @returns Value of property <code>height</code>
    */
  def getHeight(): js.Any = js.native
  /**
    * Gets content of aggregation <code>rootPaneContainer</code>.The root PaneContainer of the
    * ResponsiveSplitter
    */
  def getRootPaneContainer(): PaneContainer = js.native
  /**
    * Gets current value of property <code>width</code>.The width of the controlDefault value is
    * <code>100%</code>.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Sets the associated <code>defaultPane</code>.
    * @param oDefaultPane ID of an element which becomes the new target of this defaultPane association;
    * alternatively, an element instance may be given
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDefaultPane(oDefaultPane: js.Any): ResponsiveSplitter = js.native
  def setDefaultPane(oDefaultPane: SplitPane): ResponsiveSplitter = js.native
  /**
    * Sets a new value for property <code>height</code>.The height of the controlWhen called with a value
    * of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>100%</code>.
    * @param sHeight New value for property <code>height</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeight(sHeight: js.Any): ResponsiveSplitter = js.native
  /**
    * Sets the aggregated <code>rootPaneContainer</code>.
    * @param oRootPaneContainer The rootPaneContainer to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRootPaneContainer(oRootPaneContainer: PaneContainer): ResponsiveSplitter = js.native
  /**
    * Sets a new value for property <code>width</code>.The width of the controlWhen called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code>100%</code>.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): ResponsiveSplitter = js.native
}


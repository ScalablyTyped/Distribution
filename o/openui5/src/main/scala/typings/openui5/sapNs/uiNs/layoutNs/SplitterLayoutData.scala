package typings.openui5.sapNs.uiNs.layoutNs

import typings.openui5.sapNs.uiNs.coreNs.LayoutData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.SplitterLayoutData")
@js.native
class SplitterLayoutData protected () extends LayoutData {
  /**
    * Constructor for a new SplitterLayoutData.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Gets current value of property <code>minSize</code>.Sets the minimum size of the splitter content in
    * px.Default value is <code>0</code>.
    * @returns Value of property <code>minSize</code>
    */
  def getMinSize(): Double = js.native
  /**
    * Gets current value of property <code>resizable</code>.Determines whether the control in the splitter
    * can be resized or not.Default value is <code>true</code>.
    * @returns Value of property <code>resizable</code>
    */
  def getResizable(): Boolean = js.native
  /**
    * Gets current value of property <code>size</code>.Sets the size of the splitter content.Default value
    * is <code>auto</code>.
    * @returns Value of property <code>size</code>
    */
  def getSize(): js.Any = js.native
  /**
    * Sets a new value for property <code>minSize</code>.Sets the minimum size of the splitter content in
    * px.When called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>0</code>.
    * @param iMinSize New value for property <code>minSize</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMinSize(iMinSize: Double): SplitterLayoutData = js.native
  /**
    * Sets a new value for property <code>resizable</code>.Determines whether the control in the splitter
    * can be resized or not.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>true</code>.
    * @param bResizable New value for property <code>resizable</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setResizable(bResizable: Boolean): SplitterLayoutData = js.native
  /**
    * Sets a new value for property <code>size</code>.Sets the size of the splitter content.When called
    * with a value of <code>null</code> or <code>undefined</code>, the default value of the property will
    * be restored.Default value is <code>auto</code>.
    * @param sSize New value for property <code>size</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setSize(sSize: js.Any): SplitterLayoutData = js.native
}


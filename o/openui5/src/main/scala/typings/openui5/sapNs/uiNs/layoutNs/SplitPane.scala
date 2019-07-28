package typings.openui5.sapNs.uiNs.layoutNs

import typings.openui5.sapNs.uiNs.coreNs.Control
import typings.openui5.sapNs.uiNs.coreNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.SplitPane")
@js.native
class SplitPane protected () extends Element {
  /**
    * Constructor for a new SplitPane.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId ID for the new control, generated automatically if no ID is given
    * @param mSettings Initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Destroys the content in the aggregation <code>content</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyContent(): SplitPane = js.native
  /**
    * Gets content of aggregation <code>content</code>.Content of the SplitPane
    */
  def getContent(): Control = js.native
  /**
    * Gets current value of property <code>demandPane</code>.Determines whether the pane will be moved to
    * the paginationDefault value is <code>true</code>.
    * @returns Value of property <code>demandPane</code>
    */
  def getDemandPane(): Boolean = js.native
  /**
    * Gets current value of property <code>requiredParentWidth</code>.Determines the minimum width of the
    * ResponsiveSplitter(in pixels). When it is reached the pane will be hidden from the screen.Default
    * value is <code>800</code>.
    * @returns Value of property <code>requiredParentWidth</code>
    */
  def getRequiredParentWidth(): Double = js.native
  /**
    * Sets the aggregated <code>content</code>.
    * @param oContent The content to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setContent(oContent: Control): SplitPane = js.native
  /**
    * Sets a new value for property <code>demandPane</code>.Determines whether the pane will be moved to
    * the paginationWhen called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.Default value is <code>true</code>.
    * @param bDemandPane New value for property <code>demandPane</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDemandPane(bDemandPane: Boolean): SplitPane = js.native
  /**
    * Sets a new value for property <code>requiredParentWidth</code>.Determines the minimum width of the
    * ResponsiveSplitter(in pixels). When it is reached the pane will be hidden from the screen.When
    * called with a value of <code>null</code> or <code>undefined</code>, the default value of the
    * property will be restored.Default value is <code>800</code>.
    * @param iRequiredParentWidth New value for property <code>requiredParentWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRequiredParentWidth(iRequiredParentWidth: Double): SplitPane = js.native
}


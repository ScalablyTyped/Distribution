package typings
package openui5Lib.sapNs.uiNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.PaneContainer")
@js.native
class PaneContainer protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Element {
  /**
           * Constructor for a new PaneContainer.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId ID for the new control, generated automatically if no ID is given
           * @param mSettings Initial settings for the new control
          */
  def this(sId: java.lang.String) = this()
  /**
           * Constructor for a new PaneContainer.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId ID for the new control, generated automatically if no ID is given
           * @param mSettings Initial settings for the new control
          */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
           * Adds some pane to the aggregation <code>panes</code>.
           * @param oPane the pane to add; if empty, nothing is inserted
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def addPane(oPane: openui5Lib.sapNs.uiNs.coreNs.Element): PaneContainer = js.native
  /**
           * Destroys all the panes in the aggregation <code>panes</code>.
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def destroyPanes(): PaneContainer = js.native
  /**
           * Gets current value of property <code>orientation</code>.The orientation of the SplitterDefault value
           * is <code>Horizontal</code>.
           * @returns Value of property <code>orientation</code>
          */
  def getOrientation(): openui5Lib.sapNs.uiNs.coreNs.Orientation = js.native
  /**
           * Gets content of aggregation <code>panes</code>.The Pane that will be shown when there is no suitable
           * pane for ResponsiveSplitter's current width.
          */
  def getPanes(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Element] = js.native
  /**
           * Checks for the provided <code>sap.ui.core.Element</code> in the aggregation <code>panes</code>.and
           * returns its index if found or -1 otherwise.
           * @param oPane The pane whose index is looked for
           * @returns The index of the provided control in the aggregation if found, or -1 otherwise
          */
  def indexOfPane(oPane: openui5Lib.sapNs.uiNs.coreNs.Element): scala.Double = js.native
  /**
           * Inserts a pane into the aggregation <code>panes</code>.
           * @param oPane the pane to insert; if empty, nothing is inserted
           * @param iIndex the <code>0</code>-based index the pane should be inserted at; for             a
           * negative value of <code>iIndex</code>, the pane is inserted at position 0; for a value            
           * greater than the current size of the aggregation, the pane is inserted at             the last
           * position
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def insertPane(oPane: openui5Lib.sapNs.uiNs.coreNs.Element, iIndex: scala.Double): PaneContainer = js.native
  /**
           * Removes all the controls from the aggregation <code>panes</code>.Additionally, it unregisters them
           * from the hosting UIArea.
           * @returns An array of the removed elements (might be empty)
          */
  def removeAllPanes(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Element] = js.native
  /**
           * Removes a pane from the aggregation <code>panes</code>.
           * @param vPane The pane to remove or its index or id
           * @returns The removed pane or <code>null</code>
          */
  def removePane(vPane: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Element = js.native
  /**
           * Removes a pane from the aggregation <code>panes</code>.
           * @param vPane The pane to remove or its index or id
           * @returns The removed pane or <code>null</code>
          */
  def removePane(vPane: openui5Lib.sapNs.uiNs.coreNs.Element): openui5Lib.sapNs.uiNs.coreNs.Element = js.native
  /**
           * Removes a pane from the aggregation <code>panes</code>.
           * @param vPane The pane to remove or its index or id
           * @returns The removed pane or <code>null</code>
          */
  def removePane(vPane: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Element = js.native
  /**
           * Setter for property orientation.Default value is sap.ui.core.Orientation.Horizontal
           * @param sOrientation The Orientation type.
           * @returns this to allow method chaining.
          */
  def setOrientation(sOrientation: openui5Lib.sapNs.uiNs.coreNs.Orientation): PaneContainer = js.native
}


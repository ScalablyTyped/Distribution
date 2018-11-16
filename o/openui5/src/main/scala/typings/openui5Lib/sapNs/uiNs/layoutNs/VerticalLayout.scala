package typings
package openui5Lib.sapNs.uiNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.VerticalLayout")
@js.native
class VerticalLayout protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
           * Constructor for a new VerticalLayout.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId Id for the new control, generated automatically if no id is given
           * @param mSettings initial settings for the new control
          */
  def this(sId: java.lang.String) = this()
  /**
           * Constructor for a new VerticalLayout.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId Id for the new control, generated automatically if no id is given
           * @param mSettings initial settings for the new control
          */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
           * Adds some content to the aggregation <code>content</code>.
           * @param oContent the content to add; if empty, nothing is inserted
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def addContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): VerticalLayout = js.native
  /**
           * Destroys all the content in the aggregation <code>content</code>.
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def destroyContent(): VerticalLayout = js.native
  /**
           * Gets content of aggregation <code>content</code>.Content controls within the layout.
          */
  def getContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
           * Gets current value of property <code>enabled</code>.If not enabled, all controls inside are not
           * enabled automatically.Default value is <code>true</code>.
           * @returns Value of property <code>enabled</code>
          */
  def getEnabled(): scala.Boolean = js.native
  /**
           * Gets current value of property <code>width</code>.Width of the <code>VerticalLayout</code>. If no
           * width is set, the width of the content is used.If the content of the layout has a larger width than
           * the layout, it is cut off.There is no scrolling inside the layout.
           * @returns Value of property <code>width</code>
          */
  def getWidth(): js.Any = js.native
  /**
           * Checks for the provided <code>sap.ui.core.Control</code> in the aggregation <code>content</code>.and
           * returns its index if found or -1 otherwise.
           * @param oContent The content whose index is looked for
           * @returns The index of the provided control in the aggregation if found, or -1 otherwise
          */
  def indexOfContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): scala.Double = js.native
  /**
           * Inserts a content into the aggregation <code>content</code>.
           * @param oContent the content to insert; if empty, nothing is inserted
           * @param iIndex the <code>0</code>-based index the content should be inserted at; for             a
           * negative value of <code>iIndex</code>, the content is inserted at position 0; for a value           
           *  greater than the current size of the aggregation, the content is inserted at             the last
           * position
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def insertContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): VerticalLayout = js.native
  /**
           * Removes all the controls from the aggregation <code>content</code>.Additionally, it unregisters them
           * from the hosting UIArea.
           * @returns An array of the removed elements (might be empty)
          */
  def removeAllContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
           * Removes a content from the aggregation <code>content</code>.
           * @param vContent The content to remove or its index or id
           * @returns The removed content or <code>null</code>
          */
  def removeContent(vContent: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
           * Removes a content from the aggregation <code>content</code>.
           * @param vContent The content to remove or its index or id
           * @returns The removed content or <code>null</code>
          */
  def removeContent(vContent: openui5Lib.sapNs.uiNs.coreNs.Control): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
           * Removes a content from the aggregation <code>content</code>.
           * @param vContent The content to remove or its index or id
           * @returns The removed content or <code>null</code>
          */
  def removeContent(vContent: scala.Double): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
           * Sets a new value for property <code>enabled</code>.If not enabled, all controls inside are not
           * enabled automatically.When called with a value of <code>null</code> or <code>undefined</code>, the
           * default value of the property will be restored.Default value is <code>true</code>.
           * @param bEnabled New value for property <code>enabled</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setEnabled(bEnabled: scala.Boolean): VerticalLayout = js.native
}


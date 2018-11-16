package typings
package openui5Lib.sapNs.uiNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.layout.BlockLayoutCell")
@js.native
class BlockLayoutCell protected ()
  extends openui5Lib.sapNs.uiNs.coreNs.Control {
  /**
           * Constructor for a new BlockLayoutCell.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId ID for the new control, generated automatically if no ID is given
           * @param mSettings Initial settings for the new control
          */
  def this(sId: java.lang.String) = this()
  /**
           * Constructor for a new BlockLayoutCell.Accepts an object literal <code>mSettings</code> that defines
           * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
           * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
           * object.
           * @param sId ID for the new control, generated automatically if no ID is given
           * @param mSettings Initial settings for the new control
          */
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
           * Adds some content to the aggregation <code>content</code>.
           * @param oContent the content to add; if empty, nothing is inserted
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def addContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control): BlockLayoutCell = js.native
  /**
           * Destroys all the content in the aggregation <code>content</code>.
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def destroyContent(): BlockLayoutCell = js.native
  /**
           * Gets content of aggregation <code>content</code>.The content to be included inside the cell
          */
  def getContent(): js.Array[openui5Lib.sapNs.uiNs.coreNs.Control] = js.native
  /**
           * Gets current value of property <code>title</code>.Defines the title of the cell
           * @returns Value of property <code>title</code>
          */
  def getTitle(): java.lang.String = js.native
  /**
           * Gets current value of property <code>titleAlignment</code>.Defines the alignment of the cell
           * titleDefault value is <code>Begin</code>.
           * @returns Value of property <code>titleAlignment</code>
          */
  def getTitleAlignment(): openui5Lib.sapNs.uiNs.coreNs.HorizontalAlign = js.native
  /**
           * Gets current value of property <code>titleLevel</code>.Defines the aria level of the titleThis
           * information is e.g. used by assistive technologies like screenreaders to create a hierarchical site
           * map for faster navigation.Default value is <code>Auto</code>.
           * @returns Value of property <code>titleLevel</code>
          */
  def getTitleLevel(): openui5Lib.sapNs.uiNs.coreNs.TitleLevel = js.native
  /**
           * Gets current value of property <code>width</code>.Defines the width of the cell. Depending on the
           * context of the cell - whether it's in scrollable,or non scrollable row, this property is interpreted
           * in two different ways.If the cell is placed inside a scrollable row - this property defines the
           * width of the cell inpercentages. If no value is provided - the default is 40%.If the cell is placed
           * inside a non scrollable row - this property defines the grow factor of the cellcompared to the whole
           * row.<b>For example:</b> If you have 2 cells, each with width of 1, this means that they should be of
           * equal size,and they need to fill the whole row. This results in 50% width for each cell. If you have
           * 2 cells,one with width of 1, the other with width of 3, this means that the whole row width is 4, so
           * the firstcell will have a width of 25%, the second - 75%.According to the visual guidelines, it is
           * suggested that you only use 25%, 50%, 75% or 100% cells inyou applications. For example, 12,5% width
           * is not desirable (1 cell with width 1, and another with width 7)Default value is <code>0</code>.
           * @returns Value of property <code>width</code>
          */
  def getWidth(): scala.Double = js.native
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
  def insertContent(oContent: openui5Lib.sapNs.uiNs.coreNs.Control, iIndex: scala.Double): BlockLayoutCell = js.native
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
           * Sets a new value for property <code>title</code>.Defines the title of the cellWhen called with a
           * value of <code>null</code> or <code>undefined</code>, the default value of the property will be
           * restored.
           * @param sTitle New value for property <code>title</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setTitle(sTitle: java.lang.String): BlockLayoutCell = js.native
  /**
           * Sets a new value for property <code>titleAlignment</code>.Defines the alignment of the cell
           * titleWhen called with a value of <code>null</code> or <code>undefined</code>, the default value of
           * the property will be restored.Default value is <code>Begin</code>.
           * @param sTitleAlignment New value for property <code>titleAlignment</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setTitleAlignment(sTitleAlignment: openui5Lib.sapNs.uiNs.coreNs.HorizontalAlign): BlockLayoutCell = js.native
  /**
           * Sets a new value for property <code>titleLevel</code>.Defines the aria level of the titleThis
           * information is e.g. used by assistive technologies like screenreaders to create a hierarchical site
           * map for faster navigation.When called with a value of <code>null</code> or <code>undefined</code>,
           * the default value of the property will be restored.Default value is <code>Auto</code>.
           * @param sTitleLevel New value for property <code>titleLevel</code>
           * @returns Reference to <code>this</code> in order to allow method chaining
          */
  def setTitleLevel(sTitleLevel: openui5Lib.sapNs.uiNs.coreNs.TitleLevel): BlockLayoutCell = js.native
}


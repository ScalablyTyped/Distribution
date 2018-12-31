package typings
package openui5Lib.sapNs.mNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.Column")
@js.native
/**
  * Constructor for a new Column.Accepts an object literal <code>mSettings</code> that defines
  * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
  * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
  * object.
  * @param sId id for the new control, generated automatically if no id is given
  * @param mSettings initial settings for the new control
  */
class Column ()
  extends openui5Lib.sapNs.uiNs.coreNs.Element {
  def this(mSettings: js.Any) = this()
  /**
    * Constructor for a new Column.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: java.lang.String) = this()
  def this(sId: java.lang.String, mSettings: js.Any) = this()
  /**
    * Apply text alignment of the Column to Text/Label/Link...TODO: This is so ugly to check content
    * functionsinstead we should document how to use our controlsto inherit text-alignment and we should
    * add a newsap.ui.core.TextAlign type called "Inherit"
    * @param oControl List control
    * @param sAlign TextAlign enumeration
    * @returns oControl
    */
  def applyAlignTo(oControl: openui5Lib.sapNs.uiNs.coreNs.Control): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  def applyAlignTo(oControl: openui5Lib.sapNs.uiNs.coreNs.Control, sAlign: java.lang.String): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Clears the last value of the column if mergeDuplicates property is true
    * @since 1.20.4
    */
  def clearLastValue(): Column = js.native
  /**
    * Destroys the footer in the aggregation <code>footer</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyFooter(): Column = js.native
  /**
    * Destroys the header in the aggregation <code>header</code>.
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyHeader(): Column = js.native
  /**
    * Returns CSS alignment according to column hAlign setting or given parameterfor Begin/End values
    * checks the locale settings
    * @param sAlign TextAlign enumeration
    * @returns left|center|right
    */
  def getCssAlign(sAlign: java.lang.String): java.lang.String = js.native
  /**
    * Gets current value of property <code>demandPopin</code>.According to your minScreenWidth settings,
    * the column can be hidden in different screen sizes.Setting this property to true, shows this column
    * as pop-in instead of hiding it.Default value is <code>false</code>.
    * @returns Value of property <code>demandPopin</code>
    */
  def getDemandPopin(): scala.Boolean = js.native
  /**
    * Gets content of aggregation <code>footer</code>.Control to be displayed in the column footer.
    */
  def getFooter(): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Gets current value of property <code>hAlign</code>.Horizontal alignment of the column content.
    * Available alignment settings are "Begin", "Center", "End", "Left", and "Right".NOTE: Control with a
    * "textAlign" property inherits the horizontal alignment.Default value is <code>Begin</code>.
    * @returns Value of property <code>hAlign</code>
    */
  def getHAlign(): openui5Lib.sapNs.uiNs.coreNs.TextAlign = js.native
  /**
    * Gets content of aggregation <code>header</code>.Control to be displayed in the column header.
    */
  def getHeader(): openui5Lib.sapNs.uiNs.coreNs.Control = js.native
  /**
    * Gets the initial order of the column
    * @returns initial order of the column
    */
  def getInitialOrder(): scala.Double = js.native
  /**
    * Gets the last value of the column
    * @since 1.16
    */
  def getLastValue(): scala.Unit = js.native
  /**
    * Gets current value of property <code>mergeDuplicates</code>.Set "true" to merge repeating
    * cells(duplicates) into one cell block.Please see "mergeFunctionName" property to customize this
    * property.Note: This feature must not be used together with two-way binding. This property is ignored
    * if a column is shown in the pop-in.Default value is <code>false</code>.
    * @since 1.16
    * @returns Value of property <code>mergeDuplicates</code>
    */
  def getMergeDuplicates(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>mergeFunctionName</code>.Defines the value
    * getter(serialization) function if "mergeDuplicates" property is set "true"Control itself uses this
    * function to compare values of two repeating cells.Default value "getText" is suitable for Label and
    * Text control.e.g. For "Icon" control "getSrc" can be used.Note: You can pass one string parameter to
    * given function after "#" sign. e.g. "data#myparameter"Default value is <code>getText</code>.
    * @since 1.16
    * @returns Value of property <code>mergeFunctionName</code>
    */
  def getMergeFunctionName(): java.lang.String = js.native
  /**
    * Gets current value of property <code>minScreenWidth</code>.By default column is always shown. If you
    * set this property, control checks the minimum width of the screen to show or hide this column.As you
    * can give specific CSS sizes(e.g: "480px" or "40em"), you can also use sap.m.ScreenSize
    * enumeration(e.g: "Phone", "Tablet", "Desktop", "Small", "Medium", "Large",
    * ....).sap.m.Column.MediaQuery1->Range1 = 199This property can be used for responsive design. e.g:
    * "40em"(or "640px" or "Tablet") setting shows this column in iPad(and Desktop) but hides in
    * iPhone.Please also see "demandPopin" property
    * @returns Value of property <code>minScreenWidth</code>
    */
  def getMinScreenWidth(): java.lang.String = js.native
  /**
    * Gets the order of the column
    * @returns nOrder order of the column
    */
  def getOrder(): scala.Double = js.native
  /**
    * Gets current value of property <code>popinDisplay</code>.Defines enumerated display options for the
    * pop-in.Default value is <code>Block</code>.
    * @since 1.13.2
    * @returns Value of property <code>popinDisplay</code>
    */
  def getPopinDisplay(): PopinDisplay = js.native
  /**
    * Gets current value of property <code>popinHAlign</code>.Horizontal alignment of the pop-in content.
    * Available alignment settings are "Begin", "Center", "End", "Left", and "Right".NOTE: Controls with a
    * text align do not inherit the horizontal alignment.Default value is <code>Begin</code>.
    * @returns Value of property <code>popinHAlign</code>
    */
  def getPopinHAlign(): openui5Lib.sapNs.uiNs.coreNs.TextAlign = js.native
  /**
    * Gets current value of property <code>styleClass</code>.CSS class name for column contents(header,
    * cells and footer of column). This property can be used for different column styling. If column is
    * shown as pop-in then this class name is applied to related pop-in row.
    * @returns Value of property <code>styleClass</code>
    */
  def getStyleClass(): java.lang.String = js.native
  /**
    * Gets current value of property <code>vAlign</code>.Vertical alignment of the cells in a column.
    * Possible values are "Inherit", "Top", "Middle", "Bottom"This property does not affect the vertical
    * alignment of header and footer.Default value is <code>Inherit</code>.
    * @returns Value of property <code>vAlign</code>
    */
  def getVAlign(): openui5Lib.sapNs.uiNs.coreNs.VerticalAlign = js.native
  /**
    * Gets current value of property <code>visible</code>.Specifies whether or not the column is visible.
    * Invisible columns are not rendered.Default value is <code>true</code>.
    * @returns Value of property <code>visible</code>
    */
  def getVisible(): scala.Boolean = js.native
  /**
    * Gets current value of property <code>width</code>.Defines the width of the column. If you leave it
    * empty then this column covers the remaining space.
    * @returns Value of property <code>width</code>
    */
  def getWidth(): js.Any = js.native
  /**
    * Determines whether the column will be hidden via media queries or not
    */
  def isHidden(): scala.Unit = js.native
  /**
    * Determines whether the column will be shown as pop-in or not
    */
  def isPopin(): scala.Unit = js.native
  /**
    * Gets called from the Table when the all items are removed
    * @since 1.16
    */
  def onItemsRemoved(): scala.Unit = js.native
  /**
    * Sets a new value for property <code>demandPopin</code>.According to your minScreenWidth settings,
    * the column can be hidden in different screen sizes.Setting this property to true, shows this column
    * as pop-in instead of hiding it.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @param bDemandPopin New value for property <code>demandPopin</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setDemandPopin(bDemandPopin: scala.Boolean): Column = js.native
  /**
    * Display or hide the column from given tableThis does not set the visibility property of the column
    * @param oTableDomRef Table DOM reference
    * @param bDisplay whether visible or not
    */
  def setDisplay(oTableDomRef: js.Any): scala.Unit = js.native
  def setDisplay(oTableDomRef: js.Any, bDisplay: scala.Boolean): scala.Unit = js.native
  /**
    * Display or hide the column from given table via checking media query changes
    * @param oTableDomRef Table DOM reference
    */
  def setDisplayViaMedia(oTableDomRef: js.Any): scala.Unit = js.native
  /**
    * Sets the aggregated <code>footer</code>.
    * @param oFooter The footer to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setFooter(oFooter: openui5Lib.sapNs.uiNs.coreNs.Control): Column = js.native
  /**
    * Sets a new value for property <code>hAlign</code>.Horizontal alignment of the column content.
    * Available alignment settings are "Begin", "Center", "End", "Left", and "Right".NOTE: Control with a
    * "textAlign" property inherits the horizontal alignment.When called with a value of <code>null</code>
    * or <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Begin</code>.
    * @param sHAlign New value for property <code>hAlign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHAlign(sHAlign: openui5Lib.sapNs.uiNs.coreNs.TextAlign): Column = js.native
  /**
    * Sets the aggregated <code>header</code>.
    * @param oHeader The header to set
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setHeader(oHeader: openui5Lib.sapNs.uiNs.coreNs.Control): Column = js.native
  /**
    * Sets the visible column indexNegative index values can be used to clear
    * @param nIndex index of the visible column
    */
  def setIndex(nIndex: scala.Double): scala.Unit = js.native
  /**
    * Sets the initial order of the column
    * @param nOrder initial order of the column
    */
  def setInitialOrder(nOrder: scala.Double): scala.Unit = js.native
  /**
    * Sets the last value of the column if mergeDuplicates property is true
    * @since 1.16
    * @param value Any Value
    */
  def setLastValue(value: js.Any): Column = js.native
  /**
    * Sets a new value for property <code>mergeDuplicates</code>.Set "true" to merge repeating
    * cells(duplicates) into one cell block.Please see "mergeFunctionName" property to customize this
    * property.Note: This feature must not be used together with two-way binding. This property is ignored
    * if a column is shown in the pop-in.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>false</code>.
    * @since 1.16
    * @param bMergeDuplicates New value for property <code>mergeDuplicates</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMergeDuplicates(bMergeDuplicates: scala.Boolean): Column = js.native
  /**
    * Sets a new value for property <code>mergeFunctionName</code>.Defines the value getter(serialization)
    * function if "mergeDuplicates" property is set "true"Control itself uses this function to compare
    * values of two repeating cells.Default value "getText" is suitable for Label and Text control.e.g.
    * For "Icon" control "getSrc" can be used.Note: You can pass one string parameter to given function
    * after "#" sign. e.g. "data#myparameter"When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>getText</code>.
    * @since 1.16
    * @param sMergeFunctionName New value for property <code>mergeFunctionName</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMergeFunctionName(sMergeFunctionName: java.lang.String): Column = js.native
  /**
    * Sets a new value for property <code>minScreenWidth</code>.By default column is always shown. If you
    * set this property, control checks the minimum width of the screen to show or hide this column.As you
    * can give specific CSS sizes(e.g: "480px" or "40em"), you can also use sap.m.ScreenSize
    * enumeration(e.g: "Phone", "Tablet", "Desktop", "Small", "Medium", "Large",
    * ....).sap.m.Column.MediaQuery1->Range1 = 199This property can be used for responsive design. e.g:
    * "40em"(or "640px" or "Tablet") setting shows this column in iPad(and Desktop) but hides in
    * iPhone.Please also see "demandPopin" propertyWhen called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sMinScreenWidth New value for property <code>minScreenWidth</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setMinScreenWidth(sMinScreenWidth: java.lang.String): Column = js.native
  /**
    * Sets the order of the columnDoes not do the visual effectTable should be invalidate to re-render
    * @param nOrder order of the column
    */
  def setOrder(nOrder: scala.Double): scala.Unit = js.native
  /**
    * Sets a new value for property <code>popinDisplay</code>.Defines enumerated display options for the
    * pop-in.When called with a value of <code>null</code> or <code>undefined</code>, the default value of
    * the property will be restored.Default value is <code>Block</code>.
    * @since 1.13.2
    * @param sPopinDisplay New value for property <code>popinDisplay</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPopinDisplay(sPopinDisplay: PopinDisplay): Column = js.native
  /**
    * Sets a new value for property <code>popinHAlign</code>.Horizontal alignment of the pop-in content.
    * Available alignment settings are "Begin", "Center", "End", "Left", and "Right".NOTE: Controls with a
    * text align do not inherit the horizontal alignment.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Begin</code>.
    * @param sPopinHAlign New value for property <code>popinHAlign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPopinHAlign(sPopinHAlign: openui5Lib.sapNs.uiNs.coreNs.TextAlign): Column = js.native
  /**
    * Sets a new value for property <code>styleClass</code>.CSS class name for column contents(header,
    * cells and footer of column). This property can be used for different column styling. If column is
    * shown as pop-in then this class name is applied to related pop-in row.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @param sStyleClass New value for property <code>styleClass</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setStyleClass(sStyleClass: java.lang.String): Column = js.native
  /**
    * Sets a new value for property <code>vAlign</code>.Vertical alignment of the cells in a column.
    * Possible values are "Inherit", "Top", "Middle", "Bottom"This property does not affect the vertical
    * alignment of header and footer.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>Inherit</code>.
    * @param sVAlign New value for property <code>vAlign</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVAlign(sVAlign: openui5Lib.sapNs.uiNs.coreNs.VerticalAlign): Column = js.native
  /**
    * Sets a new value for property <code>visible</code>.Specifies whether or not the column is visible.
    * Invisible columns are not rendered.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.Default value is
    * <code>true</code>.
    * @param bVisible New value for property <code>visible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisible(bVisible: scala.Boolean): Column = js.native
  /**
    * Sets a new value for property <code>width</code>.Defines the width of the column. If you leave it
    * empty then this column covers the remaining space.When called with a value of <code>null</code> or
    * <code>undefined</code>, the default value of the property will be restored.
    * @param sWidth New value for property <code>width</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setWidth(sWidth: js.Any): Column = js.native
}


package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Item
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.m.P13nDimMeasurePanel")
@js.native
class P13nDimMeasurePanel protected () extends P13nPanel {
  /**
    * Constructor for a new P13nDimMeasurePanel.Accepts an object literal <code>mSettings</code> that
    * defines initialproperty values, aggregated and associated objects as well as event handlers.See
    * {@link sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the
    * settings object.
    * @param sId id for the new control, generated automatically if no id is given
    * @param mSettings initial settings for the new control
    */
  def this(sId: String) = this()
  def this(sId: String, mSettings: js.Any) = this()
  /**
    * Adds some availableChartType to the aggregation <code>availableChartTypes</code>.
    * @since 1.34.0
    * @param oAvailableChartType the availableChartType to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addAvailableChartType(oAvailableChartType: Item): P13nDimMeasurePanel = js.native
  /**
    * Adds some dimMeasureItem to the aggregation <code>dimMeasureItems</code>.
    * @since 1.34.0
    * @param oDimMeasureItem the dimMeasureItem to add; if empty, nothing is inserted
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def addDimMeasureItem(oDimMeasureItem: P13nDimMeasureItem): P13nDimMeasurePanel = js.native
  /**
    * Binds aggregation <code>dimMeasureItems</code> to model data.See {@link
    * sap.ui.base.ManagedObject#bindAggregation ManagedObject.bindAggregation} for a detailed description
    * of the possible properties of <code>oBindingInfo</code>.
    * @since 1.34.0
    * @param oBindingInfo The binding information
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def bindDimMeasureItems(oBindingInfo: js.Any): P13nDimMeasurePanel = js.native
  /**
    * Destroys all the availableChartTypes in the aggregation <code>availableChartTypes</code>.
    * @since 1.34.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyAvailableChartTypes(): P13nDimMeasurePanel = js.native
  /**
    * Destroys all the dimMeasureItems in the aggregation <code>dimMeasureItems</code>.
    * @since 1.34.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def destroyDimMeasureItems(): P13nDimMeasurePanel = js.native
  /**
    * Gets content of aggregation <code>availableChartTypes</code>.Specifies available chart types.
    * @since 1.34.0
    */
  def getAvailableChartTypes(): js.Array[Item] = js.native
  /**
    * Gets current value of property <code>chartTypeKey</code>.Specifies a chart type key.Default value is
    * <code></code>.
    * @since 1.34.0
    * @returns Value of property <code>chartTypeKey</code>
    */
  def getChartTypeKey(): String = js.native
  /**
    * Gets content of aggregation <code>dimMeasureItems</code>.List of columns that has been changed.
    * @since 1.34.0
    */
  def getDimMeasureItems(): js.Array[P13nDimMeasureItem] = js.native
  /**
    * Checks for the provided <code>sap.ui.core.Item</code> in the aggregation
    * <code>availableChartTypes</code>.and returns its index if found or -1 otherwise.
    * @since 1.34.0
    * @param oAvailableChartType The availableChartType whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfAvailableChartType(oAvailableChartType: Item): Double = js.native
  /**
    * Checks for the provided <code>sap.m.P13nDimMeasureItem</code> in the aggregation
    * <code>dimMeasureItems</code>.and returns its index if found or -1 otherwise.
    * @since 1.34.0
    * @param oDimMeasureItem The dimMeasureItem whose index is looked for
    * @returns The index of the provided control in the aggregation if found, or -1 otherwise
    */
  def indexOfDimMeasureItem(oDimMeasureItem: P13nDimMeasureItem): Double = js.native
  /**
    * Inserts a availableChartType into the aggregation <code>availableChartTypes</code>.
    * @since 1.34.0
    * @param oAvailableChartType the availableChartType to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the availableChartType should be inserted at; for      
    *       a negative value of <code>iIndex</code>, the availableChartType is inserted at position 0; for
    * a value             greater than the current size of the aggregation, the availableChartType is
    * inserted at             the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertAvailableChartType(oAvailableChartType: Item, iIndex: Double): P13nDimMeasurePanel = js.native
  /**
    * Inserts a dimMeasureItem into the aggregation <code>dimMeasureItems</code>.
    * @since 1.34.0
    * @param oDimMeasureItem the dimMeasureItem to insert; if empty, nothing is inserted
    * @param iIndex the <code>0</code>-based index the dimMeasureItem should be inserted at; for          
    *   a negative value of <code>iIndex</code>, the dimMeasureItem is inserted at position 0; for a value
    *             greater than the current size of the aggregation, the dimMeasureItem is inserted at     
    *        the last position
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def insertDimMeasureItem(oDimMeasureItem: P13nDimMeasureItem, iIndex: Double): P13nDimMeasurePanel = js.native
  /**
    * Removes all the controls from the aggregation <code>availableChartTypes</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @since 1.34.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllAvailableChartTypes(): js.Array[Item] = js.native
  /**
    * Removes all the controls from the aggregation <code>dimMeasureItems</code>.Additionally, it
    * unregisters them from the hosting UIArea.
    * @since 1.34.0
    * @returns An array of the removed elements (might be empty)
    */
  def removeAllDimMeasureItems(): js.Array[P13nDimMeasureItem] = js.native
  def removeAvailableChartType(vAvailableChartType: String): Item = js.native
  /**
    * Removes a availableChartType from the aggregation <code>availableChartTypes</code>.
    * @since 1.34.0
    * @param vAvailableChartType The availableChartType to remove or its index or id
    * @returns The removed availableChartType or <code>null</code>
    */
  def removeAvailableChartType(vAvailableChartType: Double): Item = js.native
  def removeAvailableChartType(vAvailableChartType: Item): Item = js.native
  def removeDimMeasureItem(vDimMeasureItem: String): P13nDimMeasureItem = js.native
  /**
    * Removes a dimMeasureItem from the aggregation <code>dimMeasureItems</code>.
    * @since 1.34.0
    * @param vDimMeasureItem The dimMeasureItem to remove or its index or id
    * @returns The removed dimMeasureItem or <code>null</code>
    */
  def removeDimMeasureItem(vDimMeasureItem: Double): P13nDimMeasureItem = js.native
  def removeDimMeasureItem(vDimMeasureItem: P13nDimMeasureItem): P13nDimMeasureItem = js.native
  /**
    * Sets a new value for property <code>chartTypeKey</code>.Specifies a chart type key.When called with
    * a value of <code>null</code> or <code>undefined</code>, the default value of the property will be
    * restored.Default value is <code></code>.
    * @since 1.34.0
    * @param sChartTypeKey New value for property <code>chartTypeKey</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setChartTypeKey(sChartTypeKey: String): P13nDimMeasurePanel = js.native
  /**
    * Unbinds aggregation <code>dimMeasureItems</code> from model data.
    * @since 1.34.0
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def unbindDimMeasureItems(): P13nDimMeasurePanel = js.native
}


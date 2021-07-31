package typings.openui5.sap.m

import typings.openui5.sap.ui.core.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait P13nDimMeasureItem
  extends StObject
     with Item {
  
  /**
    * Gets current value of property <code>columnKey</code>.Specifies the unique chart column key. In this
    * context a column refers to dimensions or measures of a chart.
    * @since 1.34.0
    * @returns Value of property <code>columnKey</code>
    */
  def getColumnKey(): String = js.native
  
  /**
    * Gets current value of property <code>index</code>.Specifies the order of visible dimensions or
    * measures of a chart.Default value is <code>-1</code>.
    * @since 1.34.0
    * @returns Value of property <code>index</code>
    */
  def getIndex(): Double = js.native
  
  /**
    * Gets current value of property <code>role</code>.Specifies the role of dimensions or measures. The
    * role determines how dimensions and measures influence the chart.
    * @since 1.34.0
    * @returns Value of property <code>role</code>
    */
  def getRole(): String = js.native
  
  /**
    * Gets current value of property <code>visible</code>.Specifies the visibility of dimensions or
    * measures.
    * @since 1.34.0
    * @returns Value of property <code>visible</code>
    */
  def getVisible(): Boolean = js.native
  
  /**
    * Sets a new value for property <code>columnKey</code>.Specifies the unique chart column key. In this
    * context a column refers to dimensions or measures of a chart.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.34.0
    * @param sColumnKey New value for property <code>columnKey</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setColumnKey(sColumnKey: String): P13nDimMeasureItem = js.native
  
  /**
    * Sets a new value for property <code>index</code>.Specifies the order of visible dimensions or
    * measures of a chart.When called with a value of <code>null</code> or <code>undefined</code>, the
    * default value of the property will be restored.Default value is <code>-1</code>.
    * @since 1.34.0
    * @param iIndex New value for property <code>index</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setIndex(iIndex: Double): P13nDimMeasureItem = js.native
  
  /**
    * Sets a new value for property <code>role</code>.Specifies the role of dimensions or measures. The
    * role determines how dimensions and measures influence the chart.When called with a value of
    * <code>null</code> or <code>undefined</code>, the default value of the property will be restored.
    * @since 1.34.0
    * @param sRole New value for property <code>role</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setRole(sRole: String): P13nDimMeasureItem = js.native
  
  /**
    * Sets a new value for property <code>visible</code>.Specifies the visibility of dimensions or
    * measures.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @since 1.34.0
    * @param bVisible New value for property <code>visible</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setVisible(bVisible: Boolean): P13nDimMeasureItem = js.native
}

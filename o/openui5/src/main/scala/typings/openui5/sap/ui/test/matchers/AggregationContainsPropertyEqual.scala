package typings.openui5.sap.ui.test.matchers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregationContainsPropertyEqual extends Matcher {
  
  /**
    * Gets current value of property <code>aggregationName</code>.The Name of the aggregation that is used
    * for matching.
    * @returns Value of property <code>aggregationName</code>
    */
  def getAggregationName(): String = js.native
  
  /**
    * Gets current value of property <code>propertyName</code>.The Name of the property that is used for
    * matching.
    * @returns Value of property <code>propertyName</code>
    */
  def getPropertyName(): String = js.native
  
  /**
    * Gets current value of property <code>propertyValue</code>.The value of the Property that is used for
    * matching.
    * @returns Value of property <code>propertyValue</code>
    */
  def getPropertyValue(): js.Any = js.native
  
  /**
    * Sets a new value for property <code>aggregationName</code>.The Name of the aggregation that is used
    * for matching.When called with a value of <code>null</code> or <code>undefined</code>, the default
    * value of the property will be restored.
    * @param sAggregationName New value for property <code>aggregationName</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setAggregationName(sAggregationName: String): AggregationContainsPropertyEqual = js.native
  
  /**
    * Sets a new value for property <code>propertyName</code>.The Name of the property that is used for
    * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param sPropertyName New value for property <code>propertyName</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPropertyName(sPropertyName: String): AggregationContainsPropertyEqual = js.native
  
  /**
    * Sets a new value for property <code>propertyValue</code>.The value of the Property that is used for
    * matching.When called with a value of <code>null</code> or <code>undefined</code>, the default value
    * of the property will be restored.
    * @param oPropertyValue New value for property <code>propertyValue</code>
    * @returns Reference to <code>this</code> in order to allow method chaining
    */
  def setPropertyValue(oPropertyValue: js.Any): AggregationContainsPropertyEqual = js.native
}

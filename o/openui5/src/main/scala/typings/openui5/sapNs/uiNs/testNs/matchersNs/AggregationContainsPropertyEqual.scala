package typings.openui5.sapNs.uiNs.testNs.matchersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.test.matchers.AggregationContainsPropertyEqual")
@js.native
class AggregationContainsPropertyEqual protected () extends Matcher {
  /**
    * AggregationContainsPropertyEqual - checks if an aggregation contains at least one item that has a
    * Property set to a certain value.Accepts an object literal <code>mSettings</code> that defines
    * initialproperty values, aggregated and associated objects as well as event handlers.See {@link
    * sap.ui.base.ManagedObject#constructor} for a general description of the syntax of the settings
    * object.
    * @param mSettings optional map/JSON-object with initial settings for the new
    * AggregationContainsPropertyEqualMatcher
    */
  def this(mSettings: js.Any) = this()
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


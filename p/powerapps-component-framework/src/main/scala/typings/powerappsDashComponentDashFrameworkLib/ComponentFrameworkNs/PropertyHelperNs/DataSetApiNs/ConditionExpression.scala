package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An expression used to represent a filter condition.
			 */
trait ConditionExpression extends js.Object {
  /**
  				 * The name of the data-set column to apply the filter on.
  				 */
  var attributeName: java.lang.String
  /**
  				 * The value evaluated by the condition
  				 */
  var conditionOperator: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.TypesNs.ConditionOperator
  /**
  				 * Entity alias name so filtering can be used on linked entities.
  				 */
  var entityAliasName: js.UndefOr[java.lang.String] = js.undefined
  /**
  				 * The value evaluated by the condition.
  				 */
  var value: java.lang.String | js.Array[java.lang.String]
}

object ConditionExpression {
  @scala.inline
  def apply(
    attributeName: java.lang.String,
    conditionOperator: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.TypesNs.ConditionOperator,
    value: java.lang.String | js.Array[java.lang.String],
    entityAliasName: java.lang.String = null
  ): ConditionExpression = {
    val __obj = js.Dynamic.literal(attributeName = attributeName, conditionOperator = conditionOperator, value = value.asInstanceOf[js.Any])
    if (entityAliasName != null) __obj.updateDynamic("entityAliasName")(entityAliasName)
    __obj.asInstanceOf[ConditionExpression]
  }
}


package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs

import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.TypesNs.FilterOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * An expression used to represent a filter.
			 */
trait FilterExpression extends js.Object {
  /**
  				 * The set of conditions associated with this filter.
  				 */
  var conditions: js.Array[ConditionExpression]
  /**
  				 * The operator used to combine conditions in this filter.
  				 */
  var filterOperator: FilterOperator
  /**
  				 * Any child filters that should be evaluated after evaluating this filter.
  				 */
  var filters: js.UndefOr[js.Array[FilterExpression]] = js.undefined
}

object FilterExpression {
  @scala.inline
  def apply(
    conditions: js.Array[ConditionExpression],
    filterOperator: FilterOperator,
    filters: js.Array[FilterExpression] = null
  ): FilterExpression = {
    val __obj = js.Dynamic.literal(conditions = conditions, filterOperator = filterOperator)
    if (filters != null) __obj.updateDynamic("filters")(filters)
    __obj.asInstanceOf[FilterExpression]
  }
}


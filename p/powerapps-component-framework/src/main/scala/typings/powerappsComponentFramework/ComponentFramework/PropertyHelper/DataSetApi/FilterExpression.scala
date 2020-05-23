package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Types.FilterOperator
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
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], filterOperator = filterOperator.asInstanceOf[js.Any])
    if (filters != null) __obj.updateDynamic("filters")(filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterExpression]
  }
}


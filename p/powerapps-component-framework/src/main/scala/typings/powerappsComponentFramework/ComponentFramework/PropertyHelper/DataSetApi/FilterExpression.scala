package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Types.FilterOperator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An expression used to represent a filter.
  */
@js.native
trait FilterExpression extends js.Object {
  
  /**
    * The set of conditions associated with this filter.
    */
  var conditions: js.Array[ConditionExpression] = js.native
  
  /**
    * The operator used to combine conditions in this filter.
    */
  var filterOperator: FilterOperator = js.native
  
  /**
    * Any child filters that should be evaluated after evaluating this filter.
    */
  var filters: js.UndefOr[js.Array[FilterExpression]] = js.native
}
object FilterExpression {
  
  @scala.inline
  def apply(conditions: js.Array[ConditionExpression], filterOperator: FilterOperator): FilterExpression = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], filterOperator = filterOperator.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterExpression]
  }
  
  @scala.inline
  implicit class FilterExpressionOps[Self <: FilterExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConditionsVarargs(value: ConditionExpression*): Self = this.set("conditions", js.Array(value :_*))
    
    @scala.inline
    def setConditions(value: js.Array[ConditionExpression]): Self = this.set("conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterOperator(value: FilterOperator): Self = this.set("filterOperator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersVarargs(value: FilterExpression*): Self = this.set("filters", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: js.Array[FilterExpression]): Self = this.set("filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilters: Self = this.set("filters", js.undefined)
  }
}

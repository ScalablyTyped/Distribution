package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Filter state for a dataset.
  */
@js.native
trait Filtering extends js.Object {
  
  /**
    * Clears the filter associated with the data-set.
    */
  def clearFilter(): Unit = js.native
  
  /**
    * Returns the top-most filter associated with the data-set
    */
  def getFilter(): FilterExpression = js.native
  
  /**
    * Sets the top-most filter associated with the data-set
    * @expression filter expression to be set
    */
  def setFilter(expression: FilterExpression): Unit = js.native
}
object Filtering {
  
  @scala.inline
  def apply(clearFilter: () => Unit, getFilter: () => FilterExpression, setFilter: FilterExpression => Unit): Filtering = {
    val __obj = js.Dynamic.literal(clearFilter = js.Any.fromFunction0(clearFilter), getFilter = js.Any.fromFunction0(getFilter), setFilter = js.Any.fromFunction1(setFilter))
    __obj.asInstanceOf[Filtering]
  }
  
  @scala.inline
  implicit class FilteringOps[Self <: Filtering] (val x: Self) extends AnyVal {
    
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
    def setClearFilter(value: () => Unit): Self = this.set("clearFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFilter(value: () => FilterExpression): Self = this.set("getFilter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetFilter(value: FilterExpression => Unit): Self = this.set("setFilter", js.Any.fromFunction1(value))
  }
}

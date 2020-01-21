package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Filter state for a dataset.
			 */
trait Filtering extends js.Object {
  /**
  				 * Clears the filter associated with the data-set.
  				 */
  def clearFilter(): Unit
  /**
  				 * Returns the top-most filter associated with the data-set
  				 */
  def getFilter(): FilterExpression
  /**
  				 * Sets the top-most filter associated with the data-set
  				 * @expression filter expression to be set
  				 */
  def setFilter(expression: FilterExpression): Unit
}

object Filtering {
  @scala.inline
  def apply(clearFilter: () => Unit, getFilter: () => FilterExpression, setFilter: FilterExpression => Unit): Filtering = {
    val __obj = js.Dynamic.literal(clearFilter = js.Any.fromFunction0(clearFilter), getFilter = js.Any.fromFunction0(getFilter), setFilter = js.Any.fromFunction1(setFilter))
  
    __obj.asInstanceOf[Filtering]
  }
}


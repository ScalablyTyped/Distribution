package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.DataSetApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Paging state for a dataset
			 */
trait Paging extends js.Object {
  /**
  				 * Whether the result set can be paged forwards.
  				 */
  var hasNextPage: Boolean
  /**
  				 * Whether the result set can be paged backwards.
  				 */
  var hasPreviousPage: Boolean
  /**
  				 * Total number of results on the server for the current query.
  				 */
  var totalResultCount: Double
  /**
  				 * Request the next page of results to be loaded. New data will be pushed to control in another 'updateView' cycle.
  				 */
  def loadNextPage(): Unit
  /**
  				 * Request the previous page of results to be loaded. New data will be pushed to control in another 'updateView' cycle.
  				 */
  def loadPreviousPage(): Unit
  /**
  				 * Reload the results from the server, and reset to page 1.
  				 */
  def reset(): Unit
  /**
  				 * Sets the number of results to return per page on the next data refresh.
  				 * @pageSize pageSize to be set.
  				 */
  def setPageSize(pageSize: Double): Unit
}

object Paging {
  @scala.inline
  def apply(
    hasNextPage: Boolean,
    hasPreviousPage: Boolean,
    loadNextPage: () => Unit,
    loadPreviousPage: () => Unit,
    reset: () => Unit,
    setPageSize: Double => Unit,
    totalResultCount: Double
  ): Paging = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPreviousPage = hasPreviousPage.asInstanceOf[js.Any], loadNextPage = js.Any.fromFunction0(loadNextPage), loadPreviousPage = js.Any.fromFunction0(loadPreviousPage), reset = js.Any.fromFunction0(reset), setPageSize = js.Any.fromFunction1(setPageSize), totalResultCount = totalResultCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Paging]
  }
}


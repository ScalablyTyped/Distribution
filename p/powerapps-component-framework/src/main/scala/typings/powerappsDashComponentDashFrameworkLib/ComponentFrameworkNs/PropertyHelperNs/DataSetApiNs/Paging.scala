package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs

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
  var hasNextPage: scala.Boolean
  /**
  				 * Whether the result set can be paged backwards.
  				 */
  var hasPreviousPage: scala.Boolean
  /**
  				 * Total number of results on the server for the current query.
  				 */
  var totalResultCount: scala.Double
  /**
  				 * Request the next page of results to be loaded. New data will be pushed to control in another 'updateView' cycle.
  				 */
  def loadNextPage(): scala.Unit
  /**
  				 * Request the previous page of results to be loaded. New data will be pushed to control in another 'updateView' cycle.
  				 */
  def loadPreviousPage(): scala.Unit
  /**
  				 * Reload the results from the server, and reset to page 1.
  				 */
  def reset(): scala.Unit
  /**
  				 * Sets the number of results to return per page on the next data refresh.
  				 * @pageSize pageSize to be set.
  				 */
  def setPageSize(pageSize: scala.Double): scala.Unit
}

object Paging {
  @scala.inline
  def apply(
    hasNextPage: scala.Boolean,
    hasPreviousPage: scala.Boolean,
    loadNextPage: () => scala.Unit,
    loadPreviousPage: () => scala.Unit,
    reset: () => scala.Unit,
    setPageSize: scala.Double => scala.Unit,
    totalResultCount: scala.Double
  ): Paging = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage, hasPreviousPage = hasPreviousPage, loadNextPage = js.Any.fromFunction0(loadNextPage), loadPreviousPage = js.Any.fromFunction0(loadPreviousPage), reset = js.Any.fromFunction0(reset), setPageSize = js.Any.fromFunction1(setPageSize), totalResultCount = totalResultCount)
  
    __obj.asInstanceOf[Paging]
  }
}


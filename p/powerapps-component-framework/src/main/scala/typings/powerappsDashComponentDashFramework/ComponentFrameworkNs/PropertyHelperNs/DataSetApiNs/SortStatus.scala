package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs

import typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.TypesNs.SortDirection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Current sort status of a dataset column
			 */
trait SortStatus extends js.Object {
  /**
  				 * The name of the column
  				 */
  var name: String
  /**
  				 * The current sort direction for the column.
  				 */
  var sortDirection: SortDirection
}

object SortStatus {
  @scala.inline
  def apply(name: String, sortDirection: SortDirection): SortStatus = {
    val __obj = js.Dynamic.literal(name = name, sortDirection = sortDirection)
  
    __obj.asInstanceOf[SortStatus]
  }
}


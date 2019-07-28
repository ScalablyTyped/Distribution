package typings.powerappsDashComponentDashFramework.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
			 * Metadata about a column in a dataset
			 */
trait Column extends js.Object {
  /**
  				 * The alias of this column.
  				 */
  var alias: String
  /**
  				 * The manifest type of this column's values.
  				 */
  var dataType: String
  /**
  				 * Prevents the UI from making the column sortable.
  				 */
  var disableSorting: js.UndefOr[Boolean] = js.undefined
  /**
  				 * Localized display name for the column
  				 */
  var displayName: String
  /**
  				 * The column visibility state.
  				 */
  var isHidden: js.UndefOr[Boolean] = js.undefined
  /**
  				 * Is specific column the primary attrribute of the view's entity
  				 */
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  /**
  				 * Name of the column, unique in this dataset
  				 */
  var name: String
  /**
  				 * The column order for the layout
  				 */
  var order: Double
  /**
  				 * Customized column width ratios
  				 */
  var visualSizeFactor: Double
}

object Column {
  @scala.inline
  def apply(
    alias: String,
    dataType: String,
    displayName: String,
    name: String,
    order: Double,
    visualSizeFactor: Double,
    disableSorting: js.UndefOr[Boolean] = js.undefined,
    isHidden: js.UndefOr[Boolean] = js.undefined,
    isPrimary: js.UndefOr[Boolean] = js.undefined
  ): Column = {
    val __obj = js.Dynamic.literal(alias = alias, dataType = dataType, displayName = displayName, name = name, order = order, visualSizeFactor = visualSizeFactor)
    if (!js.isUndefined(disableSorting)) __obj.updateDynamic("disableSorting")(disableSorting)
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden)
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary)
    __obj.asInstanceOf[Column]
  }
}


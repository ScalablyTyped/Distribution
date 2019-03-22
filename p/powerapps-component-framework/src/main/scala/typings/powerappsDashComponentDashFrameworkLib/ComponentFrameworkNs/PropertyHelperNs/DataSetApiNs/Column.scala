package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs

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
  var alias: java.lang.String
  /**
  				 * The manifest type of this column's values.
  				 */
  var dataType: java.lang.String
  /**
  				 * Prevents the UI from making the column sortable.
  				 */
  var disableSorting: js.UndefOr[scala.Boolean] = js.undefined
  /**
  				 * Localized display name for the column
  				 */
  var displayName: java.lang.String
  /**
  				 * The column visibility state.
  				 */
  var isHidden: js.UndefOr[scala.Boolean] = js.undefined
  /**
  				 * Is specific column the primary attrribute of the view's entity
  				 */
  var isPrimary: js.UndefOr[scala.Boolean] = js.undefined
  /**
  				 * Name of the column, unique in this dataset
  				 */
  var name: java.lang.String
  /**
  				 * The column order for the layout
  				 */
  var order: scala.Double
  /**
  				 * Customized column width ratios
  				 */
  var visualSizeFactor: scala.Double
}

object Column {
  @scala.inline
  def apply(
    alias: java.lang.String,
    dataType: java.lang.String,
    displayName: java.lang.String,
    name: java.lang.String,
    order: scala.Double,
    visualSizeFactor: scala.Double,
    disableSorting: js.UndefOr[scala.Boolean] = js.undefined,
    isHidden: js.UndefOr[scala.Boolean] = js.undefined,
    isPrimary: js.UndefOr[scala.Boolean] = js.undefined
  ): Column = {
    val __obj = js.Dynamic.literal(alias = alias, dataType = dataType, displayName = displayName, name = name, order = order, visualSizeFactor = visualSizeFactor)
    if (!js.isUndefined(disableSorting)) __obj.updateDynamic("disableSorting")(disableSorting)
    if (!js.isUndefined(isHidden)) __obj.updateDynamic("isHidden")(isHidden)
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary)
    __obj.asInstanceOf[Column]
  }
}


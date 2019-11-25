package typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyTypes

import org.scalablytyped.runtime.StringDictionary
import typings.powerappsDashComponentDashFramework.ComponentFramework.EntityReference
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.DataSetApi.Column
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.DataSetApi.EntityRecord
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.DataSetApi.Filtering
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.DataSetApi.Linking
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.DataSetApi.Paging
import typings.powerappsDashComponentDashFramework.ComponentFramework.PropertyHelper.DataSetApi.SortStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The structure of a dataset property as it would be passed to a control
		 */
trait DataSet extends js.Object {
  /**
  			 * Adds column to the columnset
  			 * @param name column name to be added to the columnset
  			 * @param entityAlias entity alias for which the column name needs to be added
  			 */
  var addColumn: js.UndefOr[js.Function2[/* name */ String, /* entityAlias */ js.UndefOr[String], Unit]] = js.undefined
  /**
  			 * Set of columns available in this dataset.
  			 */
  var columns: js.Array[Column]
  /**
  			 * True if encountered error while data retrieval
  			 */
  var error: Boolean
  /**
  			 * The error message associated with the last encountered error, if applicable
  			 */
  var errorMessage: String
  /**
  			 * The column filtering for the current query.
  			 */
  var filtering: Filtering
  /**
  			 * Related entity info
  			 */
  var linking: Linking
  /**
  			 * Indicate if the dataset property is in loading state or not
  			 */
  var loading: Boolean
  /**
  			 * Pagination status and actions.
  			 */
  var paging: Paging
  /**
  			 * Map of IDs to the full record object
  			 */
  var records: StringDictionary[EntityRecord]
  /**
  			 * IDs of the records in the dataset, order by the query response result
  			 */
  var sortedRecordIds: js.Array[String]
  /**
  			 * The sorting status for the current query.
  			 */
  var sorting: js.Array[SortStatus]
  /**
  			 * Clear selected record ids list
  			 */
  def clearSelectedRecordIds(): Unit
  /**
  			 * Retrieves all selected record ids
  			 */
  def getSelectedRecordIds(): js.Array[String]
  /**
  			 * Get DataSet target entity logical name
  			 */
  def getTargetEntityType(): String
  /**
  			 * Retrieves the view display name used by the dataset property
  			 */
  def getTitle(): String
  /**
  			 * Gets Id of view used by the dataset property
  			 */
  def getViewId(): String
  /**
  			 * Open dataSet item for a given EntityReference. It will check if there is a command with command button id "Mscrm.OpenRecordItem".
  			 * If there is, it will execute the command, otherwise it will just navigate to the associated form of the entityReference
  			 * @param entityReference entity reference
  			 */
  def openDatasetItem(entityReference: EntityReference): Unit
  /**
  			 * Refreshes the dataset based on filters, sorting, linking, new column. New data will be pushed to control in another 'updateView' cycle.
  			 */
  def refresh(): Unit
  /**
  			 * Set the ids of the selected records
  			 * @ids List of recordId's
  			 */
  def setSelectedRecordIds(ids: js.Array[String]): Unit
}

object DataSet {
  @scala.inline
  def apply(
    clearSelectedRecordIds: () => Unit,
    columns: js.Array[Column],
    error: Boolean,
    errorMessage: String,
    filtering: Filtering,
    getSelectedRecordIds: () => js.Array[String],
    getTargetEntityType: () => String,
    getTitle: () => String,
    getViewId: () => String,
    linking: Linking,
    loading: Boolean,
    openDatasetItem: EntityReference => Unit,
    paging: Paging,
    records: StringDictionary[EntityRecord],
    refresh: () => Unit,
    setSelectedRecordIds: js.Array[String] => Unit,
    sortedRecordIds: js.Array[String],
    sorting: js.Array[SortStatus],
    addColumn: (/* name */ String, /* entityAlias */ js.UndefOr[String]) => Unit = null
  ): DataSet = {
    val __obj = js.Dynamic.literal(clearSelectedRecordIds = js.Any.fromFunction0(clearSelectedRecordIds), columns = columns.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], filtering = filtering.asInstanceOf[js.Any], getSelectedRecordIds = js.Any.fromFunction0(getSelectedRecordIds), getTargetEntityType = js.Any.fromFunction0(getTargetEntityType), getTitle = js.Any.fromFunction0(getTitle), getViewId = js.Any.fromFunction0(getViewId), linking = linking.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], openDatasetItem = js.Any.fromFunction1(openDatasetItem), paging = paging.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), setSelectedRecordIds = js.Any.fromFunction1(setSelectedRecordIds), sortedRecordIds = sortedRecordIds.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any])
    if (addColumn != null) __obj.updateDynamic("addColumn")(js.Any.fromFunction2(addColumn))
    __obj.asInstanceOf[DataSet]
  }
}


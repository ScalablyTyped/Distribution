package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import org.scalablytyped.runtime.StringDictionary
import typings.powerappsComponentFramework.ComponentFramework.EntityReference
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Column
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.EntityRecord
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Filtering
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Linking
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Paging
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.SortStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The structure of a dataset property as it would be passed to a control
  */
@js.native
trait DataSet extends js.Object {
  /**
    * Adds column to the columnset
    * @param name column name to be added to the columnset
    * @param entityAlias entity alias for which the column name needs to be added
    */
  var addColumn: js.UndefOr[js.Function2[/* name */ String, /* entityAlias */ js.UndefOr[String], Unit]] = js.native
  /**
    * Set of columns available in this dataset.
    */
  var columns: js.Array[Column] = js.native
  /**
    * True if encountered error while data retrieval
    */
  var error: Boolean = js.native
  /**
    * The error message associated with the last encountered error, if applicable
    */
  var errorMessage: String = js.native
  /**
    * The column filtering for the current query.
    */
  var filtering: Filtering = js.native
  /**
    * Related entity info
    */
  var linking: Linking = js.native
  /**
    * Indicate if the dataset property is in loading state or not
    */
  var loading: Boolean = js.native
  /**
    * Pagination status and actions.
    */
  var paging: Paging = js.native
  /**
    * Map of IDs to the full record object
    */
  var records: StringDictionary[EntityRecord] = js.native
  /**
    * IDs of the records in the dataset, order by the query response result
    */
  var sortedRecordIds: js.Array[String] = js.native
  /**
    * The sorting status for the current query.
    */
  var sorting: js.Array[SortStatus] = js.native
  /**
    * Clear selected record ids list
    */
  def clearSelectedRecordIds(): Unit = js.native
  /**
    * Retrieves all selected record ids
    */
  def getSelectedRecordIds(): js.Array[String] = js.native
  /**
    * Get DataSet target entity logical name
    */
  def getTargetEntityType(): String = js.native
  /**
    * Retrieves the view display name used by the dataset property
    */
  def getTitle(): String = js.native
  /**
    * Gets Id of view used by the dataset property
    */
  def getViewId(): String = js.native
  /**
    * Open dataSet item for a given EntityReference. It will check if there is a command with command button id "Mscrm.OpenRecordItem".
    * If there is, it will execute the command, otherwise it will just navigate to the associated form of the entityReference
    * @param entityReference entity reference
    */
  def openDatasetItem(entityReference: EntityReference): Unit = js.native
  /**
    * Refreshes the dataset based on filters, sorting, linking, new column. New data will be pushed to control in another 'updateView' cycle.
    */
  def refresh(): Unit = js.native
  /**
    * Set the ids of the selected records
    * @ids List of recordId's
    */
  def setSelectedRecordIds(ids: js.Array[String]): Unit = js.native
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
    sorting: js.Array[SortStatus]
  ): DataSet = {
    val __obj = js.Dynamic.literal(clearSelectedRecordIds = js.Any.fromFunction0(clearSelectedRecordIds), columns = columns.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], filtering = filtering.asInstanceOf[js.Any], getSelectedRecordIds = js.Any.fromFunction0(getSelectedRecordIds), getTargetEntityType = js.Any.fromFunction0(getTargetEntityType), getTitle = js.Any.fromFunction0(getTitle), getViewId = js.Any.fromFunction0(getViewId), linking = linking.asInstanceOf[js.Any], loading = loading.asInstanceOf[js.Any], openDatasetItem = js.Any.fromFunction1(openDatasetItem), paging = paging.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any], refresh = js.Any.fromFunction0(refresh), setSelectedRecordIds = js.Any.fromFunction1(setSelectedRecordIds), sortedRecordIds = sortedRecordIds.asInstanceOf[js.Any], sorting = sorting.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSet]
  }
  @scala.inline
  implicit class DataSetOps[Self <: DataSet] (val x: Self) extends AnyVal {
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
    def setClearSelectedRecordIds(value: () => Unit): Self = this.set("clearSelectedRecordIds", js.Any.fromFunction0(value))
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: Boolean): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltering(value: Filtering): Self = this.set("filtering", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetSelectedRecordIds(value: () => js.Array[String]): Self = this.set("getSelectedRecordIds", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTargetEntityType(value: () => String): Self = this.set("getTargetEntityType", js.Any.fromFunction0(value))
    @scala.inline
    def setGetTitle(value: () => String): Self = this.set("getTitle", js.Any.fromFunction0(value))
    @scala.inline
    def setGetViewId(value: () => String): Self = this.set("getViewId", js.Any.fromFunction0(value))
    @scala.inline
    def setLinking(value: Linking): Self = this.set("linking", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenDatasetItem(value: EntityReference => Unit): Self = this.set("openDatasetItem", js.Any.fromFunction1(value))
    @scala.inline
    def setPaging(value: Paging): Self = this.set("paging", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecords(value: StringDictionary[EntityRecord]): Self = this.set("records", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefresh(value: () => Unit): Self = this.set("refresh", js.Any.fromFunction0(value))
    @scala.inline
    def setSetSelectedRecordIds(value: js.Array[String] => Unit): Self = this.set("setSelectedRecordIds", js.Any.fromFunction1(value))
    @scala.inline
    def setSortedRecordIdsVarargs(value: String*): Self = this.set("sortedRecordIds", js.Array(value :_*))
    @scala.inline
    def setSortedRecordIds(value: js.Array[String]): Self = this.set("sortedRecordIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setSortingVarargs(value: SortStatus*): Self = this.set("sorting", js.Array(value :_*))
    @scala.inline
    def setSorting(value: js.Array[SortStatus]): Self = this.set("sorting", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddColumn(value: (/* name */ String, /* entityAlias */ js.UndefOr[String]) => Unit): Self = this.set("addColumn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteAddColumn: Self = this.set("addColumn", js.undefined)
  }
  
}


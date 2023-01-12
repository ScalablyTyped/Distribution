package typings.powerappsComponentFramework.ComponentFramework.PropertyTypes

import org.scalablytyped.runtime.StringDictionary
import typings.powerappsComponentFramework.ComponentFramework.EntityReference
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Column
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.EntityRecord
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Filtering
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Linking
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Paging
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.SortStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The structure of a dataset property as it would be passed to a control
  */
trait DataSet extends StObject {
  
  /**
    * Adds column to the columnset
    * @param name column name to be added to the columnset
    * @param entityAlias entity alias for which the column name needs to be added
    */
  var addColumn: js.UndefOr[js.Function2[/* name */ String, /* entityAlias */ js.UndefOr[String], Unit]] = js.undefined
  
  /**
    * Clear selected record ids list
    */
  def clearSelectedRecordIds(): Unit
  
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
    * Related entity info
    */
  var linking: Linking
  
  /**
    * Indicate if the dataset property is in loading state or not
    */
  var loading: Boolean
  
  /**
    * Open dataSet item for a given EntityReference. It will check if there is a command with command button id "Mscrm.OpenRecordItem".
    * If there is, it will execute the command, otherwise it will just navigate to the associated form of the entityReference
    * @param entityReference entity reference
    */
  def openDatasetItem(entityReference: EntityReference): Unit
  
  /**
    * Pagination status and actions.
    */
  var paging: Paging
  
  /**
    * Map of IDs to the full record object
    */
  var records: StringDictionary[EntityRecord]
  
  /**
    * Refreshes the dataset based on filters, sorting, linking, new column. New data will be pushed to control in another 'updateView' cycle.
    */
  def refresh(): Unit
  
  /**
    * Set the ids of the selected records
    * @param ids List of recordId's
    */
  def setSelectedRecordIds(ids: js.Array[String]): Unit
  
  /**
    * IDs of the records in the dataset, order by the query response result
    */
  var sortedRecordIds: js.Array[String]
  
  /**
    * The sorting status for the current query.
    */
  var sorting: js.Array[SortStatus]
}
object DataSet {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: DataSet] (val x: Self) extends AnyVal {
    
    inline def setAddColumn(value: (/* name */ String, /* entityAlias */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "addColumn", js.Any.fromFunction2(value))
    
    inline def setAddColumnUndefined: Self = StObject.set(x, "addColumn", js.undefined)
    
    inline def setClearSelectedRecordIds(value: () => Unit): Self = StObject.set(x, "clearSelectedRecordIds", js.Any.fromFunction0(value))
    
    inline def setColumns(value: js.Array[Column]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setFiltering(value: Filtering): Self = StObject.set(x, "filtering", value.asInstanceOf[js.Any])
    
    inline def setGetSelectedRecordIds(value: () => js.Array[String]): Self = StObject.set(x, "getSelectedRecordIds", js.Any.fromFunction0(value))
    
    inline def setGetTargetEntityType(value: () => String): Self = StObject.set(x, "getTargetEntityType", js.Any.fromFunction0(value))
    
    inline def setGetTitle(value: () => String): Self = StObject.set(x, "getTitle", js.Any.fromFunction0(value))
    
    inline def setGetViewId(value: () => String): Self = StObject.set(x, "getViewId", js.Any.fromFunction0(value))
    
    inline def setLinking(value: Linking): Self = StObject.set(x, "linking", value.asInstanceOf[js.Any])
    
    inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
    
    inline def setOpenDatasetItem(value: EntityReference => Unit): Self = StObject.set(x, "openDatasetItem", js.Any.fromFunction1(value))
    
    inline def setPaging(value: Paging): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setRecords(value: StringDictionary[EntityRecord]): Self = StObject.set(x, "records", value.asInstanceOf[js.Any])
    
    inline def setRefresh(value: () => Unit): Self = StObject.set(x, "refresh", js.Any.fromFunction0(value))
    
    inline def setSetSelectedRecordIds(value: js.Array[String] => Unit): Self = StObject.set(x, "setSelectedRecordIds", js.Any.fromFunction1(value))
    
    inline def setSortedRecordIds(value: js.Array[String]): Self = StObject.set(x, "sortedRecordIds", value.asInstanceOf[js.Any])
    
    inline def setSortedRecordIdsVarargs(value: String*): Self = StObject.set(x, "sortedRecordIds", js.Array(value*))
    
    inline def setSorting(value: js.Array[SortStatus]): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
    
    inline def setSortingVarargs(value: SortStatus*): Self = StObject.set(x, "sorting", js.Array(value*))
  }
}

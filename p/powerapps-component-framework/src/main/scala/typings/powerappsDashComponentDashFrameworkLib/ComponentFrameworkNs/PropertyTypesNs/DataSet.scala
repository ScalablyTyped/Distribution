package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyTypesNs

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
  var addColumn: js.UndefOr[
    js.Function2[
      /* name */ java.lang.String, 
      /* entityAlias */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ] = js.undefined
  /**
  			 * Set of columns available in this dataset.
  			 */
  var columns: js.Array[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.Column
  ]
  /**
  			 * True if encountered error while data retrieval
  			 */
  var error: scala.Boolean
  /**
  			 * The error message associated with the last encountered error, if applicable
  			 */
  var errorMessage: java.lang.String
  /**
  			 * The column filtering for the current query.
  			 */
  var filtering: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.Filtering
  /**
  			 * Related entity info
  			 */
  var linking: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.Linking
  /**
  			 * Indicate if the dataset property is in loading state or not
  			 */
  var loading: scala.Boolean
  /**
  			 * Pagination status and actions.
  			 */
  var paging: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.Paging
  /**
  			 * Map of IDs to the full record object
  			 */
  var records: org.scalablytyped.runtime.StringDictionary[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.EntityRecord
  ]
  /**
  			 * IDs of the records in the dataset, order by the query response result
  			 */
  var sortedRecordIds: js.Array[java.lang.String]
  /**
  			 * The sorting status for the current query.
  			 */
  var sorting: js.Array[
    powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.SortStatus
  ]
  /**
  			 * Clear selected record ids list
  			 */
  def clearSelectedRecordIds(): scala.Unit
  /**
  			 * Retrieves all selected record ids
  			 */
  def getSelectedRecordIds(): js.Array[java.lang.String]
  /**
  			 * Get DataSet target entity logical name
  			 */
  def getTargetEntityType(): java.lang.String
  /**
  			 * Retrieves the view display name used by the dataset property
  			 */
  def getTitle(): java.lang.String
  /**
  			 * Gets Id of view used by the dataset property
  			 */
  def getViewId(): java.lang.String
  /**
  			 * Open dataSet item for a given EntityReference. It will check if there is a command with command button id "Mscrm.OpenRecordItem".
  			 * If there is, it will execute the command, otherwise it will just navigate to the associated form of the entityReference
  			 * @param entityReference entity reference
  			 */
  def openDatasetItem(entityReference: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.EntityReference): scala.Unit
  /**
  			 * Refreshes the dataset based on filters, sorting, linking, new column. New data will be pushed to control in another 'updateView' cycle.
  			 */
  def refresh(): scala.Unit
  /**
  			 * Set the ids of the selected records
  			 * @ids List of recordId's
  			 */
  def setSelectedRecordIds(ids: js.Array[java.lang.String]): scala.Unit
}

object DataSet {
  @scala.inline
  def apply(
    clearSelectedRecordIds: () => scala.Unit,
    columns: js.Array[
      powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.Column
    ],
    error: scala.Boolean,
    errorMessage: java.lang.String,
    filtering: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.Filtering,
    getSelectedRecordIds: () => js.Array[java.lang.String],
    getTargetEntityType: () => java.lang.String,
    getTitle: () => java.lang.String,
    getViewId: () => java.lang.String,
    linking: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.Linking,
    loading: scala.Boolean,
    openDatasetItem: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.EntityReference => scala.Unit,
    paging: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.Paging,
    records: org.scalablytyped.runtime.StringDictionary[
      powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.EntityRecord
    ],
    refresh: () => scala.Unit,
    setSelectedRecordIds: js.Array[java.lang.String] => scala.Unit,
    sortedRecordIds: js.Array[java.lang.String],
    sorting: js.Array[
      powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.PropertyHelperNs.DataSetApiNs.SortStatus
    ],
    addColumn: (/* name */ java.lang.String, /* entityAlias */ js.UndefOr[java.lang.String]) => scala.Unit = null
  ): DataSet = {
    val __obj = js.Dynamic.literal(clearSelectedRecordIds = js.Any.fromFunction0(clearSelectedRecordIds), columns = columns, error = error, errorMessage = errorMessage, filtering = filtering, getSelectedRecordIds = js.Any.fromFunction0(getSelectedRecordIds), getTargetEntityType = js.Any.fromFunction0(getTargetEntityType), getTitle = js.Any.fromFunction0(getTitle), getViewId = js.Any.fromFunction0(getViewId), linking = linking, loading = loading, openDatasetItem = js.Any.fromFunction1(openDatasetItem), paging = paging, records = records, refresh = js.Any.fromFunction0(refresh), setSelectedRecordIds = js.Any.fromFunction1(setSelectedRecordIds), sortedRecordIds = sortedRecordIds, sorting = sorting)
    if (addColumn != null) __obj.updateDynamic("addColumn")(js.Any.fromFunction2(addColumn))
    __obj.asInstanceOf[DataSet]
  }
}


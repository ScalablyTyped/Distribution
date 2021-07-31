package typings.openui5.sap.ui.model.analytics

import typings.openui5.anon.TypeofFilterType
import typings.openui5.sap.ui.model.Context
import typings.openui5.sap.ui.model.Filter
import typings.openui5.sap.ui.model.TreeBinding
import typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticalBinding
  extends StObject
     with TreeBinding {
  
  /**
    * Sets filters for matching only a subset of the entities in the bound OData entity set.Invoking this
    * function resets the state of the binding. Subsequent data requests such as calls to
    * getNodeContexts() willneed to trigger OData requests in order to fetch the data that are in line
    * with these filters.
    * @param aFilter an Array of sap.ui.model.Filter objects or a single Filter instance.
    * @param sFilterType Type of the filter which should be adjusted.
    * @returns returns <code>this</code> to facilitate method chaining
    */
  def filter(aFilter: js.Array[Filter]): AnalyticalBinding = js.native
  def filter(aFilter: Filter): AnalyticalBinding = js.native
  def filter(aFilter: Filter, sFilterType: TypeofFilterType): AnalyticalBinding = js.native
  
  /**
    * Gets the analytical information for a column with a given name.
    * @param sColumnName the column name.
    * @returns analytical information for the column; see {@link #updateAnalyticalInfo}           for an
    * explanation of the object structure
    */
  def getAnalyticalInfoForColumn(sColumnName: js.Any): js.Any = js.native
  
  /**
    * Gets analytical metadata for the bound OData entity set.
    * @returns analytical metadata for the bound OData entity set
    */
  def getAnalyticalQueryResult(): QueryResult = js.native
  
  /**
    * Gets details about the dimension properties included in the bound OData entity set.
    * @returns details for every dimension property addressed by its name. The details object provides
    * these properties: name of the dimension,keyPropertyName for the name of the property holding the
    * dimension key, textPropertyName for the name of the property holding thetext for the dimension,
    * aAttributeName listing all properties holding dimension attributes, grouped as indicator whether or
    * not thisdimension is currently grouped, and analyticalInfo, which contains the binding information
    * for this dimension passed from theAnalyticalBinding's consumer via call to function
    * updateAnalyticalInfo.
    */
  def getDimensionDetails(): js.Any = js.native
  
  /**
    * Get a download URL with the specified format considering thesort/filter/custom parameters.The
    * download URL also takes into account the selected dimensions and measures,depending on the given
    * column definitions of the AnalyticalTable.This is based on the visible/inResult flags of the
    * columns, as well as integrity dependencies,e.g. for mandatory Unit properties.
    * @since 1.24
    * @param sFormat Value for the $format Parameter
    * @returns URL which can be used for downloading
    */
  def getDownloadUrl(sFormat: String): String = js.native
  
  /**
    * Gets the names of the filterable properties in the bound OData entity set.
    * @returns names of properties that can be filtered.
    */
  def getFilterablePropertyNames(): js.Array[js.Any] = js.native
  
  /**
    * Gets a printable name for a group.The printable name follows the pattern is
    * <code>&lt;label&gt;:&lt;key-value&gt;[-&lt;text-value&gt;]</code>,where <code>label</code> is the
    * label of the dimension property used at the aggregation level for the group,<code>key-value</code>
    * is the key value of that dimension for the group, and <code>text-value</code> is thevalue of the
    * associated text property, if it is also used in the binding.Whenever a formatter function has been
    * defined for a column displaying the key or text of this dimension, the return valueof this function
    * is applied for the group name instead of the respective key or text value.
    * @param oContext the parent context identifying the requested group.
    * @param iLevel the level number of oContext (because the context might occur at multiple levels)
    * @returns a printable name for the group.
    */
  def getGroupName(oContext: Context, iLevel: Double): String = js.native
  
  /**
    * Gets the total number of contexts contained in a group, if known.For a given group, be aware that
    * the group size might vary over time. In principle, this can happen if thebound set of OData entities
    * includes measure properties with amount or quantity values. The AnalyticalBindingrecognizes
    * situations where the OData service returns multiple entries for a single group entry due to the fact
    * that ameasure property cannot be aggregated properly, because an amount exists in multiple
    * currencies or a quantity existsin multiple units. In such situations, the AnalyticalBinding
    * substitutes these entries by a single representative, andthe group size gets reduced by the count of
    * duplicate entries. Finally, since the Binding does not always fetch all children ofa group at once,
    * but only a page with a certain range, such size changes might happen after every page access.
    * @param oContext the parent context identifying the requested group of child contexts.
    * @param iLevel the level number of oContext (because the context might occur at multiple levels)
    * @returns The currently known group size, or -1, if not yet determined
    */
  def getGroupSize(oContext: Context, iLevel: Double): Double = js.native
  
  /**
    * Gets details about the measure properties included in the bound OData entity set.
    * @returns details for every measure property addressed by its name. The details object provides these
    * properties: name of the measure,rawValuePropertyName for the name of the property holding the raw
    * value, unitPropertyName for the name of the property holding the relatedvalue unit or currency, if
    * any, and analyticalInfo, which contains the binding information for this measure passed from
    * theAnalyticalBinding's consumer via call to function updateAnalyticalInfo.
    */
  def getMeasureDetails(): js.Any = js.native
  
  /**
    * Gets child contexts for a specified parent context.Contexts are returned in a stable order imposed
    * by thedimension property that defines this aggregation level beneath the parent context: Either a
    * sort order has been specified for this property,or the entries are returned in ascending order of
    * the values of this dimension property by default.If any of the requested data is missing, an OData
    * request will be triggered to load it.
    * @param mParameters specifying the aggregation level for which contexts shall be fetched. Supported
    * parameters are:<ul><li>oContext: parent context identifying the requested group of child
    * contexts</li><li>level: level number for oContext, because it might occur at multiple levels;
    * context with group ID <code>"/"</code> has level 0</li><li>numberOfExpandedLevels: number of child
    * levels that shall be fetched automatically</li><li>startIndex: index of first child entry to return
    * from the parent context (zero-based)</li><li>length: number of entries to return; counting begins at
    * the given start index</li><li>threshold: number of additional entries that shall be locally
    * available in the binding for subsequentaccesses to child entries of the given parent context.
    * </li></ul>
    * @returns Array containing the requested contexts of class sap.ui.model.Context, limited by the
    * number of entries contained           in the entity set at that aggregation level.           The
    * array will contain less than the requested number of contexts, if some are not locally available and
    * an OData request is           pending to fetch them. In this case, if the parameter
    * numberOfExpandedLevels > 0, the array will be completely empty.
    */
  def getNodeContexts(mParameters: js.Any): js.Array[js.Any] = js.native
  
  /**
    * Gets the metadata of a property with a given name.
    * @param sPropertyName The property name.
    */
  def getProperty(sPropertyName: String): js.Any = js.native
  
  /**
    * Gets the label of a property with a given name.
    * @param sPropertyName The property name.
    * @returns The heading maintained for this property or null if it does not exist.
    */
  def getPropertyHeading(sPropertyName: String): String = js.native
  
  /**
    * Gets the label of a property with a given name.
    * @param sPropertyName The property name.
    * @returns The label maintained for this property or null if it does not exist.
    */
  def getPropertyLabel(sPropertyName: String): String = js.native
  
  /**
    * Gets the quick info of a property with a given name.
    * @param sPropertyName The property name.
    * @returns The quick info maintained for this property or null if it does not exist.
    */
  def getPropertyQuickInfo(sPropertyName: String): String = js.native
  
  /**
    * Gets the context for the root aggregation level representing the grand total for all bound measure
    * properties.The context is assigned to parent group ID <code>null</code>. If the binding is
    * configured not to provide a grand total,this context is empty. If data for this context is not
    * locally available yet, an OData request will be triggered to load it.This function must be called
    * whenever the bound set of OData entities changes, e.g., by changing selected dimensions,modifying
    * filter conditions, etc.
    * @param mParameters specifying how the top-most aggregation level shall be fetched. Supported
    * parameters are:<ul><li>numberOfExpandedLevels: number of child levels that shall be fetched
    * automatically</li><li>startIndex: index of first entry to return from parent group ID
    * <code>"/"</code> (zero-based)</li><li>length: number of entries to return at and after the given
    * start index</li><li>threshold: number of additional entries that shall be locally available in the
    * binding for subsequentaccesses to contexts of parent group ID <code>"/"</code> or below, if
    * auto-expanding is selected</li></ul>
    * @returns Array with a single object of class sap.ui.model.Context for the root context,           or
    * an empty array if an OData request is pending to fetch requested contexts that are not yet locally
    * available.
    */
  def getRootContexts(mParameters: js.Any): js.Array[js.Any] = js.native
  
  /**
    * Gets the names of the sortable properties in the bound OData entity set.
    * @returns names of properties that can be used for sorting the result entities.
    */
  def getSortablePropertyNames(): js.Array[js.Any] = js.native
  
  /**
    * Gets the total number of entities in the bound OData entity set.Counting takes place at the lowest
    * aggregation level defined by the possible value combinations for the complete set ofdimension
    * properties included in the bound entity set. This means that intermediate aggregate entities
    * withsub-totals at higher aggregation levels are not counted.
    * @returns the total number of addressed entities in the OData entity set
    */
  def getTotalSize(): Double = js.native
  
  /**
    * Determines if the binding has the entries of a given aggregation level locally available.If so, no
    * further OData request is required to fetch any of them.
    * @param oContext the parent context identifying the aggregation level.
    * @param iLevel the level number of oContext (because the context might occur at multiple levels).
    * @returns property of sap.ui.model.analytics.AnalyticalBinding.ContextsAvailabilityStatus,indicating
    * whether all, some, or none of the entries are locally available.
    */
  def hasAvailableNodeContexts(oContext: Context, iLevel: Double): Boolean = js.native
  
  /**
    * Determines if any of the properties included in the bound OData entity set is a measure property.
    * @returns true if and only one or more properties are measure properties.
    */
  def hasMeasures(): Boolean = js.native
  
  /**
    * Determines if a given name refers to a measure property
    * @param sPropertyName The property name.
    * @returns true if and only if the bound OData entity set includes a measure property with this name.
    */
  def isMeasure(sPropertyName: String): Boolean = js.native
  
  /**
    * Loads child contexts of multiple groups.
    * @param mGroupIdRanges specifies index ranges of child contexts to be loaded for multiple groups
    * identified by their ID. A group index range is           given by an object consisting of
    * startIndex, length, threshold. For every group ID, the map holds an array of such range objects.
    */
  def loadGroups(mGroupIdRanges: js.Any): Unit = js.native
  
  /**
    * Determines if the binding has been configured to provide a grand total for the selected measure
    * properties.
    * @returns true if and only if the binding provides a context for the grand totals of all selected
    * measure properties.
    */
  def providesGrandTotal(): Boolean = js.native
  
  /**
    * Updates the binding's structure with new analytical information.Analytical information is the
    * mapping of UI columns to properties in the bound OData entity set. Every column object containsthe
    * name of the bound property and in addition:<ol>  <li>A column bound to a dimension property has
    * further boolean properties:    <ul>      <li>grouped: dimension will be used for building
    * groups</li>      <li>visible: if the column is visible, values for the related property will be
    * fetched from the OData service</li>      <li>inResult: if the column is not visible, but declared to
    * be part of the result, values for the related property      will also be fetched from the OData
    * service</li>    </ul>  </li>  <li>A column bound to a measure property has further boolean
    * properties:    <ul>      <li>total: totals and sub-totals will be provided for the measure at all
    * aggregation levels</li>    </ul>  </li></ol>Invoking this function resets the state of the binding
    * and subsequent data requests such as calls to getNodeContexts() willneed to trigger OData requests
    * in order to fetch the data that are in line with this analytical information.Please be aware that a
    * call of this function might lead to additional back-end requests, as well as a control re-rendering
    * later on.Whenever possible use the API of the analytical control, instead of relying on the binding.
    * @param aColumns an array with objects holding the analytical information for every column, from left
    * to right.
    */
  def updateAnalyticalInfo(aColumns: js.Array[js.Any]): Unit = js.native
}

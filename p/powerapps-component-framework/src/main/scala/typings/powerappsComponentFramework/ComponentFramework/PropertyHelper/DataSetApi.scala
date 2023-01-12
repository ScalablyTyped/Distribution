package typings.powerappsComponentFramework.ComponentFramework.PropertyHelper

import typings.powerappsComponentFramework.ComponentFramework.EntityReference
import typings.powerappsComponentFramework.ComponentFramework.LookupValue
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Types.ConditionOperator
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Types.FilterOperator
import typings.powerappsComponentFramework.ComponentFramework.PropertyHelper.DataSetApi.Types.SortDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataSetApi {
  
  /**
    * Metadata about a column in a dataset
    */
  trait Column extends StObject {
    
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
    
    inline def apply(
      alias: String,
      dataType: String,
      displayName: String,
      name: String,
      order: Double,
      visualSizeFactor: Double
    ): Column = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], dataType = dataType.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], visualSizeFactor = visualSizeFactor.asInstanceOf[js.Any])
      __obj.asInstanceOf[Column]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Column] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDisableSorting(value: Boolean): Self = StObject.set(x, "disableSorting", value.asInstanceOf[js.Any])
      
      inline def setDisableSortingUndefined: Self = StObject.set(x, "disableSorting", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setIsHidden(value: Boolean): Self = StObject.set(x, "isHidden", value.asInstanceOf[js.Any])
      
      inline def setIsHiddenUndefined: Self = StObject.set(x, "isHidden", js.undefined)
      
      inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
      
      inline def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setVisualSizeFactor(value: Double): Self = StObject.set(x, "visualSizeFactor", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An expression used to represent a filter condition.
    */
  trait ConditionExpression extends StObject {
    
    /**
      * The name of the data-set column to apply the filter on.
      */
    var attributeName: String
    
    /**
      * The value evaluated by the condition
      */
    var conditionOperator: ConditionOperator
    
    /**
      * Entity alias name so filtering can be used on linked entities.
      */
    var entityAliasName: js.UndefOr[String] = js.undefined
    
    /**
      * The value evaluated by the condition.
      */
    var value: String | js.Array[String]
  }
  object ConditionExpression {
    
    inline def apply(attributeName: String, conditionOperator: ConditionOperator, value: String | js.Array[String]): ConditionExpression = {
      val __obj = js.Dynamic.literal(attributeName = attributeName.asInstanceOf[js.Any], conditionOperator = conditionOperator.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConditionExpression]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConditionExpression] (val x: Self) extends AnyVal {
      
      inline def setAttributeName(value: String): Self = StObject.set(x, "attributeName", value.asInstanceOf[js.Any])
      
      inline def setConditionOperator(value: ConditionOperator): Self = StObject.set(x, "conditionOperator", value.asInstanceOf[js.Any])
      
      inline def setEntityAliasName(value: String): Self = StObject.set(x, "entityAliasName", value.asInstanceOf[js.Any])
      
      inline def setEntityAliasNameUndefined: Self = StObject.set(x, "entityAliasName", js.undefined)
      
      inline def setValue(value: String | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  /**
    * Base interface for dataset record result. Supports value retrival by column name.
    */
  trait EntityRecord extends StObject {
    
    /**
      * Get the current formatted value of this record column.
      * @param columnName Column name of the record
      */
    def getFormattedValue(columnName: String): String
    
    /**
      * Get the object that encapsulates an Entity Reference as a plain object
      */
    def getNamedReference(): EntityReference
    
    /**
      * Get the record ID
      */
    def getRecordId(): String
    
    /**
      * Get the raw value of the record's column
      * @param columnName Column name of the record
      */
    def getValue(columnName: String): String | js.Date | Double | (js.Array[Double | EntityReference | LookupValue]) | Boolean | EntityReference | LookupValue
  }
  object EntityRecord {
    
    inline def apply(
      getFormattedValue: String => String,
      getNamedReference: () => EntityReference,
      getRecordId: () => String,
      getValue: String => String | js.Date | Double | (js.Array[Double | EntityReference | LookupValue]) | Boolean | EntityReference | LookupValue
    ): EntityRecord = {
      val __obj = js.Dynamic.literal(getFormattedValue = js.Any.fromFunction1(getFormattedValue), getNamedReference = js.Any.fromFunction0(getNamedReference), getRecordId = js.Any.fromFunction0(getRecordId), getValue = js.Any.fromFunction1(getValue))
      __obj.asInstanceOf[EntityRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EntityRecord] (val x: Self) extends AnyVal {
      
      inline def setGetFormattedValue(value: String => String): Self = StObject.set(x, "getFormattedValue", js.Any.fromFunction1(value))
      
      inline def setGetNamedReference(value: () => EntityReference): Self = StObject.set(x, "getNamedReference", js.Any.fromFunction0(value))
      
      inline def setGetRecordId(value: () => String): Self = StObject.set(x, "getRecordId", js.Any.fromFunction0(value))
      
      inline def setGetValue(
        value: String => String | js.Date | Double | (js.Array[Double | EntityReference | LookupValue]) | Boolean | EntityReference | LookupValue
      ): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * An expression used to represent a filter.
    */
  trait FilterExpression extends StObject {
    
    /**
      * The set of conditions associated with this filter.
      */
    var conditions: js.Array[ConditionExpression]
    
    /**
      * The operator used to combine conditions in this filter.
      */
    var filterOperator: FilterOperator
    
    /**
      * Any child filters that should be evaluated after evaluating this filter.
      */
    var filters: js.UndefOr[js.Array[FilterExpression]] = js.undefined
  }
  object FilterExpression {
    
    inline def apply(conditions: js.Array[ConditionExpression], filterOperator: FilterOperator): FilterExpression = {
      val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], filterOperator = filterOperator.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterExpression]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterExpression] (val x: Self) extends AnyVal {
      
      inline def setConditions(value: js.Array[ConditionExpression]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
      
      inline def setConditionsVarargs(value: ConditionExpression*): Self = StObject.set(x, "conditions", js.Array(value*))
      
      inline def setFilterOperator(value: FilterOperator): Self = StObject.set(x, "filterOperator", value.asInstanceOf[js.Any])
      
      inline def setFilters(value: js.Array[FilterExpression]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: FilterExpression*): Self = StObject.set(x, "filters", js.Array(value*))
    }
  }
  
  /**
    * Filter state for a dataset.
    */
  trait Filtering extends StObject {
    
    /**
      * Clears the filter associated with the data-set.
      */
    def clearFilter(): Unit
    
    /**
      * Returns the top-most filter associated with the data-set
      */
    def getFilter(): FilterExpression
    
    /**
      * Sets the top-most filter associated with the data-set
      * @param expression filter expression to be set
      */
    def setFilter(expression: FilterExpression): Unit
  }
  object Filtering {
    
    inline def apply(clearFilter: () => Unit, getFilter: () => FilterExpression, setFilter: FilterExpression => Unit): Filtering = {
      val __obj = js.Dynamic.literal(clearFilter = js.Any.fromFunction0(clearFilter), getFilter = js.Any.fromFunction0(getFilter), setFilter = js.Any.fromFunction1(setFilter))
      __obj.asInstanceOf[Filtering]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Filtering] (val x: Self) extends AnyVal {
      
      inline def setClearFilter(value: () => Unit): Self = StObject.set(x, "clearFilter", js.Any.fromFunction0(value))
      
      inline def setGetFilter(value: () => FilterExpression): Self = StObject.set(x, "getFilter", js.Any.fromFunction0(value))
      
      inline def setSetFilter(value: FilterExpression => Unit): Self = StObject.set(x, "setFilter", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Entity linking expression
    */
  trait LinkEntityExposedExpression extends StObject {
    
    /**
      * The 'alias' for the link-entity relationship
      */
    var alias: String
    
    /**
      * The 'from' attribute in the link-entity relationship
      */
    var from: String
    
    /**
      * The 'type' of the link, referred by the link-entity attribute
      */
    var linkType: String
    
    /**
      * The 'name' of the entity to link to
      */
    var name: String
    
    /**
      * The 'to' attribute in the link-entity relationship
      */
    var to: String
  }
  object LinkEntityExposedExpression {
    
    inline def apply(alias: String, from: String, linkType: String, name: String, to: String): LinkEntityExposedExpression = {
      val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], from = from.asInstanceOf[js.Any], linkType = linkType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[LinkEntityExposedExpression]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkEntityExposedExpression] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setFrom(value: String): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setLinkType(value: String): Self = StObject.set(x, "linkType", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Dataset entity linking.
    */
  trait Linking extends StObject {
    
    /**
      * Add a new linked entity relationship with the existed query primary entity
      * @param expression The new linked entity to add
      */
    def addLinkedEntity(expression: LinkEntityExposedExpression): Unit
    
    /**
      * Returns all the linked entities information
      */
    def getLinkedEntities(): js.Array[LinkEntityExposedExpression]
  }
  object Linking {
    
    inline def apply(
      addLinkedEntity: LinkEntityExposedExpression => Unit,
      getLinkedEntities: () => js.Array[LinkEntityExposedExpression]
    ): Linking = {
      val __obj = js.Dynamic.literal(addLinkedEntity = js.Any.fromFunction1(addLinkedEntity), getLinkedEntities = js.Any.fromFunction0(getLinkedEntities))
      __obj.asInstanceOf[Linking]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Linking] (val x: Self) extends AnyVal {
      
      inline def setAddLinkedEntity(value: LinkEntityExposedExpression => Unit): Self = StObject.set(x, "addLinkedEntity", js.Any.fromFunction1(value))
      
      inline def setGetLinkedEntities(value: () => js.Array[LinkEntityExposedExpression]): Self = StObject.set(x, "getLinkedEntities", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Paging state for a dataset
    */
  @js.native
  trait Paging extends StObject {
    
    /**
      * The number of the first page to retrieve
      */
    var firstPageNumber: Double = js.native
    
    /**
      * Whether the result set can be paged forwards.
      */
    var hasNextPage: Boolean = js.native
    
    /**
      * Whether the result set can be paged backwards.
      */
    var hasPreviousPage: Boolean = js.native
    
    /**
      * The number of the last page to retrieve
      */
    var lastPageNumber: Double = js.native
    
    /**
      * Request the exact page of results to be loaded.
      * @param pageNumber exact page to be loaded.
      */
    def loadExactPage(pageNumber: Double): Unit = js.native
    
    /**
      * Request the next page of results to be loaded. Returns results for the whole page range.
      * New data will be pushed to control in another 'updateView' cycle.
      * @param loadOnlyNewPage Limits return value to only newly loaded page.
      */
    def loadNextPage(): Unit = js.native
    def loadNextPage(loadOnlyNewPage: Boolean): Unit = js.native
    
    /**
      * Request the previous page of results to be loaded. Returns results for the whole page range.
      * New data will be pushed to control in another 'updateView' cycle.
      * @param loadOnlyNewPage Limits return value to only newly loaded page.
      */
    def loadPreviousPage(): Unit = js.native
    def loadPreviousPage(loadOnlyNewPage: Boolean): Unit = js.native
    
    /**
      * The pagesize for each page retrieved
      */
    var pageSize: Double = js.native
    
    /**
      * Reload the results from the server, and reset to page 1.
      */
    def reset(): Unit = js.native
    
    /**
      * Sets the number of results to return per page on the next data refresh.
      * @param pageSize pageSize to be set.
      */
    def setPageSize(pageSize: Double): Unit = js.native
    
    /**
      * Total number of results on the server for the currently applied query.
      */
    var totalResultCount: Double = js.native
  }
  
  /**
    * Current sort status of a dataset column
    */
  trait SortStatus extends StObject {
    
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
    
    inline def apply(name: String, sortDirection: SortDirection): SortStatus = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sortDirection = sortDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[SortStatus]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SortStatus] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSortDirection(value: SortDirection): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
    }
  }
  
  object Types {
    
    /**
      * Supported Condition Operator for filtering expression condition
      * This is subset of full condition operators list defined in https://docs.microsoft.com/en-us/dotnet/api/microsoft.xrm.sdk.query.conditionoperator
      */
    /* Rewritten from type alias, can be one of: 
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`-1`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`0`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`1`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`2`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`3`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`4`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`5`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`6`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`8`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`12`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`14`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`15`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`16`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`17`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`18`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`19`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`20`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`22`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`23`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`25`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`26`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`27`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`28`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`29`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`33`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`34`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`37`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`38`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`49`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`70`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`75`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`76`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`77`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`78`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`79`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`87`
    */
    trait ConditionOperator extends StObject
    object ConditionOperator {
      
      inline def `-1`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`-1` = -1.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`-1`]
      
      inline def `0`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`0` = 0.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`0`]
      
      inline def `1`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`1` = 1.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`1`]
      
      inline def `12`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`12` = 12.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`12`]
      
      inline def `14`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`14` = 14.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`14`]
      
      inline def `15`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`15` = 15.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`15`]
      
      inline def `16`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`16` = 16.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`16`]
      
      inline def `17`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`17` = 17.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`17`]
      
      inline def `18`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`18` = 18.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`18`]
      
      inline def `19`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`19` = 19.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`19`]
      
      inline def `2`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`2` = 2.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`2`]
      
      inline def `20`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`20` = 20.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`20`]
      
      inline def `22`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`22` = 22.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`22`]
      
      inline def `23`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`23` = 23.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`23`]
      
      inline def `25`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`25` = 25.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`25`]
      
      inline def `26`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`26` = 26.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`26`]
      
      inline def `27`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`27` = 27.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`27`]
      
      inline def `28`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`28` = 28.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`28`]
      
      inline def `29`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`29` = 29.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`29`]
      
      inline def `3`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`3` = 3.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`3`]
      
      inline def `33`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`33` = 33.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`33`]
      
      inline def `34`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`34` = 34.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`34`]
      
      inline def `37`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`37` = 37.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`37`]
      
      inline def `38`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`38` = 38.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`38`]
      
      inline def `4`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`4` = 4.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`4`]
      
      inline def `49`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`49` = 49.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`49`]
      
      inline def `5`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`5` = 5.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`5`]
      
      inline def `6`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`6` = 6.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`6`]
      
      inline def `70`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`70` = 70.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`70`]
      
      inline def `75`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`75` = 75.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`75`]
      
      inline def `76`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`76` = 76.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`76`]
      
      inline def `77`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`77` = 77.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`77`]
      
      inline def `78`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`78` = 78.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`78`]
      
      inline def `79`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`79` = 79.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`79`]
      
      inline def `8`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`8` = 8.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`8`]
      
      inline def `87`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`87` = 87.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`87`]
    }
    
    /**
      * Supported Filter Operator for filtering expression linkage
      * 0 - And,
      * 1 - Or
      */
    /* Rewritten from type alias, can be one of: 
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`0`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`1`
    */
    trait FilterOperator extends StObject
    object FilterOperator {
      
      inline def `0`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`0` = 0.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`0`]
      
      inline def `1`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`1` = 1.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`1`]
    }
    
    /**
      * Column Sort Direction
      * -1 - None,
      * 0 - Ascending,
      * 1 - Descending
      */
    /* Rewritten from type alias, can be one of: 
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`-1`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`0`
      - typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`1`
    */
    trait SortDirection extends StObject
    object SortDirection {
      
      inline def `-1`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`-1` = -1.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`-1`]
      
      inline def `0`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`0` = 0.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`0`]
      
      inline def `1`: typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`1` = 1.asInstanceOf[typings.powerappsComponentFramework.powerappsComponentFrameworkInts.`1`]
    }
  }
}

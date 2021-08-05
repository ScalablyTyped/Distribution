package typings.openui5.sap.ui.model.analytics.odata4analytics

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResultRequest extends StObject {
  
  /**
    * Add one or more dimensions to the aggregation level
    * @param aDimensionName Array of dimension names to be added to the already defined          
    * aggregation level.
    */
  def addToAggregationLevel(aDimensionName: js.Any): Unit
  
  /**
    * Get the names of the dimensions included in the aggregation level
    * @returns The dimension names included in the aggregation level
    */
  def getAggregationLevel(): js.Array[js.Any]
  
  /**
    * Get details about a dimensions included in the aggregation level
    * @param sDImensionName Name of a dimension included in the aggregation level of this          
    * request, for which details shall be returned
    * @returns An object with three properties named key and text,         both with Boolean values
    * indicating whether the key and text of         this dimension are included in this request. The
    * third property         named attributes is an array of attribute names of this         dimension
    * included in this request, or null, if there are none.
    */
  def getAggregationLevelDetails(sDImensionName: js.Any): js.Any
  
  /**
    * Get the filter expression for this request.Expressions are represented by separate objects. If none
    * exists so far, anew expression object gets created.
    * @returns The filter object         associated to this request.
    */
  def getFilterExpression(): FilterExpression
  
  /**
    * Get the names of the measures included in the query result request
    * @returns The measure names included in the query result request
    */
  def getMeasureNames(): js.Array[js.Any]
  
  /**
    * Retrieves the current parametrization request
    */
  def getParameterizationRequest(): js.Any
  
  /**
    * Get the description of the query result on which this request operates on
    * @returns Description of a query         result
    */
  def getQueryResult(): QueryResult
  
  /**
    * Returns the current page boundaries as object with properties<code>start</code> and
    * <code>end</code>. If the end of the page isunbounded, <code>end</code> is null.
    * @returns the current page boundaries as object
    */
  def getResultPageBoundaries(): js.Any
  
  /**
    * Get the sort expression for this request.Expressions are represented by separate objects. If none
    * exists so far, anew expression object gets created.
    * @returns The sort object         associated to this request.
    */
  def getSortExpression(): SortExpression
  
  /**
    * Get the value of an query option for the OData request URI correspondingto this request.
    * @param sQueryOptionName Identifies the query option: $select,           $filter,$orderby ... or any
    * custom query option
    * @returns The value of the requested query option or null, if         this option is not used for the
    * OData request.
    */
  def getURIQueryOptionValue(sQueryOptionName: String): String
  
  /**
    * Get the URI to locate the entity set for the query result.
    * @param sServiceRootURI (optional) Identifies the root of the OData           service
    * @returns The resource path of the URI pointing to the entity         set. It is a relative URI
    * unless a service root is given, which         would then prefixed in order to return a complete URL.
    */
  def getURIToQueryResultEntitySet(sServiceRootURI: String): String
  
  /**
    * Get the unescaped URI to fetch the query result.
    * @param sServiceRootURI (optional) Identifies the root of the OData           service
    * @param sResourcePath (optional) OData resource path to be considered.           If provided, it
    * overwrites any parameterization object that           might have been specified separately.
    * @returns The unescaped URI that contains the OData resource path         and OData system query
    * options to express the aggregation level,         filter expression and further options.
    */
  def getURIToQueryResultEntries(sServiceRootURI: String, sResourcePath: String): String
  
  /**
    * Specify which dimension components shall be included in the query result.The settings get applied to
    * the currently defined aggregation level.
    * @param sDimensionName Name of the dimension for which the settings get applied.           Specify
    * null to apply the settings to all dimensions in the           aggregation level.
    * @param bIncludeKey Indicator whether or not to include the dimension key in the           query
    * result. Pass null to keep current setting.
    * @param bIncludeText Indicator whether or not to include the dimension text (if           available)
    * in the query result. Pass null to keep current           setting.
    * @param aAttributeName Array of dimension attribute names to be included in the           result.
    * Pass null to keep current setting. This argument is           ignored if sDimensionName is null.
    */
  def includeDimensionKeyTextAttributes(sDimensionName: js.Any, bIncludeKey: js.Any, bIncludeText: js.Any, aAttributeName: js.Any): Unit
  
  /**
    * Specify which measure components shall be included in the query result.The settings get applied to
    * the currently set measures.
    * @param sMeasureName Name of the measure for which the settings get applied.           Specify null
    * to apply the settings to all currently set           measures.
    * @param bIncludeRawValue Indicator whether or not to include the raw value in the query          
    * result. Pass null to keep current setting.
    * @param bIncludeFormattedValue Indicator whether or not to include the formatted value (if          
    * available) in the query result. Pass null to keep current           setting.
    * @param bIncludeUnit Indicator whether or not to include the unit (if available) in           the
    * query result. Pass null to keep current setting.
    */
  def includeMeasureRawFormattedValueUnit(
    sMeasureName: js.Any,
    bIncludeRawValue: js.Any,
    bIncludeFormattedValue: js.Any,
    bIncludeUnit: js.Any
  ): Unit
  
  /**
    * Remove one or more dimensions from the aggregation level. The method alsoremoved a potential sort
    * expression on the dimension.
    * @param aDimensionName Array of dimension names to be removed from the already           defined
    * aggregation level.
    */
  def removeFromAggregationLevel(aDimensionName: js.Any): Unit
  
  /**
    * Set the aggregation level for the query result request. By default, thequery result will include the
    * properties holding the keys of the givendimensions. This setting can be changed
    * usingincludeDimensionKeyTextAttributes.
    * @param aDimensionName Array of dimension names to be part of the aggregation level.           If
    * null, the aggregation level includes all dimensions, if           empty, no dimension is included.
    */
  def setAggregationLevel(aDimensionName: js.Any): Unit
  
  /**
    * Set the filter expression for this request.Expressions are represented by separate objects. Calling
    * this methodreplaces the filter object maintained by this request.
    * @param oFilter The filter object to be associated with this request.
    */
  def setFilterExpression(oFilter: FilterExpression): Unit
  
  /**
    * Set the measures to be included in the query result request. By default,the query result will
    * include the properties holding the raw values ofthe given measures. This setting can be changed
    * usingincludeMeasureRawFormattedValueUnit.
    * @param aMeasureName Array of measure names to be part of the query result request.           If
    * null, the request includes all measures, if empty, no           measure is included.
    */
  def setMeasures(aMeasureName: js.Any): Unit
  
  /**
    * Set the parameterization request required for interactions with the queryresult of parameterized
    * queries. This method provides an alternative wayto assign a parameterization request to a query
    * result request.
    * @param oParameterizationRequest Request object for interactions with the parameterization of        
    *   this query
    */
  def setParameterizationRequest(oParameterizationRequest: js.Any): Unit
  
  /**
    * Set further options to be applied for the OData request to fetch thequery result
    * @param bIncludeEntityKey Indicates whether or not the entity key           should be returned for
    * every entry in the query result.           Default is not to include it. Pass null to keep current  
    *         setting.
    * @param bIncludeCount Indicates whether or not the result shall           include a count for the
    * returned entities. Default is not to           include it. Pass null to keep current setting.
    * @param bReturnNoEntities Indicates whether or not the result shall           be empty. This will
    * translate to $top=0 in the OData request and override           any setting done with
    * setResultPageBoundaries. The default is not to           suppress entities in the result. Pass null
    * to keep current setting.           The main use case for this option is to create a request         
    *  with $inlinecount returning an entity count.
    */
  def setRequestOptions(bIncludeEntityKey: Boolean, bIncludeCount: Boolean, bReturnNoEntities: Boolean): Unit
  
  /**
    * Set the resource path to be considered for the OData request URI of thisquery request object. This
    * method provides an alternative way to assign apath comprising a parameterization. If a path is
    * provided, it overwritesany parameterization object that might have been specified separately.
    * @param sResourcePath Resource path pointing to the entity set of the query result.           Must
    * include a valid parameterization if query contains           parameters.
    */
  def setResourcePath(sResourcePath: js.Any): Unit
  
  /**
    * Specify that only a page of the query result shall be returned. A page isdescribed by its
    * boundaries, that are row numbers for the first and lastrows in the query result to be returned.
    * @param start The first row of the query result to be returned.           Numbering starts at 1.
    * Passing null is equivalent to start           with the first row.
    * @param end The last row of the query result to be returned. Passing           null is equivalent to
    * get all rows up to the end of the query           result.
    */
  def setResultPageBoundaries(start: Number, end: Number): Unit
  
  /**
    * Set the sort expression for this request.Expressions are represented by separate objects. Calling
    * this methodreplaces the sort object maintained by this request.
    * @param oSorter The sort object to be associated with this request.
    */
  def setSortExpression(oSorter: SortExpression): Unit
}
object QueryResultRequest {
  
  inline def apply(
    addToAggregationLevel: js.Any => Unit,
    getAggregationLevel: () => js.Array[js.Any],
    getAggregationLevelDetails: js.Any => js.Any,
    getFilterExpression: () => FilterExpression,
    getMeasureNames: () => js.Array[js.Any],
    getParameterizationRequest: () => js.Any,
    getQueryResult: () => QueryResult,
    getResultPageBoundaries: () => js.Any,
    getSortExpression: () => SortExpression,
    getURIQueryOptionValue: String => String,
    getURIToQueryResultEntitySet: String => String,
    getURIToQueryResultEntries: (String, String) => String,
    includeDimensionKeyTextAttributes: (js.Any, js.Any, js.Any, js.Any) => Unit,
    includeMeasureRawFormattedValueUnit: (js.Any, js.Any, js.Any, js.Any) => Unit,
    removeFromAggregationLevel: js.Any => Unit,
    setAggregationLevel: js.Any => Unit,
    setFilterExpression: FilterExpression => Unit,
    setMeasures: js.Any => Unit,
    setParameterizationRequest: js.Any => Unit,
    setRequestOptions: (Boolean, Boolean, Boolean) => Unit,
    setResourcePath: js.Any => Unit,
    setResultPageBoundaries: (Number, Number) => Unit,
    setSortExpression: SortExpression => Unit
  ): QueryResultRequest = {
    val __obj = js.Dynamic.literal(addToAggregationLevel = js.Any.fromFunction1(addToAggregationLevel), getAggregationLevel = js.Any.fromFunction0(getAggregationLevel), getAggregationLevelDetails = js.Any.fromFunction1(getAggregationLevelDetails), getFilterExpression = js.Any.fromFunction0(getFilterExpression), getMeasureNames = js.Any.fromFunction0(getMeasureNames), getParameterizationRequest = js.Any.fromFunction0(getParameterizationRequest), getQueryResult = js.Any.fromFunction0(getQueryResult), getResultPageBoundaries = js.Any.fromFunction0(getResultPageBoundaries), getSortExpression = js.Any.fromFunction0(getSortExpression), getURIQueryOptionValue = js.Any.fromFunction1(getURIQueryOptionValue), getURIToQueryResultEntitySet = js.Any.fromFunction1(getURIToQueryResultEntitySet), getURIToQueryResultEntries = js.Any.fromFunction2(getURIToQueryResultEntries), includeDimensionKeyTextAttributes = js.Any.fromFunction4(includeDimensionKeyTextAttributes), includeMeasureRawFormattedValueUnit = js.Any.fromFunction4(includeMeasureRawFormattedValueUnit), removeFromAggregationLevel = js.Any.fromFunction1(removeFromAggregationLevel), setAggregationLevel = js.Any.fromFunction1(setAggregationLevel), setFilterExpression = js.Any.fromFunction1(setFilterExpression), setMeasures = js.Any.fromFunction1(setMeasures), setParameterizationRequest = js.Any.fromFunction1(setParameterizationRequest), setRequestOptions = js.Any.fromFunction3(setRequestOptions), setResourcePath = js.Any.fromFunction1(setResourcePath), setResultPageBoundaries = js.Any.fromFunction2(setResultPageBoundaries), setSortExpression = js.Any.fromFunction1(setSortExpression))
    __obj.asInstanceOf[QueryResultRequest]
  }
  
  extension [Self <: QueryResultRequest](x: Self) {
    
    inline def setAddToAggregationLevel(value: js.Any => Unit): Self = StObject.set(x, "addToAggregationLevel", js.Any.fromFunction1(value))
    
    inline def setGetAggregationLevel(value: () => js.Array[js.Any]): Self = StObject.set(x, "getAggregationLevel", js.Any.fromFunction0(value))
    
    inline def setGetAggregationLevelDetails(value: js.Any => js.Any): Self = StObject.set(x, "getAggregationLevelDetails", js.Any.fromFunction1(value))
    
    inline def setGetFilterExpression(value: () => FilterExpression): Self = StObject.set(x, "getFilterExpression", js.Any.fromFunction0(value))
    
    inline def setGetMeasureNames(value: () => js.Array[js.Any]): Self = StObject.set(x, "getMeasureNames", js.Any.fromFunction0(value))
    
    inline def setGetParameterizationRequest(value: () => js.Any): Self = StObject.set(x, "getParameterizationRequest", js.Any.fromFunction0(value))
    
    inline def setGetQueryResult(value: () => QueryResult): Self = StObject.set(x, "getQueryResult", js.Any.fromFunction0(value))
    
    inline def setGetResultPageBoundaries(value: () => js.Any): Self = StObject.set(x, "getResultPageBoundaries", js.Any.fromFunction0(value))
    
    inline def setGetSortExpression(value: () => SortExpression): Self = StObject.set(x, "getSortExpression", js.Any.fromFunction0(value))
    
    inline def setGetURIQueryOptionValue(value: String => String): Self = StObject.set(x, "getURIQueryOptionValue", js.Any.fromFunction1(value))
    
    inline def setGetURIToQueryResultEntitySet(value: String => String): Self = StObject.set(x, "getURIToQueryResultEntitySet", js.Any.fromFunction1(value))
    
    inline def setGetURIToQueryResultEntries(value: (String, String) => String): Self = StObject.set(x, "getURIToQueryResultEntries", js.Any.fromFunction2(value))
    
    inline def setIncludeDimensionKeyTextAttributes(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "includeDimensionKeyTextAttributes", js.Any.fromFunction4(value))
    
    inline def setIncludeMeasureRawFormattedValueUnit(value: (js.Any, js.Any, js.Any, js.Any) => Unit): Self = StObject.set(x, "includeMeasureRawFormattedValueUnit", js.Any.fromFunction4(value))
    
    inline def setRemoveFromAggregationLevel(value: js.Any => Unit): Self = StObject.set(x, "removeFromAggregationLevel", js.Any.fromFunction1(value))
    
    inline def setSetAggregationLevel(value: js.Any => Unit): Self = StObject.set(x, "setAggregationLevel", js.Any.fromFunction1(value))
    
    inline def setSetFilterExpression(value: FilterExpression => Unit): Self = StObject.set(x, "setFilterExpression", js.Any.fromFunction1(value))
    
    inline def setSetMeasures(value: js.Any => Unit): Self = StObject.set(x, "setMeasures", js.Any.fromFunction1(value))
    
    inline def setSetParameterizationRequest(value: js.Any => Unit): Self = StObject.set(x, "setParameterizationRequest", js.Any.fromFunction1(value))
    
    inline def setSetRequestOptions(value: (Boolean, Boolean, Boolean) => Unit): Self = StObject.set(x, "setRequestOptions", js.Any.fromFunction3(value))
    
    inline def setSetResourcePath(value: js.Any => Unit): Self = StObject.set(x, "setResourcePath", js.Any.fromFunction1(value))
    
    inline def setSetResultPageBoundaries(value: (Number, Number) => Unit): Self = StObject.set(x, "setResultPageBoundaries", js.Any.fromFunction2(value))
    
    inline def setSetSortExpression(value: SortExpression => Unit): Self = StObject.set(x, "setSortExpression", js.Any.fromFunction1(value))
  }
}

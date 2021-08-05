package typings.openui5.sap.ui.model.analytics.odata4analytics

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionMemberSetRequest extends StObject {
  
  /**
    * Get the filter expression for this request.Expressions are represented by separate objects. If none
    * exists so far, anew expression object gets created.
    * @returns The filter object         associated to this request.
    */
  def getFilterExpression(): FilterExpression
  
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
    * @param sQueryOptionName Identifies the query option: $select,           $filter,... or any custom
    * query option
    * @returns The value of the requested query option or null, if         this option is not used for the
    * OData request.
    */
  def getURIQueryOptionValue(sQueryOptionName: String): String
  
  /**
    * Get the URI to locate the entity set for the dimension memebers.
    * @param sServiceRootURI (optional) Identifies the root of the OData           service
    * @returns The resource path of the URI pointing to the entity         set. It is a relative URI
    * unless a service root is given, which         would then prefixed in order to return a complete URL.
    */
  def getURIToDimensionMemberEntitySet(sServiceRootURI: String): String
  
  /**
    * Get the unescaped URI to fetch the dimension members, optionallyaugmented by text and attributes.
    * @param sServiceRootURI (optional) Identifies the root of the OData           service
    * @returns The unescaped URI that contains the OData resource path         and OData system query
    * options to express the request for the         parameter value set..
    */
  def getURIToDimensionMemberEntries(sServiceRootURI: String): String
  
  /**
    * Set the filter expression for this request.Expressions are represented by separate objects. Calling
    * this methodreplaces the filter object maintained by this request.
    * @param oFilter The filter object to be associated with this request.
    */
  def setFilterExpression(oFilter: FilterExpression): Unit
  
  /**
    * Set the parameterization request required for retrieving dimensionmembers directly from the query
    * result, if it is parameterized.
    * @param oParameterizationRequest Request object for interactions with the parameterization of        
    *   this query result
    */
  def setParameterizationRequest(oParameterizationRequest: js.Any): Unit
  
  /**
    * Set further options to be applied for the OData request
    * @param bIncludeCount Indicates whether or not the result shall           include a count for the
    * returned entities. Default is not to           include it. Pass null to keep current setting.
    */
  def setRequestOptions(bIncludeCount: Boolean): Unit
  
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
object DimensionMemberSetRequest {
  
  inline def apply(
    getFilterExpression: () => FilterExpression,
    getResultPageBoundaries: () => js.Any,
    getSortExpression: () => SortExpression,
    getURIQueryOptionValue: String => String,
    getURIToDimensionMemberEntitySet: String => String,
    getURIToDimensionMemberEntries: String => String,
    setFilterExpression: FilterExpression => Unit,
    setParameterizationRequest: js.Any => Unit,
    setRequestOptions: Boolean => Unit,
    setResultPageBoundaries: (Number, Number) => Unit,
    setSortExpression: SortExpression => Unit
  ): DimensionMemberSetRequest = {
    val __obj = js.Dynamic.literal(getFilterExpression = js.Any.fromFunction0(getFilterExpression), getResultPageBoundaries = js.Any.fromFunction0(getResultPageBoundaries), getSortExpression = js.Any.fromFunction0(getSortExpression), getURIQueryOptionValue = js.Any.fromFunction1(getURIQueryOptionValue), getURIToDimensionMemberEntitySet = js.Any.fromFunction1(getURIToDimensionMemberEntitySet), getURIToDimensionMemberEntries = js.Any.fromFunction1(getURIToDimensionMemberEntries), setFilterExpression = js.Any.fromFunction1(setFilterExpression), setParameterizationRequest = js.Any.fromFunction1(setParameterizationRequest), setRequestOptions = js.Any.fromFunction1(setRequestOptions), setResultPageBoundaries = js.Any.fromFunction2(setResultPageBoundaries), setSortExpression = js.Any.fromFunction1(setSortExpression))
    __obj.asInstanceOf[DimensionMemberSetRequest]
  }
  
  extension [Self <: DimensionMemberSetRequest](x: Self) {
    
    inline def setGetFilterExpression(value: () => FilterExpression): Self = StObject.set(x, "getFilterExpression", js.Any.fromFunction0(value))
    
    inline def setGetResultPageBoundaries(value: () => js.Any): Self = StObject.set(x, "getResultPageBoundaries", js.Any.fromFunction0(value))
    
    inline def setGetSortExpression(value: () => SortExpression): Self = StObject.set(x, "getSortExpression", js.Any.fromFunction0(value))
    
    inline def setGetURIQueryOptionValue(value: String => String): Self = StObject.set(x, "getURIQueryOptionValue", js.Any.fromFunction1(value))
    
    inline def setGetURIToDimensionMemberEntitySet(value: String => String): Self = StObject.set(x, "getURIToDimensionMemberEntitySet", js.Any.fromFunction1(value))
    
    inline def setGetURIToDimensionMemberEntries(value: String => String): Self = StObject.set(x, "getURIToDimensionMemberEntries", js.Any.fromFunction1(value))
    
    inline def setSetFilterExpression(value: FilterExpression => Unit): Self = StObject.set(x, "setFilterExpression", js.Any.fromFunction1(value))
    
    inline def setSetParameterizationRequest(value: js.Any => Unit): Self = StObject.set(x, "setParameterizationRequest", js.Any.fromFunction1(value))
    
    inline def setSetRequestOptions(value: Boolean => Unit): Self = StObject.set(x, "setRequestOptions", js.Any.fromFunction1(value))
    
    inline def setSetResultPageBoundaries(value: (Number, Number) => Unit): Self = StObject.set(x, "setResultPageBoundaries", js.Any.fromFunction2(value))
    
    inline def setSetSortExpression(value: SortExpression => Unit): Self = StObject.set(x, "setSortExpression", js.Any.fromFunction1(value))
  }
}

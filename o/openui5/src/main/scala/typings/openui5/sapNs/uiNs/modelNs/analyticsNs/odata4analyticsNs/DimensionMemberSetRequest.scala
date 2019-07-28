package typings.openui5.sapNs.uiNs.modelNs.analyticsNs.odata4analyticsNs

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.DimensionMemberSetRequest")
@js.native
class DimensionMemberSetRequest protected () extends js.Object {
  /**
    * Create a request object for interaction with a dimension value help. Such avalue help is served by
    * either the query result entity set, in which case thereturned dimension members are limited to those
    * also used in the query resultdata. Or, the value help is populated by a master data entity set, if
    * madeavailable by the service. In this case, the result will include all validmembers for that
    * dimension.
    * @param oDimension Description of a dimension
    * @param oParameterizationRequest (optional) Request object for           interactions with the
    * parameterization of the query result or (not           yet supported) master data entity set Such an
    * object is required           if the entity set holding the dimension members includes          
    * parameters.
    * @param bUseMasterData (optional) Indicates use of master data for           determining the
    * dimension members.
    */
  def this(oDimension: Dimension, oParameterizationRequest: ParameterizationRequest, bUseMasterData: Boolean) = this()
  /**
    * Get the filter expression for this request.Expressions are represented by separate objects. If none
    * exists so far, anew expression object gets created.
    * @returns The filter object         associated to this request.
    */
  def getFilterExpression(): FilterExpression = js.native
  /**
    * Returns the current page boundaries as object with properties<code>start</code> and
    * <code>end</code>. If the end of the page isunbounded, <code>end</code> is null.
    * @returns the current page boundaries as object
    */
  def getResultPageBoundaries(): js.Any = js.native
  /**
    * Get the sort expression for this request.Expressions are represented by separate objects. If none
    * exists so far, anew expression object gets created.
    * @returns The sort object         associated to this request.
    */
  def getSortExpression(): SortExpression = js.native
  /**
    * Get the value of an query option for the OData request URI correspondingto this request.
    * @param sQueryOptionName Identifies the query option: $select,           $filter,... or any custom
    * query option
    * @returns The value of the requested query option or null, if         this option is not used for the
    * OData request.
    */
  def getURIQueryOptionValue(sQueryOptionName: String): String = js.native
  /**
    * Get the URI to locate the entity set for the dimension memebers.
    * @param sServiceRootURI (optional) Identifies the root of the OData           service
    * @returns The resource path of the URI pointing to the entity         set. It is a relative URI
    * unless a service root is given, which         would then prefixed in order to return a complete URL.
    */
  def getURIToDimensionMemberEntitySet(sServiceRootURI: String): String = js.native
  /**
    * Get the unescaped URI to fetch the dimension members, optionallyaugmented by text and attributes.
    * @param sServiceRootURI (optional) Identifies the root of the OData           service
    * @returns The unescaped URI that contains the OData resource path         and OData system query
    * options to express the request for the         parameter value set..
    */
  def getURIToDimensionMemberEntries(sServiceRootURI: String): String = js.native
  /**
    * Set the filter expression for this request.Expressions are represented by separate objects. Calling
    * this methodreplaces the filter object maintained by this request.
    * @param oFilter The filter object to be associated with this request.
    */
  def setFilterExpression(oFilter: FilterExpression): Unit = js.native
  /**
    * Set the parameterization request required for retrieving dimensionmembers directly from the query
    * result, if it is parameterized.
    * @param oParameterizationRequest Request object for interactions with the parameterization of        
    *   this query result
    */
  def setParameterizationRequest(oParameterizationRequest: js.Any): Unit = js.native
  /**
    * Set further options to be applied for the OData request
    * @param bIncludeCount Indicates whether or not the result shall           include a count for the
    * returned entities. Default is not to           include it. Pass null to keep current setting.
    */
  def setRequestOptions(bIncludeCount: Boolean): Unit = js.native
  /**
    * Specify that only a page of the query result shall be returned. A page isdescribed by its
    * boundaries, that are row numbers for the first and lastrows in the query result to be returned.
    * @param start The first row of the query result to be returned.           Numbering starts at 1.
    * Passing null is equivalent to start           with the first row.
    * @param end The last row of the query result to be returned. Passing           null is equivalent to
    * get all rows up to the end of the query           result.
    */
  def setResultPageBoundaries(start: Number, end: Number): Unit = js.native
  /**
    * Set the sort expression for this request.Expressions are represented by separate objects. Calling
    * this methodreplaces the sort object maintained by this request.
    * @param oSorter The sort object to be associated with this request.
    */
  def setSortExpression(oSorter: SortExpression): Unit = js.native
}


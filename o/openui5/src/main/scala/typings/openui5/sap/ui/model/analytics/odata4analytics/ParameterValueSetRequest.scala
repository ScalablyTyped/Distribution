package typings.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterValueSetRequest extends js.Object {
  /**
    * Get the filter expression for this request.Expressions are represented by separate objects. If none
    * exists so far, anew expression object gets created.
    * @returns The filter object         associated to this request.
    */
  def getFilterExpression(): FilterExpression
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
    * Get the unescaped URI to fetch the parameter value set.
    * @param sServiceRootURI (optional) Identifies the root of the OData           service
    * @returns The unescaped URI that contains the OData resource path         and OData system query
    * options to express the request for the         parameter value set..
    */
  def getURIToParameterValueSetEntries(sServiceRootURI: String): String
  /**
    * Specify which components of the parameter shall be included in the valueset.
    * @param bIncludeText Indicator whether or not to include the parameter text (if           available)
    * in the value set. Pass null to keep current           setting.
    */
  def includeParameterText(bIncludeText: js.Any): Unit
  /**
    * Set the filter expression for this request.Expressions are represented by separate objects. Calling
    * this methodreplaces the filter object maintained by this request.
    * @param oFilter The filter object to be associated with this request.
    */
  def setFilterExpression(oFilter: FilterExpression): Unit
  /**
    * Set the sort expression for this request.Expressions are represented by separate objects. Calling
    * this methodreplaces the sort object maintained by this request.
    * @param oSorter The sort object to be associated with this request.
    */
  def setSortExpression(oSorter: SortExpression): Unit
}

object ParameterValueSetRequest {
  @scala.inline
  def apply(
    getFilterExpression: () => FilterExpression,
    getSortExpression: () => SortExpression,
    getURIQueryOptionValue: String => String,
    getURIToParameterValueSetEntries: String => String,
    includeParameterText: js.Any => Unit,
    setFilterExpression: FilterExpression => Unit,
    setSortExpression: SortExpression => Unit
  ): ParameterValueSetRequest = {
    val __obj = js.Dynamic.literal(getFilterExpression = js.Any.fromFunction0(getFilterExpression), getSortExpression = js.Any.fromFunction0(getSortExpression), getURIQueryOptionValue = js.Any.fromFunction1(getURIQueryOptionValue), getURIToParameterValueSetEntries = js.Any.fromFunction1(getURIToParameterValueSetEntries), includeParameterText = js.Any.fromFunction1(includeParameterText), setFilterExpression = js.Any.fromFunction1(setFilterExpression), setSortExpression = js.Any.fromFunction1(setSortExpression))
    __obj.asInstanceOf[ParameterValueSetRequest]
  }
}


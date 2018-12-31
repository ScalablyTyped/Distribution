package typings
package openui5Lib.sapNs.uiNs.modelNs.analyticsNs.odata4analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.SortExpression")
@js.native
class SortExpression protected () extends js.Object {
  /**
    * Create a representation of an order by expression for a given entity type. Itcan be rendered as
    * value for the $orderby system query option.
    * @param oModel DataJS object for the OData model containing this entity           type
    * @param oSchema DataJS object for the schema containing this entity type
    * @param oEntityType object for the entity type
    */
  def this(oModel: js.Any, oSchema: js.Any, oEntityType: EntityType) = this()
  /**
    * Add a condition to the order by expression. It replaces any previously specifiedsort order for the
    * property.
    * @param sPropertyName The name of the property bound in the condition
    * @param sSortOrder sorting order used for the condition
    * @returns This object for method         chaining
    */
  def addSorter(sPropertyName: java.lang.String, sSortOrder: js.Any): SortExpression = js.native
  /**
    * Clear expression from any sort conditions that may have been setpreviously
    */
  def clear(): scala.Unit = js.native
  /**
    * Get description for this entity type
    * @returns The object representing the         entity type
    */
  def getEntityType(): EntityType = js.native
  /**
    * Get the first SAPUI5 Sorter object.
    * @returns first sorter object or null if empty
    */
  def getExpressionAsUI5Sorter(): openui5Lib.sapNs.uiNs.modelNs.Sorter = js.native
  /**
    * Get an array of SAPUI5 Sorter objects corresponding to this expression.
    * @returns List of sorter objects representing         this expression
    */
  def getExpressionsAsUI5SorterArray(): js.Array[openui5Lib.sapNs.uiNs.modelNs.Sorter] = js.native
  /**
    * Get the value for the OData system query option $orderby corresponding tothis expression.
    * @param oSelectedPropertyNames Object with properties requested for $select
    * @returns The $orderby value for the sort expressions
    */
  def getURIOrderByOptionValue(oSelectedPropertyNames: js.Any): java.lang.String = js.native
  /**
    * Removes the order by expression for the given property name from the listof order by expression. If
    * no order by expression with this property nameexists the method does nothing.
    * @param sPropertyName The name of the property to be removed from the           condition
    */
  def removeSorter(sPropertyName: java.lang.String): scala.Unit = js.native
}


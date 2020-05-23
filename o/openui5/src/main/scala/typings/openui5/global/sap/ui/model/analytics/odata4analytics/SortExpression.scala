package typings.openui5.global.sap.ui.model.analytics.odata4analytics

import typings.openui5.sap.ui.model.Sorter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.SortExpression")
@js.native
class SortExpression protected ()
  extends typings.openui5.sap.ui.model.analytics.odata4analytics.SortExpression {
  /**
    * Create a representation of an order by expression for a given entity type. Itcan be rendered as
    * value for the $orderby system query option.
    * @param oModel DataJS object for the OData model containing this entity           type
    * @param oSchema DataJS object for the schema containing this entity type
    * @param oEntityType object for the entity type
    */
  def this(
    oModel: js.Any,
    oSchema: js.Any,
    oEntityType: typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType
  ) = this()
  /**
    * Add a condition to the order by expression. It replaces any previously specifiedsort order for the
    * property.
    * @param sPropertyName The name of the property bound in the condition
    * @param sSortOrder sorting order used for the condition
    * @returns This object for method         chaining
    */
  /* CompleteClass */
  override def addSorter(sPropertyName: String, sSortOrder: js.Any): typings.openui5.sap.ui.model.analytics.odata4analytics.SortExpression = js.native
  /**
    * Clear expression from any sort conditions that may have been setpreviously
    */
  /* CompleteClass */
  override def clear(): Unit = js.native
  /**
    * Get description for this entity type
    * @returns The object representing the         entity type
    */
  /* CompleteClass */
  override def getEntityType(): typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType = js.native
  /**
    * Get the first SAPUI5 Sorter object.
    * @returns first sorter object or null if empty
    */
  /* CompleteClass */
  override def getExpressionAsUI5Sorter(): Sorter = js.native
  /**
    * Get an array of SAPUI5 Sorter objects corresponding to this expression.
    * @returns List of sorter objects representing         this expression
    */
  /* CompleteClass */
  override def getExpressionsAsUI5SorterArray(): js.Array[Sorter] = js.native
  /**
    * Get the value for the OData system query option $orderby corresponding tothis expression.
    * @param oSelectedPropertyNames Object with properties requested for $select
    * @returns The $orderby value for the sort expressions
    */
  /* CompleteClass */
  override def getURIOrderByOptionValue(oSelectedPropertyNames: js.Any): String = js.native
  /**
    * Removes the order by expression for the given property name from the listof order by expression. If
    * no order by expression with this property nameexists the method does nothing.
    * @param sPropertyName The name of the property to be removed from the           condition
    */
  /* CompleteClass */
  override def removeSorter(sPropertyName: String): Unit = js.native
}


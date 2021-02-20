package typings.openui5.sap.ui.model.analytics.odata4analytics

import typings.openui5.sap.ui.model.Sorter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortExpression extends StObject {
  
  /**
    * Add a condition to the order by expression. It replaces any previously specifiedsort order for the
    * property.
    * @param sPropertyName The name of the property bound in the condition
    * @param sSortOrder sorting order used for the condition
    * @returns This object for method         chaining
    */
  def addSorter(sPropertyName: String, sSortOrder: js.Any): SortExpression = js.native
  
  /**
    * Clear expression from any sort conditions that may have been setpreviously
    */
  def clear(): Unit = js.native
  
  /**
    * Get description for this entity type
    * @returns The object representing the         entity type
    */
  def getEntityType(): EntityType = js.native
  
  /**
    * Get the first SAPUI5 Sorter object.
    * @returns first sorter object or null if empty
    */
  def getExpressionAsUI5Sorter(): Sorter = js.native
  
  /**
    * Get an array of SAPUI5 Sorter objects corresponding to this expression.
    * @returns List of sorter objects representing         this expression
    */
  def getExpressionsAsUI5SorterArray(): js.Array[Sorter] = js.native
  
  /**
    * Get the value for the OData system query option $orderby corresponding tothis expression.
    * @param oSelectedPropertyNames Object with properties requested for $select
    * @returns The $orderby value for the sort expressions
    */
  def getURIOrderByOptionValue(oSelectedPropertyNames: js.Any): String = js.native
  
  /**
    * Removes the order by expression for the given property name from the listof order by expression. If
    * no order by expression with this property nameexists the method does nothing.
    * @param sPropertyName The name of the property to be removed from the           condition
    */
  def removeSorter(sPropertyName: String): Unit = js.native
}
object SortExpression {
  
  @scala.inline
  def apply(
    addSorter: (String, js.Any) => SortExpression,
    clear: () => Unit,
    getEntityType: () => EntityType,
    getExpressionAsUI5Sorter: () => Sorter,
    getExpressionsAsUI5SorterArray: () => js.Array[Sorter],
    getURIOrderByOptionValue: js.Any => String,
    removeSorter: String => Unit
  ): SortExpression = {
    val __obj = js.Dynamic.literal(addSorter = js.Any.fromFunction2(addSorter), clear = js.Any.fromFunction0(clear), getEntityType = js.Any.fromFunction0(getEntityType), getExpressionAsUI5Sorter = js.Any.fromFunction0(getExpressionAsUI5Sorter), getExpressionsAsUI5SorterArray = js.Any.fromFunction0(getExpressionsAsUI5SorterArray), getURIOrderByOptionValue = js.Any.fromFunction1(getURIOrderByOptionValue), removeSorter = js.Any.fromFunction1(removeSorter))
    __obj.asInstanceOf[SortExpression]
  }
  
  @scala.inline
  implicit class SortExpressionMutableBuilder[Self <: SortExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddSorter(value: (String, js.Any) => SortExpression): Self = StObject.set(x, "addSorter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEntityType(value: () => EntityType): Self = StObject.set(x, "getEntityType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExpressionAsUI5Sorter(value: () => Sorter): Self = StObject.set(x, "getExpressionAsUI5Sorter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetExpressionsAsUI5SorterArray(value: () => js.Array[Sorter]): Self = StObject.set(x, "getExpressionsAsUI5SorterArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetURIOrderByOptionValue(value: js.Any => String): Self = StObject.set(x, "getURIOrderByOptionValue", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveSorter(value: String => Unit): Self = StObject.set(x, "removeSorter", js.Any.fromFunction1(value))
  }
}

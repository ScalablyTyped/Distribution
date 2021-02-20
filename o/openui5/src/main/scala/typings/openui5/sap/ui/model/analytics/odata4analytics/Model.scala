package typings.openui5.sap.ui.model.analytics.odata4analytics

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends StObject {
  
  /**
    * Find analytic query result by name
    * @param sName Fully qualified name of query result entity set
    * @returns The query result object         with this name or null if it does not exist
    */
  def findQueryResultByName(sName: String): QueryResult = js.native
  
  /**
    * Get the names of all query results (entity sets) offered by the model
    * @returns List of all query result names
    */
  def getAllQueryResultNames(): js.Array[String] = js.native
  
  /**
    * Get all query results offered by the model
    * @returns An object with individual JS properties for each query         result included in the
    * model. The JS object properties all are         objects of type odata4analytics.QueryResult. The
    * names         of the JS object properties are given by the entity set names         representing the
    * query results.
    */
  def getAllQueryResults(): js.Any = js.native
  
  /**
    * Get underlying OData model provided by SAP UI5
    * @returns The SAP UI5 representation of the model.
    */
  def getODataModel(): js.Any = js.native
}
object Model {
  
  @scala.inline
  def apply(
    findQueryResultByName: String => QueryResult,
    getAllQueryResultNames: () => js.Array[String],
    getAllQueryResults: () => js.Any,
    getODataModel: () => js.Any
  ): Model = {
    val __obj = js.Dynamic.literal(findQueryResultByName = js.Any.fromFunction1(findQueryResultByName), getAllQueryResultNames = js.Any.fromFunction0(getAllQueryResultNames), getAllQueryResults = js.Any.fromFunction0(getAllQueryResults), getODataModel = js.Any.fromFunction0(getODataModel))
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelMutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFindQueryResultByName(value: String => QueryResult): Self = StObject.set(x, "findQueryResultByName", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAllQueryResultNames(value: () => js.Array[String]): Self = StObject.set(x, "getAllQueryResultNames", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetAllQueryResults(value: () => js.Any): Self = StObject.set(x, "getAllQueryResults", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetODataModel(value: () => js.Any): Self = StObject.set(x, "getODataModel", js.Any.fromFunction0(value))
  }
  
  @js.native
  trait ReferenceByModel extends StObject
  
  @js.native
  trait ReferenceByURI extends StObject
  
  @js.native
  trait ReferenceWithWorkaround extends StObject
}

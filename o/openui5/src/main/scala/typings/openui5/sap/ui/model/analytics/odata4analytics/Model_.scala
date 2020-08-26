package typings.openui5.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model_ extends js.Object {
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

object Model_ {
  @scala.inline
  def apply(
    findQueryResultByName: String => QueryResult,
    getAllQueryResultNames: () => js.Array[String],
    getAllQueryResults: () => js.Any,
    getODataModel: () => js.Any
  ): Model_ = {
    val __obj = js.Dynamic.literal(findQueryResultByName = js.Any.fromFunction1(findQueryResultByName), getAllQueryResultNames = js.Any.fromFunction0(getAllQueryResultNames), getAllQueryResults = js.Any.fromFunction0(getAllQueryResults), getODataModel = js.Any.fromFunction0(getODataModel))
    __obj.asInstanceOf[Model_]
  }
  @scala.inline
  implicit class Model_Ops[Self <: Model_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFindQueryResultByName(value: String => QueryResult): Self = this.set("findQueryResultByName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAllQueryResultNames(value: () => js.Array[String]): Self = this.set("getAllQueryResultNames", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAllQueryResults(value: () => js.Any): Self = this.set("getAllQueryResults", js.Any.fromFunction0(value))
    @scala.inline
    def setGetODataModel(value: () => js.Any): Self = this.set("getODataModel", js.Any.fromFunction0(value))
  }
  
}


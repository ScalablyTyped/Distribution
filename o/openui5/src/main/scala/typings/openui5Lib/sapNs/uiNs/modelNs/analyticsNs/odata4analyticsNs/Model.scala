package typings
package openui5Lib.sapNs.uiNs.modelNs.analyticsNs.odata4analyticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.Model")
@js.native
class Model protected () extends js.Object {
  /**
    * Create a representation of the analytical semantics of OData service metadata
    * @param oModelReference An instance of ReferenceByURI, ReferenceByModel or          
    * ReferenceWithWorkaround for locating the OData service.
    * @param mParameter Additional parameters for controlling the model construction. Currently supported
    * are:           <li> sAnnotationJSONDoc - A JSON document providing extra annotations to the elements
    * of the                structure of the given service           </li>           <li> modelVersion -
    * Parameter to define which ODataModel version should be used, in you use               
    * 'odata4analytics.Model.ReferenceByURI': 1 (default), 2                see also:
    * AnalyticalVersionInfo constants           </li>
    */
  def this(oModelReference: js.Any) = this()
  def this(oModelReference: js.Any, mParameter: js.Any) = this()
  /**
    * Find analytic query result by name
    * @param sName Fully qualified name of query result entity set
    * @returns The query result object         with this name or null if it does not exist
    */
  def findQueryResultByName(sName: java.lang.String): QueryResult = js.native
  /**
    * Get the names of all query results (entity sets) offered by the model
    * @returns List of all query result names
    */
  def getAllQueryResultNames(): js.Array[java.lang.String] = js.native
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


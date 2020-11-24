package typings.openui5.global.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.model.analytics.odata4analytics.QueryResultRequest")
@js.native
class QueryResultRequest protected ()
  extends typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResultRequest {
  /**
    * Create a request object for interaction with a query result.
    * @param oQueryResult Description of a query parameterization
    * @param oParameterizationRequest Request object for           interactions with the parameterization
    * of this query. Only           required if the query service includes parameters.
    */
  def this(oQueryResult: typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult) = this()
  def this(
    oQueryResult: typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult,
    oParameterizationRequest: typings.openui5.sap.ui.model.analytics.odata4analytics.ParameterizationRequest
  ) = this()
}

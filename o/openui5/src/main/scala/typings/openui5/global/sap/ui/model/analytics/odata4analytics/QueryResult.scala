package typings.openui5.global.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.QueryResult")
@js.native
class QueryResult protected ()
  extends typings.openui5.sap.ui.model.analytics.odata4analytics.QueryResult {
  /**
    * Create a representation of an analytic query. Do not create your own instances.
    * @param oModel The analytical model containing this query result entity           set
    * @param oEntityType The OData entity type for this query
    * @param oEntitySet The OData entity set for this query offered by the           OData service
    * @param oParameterization The parameterization of this query, if any
    */
  def this(
    oModel: typings.openui5.sap.ui.model.analytics.odata4analytics.Model,
    oEntityType: typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType,
    oEntitySet: typings.openui5.sap.ui.model.analytics.odata4analytics.EntitySet,
    oParameterization: typings.openui5.sap.ui.model.analytics.odata4analytics.Parameterization
  ) = this()
}


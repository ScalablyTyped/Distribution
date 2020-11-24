package typings.openui5.global.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.model.analytics.odata4analytics.DimensionMemberSetRequest")
@js.native
class DimensionMemberSetRequest protected ()
  extends typings.openui5.sap.ui.model.analytics.odata4analytics.DimensionMemberSetRequest {
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
  def this(
    oDimension: typings.openui5.sap.ui.model.analytics.odata4analytics.Dimension,
    oParameterizationRequest: typings.openui5.sap.ui.model.analytics.odata4analytics.ParameterizationRequest,
    bUseMasterData: Boolean
  ) = this()
}

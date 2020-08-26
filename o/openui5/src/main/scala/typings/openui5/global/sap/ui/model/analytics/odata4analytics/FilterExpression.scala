package typings.openui5.global.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.FilterExpression")
@js.native
class FilterExpression protected ()
  extends typings.openui5.sap.ui.model.analytics.odata4analytics.FilterExpression {
  /**
    * Create a representation of a filter expression for a given entity type. It can be rendered as value
    * for the $filter systemquery option.
    * @param oModel DataJS object for the OData model containing this entity type
    * @param oSchema DataJS object for the schema containing this entity type
    * @param oEntityType object for the entity type
    */
  def this(
    oModel: js.Any,
    oSchema: js.Any,
    oEntityType: typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType
  ) = this()
}


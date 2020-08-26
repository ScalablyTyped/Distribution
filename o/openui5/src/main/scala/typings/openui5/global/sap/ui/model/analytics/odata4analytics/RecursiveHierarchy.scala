package typings.openui5.global.sap.ui.model.analytics.odata4analytics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.analytics.odata4analytics.RecursiveHierarchy")
@js.native
class RecursiveHierarchy protected ()
  extends typings.openui5.sap.ui.model.analytics.odata4analytics.RecursiveHierarchy {
  /**
    * Create a representation of a recursive hierarchy defined on one multipleproperties in an OData
    * entity type query. Do not create your own instances.
    * @param oEntityType object for the entity type
    * @param oNodeIDProperty DataJS object for the property holding the           hierarchy node ID
    * identifying the hierarchy node to which the           OData entry belongs
    * @param oParentNodeIDProperty DataJS object for the property holding the           node ID of the
    * parent of the hierarchy node pointed to by the           value of oNodeIDProperty
    * @param oNodeLevelProperty DataJS object for the property holding the           level number for the
    * of the hierarchy node pointed to by the value           of oNodeIDProperty
    * @param oNodeValueProperty DataJS object for the property holding the data           value for the of
    * the hierarchy node pointed to by the value of           oNodeIDProperty
    */
  def this(
    oEntityType: typings.openui5.sap.ui.model.analytics.odata4analytics.EntityType,
    oNodeIDProperty: js.Any,
    oParentNodeIDProperty: js.Any,
    oNodeLevelProperty: js.Any,
    oNodeValueProperty: js.Any
  ) = this()
}


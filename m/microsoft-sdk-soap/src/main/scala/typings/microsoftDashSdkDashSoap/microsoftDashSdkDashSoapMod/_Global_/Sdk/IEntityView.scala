package typings.microsoftDashSdkDashSoap.microsoftDashSdkDashSoapMod._Global_.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEntityView extends js.Object {
  var attributes: AttributeCollection
  var entityState: EntityState
  var id: java.lang.String
  var logicalName: java.lang.String
  var relatedEntities: RelatedEntityCollection
}

object IEntityView {
  @scala.inline
  def apply(
    attributes: AttributeCollection,
    entityState: EntityState,
    id: java.lang.String,
    logicalName: java.lang.String,
    relatedEntities: RelatedEntityCollection
  ): IEntityView = {
    val __obj = js.Dynamic.literal(attributes = attributes, entityState = entityState, id = id, logicalName = logicalName, relatedEntities = relatedEntities)
  
    __obj.asInstanceOf[IEntityView]
  }
}


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
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], entityState = entityState.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], logicalName = logicalName.asInstanceOf[js.Any], relatedEntities = relatedEntities.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEntityView]
  }
}


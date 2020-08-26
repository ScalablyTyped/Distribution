package typings.microsoftSdkSoap.mod.global.Sdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEntityView extends js.Object {
  var attributes: AttributeCollection = js.native
  var entityState: EntityState = js.native
  var id: java.lang.String = js.native
  var logicalName: java.lang.String = js.native
  var relatedEntities: RelatedEntityCollection = js.native
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
  @scala.inline
  implicit class IEntityViewOps[Self <: IEntityView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttributes(value: AttributeCollection): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityState(value: EntityState): Self = this.set("entityState", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: java.lang.String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogicalName(value: java.lang.String): Self = this.set("logicalName", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelatedEntities(value: RelatedEntityCollection): Self = this.set("relatedEntities", value.asInstanceOf[js.Any])
  }
  
}


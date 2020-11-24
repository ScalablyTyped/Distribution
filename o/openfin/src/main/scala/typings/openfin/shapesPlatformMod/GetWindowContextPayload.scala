package typings.openfin.shapesPlatformMod

import typings.openfin.entityTypeMod.EntityType
import typings.openfin.shapesIdentityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetWindowContextPayload extends js.Object {
  
  var entityType: EntityType = js.native
  
  var target: Identity = js.native
}
object GetWindowContextPayload {
  
  @scala.inline
  def apply(entityType: EntityType, target: Identity): GetWindowContextPayload = {
    val __obj = js.Dynamic.literal(entityType = entityType.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWindowContextPayload]
  }
  
  @scala.inline
  implicit class GetWindowContextPayloadOps[Self <: GetWindowContextPayload] (val x: Self) extends AnyVal {
    
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
    def setEntityType(value: EntityType): Self = this.set("entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Identity): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}

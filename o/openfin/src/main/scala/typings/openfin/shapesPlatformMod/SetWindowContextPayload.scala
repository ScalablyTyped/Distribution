package typings.openfin.shapesPlatformMod

import typings.openfin.entityTypeMod.EntityType
import typings.openfin.shapesIdentityMod.Identity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetWindowContextPayload extends js.Object {
  
  var context: js.Any = js.native
  
  var entityType: EntityType = js.native
  
  var target: Identity = js.native
}
object SetWindowContextPayload {
  
  @scala.inline
  def apply(context: js.Any, entityType: EntityType, target: Identity): SetWindowContextPayload = {
    val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], entityType = entityType.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetWindowContextPayload]
  }
  
  @scala.inline
  implicit class SetWindowContextPayloadOps[Self <: SetWindowContextPayload] (val x: Self) extends AnyVal {
    
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
    def setContext(value: js.Any): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityType(value: EntityType): Self = this.set("entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: Identity): Self = this.set("target", value.asInstanceOf[js.Any])
  }
}

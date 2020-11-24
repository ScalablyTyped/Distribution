package typings.openfin.shapesIdentityMod

import typings.openfin.entityTypeMod.EntityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Identity extends js.Object {
  
  var entityType: js.UndefOr[EntityType] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var parentFrame: js.UndefOr[String] = js.native
  
  var runtimeUuid: js.UndefOr[String] = js.native
  
  var uuid: String = js.native
}
object Identity {
  
  @scala.inline
  def apply(uuid: String): Identity = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
  
  @scala.inline
  implicit class IdentityOps[Self <: Identity] (val x: Self) extends AnyVal {
    
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
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntityType(value: EntityType): Self = this.set("entityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntityType: Self = this.set("entityType", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParentFrame(value: String): Self = this.set("parentFrame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentFrame: Self = this.set("parentFrame", js.undefined)
    
    @scala.inline
    def setRuntimeUuid(value: String): Self = this.set("runtimeUuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRuntimeUuid: Self = this.set("runtimeUuid", js.undefined)
  }
}

package typings.powerappsComponentFramework.ComponentFramework

import typings.powerappsComponentFramework.anon.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An object that encapsulates an Entity Reference as a plain object suitable for storing in the state tree
  */
@js.native
trait EntityReference extends js.Object {
  
  /**
    * The entity logical name. Read-only.
    */
  var etn: js.UndefOr[String] = js.native
  
  /**
    * The record id. Read-only.
    */
  var id: Guid = js.native
  
  /**
    * The name of the entity reference. Read-only.
    */
  var name: String = js.native
}
object EntityReference {
  
  @scala.inline
  def apply(id: Guid, name: String): EntityReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityReference]
  }
  
  @scala.inline
  implicit class EntityReferenceOps[Self <: EntityReference] (val x: Self) extends AnyVal {
    
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
    def setId(value: Guid): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtn(value: String): Self = this.set("etn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEtn: Self = this.set("etn", js.undefined)
  }
}

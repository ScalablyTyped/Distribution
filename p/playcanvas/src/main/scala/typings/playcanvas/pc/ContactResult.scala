package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new ContactResult.
  * @property other - The entity that was involved in the contact with this entity.
  * @property contacts - An array of ContactPoints with the other entity.
  * @param other - The entity that was involved in the contact with this entity.
  * @param contacts - An array of ContactPoints with the other entity.
  */
@js.native
trait ContactResult extends js.Object {
  
  /**
    * An array of ContactPoints with the other entity.
    */
  var contacts: js.Array[ContactPoint] = js.native
  
  /**
    * The entity that was involved in the contact with this entity.
    */
  var other: Entity = js.native
}
object ContactResult {
  
  @scala.inline
  def apply(contacts: js.Array[ContactPoint], other: Entity): ContactResult = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactResult]
  }
  
  @scala.inline
  implicit class ContactResultOps[Self <: ContactResult] (val x: Self) extends AnyVal {
    
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
    def setContactsVarargs(value: ContactPoint*): Self = this.set("contacts", js.Array(value :_*))
    
    @scala.inline
    def setContacts(value: js.Array[ContactPoint]): Self = this.set("contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOther(value: Entity): Self = this.set("other", value.asInstanceOf[js.Any])
  }
}

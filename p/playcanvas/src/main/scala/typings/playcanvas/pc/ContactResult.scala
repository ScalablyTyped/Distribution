package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
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
trait ContactResult extends StObject {
  
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
  implicit class ContactResultMutableBuilder[Self <: ContactResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContacts(value: js.Array[ContactPoint]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactsVarargs(value: ContactPoint*): Self = StObject.set(x, "contacts", js.Array(value :_*))
    
    @scala.inline
    def setOther(value: Entity): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
  }
}

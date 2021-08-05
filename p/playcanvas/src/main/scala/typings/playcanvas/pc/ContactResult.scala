package typings.playcanvas.pc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Create a new ContactResult.
  * @property other - The entity that was involved in the contact with this entity.
  * @property contacts - An array of ContactPoints with the other entity.
  * @param other - The entity that was involved in the contact with this entity.
  * @param contacts - An array of ContactPoints with the other entity.
  */
trait ContactResult extends StObject {
  
  /**
    * An array of ContactPoints with the other entity.
    */
  var contacts: js.Array[ContactPoint]
  
  /**
    * The entity that was involved in the contact with this entity.
    */
  var other: Entity
}
object ContactResult {
  
  inline def apply(contacts: js.Array[ContactPoint], other: Entity): ContactResult = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactResult]
  }
  
  extension [Self <: ContactResult](x: Self) {
    
    inline def setContacts(value: js.Array[ContactPoint]): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsVarargs(value: ContactPoint*): Self = StObject.set(x, "contacts", js.Array(value :_*))
    
    inline def setOther(value: Entity): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
  }
}

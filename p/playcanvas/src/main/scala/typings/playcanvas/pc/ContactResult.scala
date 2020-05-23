package typings.playcanvas.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Create a new ContactResult.
  * @property other - The entity that was involved in the contact with this entity.
  * @property contacts - An array of ContactPoints with the other entity.
  * @param other - The entity that was involved in the contact with this entity.
  * @param contacts - An array of ContactPoints with the other entity.
  */
trait ContactResult extends js.Object {
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
  @scala.inline
  def apply(contacts: js.Array[ContactPoint], other: Entity): ContactResult = {
    val __obj = js.Dynamic.literal(contacts = contacts.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactResult]
  }
}


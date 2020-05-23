package typings.playcanvas.global.pc

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
@JSGlobal("pc.ContactResult")
@js.native
class ContactResult protected ()
  extends typings.playcanvas.pc.ContactResult {
  def this(other: typings.playcanvas.pc.Entity, contacts: js.Array[typings.playcanvas.pc.ContactPoint]) = this()
  /**
    * An array of ContactPoints with the other entity.
    */
  /* CompleteClass */
  override var contacts: js.Array[typings.playcanvas.pc.ContactPoint] = js.native
  /**
    * The entity that was involved in the contact with this entity.
    */
  /* CompleteClass */
  override var other: typings.playcanvas.pc.Entity = js.native
}


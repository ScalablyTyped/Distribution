package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object holding the result of a contact between two Entities.
  */
@JSImport("playcanvas", "ContactResult")
@js.native
open class ContactResult protected () extends StObject {
  /**
    * Create a new ContactResult instance.
    *
    * @param {Entity} other - The entity that was involved in the contact with this entity.
    * @param {ContactPoint[]} contacts - An array of ContactPoints with the other entity.
    * @hideconstructor
    */
  def this(other: Entity, contacts: js.Array[ContactPoint]) = this()
  
  /**
    * An array of ContactPoints with the other entity.
    *
    * @type {ContactPoint[]}
    */
  var contacts: js.Array[ContactPoint] = js.native
  
  /**
    * The entity that was involved in the contact with this entity.
    *
    * @type {Entity}
    */
  var other: Entity = js.native
}

package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofRigidBodyComponent extends StObject {
  
  /**
    * Fired when a contact occurs between two rigid bodies.
    *
    * @event RigidBodyComponent#contact
    * @param {ContactResult} result - Details of the contact between the two rigid bodies.
    */
  /**
    * Fired when two rigid bodies start touching.
    *
    * @event RigidBodyComponent#collisionstart
    * @param {ContactResult} result - Details of the contact between the two rigid bodies.
    */
  /**
    * Fired when two rigid bodies stop touching.
    *
    * @event RigidBodyComponent#collisionend
    * @param {Entity} other - The {@link Entity} that stopped touching this rigid body.
    */
  /**
    * Fired when a rigid body enters a trigger volume.
    *
    * @event RigidBodyComponent#triggerenter
    * @param {Entity} other - The {@link Entity} with trigger volume that this rigid body entered.
    */
  /**
    * Fired when a rigid body exits a trigger volume.
    *
    * @event RigidBodyComponent#triggerleave
    * @param {Entity} other - The {@link Entity} with trigger volume that this rigid body exited.
    */
  /* static member */
  def onLibraryLoaded(): Unit
}
object TypeofRigidBodyComponent {
  
  inline def apply(onLibraryLoaded: () => Unit): TypeofRigidBodyComponent = {
    val __obj = js.Dynamic.literal(onLibraryLoaded = js.Any.fromFunction0(onLibraryLoaded))
    __obj.asInstanceOf[TypeofRigidBodyComponent]
  }
  
  extension [Self <: TypeofRigidBodyComponent](x: Self) {
    
    inline def setOnLibraryLoaded(value: () => Unit): Self = StObject.set(x, "onLibraryLoaded", js.Any.fromFunction0(value))
  }
}

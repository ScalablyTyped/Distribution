package typings.phaser.Phaser.Physics.Arcade

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Arcade Physics Static Group object.
  * 
  * All Game Objects created by or added to this Group will automatically be given static Arcade Physics bodies, if they have no body.
  * 
  * Its dynamic counterpart is {@link Phaser.Physics.Arcade.Group}.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType because Already inherited */ @js.native
trait StaticGroup
  extends typings.phaser.Phaser.GameObjects.Group {
  
  /**
    * Adds a static physics body to the new group member (if it lacks one) and adds it to the simulation.
    * @param child The new group member.
    */
  def createCallbackHandler(child: GameObject): Unit = js.native
  
  /**
    * Refreshes the group.
    * @param entries The newly created group members.
    */
  def createMultipleCallbackHandler(entries: js.Array[GameObject]): Unit = js.native
  
  /**
    * The scene this group belongs to.
    */
  var physicsType: integer = js.native
  
  /**
    * Resets each Body to the position of its parent Game Object.
    * Body sizes aren't changed (use {@link Phaser.Physics.Arcade.Components.Enable#refreshBody} for that).
    */
  def refresh(): StaticGroup = js.native
  
  /**
    * Disables the group member's physics body, removing it from the simulation.
    * @param child The group member being removed.
    */
  def removeCallbackHandler(child: GameObject): Unit = js.native
  
  /**
    * The physics simulation.
    */
  var world: World = js.native
}

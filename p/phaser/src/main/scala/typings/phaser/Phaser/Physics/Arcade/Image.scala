package typings.phaser.Phaser.Physics.Arcade

import typings.phaser.Phaser.Physics.Arcade.Components.Acceleration
import typings.phaser.Phaser.Physics.Arcade.Components.Angular
import typings.phaser.Phaser.Physics.Arcade.Components.Bounce
import typings.phaser.Phaser.Physics.Arcade.Components.Debug
import typings.phaser.Phaser.Physics.Arcade.Components.Drag
import typings.phaser.Phaser.Physics.Arcade.Components.Enable
import typings.phaser.Phaser.Physics.Arcade.Components.Friction
import typings.phaser.Phaser.Physics.Arcade.Components.Gravity
import typings.phaser.Phaser.Physics.Arcade.Components.Immovable
import typings.phaser.Phaser.Physics.Arcade.Components.Mass
import typings.phaser.Phaser.Physics.Arcade.Components.Size
import typings.phaser.Phaser.Physics.Arcade.Components.Velocity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An Arcade Physics Image is an Image with an Arcade Physics body and related components.
  * The body can be dynamic or static.
  * 
  * The main difference between an Arcade Image and an Arcade Sprite is that you cannot animate an Arcade Image.
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType because Already inherited
- typings.phaser.Phaser.GameObjects.Components.Texture because var conflicts: frame, texture. Inlined  */ @js.native
trait Image
  extends typings.phaser.Phaser.GameObjects.Image
     with Acceleration
     with Angular
     with Bounce
     with Debug
     with Drag
     with Enable
     with Friction
     with Gravity
     with Immovable
     with Mass
     with Size
     with Velocity {
  
  /**
    * **DEPRECATED**: Please use `setBodySize` instead.
    * 
    * Sets the size of this physics body. Setting the size does not adjust the dimensions of the parent Game Object.
    * @param width The new width of the physics body, in pixels.
    * @param height The new height of the physics body, in pixels.
    * @param center Should the body be re-positioned so its center aligns with the parent Game Object? Default true.
    */
  /* InferMemberOverrides */
  override def setSize(width: Double, height: Double): this.type = js.native
}

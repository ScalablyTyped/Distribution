package typings.phaser.Phaser.Types.Physics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Arcade {
  /**
    * An Arcade Physics Collider Type.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.phaser.Phaser.GameObjects.GameObject
    - typings.phaser.Phaser.GameObjects.Group
    - typings.phaser.Phaser.Physics.Arcade.Sprite
    - typings.phaser.Phaser.Physics.Arcade.Image
    - typings.phaser.Phaser.Physics.Arcade.StaticGroup
    - typings.phaser.Phaser.Physics.Arcade.Group
    - typings.phaser.Phaser.Tilemaps.DynamicTilemapLayer
    - typings.phaser.Phaser.Tilemaps.StaticTilemapLayer
    - js.Array[
  typings.phaser.Phaser.Tilemaps.DynamicTilemapLayer | typings.phaser.Phaser.GameObjects.GameObject | typings.phaser.Phaser.Physics.Arcade.Group | typings.phaser.Phaser.Physics.Arcade.Image | typings.phaser.Phaser.Physics.Arcade.Sprite | typings.phaser.Phaser.Physics.Arcade.StaticGroup | typings.phaser.Phaser.Tilemaps.StaticTilemapLayer]
  */
  type ArcadeColliderType = typings.phaser.Phaser.Types.Physics.Arcade._ArcadeColliderType | (js.Array[
    typings.phaser.Phaser.Tilemaps.DynamicTilemapLayer | typings.phaser.Phaser.GameObjects.GameObject | typings.phaser.Phaser.Physics.Arcade.Group | typings.phaser.Phaser.Physics.Arcade.Image | typings.phaser.Phaser.Physics.Arcade.Sprite | typings.phaser.Phaser.Physics.Arcade.StaticGroup | typings.phaser.Phaser.Tilemaps.StaticTilemapLayer
  ])
  type PhysicsGroupConfig = typings.phaser.Phaser.Types.GameObjects.Group.GroupConfig with typings.phaser.AnonAccelerationX
}

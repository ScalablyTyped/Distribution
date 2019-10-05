package typings.phaser.Phaser.Types.Physics

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Arcade {
  import typings.phaser.Anon_AccelerationX
  import typings.phaser.Phaser.GameObjects.GameObject
  import typings.phaser.Phaser.Physics.Arcade.Group
  import typings.phaser.Phaser.Physics.Arcade.Image
  import typings.phaser.Phaser.Physics.Arcade.Sprite
  import typings.phaser.Phaser.Physics.Arcade.StaticGroup
  import typings.phaser.Phaser.Tilemaps.DynamicTilemapLayer
  import typings.phaser.Phaser.Tilemaps.StaticTilemapLayer
  import typings.phaser.Phaser.Types.GameObjects.Group.GroupConfig

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
  type ArcadeColliderType = _ArcadeColliderType | (js.Array[
    DynamicTilemapLayer | GameObject | Group | Image | Sprite | StaticGroup | StaticTilemapLayer
  ])
  type PhysicsGroupConfig = GroupConfig with Anon_AccelerationX
}

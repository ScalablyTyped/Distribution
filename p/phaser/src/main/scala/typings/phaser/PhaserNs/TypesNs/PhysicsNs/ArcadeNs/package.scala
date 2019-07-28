package typings.phaser.PhaserNs.TypesNs.PhysicsNs

import typings.phaser.Anon_AccelerationX
import typings.phaser.PhaserNs.GameObjectsNs.GameObject
import typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Group
import typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Image
import typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Sprite
import typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.StaticGroup
import typings.phaser.PhaserNs.TilemapsNs.DynamicTilemapLayer
import typings.phaser.PhaserNs.TilemapsNs.StaticTilemapLayer
import typings.phaser.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ArcadeNs {
  /**
    * An Arcade Physics Collider Type.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.phaser.PhaserNs.GameObjectsNs.GameObject
    - typings.phaser.PhaserNs.GameObjectsNs.Group
    - typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Sprite
    - typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Image
    - typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.StaticGroup
    - typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Group
    - typings.phaser.PhaserNs.TilemapsNs.DynamicTilemapLayer
    - typings.phaser.PhaserNs.TilemapsNs.StaticTilemapLayer
    - js.Array[
  typings.phaser.PhaserNs.TilemapsNs.DynamicTilemapLayer | typings.phaser.PhaserNs.GameObjectsNs.GameObject | typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Group | typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Image | typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.Sprite | typings.phaser.PhaserNs.PhysicsNs.ArcadeNs.StaticGroup | typings.phaser.PhaserNs.TilemapsNs.StaticTilemapLayer]
  */
  type ArcadeColliderType = _ArcadeColliderType | (js.Array[
    DynamicTilemapLayer | GameObject | Group | Image | Sprite | StaticGroup | StaticTilemapLayer
  ])
  type PhysicsGroupConfig = GroupConfig with Anon_AccelerationX
}

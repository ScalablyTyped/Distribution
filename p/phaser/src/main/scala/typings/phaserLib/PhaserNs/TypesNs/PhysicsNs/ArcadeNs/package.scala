package typings
package phaserLib.PhaserNs.TypesNs.PhysicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ArcadeNs {
  /**
    * An Arcade Physics Collider Type.
    */
  /* Rewritten from type alias, can be one of: 
    - phaserLib.PhaserNs.GameObjectsNs.GameObject
    - phaserLib.PhaserNs.GameObjectsNs.Group
    - phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Sprite
    - phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Image
    - phaserLib.PhaserNs.PhysicsNs.ArcadeNs.StaticGroup
    - phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Group
    - phaserLib.PhaserNs.TilemapsNs.DynamicTilemapLayer
    - phaserLib.PhaserNs.TilemapsNs.StaticTilemapLayer
    - js.Array[
  phaserLib.PhaserNs.TilemapsNs.DynamicTilemapLayer | phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Group | phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Image | phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Sprite | phaserLib.PhaserNs.PhysicsNs.ArcadeNs.StaticGroup | phaserLib.PhaserNs.TilemapsNs.StaticTilemapLayer]
  */
  type ArcadeColliderType = _ArcadeColliderType | (js.Array[
    phaserLib.PhaserNs.TilemapsNs.DynamicTilemapLayer | phaserLib.PhaserNs.GameObjectsNs.GameObject | phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Group | phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Image | phaserLib.PhaserNs.PhysicsNs.ArcadeNs.Sprite | phaserLib.PhaserNs.PhysicsNs.ArcadeNs.StaticGroup | phaserLib.PhaserNs.TilemapsNs.StaticTilemapLayer
  ])
  type PhysicsGroupConfig = phaserLib.PhaserNs.TypesNs.GameObjectsNs.GroupNs.GroupConfig with phaserLib.Anon_AccelerationX
}

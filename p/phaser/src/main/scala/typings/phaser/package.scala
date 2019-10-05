package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object phaser {
  import typings.phaser.Phaser.GameObjects.Bob
  import typings.phaser.Phaser.GameObjects.GameObject
  import typings.phaser.Phaser.GameObjects.Light
  import typings.phaser.Phaser.GameObjects.Text
  import typings.phaser.Phaser.Geom.Triangle
  import typings.phaser.Phaser.Physics.Impact.Body
  import typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer
  import typings.phaser.Phaser.Textures.Texture
  import typings.phaser.Phaser.Tilemaps.Tile

  type ArcadePhysicsCallback = js.Function2[/* object1 */ GameObject, /* object2 */ GameObject, Unit]
  type CenterFunction = js.Function1[/* triangle */ Triangle, Unit]
  type CollideCallback = js.Function3[/* body */ Body, /* other */ Body, /* axis */ String, Unit]
  type ContentLoadedCallback = js.Function0[Unit]
  type CreateCallback = js.Function2[/* bob */ Bob, /* index */ integer, Unit]
  type DataEachCallback = js.Function4[/* parent */ js.Any, /* key */ String, /* value */ js.Any, /* repeated */ js.Any, Unit]
  type EachContainerCallback[I] = js.Function2[/* item */ js.Any, /* repeated */ js.Any, Unit]
  type EachListCallback[I] = js.Function2[/* item */ I, /* repeated */ js.Any, Unit]
  type EachMapCallback[E] = js.Function2[/* key */ String, /* entry */ E, Unit]
  type EachSetCallback[E] = js.Function2[/* entry */ E, /* index */ Double, Unit]
  type EachTextureCallback = js.Function2[/* texture */ Texture, /* repeated */ js.Any, Unit]
  type EachTileCallback = js.Function3[/* value */ Tile, /* index */ integer, /* array */ js.Array[Tile], Unit]
  type FindTileCallback = js.Function3[/* value */ Tile, /* index */ integer, /* array */ js.Array[Tile], Unit]
  type LightForEach = js.Function1[/* light */ Light, Unit]
  /**
    * A custom function that will be responsible for wrapping the text.
    */
  type TextStyleWordWrapCallback = js.Function2[/* text */ String, /* textObject */ Text, Unit]
  type TilemapFilterCallback = js.Function3[/* value */ GameObject, /* index */ Double, /* array */ js.Array[GameObject], Unit]
  type TilemapFindCallback = js.Function3[/* value */ GameObject, /* index */ Double, /* array */ js.Array[GameObject], Unit]
  type WebGLContextCallback = js.Function1[/* renderer */ WebGLRenderer, Unit]
  type integer = Double
}

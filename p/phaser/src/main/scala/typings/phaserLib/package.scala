package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object phaserLib {
  type ArcadePhysicsCallback = js.Function2[
    /* object1 */ phaserLib.PhaserNs.GameObjectsNs.GameObject, 
    /* object2 */ phaserLib.PhaserNs.GameObjectsNs.GameObject, 
    scala.Unit
  ]
  type CenterFunction = js.Function1[/* triangle */ phaserLib.PhaserNs.GeomNs.Triangle, scala.Unit]
  type CollideCallback = js.Function3[
    /* body */ phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body, 
    /* other */ phaserLib.PhaserNs.PhysicsNs.ImpactNs.Body, 
    /* axis */ java.lang.String, 
    scala.Unit
  ]
  type ContentLoadedCallback = js.Function0[scala.Unit]
  type CreateCallback = js.Function2[/* bob */ phaserLib.PhaserNs.GameObjectsNs.Bob, /* index */ integer, scala.Unit]
  type DataEachCallback = js.Function4[
    /* parent */ js.Any, 
    /* key */ java.lang.String, 
    /* value */ js.Any, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type EachContainerCallback[I] = js.Function2[/* item */ js.Any, /* repeated */ js.Any, scala.Unit]
  type EachListCallback[I] = js.Function2[/* item */ I, /* repeated */ js.Any, scala.Unit]
  type EachMapCallback[E] = js.Function2[/* key */ java.lang.String, /* entry */ E, scala.Unit]
  type EachSetCallback[E] = js.Function2[/* entry */ E, /* index */ scala.Double, scala.Unit]
  type EachTextureCallback = js.Function2[
    /* texture */ phaserLib.PhaserNs.TexturesNs.Texture, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  type EachTileCallback = js.Function3[
    /* value */ phaserLib.PhaserNs.TilemapsNs.Tile, 
    /* index */ integer, 
    /* array */ js.Array[phaserLib.PhaserNs.TilemapsNs.Tile], 
    scala.Unit
  ]
  type FindTileCallback = js.Function3[
    /* value */ phaserLib.PhaserNs.TilemapsNs.Tile, 
    /* index */ integer, 
    /* array */ js.Array[phaserLib.PhaserNs.TilemapsNs.Tile], 
    scala.Unit
  ]
  type LightForEach = js.Function1[/* light */ phaserLib.PhaserNs.GameObjectsNs.Light, scala.Unit]
  /**
    * A custom function that will be responsible for wrapping the text.
    */
  type TextStyleWordWrapCallback = js.Function2[
    /* text */ java.lang.String, 
    /* textObject */ phaserLib.PhaserNs.GameObjectsNs.Text, 
    scala.Unit
  ]
  type TilemapFilterCallback = js.Function3[
    /* value */ phaserLib.PhaserNs.GameObjectsNs.GameObject, 
    /* index */ scala.Double, 
    /* array */ js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject], 
    scala.Unit
  ]
  type TilemapFindCallback = js.Function3[
    /* value */ phaserLib.PhaserNs.GameObjectsNs.GameObject, 
    /* index */ scala.Double, 
    /* array */ js.Array[phaserLib.PhaserNs.GameObjectsNs.GameObject], 
    scala.Unit
  ]
  type WebGLContextCallback = js.Function1[/* renderer */ phaserLib.PhaserNs.RendererNs.WebGLNs.WebGLRenderer, scala.Unit]
  type integer = scala.Double
}

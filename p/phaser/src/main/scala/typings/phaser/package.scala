package typings.phaser

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.Bob
import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.GameObjects.Light
import typings.phaser.Phaser.GameObjects.Text
import typings.phaser.Phaser.Geom.Triangle
import typings.phaser.Phaser.Math.Vector2
import typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer
import typings.phaser.Phaser.Tilemaps.Tile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CameraRotateCallback = js.Function3[/* camera */ Camera, /* progress */ Double, /* angle */ Double, Unit]

type CenterFunction = js.Function1[/* triangle */ Triangle, Vector2]

type ContentLoadedCallback = js.Function0[Unit]

/**
  * A filter that may be applied to a Context Choose operation.
  * 
  * 'NEW_CONTEXT_ONLY' - Prefer to only surface contexts the game has not been played in before.
  * 'INCLUDE_EXISTING_CHALLENGES' - Include the "Existing Challenges" section, which surfaces actively played-in contexts that the player is a part of.
  * 'NEW_PLAYERS_ONLY' - In sections containing individuals, prefer people who have not played the game.
  */
type ContextFilter = String

type CreateCallback = js.Function2[/* bob */ Bob, /* index */ Double, Unit]

type EachMapCallback[E] = js.Function2[/* key */ String, /* entry */ E, Boolean | Null]

type EachSetCallback[E] = js.Function2[/* entry */ E, /* index */ Double, Boolean | Null]

type EachTileCallback = js.Function3[/* value */ Tile, /* index */ Double, /* array */ js.Array[Tile], Unit]

type FindTileCallback = js.Function3[/* value */ Tile, /* index */ Double, /* array */ js.Array[Tile], Boolean]

type LightForEach = js.Function1[/* light */ Light, Unit]

/**
  * A custom function that will be responsible for wrapping the text.
  */
type TextStyleWordWrapCallback = js.Function2[/* text */ String, /* textObject */ Text, String | js.Array[String]]

/**
  * A predicate, to test each element of the array.
  */
type TilemapFilterCallback = js.Function3[/* value */ GameObject, /* index */ Double, /* array */ js.Array[GameObject], Boolean]

type TilemapFindCallback = js.Function3[/* value */ GameObject, /* index */ Double, /* array */ js.Array[GameObject], Boolean]

type WebGLContextCallback = js.Function1[/* renderer */ WebGLRenderer, Unit]

type integer = Double

package typings.phaser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ArcadePhysicsCallback = js.Function2[
/* object1 */ typings.phaser.Phaser.Types.Physics.Arcade.GameObjectWithBody, 
/* object2 */ typings.phaser.Phaser.Types.Physics.Arcade.GameObjectWithBody, 
scala.Unit]

type CameraRotateCallback = js.Function3[
/* camera */ typings.phaser.Phaser.Cameras.Scene2D.Camera, 
/* progress */ scala.Double, 
/* angle */ scala.Double, 
scala.Unit]

type CenterFunction = js.Function1[/* triangle */ typings.phaser.Phaser.Geom.Triangle, scala.Unit]

type ContentLoadedCallback = js.Function0[scala.Unit]

/**
  * A filter that may be applied to a Context Choose operation.
  * 
  * 'NEW_CONTEXT_ONLY' - Prefer to only surface contexts the game has not been played in before.
  * 'INCLUDE_EXISTING_CHALLENGES' - Include the "Existing Challenges" section, which surfaces actively played-in contexts that the player is a part of.
  * 'NEW_PLAYERS_ONLY' - In sections containing individuals, prefer people who have not played the game.
  */
type ContextFilter = java.lang.String

type CreateCallback = js.Function2[
/* bob */ typings.phaser.Phaser.GameObjects.Bob, 
/* index */ typings.phaser.integer, 
scala.Unit]

type EachMapCallback[E] = js.Function2[/* key */ java.lang.String, /* entry */ E, scala.Unit]

type EachSetCallback[E] = js.Function2[/* entry */ E, /* index */ scala.Double, scala.Unit]

type EachTileCallback = js.Function3[
/* value */ typings.phaser.Phaser.Tilemaps.Tile, 
/* index */ typings.phaser.integer, 
/* array */ js.Array[typings.phaser.Phaser.Tilemaps.Tile], 
scala.Unit]

type FindTileCallback = js.Function3[
/* value */ typings.phaser.Phaser.Tilemaps.Tile, 
/* index */ typings.phaser.integer, 
/* array */ js.Array[typings.phaser.Phaser.Tilemaps.Tile], 
scala.Unit]

type LightForEach = js.Function1[/* light */ typings.phaser.Phaser.GameObjects.Light, scala.Unit]

/**
  * A custom function that will be responsible for wrapping the text.
  */
type TextStyleWordWrapCallback = js.Function2[
/* text */ java.lang.String, 
/* textObject */ typings.phaser.Phaser.GameObjects.Text, 
scala.Unit]

type TilemapFilterCallback = js.Function3[
/* value */ typings.phaser.Phaser.GameObjects.GameObject, 
/* index */ scala.Double, 
/* array */ js.Array[typings.phaser.Phaser.GameObjects.GameObject], 
scala.Unit]

type TilemapFindCallback = js.Function3[
/* value */ typings.phaser.Phaser.GameObjects.GameObject, 
/* index */ scala.Double, 
/* array */ js.Array[typings.phaser.Phaser.GameObjects.GameObject], 
scala.Unit]

type WebGLContextCallback = js.Function1[/* renderer */ typings.phaser.Phaser.Renderer.WebGL.WebGLRenderer, scala.Unit]

type integer = scala.Double

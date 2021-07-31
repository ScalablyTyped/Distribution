package typings.phaser.phaserMod.GameObjects

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Builds a Game Object using the provided configuration object.
  * @param scene A reference to the Scene.
  * @param gameObject The initial GameObject.
  * @param config The config to build the GameObject with.
  */
@scala.inline
def BuildGameObject(
  scene: typings.phaser.Phaser.Scene,
  gameObject: typings.phaser.Phaser.GameObjects.GameObject,
  config: typings.phaser.Phaser.Types.GameObjects.GameObjectConfig
): typings.phaser.Phaser.GameObjects.GameObject = (typings.phaser.phaserMod.GameObjects.^.asInstanceOf[js.Dynamic].applyDynamic("BuildGameObject")(scene.asInstanceOf[js.Any], gameObject.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.GameObjects.GameObject]

/**
  * Adds an Animation component to a Sprite and populates it based on the given config.
  * @param sprite The sprite to add an Animation component to.
  * @param config The animation config.
  */
@scala.inline
def BuildGameObjectAnimation(sprite: typings.phaser.Phaser.GameObjects.Sprite, config: js.Object): typings.phaser.Phaser.GameObjects.Sprite = (typings.phaser.phaserMod.GameObjects.^.asInstanceOf[js.Dynamic].applyDynamic("BuildGameObjectAnimation")(sprite.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.GameObjects.Sprite]

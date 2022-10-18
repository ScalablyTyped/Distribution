package typings.phaser.mod.GameObjects

import typings.phaser.Phaser.Cameras.Scene2D.Camera
import typings.phaser.Phaser.GameObjects.Components.TransformMatrix
import typings.phaser.Phaser.Scene
import typings.phaser.Phaser.Types.GameObjects.GameObjectConfig
import typings.phaser.Phaser.Types.GameObjects.GetCalcMatrixResults
import typings.phaser.Phaser.Types.GameObjects.Text.GetTextSizeObject
import typings.phaser.Phaser.Types.GameObjects.Text.TextMetrics
import typings.phaser.mod.GameObjects.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * Builds a Game Object using the provided configuration object.
  * @param scene A reference to the Scene.
  * @param gameObject The initial GameObject.
  * @param config The config to build the GameObject with.
  */
inline def BuildGameObject(scene: Scene, gameObject: typings.phaser.Phaser.GameObjects.GameObject, config: GameObjectConfig): typings.phaser.Phaser.GameObjects.GameObject = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildGameObject")(scene.asInstanceOf[js.Any], gameObject.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.GameObjects.GameObject]

/**
  * Adds an Animation component to a Sprite and populates it based on the given config.
  * @param sprite The sprite to add an Animation component to.
  * @param config The animation config.
  */
inline def BuildGameObjectAnimation(sprite: typings.phaser.Phaser.GameObjects.Sprite, config: js.Object): typings.phaser.Phaser.GameObjects.Sprite = (^.asInstanceOf[js.Dynamic].applyDynamic("BuildGameObjectAnimation")(sprite.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typings.phaser.Phaser.GameObjects.Sprite]

/**
  * Calculates the Transform Matrix of the given Game Object and Camera, factoring in
  * the parent matrix if provided.
  * 
  * Note that the object this results contains _references_ to the Transform Matrices,
  * not new instances of them. Therefore, you should use their values immediately, or
  * copy them to your own matrix, as they will be replaced as soon as another Game
  * Object is rendered.
  * @param src The Game Object to calculate the transform matrix for.
  * @param camera The camera being used to render the Game Object.
  * @param parentMatrix The transform matrix of the parent container, if any.
  */
inline def GetCalcMatrix(src: typings.phaser.Phaser.GameObjects.GameObject, camera: Camera): GetCalcMatrixResults = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCalcMatrix")(src.asInstanceOf[js.Any], camera.asInstanceOf[js.Any])).asInstanceOf[GetCalcMatrixResults]
inline def GetCalcMatrix(src: typings.phaser.Phaser.GameObjects.GameObject, camera: Camera, parentMatrix: TransformMatrix): GetCalcMatrixResults = (^.asInstanceOf[js.Dynamic].applyDynamic("GetCalcMatrix")(src.asInstanceOf[js.Any], camera.asInstanceOf[js.Any], parentMatrix.asInstanceOf[js.Any])).asInstanceOf[GetCalcMatrixResults]

/**
  * Returns an object containing dimensions of the Text object.
  * @param text The Text object to calculate the size from.
  * @param size The Text metrics to use when calculating the size.
  * @param lines The lines of text to calculate the size from.
  */
inline def GetTextSize(text: typings.phaser.Phaser.GameObjects.Text, size: TextMetrics, lines: js.Array[String]): GetTextSizeObject = (^.asInstanceOf[js.Dynamic].applyDynamic("GetTextSize")(text.asInstanceOf[js.Any], size.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[GetTextSizeObject]

/**
  * Calculates the ascent, descent and fontSize of a given font style.
  * @param textStyle The TextStyle object to measure.
  */
inline def MeasureText(textStyle: typings.phaser.Phaser.GameObjects.TextStyle): TextMetrics = ^.asInstanceOf[js.Dynamic].applyDynamic("MeasureText")(textStyle.asInstanceOf[js.Any]).asInstanceOf[TextMetrics]

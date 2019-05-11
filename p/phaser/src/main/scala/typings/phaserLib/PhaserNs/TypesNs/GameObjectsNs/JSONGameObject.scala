package typings
package phaserLib.PhaserNs.TypesNs.GameObjectsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONGameObject extends js.Object {
  /**
    * The alpha value of the Game Object.
    */
  var alpha: scala.Double
  /**
    * Sets the Blend Mode being used by this Game Object.
    */
  var blendMode: phaserLib.integer | java.lang.String
  /**
    * The data of this Game Object.
    */
  var data: js.Object
  /**
    * The horizontally flipped state of the Game Object.
    */
  var flipX: scala.Boolean
  /**
    * The vertically flipped state of the Game Object.
    */
  var flipY: scala.Boolean
  /**
    * The frame key of this Game Object.
    */
  var frameKey: java.lang.String
  /**
    * The name of this Game Object.
    */
  var name: java.lang.String
  /**
    * The origin of this Game Object.
    */
  var origin: js.Object
  /**
    * The horizontal origin of this Game Object.
    */
  var `origin.x`: scala.Double
  /**
    * The vertical origin of this Game Object.
    */
  var `origin.y`: scala.Double
  /**
    * The angle of this Game Object in radians.
    */
  var rotation: scala.Double
  /**
    * The scale of this Game Object
    */
  var scale: js.Object
  /**
    * The horizontal scale of this Game Object.
    */
  var `scale.x`: scala.Double
  /**
    * The vertical scale of this Game Object.
    */
  var `scale.y`: scala.Double
  /**
    * The Scale Mode being used by this Game Object.
    */
  var scaleMode: phaserLib.integer
  /**
    * The texture key of this Game Object.
    */
  var textureKey: java.lang.String
  /**
    * A textual representation of this Game Object, i.e. `sprite`.
    */
  var `type`: java.lang.String
  /**
    * The visible state of the Game Object.
    */
  var visible: scala.Boolean
  /**
    * The x position of this Game Object.
    */
  var x: scala.Double
  /**
    * The y position of this Game Object.
    */
  var y: scala.Double
}

object JSONGameObject {
  @scala.inline
  def apply(
    alpha: scala.Double,
    blendMode: phaserLib.integer | java.lang.String,
    data: js.Object,
    flipX: scala.Boolean,
    flipY: scala.Boolean,
    frameKey: java.lang.String,
    name: java.lang.String,
    origin: js.Object,
    `origin.x`: scala.Double,
    `origin.y`: scala.Double,
    rotation: scala.Double,
    scale: js.Object,
    `scale.x`: scala.Double,
    `scale.y`: scala.Double,
    scaleMode: phaserLib.integer,
    textureKey: java.lang.String,
    `type`: java.lang.String,
    visible: scala.Boolean,
    x: scala.Double,
    y: scala.Double
  ): JSONGameObject = {
    val __obj = js.Dynamic.literal(alpha = alpha, blendMode = blendMode.asInstanceOf[js.Any], data = data, flipX = flipX, flipY = flipY, frameKey = frameKey, name = name, origin = origin, rotation = rotation, scale = scale, scaleMode = scaleMode, textureKey = textureKey, visible = visible, x = x, y = y)
    __obj.updateDynamic("origin.x")(`origin.x`)
    __obj.updateDynamic("origin.y")(`origin.y`)
    __obj.updateDynamic("scale.x")(`scale.x`)
    __obj.updateDynamic("scale.y")(`scale.y`)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[JSONGameObject]
  }
}


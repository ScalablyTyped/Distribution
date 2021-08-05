package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONGameObject extends StObject {
  
  /**
    * The alpha value of the Game Object.
    */
  var alpha: Double
  
  /**
    * Sets the Blend Mode being used by this Game Object.
    */
  var blendMode: integer | String
  
  /**
    * The data of this Game Object.
    */
  var data: js.Object
  
  /**
    * The horizontally flipped state of the Game Object.
    */
  var flipX: Boolean
  
  /**
    * The vertically flipped state of the Game Object.
    */
  var flipY: Boolean
  
  /**
    * The frame key of this Game Object.
    */
  var frameKey: String
  
  /**
    * The name of this Game Object.
    */
  var name: String
  
  /**
    * The origin of this Game Object.
    */
  var origin: js.Object
  
  /**
    * The horizontal origin of this Game Object.
    */
  @JSName("origin.x")
  var originDotx: Double
  
  /**
    * The vertical origin of this Game Object.
    */
  @JSName("origin.y")
  var originDoty: Double
  
  /**
    * The angle of this Game Object in radians.
    */
  var rotation: Double
  
  /**
    * The scale of this Game Object
    */
  var scale: js.Object
  
  /**
    * The horizontal scale of this Game Object.
    */
  @JSName("scale.x")
  var scaleDotx: Double
  
  /**
    * The vertical scale of this Game Object.
    */
  @JSName("scale.y")
  var scaleDoty: Double
  
  /**
    * The Scale Mode being used by this Game Object.
    */
  var scaleMode: integer
  
  /**
    * The texture key of this Game Object.
    */
  var textureKey: String
  
  /**
    * A textual representation of this Game Object, i.e. `sprite`.
    */
  var `type`: String
  
  /**
    * The visible state of the Game Object.
    */
  var visible: Boolean
  
  /**
    * The x position of this Game Object.
    */
  var x: Double
  
  /**
    * The y position of this Game Object.
    */
  var y: Double
}
object JSONGameObject {
  
  inline def apply(
    alpha: Double,
    blendMode: integer | String,
    data: js.Object,
    flipX: Boolean,
    flipY: Boolean,
    frameKey: String,
    name: String,
    origin: js.Object,
    originDotx: Double,
    originDoty: Double,
    rotation: Double,
    scale: js.Object,
    scaleDotx: Double,
    scaleDoty: Double,
    scaleMode: integer,
    textureKey: String,
    `type`: String,
    visible: Boolean,
    x: Double,
    y: Double
  ): JSONGameObject = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], frameKey = frameKey.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleMode = scaleMode.asInstanceOf[js.Any], textureKey = textureKey.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("origin.x")(originDotx.asInstanceOf[js.Any])
    __obj.updateDynamic("origin.y")(originDoty.asInstanceOf[js.Any])
    __obj.updateDynamic("scale.x")(scaleDotx.asInstanceOf[js.Any])
    __obj.updateDynamic("scale.y")(scaleDoty.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONGameObject]
  }
  
  extension [Self <: JSONGameObject](x: Self) {
    
    inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    inline def setBlendMode(value: integer | String): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
    
    inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    inline def setFrameKey(value: String): Self = StObject.set(x, "frameKey", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: js.Object): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginDotx(value: Double): Self = StObject.set(x, "origin.x", value.asInstanceOf[js.Any])
    
    inline def setOriginDoty(value: Double): Self = StObject.set(x, "origin.y", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setScale(value: js.Object): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleDotx(value: Double): Self = StObject.set(x, "scale.x", value.asInstanceOf[js.Any])
    
    inline def setScaleDoty(value: Double): Self = StObject.set(x, "scale.y", value.asInstanceOf[js.Any])
    
    inline def setScaleMode(value: integer): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
    
    inline def setTextureKey(value: String): Self = StObject.set(x, "textureKey", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}

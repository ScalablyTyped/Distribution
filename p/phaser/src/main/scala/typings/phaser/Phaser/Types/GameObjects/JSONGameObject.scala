package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JSONGameObject extends StObject {
  
  /**
    * The alpha value of the Game Object.
    */
  var alpha: Double = js.native
  
  /**
    * Sets the Blend Mode being used by this Game Object.
    */
  var blendMode: integer | String = js.native
  
  /**
    * The data of this Game Object.
    */
  var data: js.Object = js.native
  
  /**
    * The horizontally flipped state of the Game Object.
    */
  var flipX: Boolean = js.native
  
  /**
    * The vertically flipped state of the Game Object.
    */
  var flipY: Boolean = js.native
  
  /**
    * The frame key of this Game Object.
    */
  var frameKey: String = js.native
  
  /**
    * The name of this Game Object.
    */
  var name: String = js.native
  
  /**
    * The origin of this Game Object.
    */
  var origin: js.Object = js.native
  
  /**
    * The horizontal origin of this Game Object.
    */
  @JSName("origin.x")
  var originDotx: Double = js.native
  
  /**
    * The vertical origin of this Game Object.
    */
  @JSName("origin.y")
  var originDoty: Double = js.native
  
  /**
    * The angle of this Game Object in radians.
    */
  var rotation: Double = js.native
  
  /**
    * The scale of this Game Object
    */
  var scale: js.Object = js.native
  
  /**
    * The horizontal scale of this Game Object.
    */
  @JSName("scale.x")
  var scaleDotx: Double = js.native
  
  /**
    * The vertical scale of this Game Object.
    */
  @JSName("scale.y")
  var scaleDoty: Double = js.native
  
  /**
    * The Scale Mode being used by this Game Object.
    */
  var scaleMode: integer = js.native
  
  /**
    * The texture key of this Game Object.
    */
  var textureKey: String = js.native
  
  /**
    * A textual representation of this Game Object, i.e. `sprite`.
    */
  var `type`: String = js.native
  
  /**
    * The visible state of the Game Object.
    */
  var visible: Boolean = js.native
  
  /**
    * The x position of this Game Object.
    */
  var x: Double = js.native
  
  /**
    * The y position of this Game Object.
    */
  var y: Double = js.native
}
object JSONGameObject {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class JSONGameObjectMutableBuilder[Self <: JSONGameObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlendMode(value: integer | String): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFrameKey(value: String): Self = StObject.set(x, "frameKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: js.Object): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginDotx(value: Double): Self = StObject.set(x, "origin.x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOriginDoty(value: Double): Self = StObject.set(x, "origin.y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: js.Object): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleDotx(value: Double): Self = StObject.set(x, "scale.x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleDoty(value: Double): Self = StObject.set(x, "scale.y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleMode(value: integer): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextureKey(value: String): Self = StObject.set(x, "textureKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}

package typings.phaser.Phaser.Types.GameObjects.TileSprite

import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined phaser.Phaser.Types.GameObjects.GameObjectConfig & {  x :number | undefined,   y :number | undefined,   width :phaser.integer | undefined,   height :phaser.integer | undefined,   key :string | undefined,   frame :string | undefined} */
@js.native
trait TileSpriteConfig extends js.Object {
  
  /**
    * Add the GameObject to the scene.
    */
  var add: js.UndefOr[Boolean] = js.native
  
  /**
    * The alpha (opacity) of the Game Object.
    */
  var alpha: js.UndefOr[Double] = js.native
  
  /**
    * The rotation angle of the Game Object, in degrees.
    */
  var angle: js.UndefOr[Double] = js.native
  
  /**
    * The blend mode of the GameObject.
    */
  var blendMode: js.UndefOr[Double] = js.native
  
  /**
    * The depth of the GameObject.
    */
  var depth: js.UndefOr[Double] = js.native
  
  /**
    * The horizontally flipped state of the Game Object.
    */
  var flipX: js.UndefOr[Boolean] = js.native
  
  /**
    * The vertically flipped state of the Game Object.
    */
  var flipY: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional frame from the Texture this Tile Sprite is rendering with.
    */
  var frame: js.UndefOr[String] = js.native
  
  /**
    * The height of the Tile Sprite. If zero it will use the size of the texture frame.
    */
  var height: js.UndefOr[integer] = js.native
  
  /**
    * The key of the Texture this Tile Sprite will use to render with, as stored in the Texture Manager.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * The origin of the Game Object.
    */
  var origin: js.UndefOr[Double | js.Object] = js.native
  
  /**
    * The rotation angle of the Game Object, in radians.
    */
  var rotation: js.UndefOr[Double] = js.native
  
  /**
    * The scale of the GameObject.
    */
  var scale: js.UndefOr[Double | js.Object] = js.native
  
  /**
    * The scale mode of the GameObject.
    */
  var scaleMode: js.UndefOr[Double] = js.native
  
  /**
    * The scroll factor of the GameObject.
    */
  var scrollFactor: js.UndefOr[Double | js.Object] = js.native
  
  /**
    * The visible state of the Game Object.
    */
  var visible: js.UndefOr[Boolean] = js.native
  
  /**
    * The width of the Tile Sprite. If zero it will use the size of the texture frame.
    */
  var width: js.UndefOr[integer] = js.native
  
  /**
    * The x position of the Game Object.
    */
  /**
    * The x coordinate of the Tile Sprite.
    */
  var x: js.UndefOr[Double] = js.native
  
  /**
    * The y position of the Game Object.
    */
  /**
    * The y coordinate of the Tile Sprite.
    */
  var y: js.UndefOr[Double] = js.native
}
object TileSpriteConfig {
  
  @scala.inline
  def apply(): TileSpriteConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TileSpriteConfig]
  }
  
  @scala.inline
  implicit class TileSpriteConfigOps[Self <: TileSpriteConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdd(value: Boolean): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdd: Self = this.set("add", js.undefined)
    
    @scala.inline
    def setAlpha(value: Double): Self = this.set("alpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlpha: Self = this.set("alpha", js.undefined)
    
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAngle: Self = this.set("angle", js.undefined)
    
    @scala.inline
    def setBlendMode(value: Double): Self = this.set("blendMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlendMode: Self = this.set("blendMode", js.undefined)
    
    @scala.inline
    def setDepth(value: Double): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setFlipX(value: Boolean): Self = this.set("flipX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlipX: Self = this.set("flipX", js.undefined)
    
    @scala.inline
    def setFlipY(value: Boolean): Self = this.set("flipY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlipY: Self = this.set("flipY", js.undefined)
    
    @scala.inline
    def setFrame(value: String): Self = this.set("frame", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    
    @scala.inline
    def setHeight(value: integer): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setOrigin(value: Double | js.Object): Self = this.set("origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigin: Self = this.set("origin", js.undefined)
    
    @scala.inline
    def setRotation(value: Double): Self = this.set("rotation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
    
    @scala.inline
    def setScale(value: Double | js.Object): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    
    @scala.inline
    def setScaleMode(value: Double): Self = this.set("scaleMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleMode: Self = this.set("scaleMode", js.undefined)
    
    @scala.inline
    def setScrollFactor(value: Double | js.Object): Self = this.set("scrollFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollFactor: Self = this.set("scrollFactor", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
    
    @scala.inline
    def setWidth(value: integer): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX: Self = this.set("x", js.undefined)
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY: Self = this.set("y", js.undefined)
  }
}

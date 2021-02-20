package typings.phaser.Phaser.Types.GameObjects

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TileSprite {
  
  /* Inlined phaser.Phaser.Types.GameObjects.GameObjectConfig & {  x :number | undefined,   y :number | undefined,   width :phaser.integer | undefined,   height :phaser.integer | undefined,   key :string | undefined,   frame :string | undefined} */
  @js.native
  trait TileSpriteConfig extends StObject {
    
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
    implicit class TileSpriteConfigMutableBuilder[Self <: TileSpriteConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      @scala.inline
      def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlphaUndefined: Self = StObject.set(x, "alpha", js.undefined)
      
      @scala.inline
      def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setBlendMode(value: Double): Self = StObject.set(x, "blendMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlendModeUndefined: Self = StObject.set(x, "blendMode", js.undefined)
      
      @scala.inline
      def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      @scala.inline
      def setFlipX(value: Boolean): Self = StObject.set(x, "flipX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipXUndefined: Self = StObject.set(x, "flipX", js.undefined)
      
      @scala.inline
      def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
      
      @scala.inline
      def setFrame(value: String): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOrigin(value: Double | js.Object): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      @scala.inline
      def setScale(value: Double | js.Object): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleMode(value: Double): Self = StObject.set(x, "scaleMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleModeUndefined: Self = StObject.set(x, "scaleMode", js.undefined)
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setScrollFactor(value: Double | js.Object): Self = StObject.set(x, "scrollFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollFactorUndefined: Self = StObject.set(x, "scrollFactor", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}

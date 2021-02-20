package typings.phaser.Phaser.Types.GameObjects

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.phaser.Phaser.GameObjects.DynamicBitmapText
import typings.phaser.integer
import typings.phaser.phaserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BitmapText {
  
  /**
    * The font data for an individual character of a Bitmap Font.
    * 
    * Describes the character's position, size, offset and kerning.
    */
  @js.native
  trait BitmapFontCharacterData extends StObject {
    
    /**
      * The center x position of the character.
      */
    var centerX: Double = js.native
    
    /**
      * The center y position of the character.
      */
    var centerY: Double = js.native
    
    /**
      * Extra data for the character.
      */
    var data: js.Object = js.native
    
    /**
      * The height of the character.
      */
    var height: Double = js.native
    
    /**
      * Kerning values, keyed by character code.
      */
    var kerning: StringDictionary[Double] = js.native
    
    /**
      * The width of the character.
      */
    var width: Double = js.native
    
    /**
      * The x position of the character.
      */
    var x: Double = js.native
    
    /**
      * The x offset of the character.
      */
    var xOffset: Double = js.native
    
    /**
      * The y position of the character.
      */
    var y: Double = js.native
    
    /**
      * The y offset of the character.
      */
    var yOffset: Double = js.native
  }
  object BitmapFontCharacterData {
    
    @scala.inline
    def apply(
      centerX: Double,
      centerY: Double,
      data: js.Object,
      height: Double,
      kerning: StringDictionary[Double],
      width: Double,
      x: Double,
      xOffset: Double,
      y: Double,
      yOffset: Double
    ): BitmapFontCharacterData = {
      val __obj = js.Dynamic.literal(centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], kerning = kerning.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitmapFontCharacterData]
    }
    
    @scala.inline
    implicit class BitmapFontCharacterDataMutableBuilder[Self <: BitmapFontCharacterData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKerning(value: StringDictionary[Double]): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Bitmap Font data that can be used by a BitmapText Game Object.
    */
  @js.native
  trait BitmapFontData extends StObject {
    
    /**
      * The character data of the font, keyed by character code. Each character datum includes a position, size, offset and more.
      */
    var chars: NumberDictionary[BitmapFontCharacterData] = js.native
    
    /**
      * The name of the font.
      */
    var font: String = js.native
    
    /**
      * The line height of the font.
      */
    var lineHeight: Double = js.native
    
    /**
      * Whether this font is a retro font (monospace).
      */
    var retroFont: Boolean = js.native
    
    /**
      * The size of the font.
      */
    var size: Double = js.native
  }
  object BitmapFontData {
    
    @scala.inline
    def apply(
      chars: NumberDictionary[BitmapFontCharacterData],
      font: String,
      lineHeight: Double,
      retroFont: Boolean,
      size: Double
    ): BitmapFontData = {
      val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], retroFont = retroFont.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitmapFontData]
    }
    
    @scala.inline
    implicit class BitmapFontDataMutableBuilder[Self <: BitmapFontData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChars(value: NumberDictionary[BitmapFontCharacterData]): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetroFont(value: Boolean): Self = StObject.set(x, "retroFont", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined phaser.Phaser.Types.GameObjects.GameObjectConfig & {  font :string | undefined,   text :string | undefined,   size :number | false | undefined} */
  @js.native
  trait BitmapTextConfig extends StObject {
    
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
      * The key of the font to use from the BitmapFont cache.
      */
    var font: js.UndefOr[String] = js.native
    
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
      * The font size to set.
      */
    var size: js.UndefOr[Double | `false`] = js.native
    
    /**
      * The string, or array of strings, to be set as the content of this Bitmap Text.
      */
    var text: js.UndefOr[String] = js.native
    
    /**
      * The visible state of the Game Object.
      */
    var visible: js.UndefOr[Boolean] = js.native
    
    /**
      * The x position of the Game Object.
      */
    var x: js.UndefOr[Double] = js.native
    
    /**
      * The y position of the Game Object.
      */
    var y: js.UndefOr[Double] = js.native
  }
  object BitmapTextConfig {
    
    @scala.inline
    def apply(): BitmapTextConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BitmapTextConfig]
    }
    
    @scala.inline
    implicit class BitmapTextConfigMutableBuilder[Self <: BitmapTextConfig] (val x: Self) extends AnyVal {
      
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
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
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
      def setSize(value: Double | `false`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
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
  
  @js.native
  trait BitmapTextSize extends StObject {
    
    /**
      * The position and size of the BitmapText, taking into account the position and scale of the Game Object.
      */
    var global: GlobalBitmapTextSize = js.native
    
    /**
      * The position and size of the BitmapText, taking just the font size into account.
      */
    var local: LocalBitmapTextSize = js.native
  }
  object BitmapTextSize {
    
    @scala.inline
    def apply(global: GlobalBitmapTextSize, local: LocalBitmapTextSize): BitmapTextSize = {
      val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitmapTextSize]
    }
    
    @scala.inline
    implicit class BitmapTextSizeMutableBuilder[Self <: BitmapTextSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlobal(value: GlobalBitmapTextSize): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocal(value: LocalBitmapTextSize): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    }
  }
  
  type DisplayCallback = js.Function1[/* display */ DisplayCallbackConfig, Unit]
  
  @js.native
  trait DisplayCallbackConfig extends StObject {
    
    /**
      * The character code of the character being rendered.
      */
    var charCode: Double = js.native
    
    /**
      * Custom data stored with the character being rendered.
      */
    var data: js.Any = js.native
    
    /**
      * The index of the character being rendered.
      */
    var index: Double = js.native
    
    /**
      * The Dynamic Bitmap Text object that owns this character being rendered.
      */
    var parent: DynamicBitmapText = js.native
    
    /**
      * The rotation of the character being rendered.
      */
    var rotation: Double = js.native
    
    /**
      * The scale of the character being rendered.
      */
    var scale: Double = js.native
    
    /**
      * The tint of the character being rendered. Always zero in Canvas.
      */
    var tint: TintConfig = js.native
    
    /**
      * The x position of the character being rendered.
      */
    var x: Double = js.native
    
    /**
      * The y position of the character being rendered.
      */
    var y: Double = js.native
  }
  object DisplayCallbackConfig {
    
    @scala.inline
    def apply(
      charCode: Double,
      data: js.Any,
      index: Double,
      parent: DynamicBitmapText,
      rotation: Double,
      scale: Double,
      tint: TintConfig,
      x: Double,
      y: Double
    ): DisplayCallbackConfig = {
      val __obj = js.Dynamic.literal(charCode = charCode.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], tint = tint.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayCallbackConfig]
    }
    
    @scala.inline
    implicit class DisplayCallbackConfigMutableBuilder[Self <: DisplayCallbackConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCharCode(value: Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: DynamicBitmapText): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTint(value: TintConfig): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The position and size of the Bitmap Text in global space, taking into account the Game Object's scale and world position.
    */
  @js.native
  trait GlobalBitmapTextSize extends StObject {
    
    /**
      * The height of the BitmapText, taking into account the y scale of the Game Object.
      */
    var height: Double = js.native
    
    /**
      * The width of the BitmapText, taking into account the x scale of the Game Object.
      */
    var width: Double = js.native
    
    /**
      * The x position of the BitmapText, taking into account the x position and scale of the Game Object.
      */
    var x: Double = js.native
    
    /**
      * The y position of the BitmapText, taking into account the y position and scale of the Game Object.
      */
    var y: Double = js.native
  }
  object GlobalBitmapTextSize {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): GlobalBitmapTextSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalBitmapTextSize]
    }
    
    @scala.inline
    implicit class GlobalBitmapTextSizeMutableBuilder[Self <: GlobalBitmapTextSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined phaser.Phaser.Types.GameObjects.JSONGameObject & {  font :string,   text :string,   fontSize :number,   letterSpacing :number,   align :phaser.integer} */
  @js.native
  trait JSONBitmapText extends StObject {
    
    /**
      * The alignment of the text in a multi-line BitmapText object.
      */
    var align: integer = js.native
    
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
      * The name of the font.
      */
    var font: String = js.native
    
    /**
      * The size of the font.
      */
    var fontSize: Double = js.native
    
    /**
      * The frame key of this Game Object.
      */
    var frameKey: String = js.native
    
    /**
      * Adds / Removes spacing between characters.
      */
    var letterSpacing: Double = js.native
    
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
      * The text that this Bitmap Text displays.
      */
    var text: String = js.native
    
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
  object JSONBitmapText {
    
    @scala.inline
    def apply(
      align: integer,
      alpha: Double,
      blendMode: integer | String,
      data: js.Object,
      flipX: Boolean,
      flipY: Boolean,
      font: String,
      fontSize: Double,
      frameKey: String,
      letterSpacing: Double,
      name: String,
      origin: js.Object,
      originDotx: Double,
      originDoty: Double,
      rotation: Double,
      scale: js.Object,
      scaleDotx: Double,
      scaleDoty: Double,
      scaleMode: integer,
      text: String,
      textureKey: String,
      `type`: String,
      visible: Boolean,
      x: Double,
      y: Double
    ): JSONBitmapText = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], frameKey = frameKey.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleMode = scaleMode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textureKey = textureKey.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("origin.x")(originDotx.asInstanceOf[js.Any])
      __obj.updateDynamic("origin.y")(originDoty.asInstanceOf[js.Any])
      __obj.updateDynamic("scale.x")(scaleDotx.asInstanceOf[js.Any])
      __obj.updateDynamic("scale.y")(scaleDoty.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONBitmapText]
    }
    
    @scala.inline
    implicit class JSONBitmapTextMutableBuilder[Self <: JSONBitmapText] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: integer): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
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
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameKey(value: String): Self = StObject.set(x, "frameKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
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
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
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
  
  /**
    * The position and size of the Bitmap Text in local space, taking just the font size into account.
    */
  @js.native
  trait LocalBitmapTextSize extends StObject {
    
    /**
      * The height of the BitmapText.
      */
    var height: Double = js.native
    
    /**
      * The width of the BitmapText.
      */
    var width: Double = js.native
    
    /**
      * The x position of the BitmapText.
      */
    var x: Double = js.native
    
    /**
      * The y position of the BitmapText.
      */
    var y: Double = js.native
  }
  object LocalBitmapTextSize {
    
    @scala.inline
    def apply(height: Double, width: Double, x: Double, y: Double): LocalBitmapTextSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalBitmapTextSize]
    }
    
    @scala.inline
    implicit class LocalBitmapTextSizeMutableBuilder[Self <: LocalBitmapTextSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RetroFontConfig extends StObject {
    
    /**
      * The characters used in the font set, in display order. You can use the TEXT_SET consts for common font set arrangements.
      */
    var chars: String = js.native
    
    /**
      * The number of characters per row in the font set. If not given charsPerRow will be the image width / characterWidth.
      */
    var charsPerRow: Double = js.native
    
    /**
      * The height of each character in the font set.
      */
    var height: Double = js.native
    
    /**
      * The key of the image containing the font.
      */
    var image: String = js.native
    
    /**
      * The amount of vertical space to add to the line height of the font.
      */
    var lineSpacing: Double = js.native
    
    /**
      * If the font set doesn't start at the top left of the given image, specify the X coordinate offset here.
      */
    @JSName("offset.x")
    var offsetDotx: Double = js.native
    
    /**
      * If the font set doesn't start at the top left of the given image, specify the Y coordinate offset here.
      */
    @JSName("offset.y")
    var offsetDoty: Double = js.native
    
    /**
      * If the characters in the font set have horizontal spacing between them set the required amount here.
      */
    @JSName("spacing.x")
    var spacingDotx: Double = js.native
    
    /**
      * If the characters in the font set have vertical spacing between them set the required amount here.
      */
    @JSName("spacing.y")
    var spacingDoty: Double = js.native
    
    /**
      * The width of each character in the font set.
      */
    var width: Double = js.native
  }
  object RetroFontConfig {
    
    @scala.inline
    def apply(
      chars: String,
      charsPerRow: Double,
      height: Double,
      image: String,
      lineSpacing: Double,
      offsetDotx: Double,
      offsetDoty: Double,
      spacingDotx: Double,
      spacingDoty: Double,
      width: Double
    ): RetroFontConfig = {
      val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], charsPerRow = charsPerRow.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("offset.x")(offsetDotx.asInstanceOf[js.Any])
      __obj.updateDynamic("offset.y")(offsetDoty.asInstanceOf[js.Any])
      __obj.updateDynamic("spacing.x")(spacingDotx.asInstanceOf[js.Any])
      __obj.updateDynamic("spacing.y")(spacingDoty.asInstanceOf[js.Any])
      __obj.asInstanceOf[RetroFontConfig]
    }
    
    @scala.inline
    implicit class RetroFontConfigMutableBuilder[Self <: RetroFontConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChars(value: String): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharsPerRow(value: Double): Self = StObject.set(x, "charsPerRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetDotx(value: Double): Self = StObject.set(x, "offset.x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetDoty(value: Double): Self = StObject.set(x, "offset.y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingDotx(value: Double): Self = StObject.set(x, "spacing.x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacingDoty(value: Double): Self = StObject.set(x, "spacing.y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TintConfig extends StObject {
    
    /**
      * The bottom left tint value. Always zero in canvas.
      */
    var bottomLeft: Double = js.native
    
    /**
      * The bottom right tint value. Always zero in canvas.
      */
    var bottomRight: Double = js.native
    
    /**
      * The top left tint value. Always zero in canvas.
      */
    var topLeft: Double = js.native
    
    /**
      * The top right tint value. Always zero in canvas.
      */
    var topRight: Double = js.native
  }
  object TintConfig {
    
    @scala.inline
    def apply(bottomLeft: Double, bottomRight: Double, topLeft: Double, topRight: Double): TintConfig = {
      val __obj = js.Dynamic.literal(bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[TintConfig]
    }
    
    @scala.inline
    implicit class TintConfigMutableBuilder[Self <: TintConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottomLeft(value: Double): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottomRight(value: Double): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopLeft(value: Double): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopRight(value: Double): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    }
  }
}

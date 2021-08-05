package typings.phaser.Phaser.Types.GameObjects

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.phaser.Phaser.GameObjects.DynamicBitmapText
import typings.phaser.integer
import typings.phaser.phaserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BitmapText {
  
  /**
    * The font data for an individual character of a Bitmap Font.
    * 
    * Describes the character's position, size, offset and kerning.
    */
  trait BitmapFontCharacterData extends StObject {
    
    /**
      * The center x position of the character.
      */
    var centerX: Double
    
    /**
      * The center y position of the character.
      */
    var centerY: Double
    
    /**
      * Extra data for the character.
      */
    var data: js.Object
    
    /**
      * The height of the character.
      */
    var height: Double
    
    /**
      * Kerning values, keyed by character code.
      */
    var kerning: StringDictionary[Double]
    
    /**
      * The width of the character.
      */
    var width: Double
    
    /**
      * The x position of the character.
      */
    var x: Double
    
    /**
      * The x offset of the character.
      */
    var xOffset: Double
    
    /**
      * The y position of the character.
      */
    var y: Double
    
    /**
      * The y offset of the character.
      */
    var yOffset: Double
  }
  object BitmapFontCharacterData {
    
    inline def apply(
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
    
    extension [Self <: BitmapFontCharacterData](x: Self) {
      
      inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
      
      inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setKerning(value: StringDictionary[Double]): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Bitmap Font data that can be used by a BitmapText Game Object.
    */
  trait BitmapFontData extends StObject {
    
    /**
      * The character data of the font, keyed by character code. Each character datum includes a position, size, offset and more.
      */
    var chars: NumberDictionary[BitmapFontCharacterData]
    
    /**
      * The name of the font.
      */
    var font: String
    
    /**
      * The line height of the font.
      */
    var lineHeight: Double
    
    /**
      * Whether this font is a retro font (monospace).
      */
    var retroFont: Boolean
    
    /**
      * The size of the font.
      */
    var size: Double
  }
  object BitmapFontData {
    
    inline def apply(
      chars: NumberDictionary[BitmapFontCharacterData],
      font: String,
      lineHeight: Double,
      retroFont: Boolean,
      size: Double
    ): BitmapFontData = {
      val __obj = js.Dynamic.literal(chars = chars.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], retroFont = retroFont.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitmapFontData]
    }
    
    extension [Self <: BitmapFontData](x: Self) {
      
      inline def setChars(value: NumberDictionary[BitmapFontCharacterData]): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setRetroFont(value: Boolean): Self = StObject.set(x, "retroFont", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait BitmapTextConfig
    extends StObject
       with GameObjectConfig {
    
    /**
      * The key of the font to use from the BitmapFont cache.
      */
    var font: js.UndefOr[String] = js.undefined
    
    /**
      * The font size to set.
      */
    var size: js.UndefOr[Double | `false`] = js.undefined
    
    /**
      * The string, or array of strings, to be set as the content of this Bitmap Text.
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object BitmapTextConfig {
    
    inline def apply(): BitmapTextConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BitmapTextConfig]
    }
    
    extension [Self <: BitmapTextConfig](x: Self) {
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setSize(value: Double | `false`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait BitmapTextSize extends StObject {
    
    /**
      * The position and size of the BitmapText, taking into account the position and scale of the Game Object.
      */
    var global: GlobalBitmapTextSize
    
    /**
      * The position and size of the BitmapText, taking just the font size into account.
      */
    var local: LocalBitmapTextSize
  }
  object BitmapTextSize {
    
    inline def apply(global: GlobalBitmapTextSize, local: LocalBitmapTextSize): BitmapTextSize = {
      val __obj = js.Dynamic.literal(global = global.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitmapTextSize]
    }
    
    extension [Self <: BitmapTextSize](x: Self) {
      
      inline def setGlobal(value: GlobalBitmapTextSize): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setLocal(value: LocalBitmapTextSize): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    }
  }
  
  type DisplayCallback = js.Function1[/* display */ DisplayCallbackConfig, Unit]
  
  trait DisplayCallbackConfig extends StObject {
    
    /**
      * The character code of the character being rendered.
      */
    var charCode: Double
    
    /**
      * Custom data stored with the character being rendered.
      */
    var data: js.Any
    
    /**
      * The index of the character being rendered.
      */
    var index: Double
    
    /**
      * The Dynamic Bitmap Text object that owns this character being rendered.
      */
    var parent: DynamicBitmapText
    
    /**
      * The rotation of the character being rendered.
      */
    var rotation: Double
    
    /**
      * The scale of the character being rendered.
      */
    var scale: Double
    
    /**
      * The tint of the character being rendered. Always zero in Canvas.
      */
    var tint: TintConfig
    
    /**
      * The x position of the character being rendered.
      */
    var x: Double
    
    /**
      * The y position of the character being rendered.
      */
    var y: Double
  }
  object DisplayCallbackConfig {
    
    inline def apply(
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
    
    extension [Self <: DisplayCallbackConfig](x: Self) {
      
      inline def setCharCode(value: Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setParent(value: DynamicBitmapText): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setTint(value: TintConfig): Self = StObject.set(x, "tint", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The position and size of the Bitmap Text in global space, taking into account the Game Object's scale and world position.
    */
  trait GlobalBitmapTextSize extends StObject {
    
    /**
      * The height of the BitmapText, taking into account the y scale of the Game Object.
      */
    var height: Double
    
    /**
      * The width of the BitmapText, taking into account the x scale of the Game Object.
      */
    var width: Double
    
    /**
      * The x position of the BitmapText, taking into account the x position and scale of the Game Object.
      */
    var x: Double
    
    /**
      * The y position of the BitmapText, taking into account the y position and scale of the Game Object.
      */
    var y: Double
  }
  object GlobalBitmapTextSize {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): GlobalBitmapTextSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[GlobalBitmapTextSize]
    }
    
    extension [Self <: GlobalBitmapTextSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait JSONBitmapText
    extends StObject
       with JSONGameObject {
    
    /**
      * The alignment of the text in a multi-line BitmapText object.
      */
    var align: integer
    
    /**
      * The name of the font.
      */
    var font: String
    
    /**
      * The size of the font.
      */
    var fontSize: Double
    
    /**
      * Adds / Removes spacing between characters.
      */
    var letterSpacing: Double
    
    /**
      * The text that this Bitmap Text displays.
      */
    var text: String
  }
  object JSONBitmapText {
    
    inline def apply(
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
    
    extension [Self <: JSONBitmapText](x: Self) {
      
      inline def setAlign(value: integer): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The position and size of the Bitmap Text in local space, taking just the font size into account.
    */
  trait LocalBitmapTextSize extends StObject {
    
    /**
      * The height of the BitmapText.
      */
    var height: Double
    
    /**
      * The width of the BitmapText.
      */
    var width: Double
    
    /**
      * The x position of the BitmapText.
      */
    var x: Double
    
    /**
      * The y position of the BitmapText.
      */
    var y: Double
  }
  object LocalBitmapTextSize {
    
    inline def apply(height: Double, width: Double, x: Double, y: Double): LocalBitmapTextSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocalBitmapTextSize]
    }
    
    extension [Self <: LocalBitmapTextSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait RetroFontConfig extends StObject {
    
    /**
      * The characters used in the font set, in display order. You can use the TEXT_SET consts for common font set arrangements.
      */
    var chars: String
    
    /**
      * The number of characters per row in the font set. If not given charsPerRow will be the image width / characterWidth.
      */
    var charsPerRow: Double
    
    /**
      * The height of each character in the font set.
      */
    var height: Double
    
    /**
      * The key of the image containing the font.
      */
    var image: String
    
    /**
      * The amount of vertical space to add to the line height of the font.
      */
    var lineSpacing: Double
    
    /**
      * If the font set doesn't start at the top left of the given image, specify the X coordinate offset here.
      */
    @JSName("offset.x")
    var offsetDotx: Double
    
    /**
      * If the font set doesn't start at the top left of the given image, specify the Y coordinate offset here.
      */
    @JSName("offset.y")
    var offsetDoty: Double
    
    /**
      * If the characters in the font set have horizontal spacing between them set the required amount here.
      */
    @JSName("spacing.x")
    var spacingDotx: Double
    
    /**
      * If the characters in the font set have vertical spacing between them set the required amount here.
      */
    @JSName("spacing.y")
    var spacingDoty: Double
    
    /**
      * The width of each character in the font set.
      */
    var width: Double
  }
  object RetroFontConfig {
    
    inline def apply(
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
    
    extension [Self <: RetroFontConfig](x: Self) {
      
      inline def setChars(value: String): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setCharsPerRow(value: Double): Self = StObject.set(x, "charsPerRow", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
      
      inline def setOffsetDotx(value: Double): Self = StObject.set(x, "offset.x", value.asInstanceOf[js.Any])
      
      inline def setOffsetDoty(value: Double): Self = StObject.set(x, "offset.y", value.asInstanceOf[js.Any])
      
      inline def setSpacingDotx(value: Double): Self = StObject.set(x, "spacing.x", value.asInstanceOf[js.Any])
      
      inline def setSpacingDoty(value: Double): Self = StObject.set(x, "spacing.y", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait TintConfig extends StObject {
    
    /**
      * The bottom left tint value. Always zero in canvas.
      */
    var bottomLeft: Double
    
    /**
      * The bottom right tint value. Always zero in canvas.
      */
    var bottomRight: Double
    
    /**
      * The top left tint value. Always zero in canvas.
      */
    var topLeft: Double
    
    /**
      * The top right tint value. Always zero in canvas.
      */
    var topRight: Double
  }
  object TintConfig {
    
    inline def apply(bottomLeft: Double, bottomRight: Double, topLeft: Double, topRight: Double): TintConfig = {
      val __obj = js.Dynamic.literal(bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[TintConfig]
    }
    
    extension [Self <: TintConfig](x: Self) {
      
      inline def setBottomLeft(value: Double): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomRight(value: Double): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setTopLeft(value: Double): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopRight(value: Double): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    }
  }
}

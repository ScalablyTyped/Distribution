package typings.phaser.Phaser.Types.GameObjects

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.phaser.Phaser.GameObjects.DynamicBitmapText
import typings.phaser.phaserBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BitmapText {
  
  /**
    * The font data for an individual character of a Bitmap Font.
    * 
    * Describes the character's position, size, offset and kerning.
    * 
    * As of version 3.50 it also includes the WebGL texture uv data.
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
      * WebGL texture u0.
      */
    var u0: Double
    
    /**
      * WebGL texture u1.
      */
    var u1: Double
    
    /**
      * WebGL texture v0.
      */
    var v0: Double
    
    /**
      * WebGL texture v1.
      */
    var v1: Double
    
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
      u0: Double,
      u1: Double,
      v0: Double,
      v1: Double,
      width: Double,
      x: Double,
      xOffset: Double,
      y: Double,
      yOffset: Double
    ): BitmapFontCharacterData = {
      val __obj = js.Dynamic.literal(centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], kerning = kerning.asInstanceOf[js.Any], u0 = u0.asInstanceOf[js.Any], u1 = u1.asInstanceOf[js.Any], v0 = v0.asInstanceOf[js.Any], v1 = v1.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xOffset = xOffset.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yOffset = yOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitmapFontCharacterData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BitmapFontCharacterData] (val x: Self) extends AnyVal {
      
      inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
      
      inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setKerning(value: StringDictionary[Double]): Self = StObject.set(x, "kerning", value.asInstanceOf[js.Any])
      
      inline def setU0(value: Double): Self = StObject.set(x, "u0", value.asInstanceOf[js.Any])
      
      inline def setU1(value: Double): Self = StObject.set(x, "u1", value.asInstanceOf[js.Any])
      
      inline def setV0(value: Double): Self = StObject.set(x, "v0", value.asInstanceOf[js.Any])
      
      inline def setV1(value: Double): Self = StObject.set(x, "v1", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BitmapFontData] (val x: Self) extends AnyVal {
      
      inline def setChars(value: NumberDictionary[BitmapFontCharacterData]): Self = StObject.set(x, "chars", value.asInstanceOf[js.Any])
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
      
      inline def setRetroFont(value: Boolean): Self = StObject.set(x, "retroFont", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A single entry from the `BitmapTextSize` characters array.
    * 
    * The position and dimensions take the font size into account,
    * but are not translated into the local space of the Game Object itself.
    */
  trait BitmapTextCharacter extends StObject {
    
    /**
      * The bottom of the line this character is on.
      */
    var b: Double
    
    /**
      * The character.
      */
    var char: String
    
    /**
      * The character code of the character.
      */
    var code: Double
    
    /**
      * Reference to the glyph object this character is using.
      */
    var glyph: BitmapFontCharacterData
    
    /**
      * The height of the character.
      */
    var h: Double
    
    /**
      * The index of this character within the BitmapText wrapped text string.
      */
    var i: Double
    
    /**
      * The index of this character within the BitmapText text string.
      */
    var idx: Double
    
    /**
      * The line number the character appears on.
      */
    var line: Double
    
    /**
      * The right-most point of this character, including xAdvance.
      */
    var r: Double
    
    /**
      * The top of the line this character is on.
      */
    var t: Double
    
    /**
      * The width of the character.
      */
    var w: Double
    
    /**
      * The x position of the character in the BitmapText.
      */
    var x: Double
    
    /**
      * The y position of the character in the BitmapText.
      */
    var y: Double
  }
  object BitmapTextCharacter {
    
    inline def apply(
      b: Double,
      char: String,
      code: Double,
      glyph: BitmapFontCharacterData,
      h: Double,
      i: Double,
      idx: Double,
      line: Double,
      r: Double,
      t: Double,
      w: Double,
      x: Double,
      y: Double
    ): BitmapTextCharacter = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], char = char.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], glyph = glyph.asInstanceOf[js.Any], h = h.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], idx = idx.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitmapTextCharacter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BitmapTextCharacter] (val x: Self) extends AnyVal {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setChar(value: String): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setGlyph(value: BitmapFontCharacterData): Self = StObject.set(x, "glyph", value.asInstanceOf[js.Any])
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setIdx(value: Double): Self = StObject.set(x, "idx", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
      
      inline def setT(value: Double): Self = StObject.set(x, "t", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BitmapTextConfig] (val x: Self) extends AnyVal {
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setSize(value: Double | `false`): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /**
    * Details about the line data in the `BitmapTextSize` object.
    */
  trait BitmapTextLines extends StObject {
    
    /**
      * The height of a line of text.
      */
    var height: Double
    
    /**
      * An array where each entry contains the length of that line of text.
      */
    var lengths: js.Array[Double]
    
    /**
      * The width of the longest line of text.
      */
    var longest: Double
    
    /**
      * The width of the shortest line of text.
      */
    var shortest: Double
  }
  object BitmapTextLines {
    
    inline def apply(height: Double, lengths: js.Array[Double], longest: Double, shortest: Double): BitmapTextLines = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], lengths = lengths.asInstanceOf[js.Any], longest = longest.asInstanceOf[js.Any], shortest = shortest.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitmapTextLines]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BitmapTextLines] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLengths(value: js.Array[Double]): Self = StObject.set(x, "lengths", value.asInstanceOf[js.Any])
      
      inline def setLengthsVarargs(value: Double*): Self = StObject.set(x, "lengths", js.Array(value*))
      
      inline def setLongest(value: Double): Self = StObject.set(x, "longest", value.asInstanceOf[js.Any])
      
      inline def setShortest(value: Double): Self = StObject.set(x, "shortest", value.asInstanceOf[js.Any])
    }
  }
  
  trait BitmapTextSize extends StObject {
    
    /**
      * An array containing per-character data. Only populated if `includeChars` is `true` in the `getTextBounds` call.
      */
    var characters: js.Array[BitmapTextCharacter]
    
    /**
      * The position and size of the BitmapText, taking into account the position and scale of the Game Object.
      */
    var global: GlobalBitmapTextSize
    
    /**
      * Data about the lines of text within the BitmapText.
      */
    var lines: BitmapTextLines
    
    /**
      * The position and size of the BitmapText, taking just the font size into account.
      */
    var local: LocalBitmapTextSize
    
    /**
      * The scale of the BitmapText font being rendered vs. font size in the text data.
      */
    var scale: Double
    
    /**
      * The scale X value of the BitmapText.
      */
    var scaleX: Double
    
    /**
      * The scale Y value of the BitmapText.
      */
    var scaleY: Double
    
    /**
      * An array containing the word data from the BitmapText.
      */
    var words: js.Array[BitmapTextWord]
    
    /**
      * The wrapped text, if wrapping enabled and required.
      */
    var wrappedText: String
  }
  object BitmapTextSize {
    
    inline def apply(
      characters: js.Array[BitmapTextCharacter],
      global: GlobalBitmapTextSize,
      lines: BitmapTextLines,
      local: LocalBitmapTextSize,
      scale: Double,
      scaleX: Double,
      scaleY: Double,
      words: js.Array[BitmapTextWord],
      wrappedText: String
    ): BitmapTextSize = {
      val __obj = js.Dynamic.literal(characters = characters.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleX = scaleX.asInstanceOf[js.Any], scaleY = scaleY.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any], wrappedText = wrappedText.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitmapTextSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BitmapTextSize] (val x: Self) extends AnyVal {
      
      inline def setCharacters(value: js.Array[BitmapTextCharacter]): Self = StObject.set(x, "characters", value.asInstanceOf[js.Any])
      
      inline def setCharactersVarargs(value: BitmapTextCharacter*): Self = StObject.set(x, "characters", js.Array(value*))
      
      inline def setGlobal(value: GlobalBitmapTextSize): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setLines(value: BitmapTextLines): Self = StObject.set(x, "lines", value.asInstanceOf[js.Any])
      
      inline def setLocal(value: LocalBitmapTextSize): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleX(value: Double): Self = StObject.set(x, "scaleX", value.asInstanceOf[js.Any])
      
      inline def setScaleY(value: Double): Self = StObject.set(x, "scaleY", value.asInstanceOf[js.Any])
      
      inline def setWords(value: js.Array[BitmapTextWord]): Self = StObject.set(x, "words", value.asInstanceOf[js.Any])
      
      inline def setWordsVarargs(value: BitmapTextWord*): Self = StObject.set(x, "words", js.Array(value*))
      
      inline def setWrappedText(value: String): Self = StObject.set(x, "wrappedText", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Details about a single world entry in the `BitmapTextSize` object words array.
    */
  trait BitmapTextWord extends StObject {
    
    /**
      * The height of the word.
      */
    var h: Double
    
    /**
      * The index of the first character of this word within the entire string. Note: this index factors in spaces, quotes, carriage-returns, etc.
      */
    var i: Double
    
    /**
      * The width of the word.
      */
    var w: Double
    
    /**
      * The word.
      */
    var word: String
    
    /**
      * The x position of the word in the BitmapText.
      */
    var x: Double
    
    /**
      * The y position of the word in the BitmapText.
      */
    var y: Double
  }
  object BitmapTextWord {
    
    inline def apply(h: Double, i: Double, w: Double, word: String, x: Double, y: Double): BitmapTextWord = {
      val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], i = i.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[BitmapTextWord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BitmapTextWord] (val x: Self) extends AnyVal {
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setI(value: Double): Self = StObject.set(x, "i", value.asInstanceOf[js.Any])
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  type DisplayCallback = js.Function1[/* display */ DisplayCallbackConfig, DisplayCallbackConfig]
  
  trait DisplayCallbackConfig extends StObject {
    
    /**
      * The character code of the character being rendered.
      */
    var charCode: Double
    
    /**
      * Custom data stored with the character being rendered.
      */
    var data: Any
    
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
      data: Any,
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
    implicit open class MutableBuilder[Self <: DisplayCallbackConfig] (val x: Self) extends AnyVal {
      
      inline def setCharCode(value: Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GlobalBitmapTextSize] (val x: Self) extends AnyVal {
      
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
    var align: Double
    
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
      * Adds / Removes spacing between lines in multi-line text.
      */
    var lineSpacing: Double
    
    /**
      * The text that this Bitmap Text displays.
      */
    var text: String
  }
  object JSONBitmapText {
    
    inline def apply(
      align: Double,
      alpha: Double,
      blendMode: Double | String,
      data: js.Object,
      flipX: Boolean,
      flipY: Boolean,
      font: String,
      fontSize: Double,
      frameKey: String,
      letterSpacing: Double,
      lineSpacing: Double,
      name: String,
      origin: js.Object,
      originDotx: Double,
      originDoty: Double,
      rotation: Double,
      scale: js.Object,
      scaleDotx: Double,
      scaleDoty: Double,
      scaleMode: Double,
      text: String,
      textureKey: String,
      `type`: String,
      visible: Boolean,
      x: Double,
      y: Double
    ): JSONBitmapText = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], alpha = alpha.asInstanceOf[js.Any], blendMode = blendMode.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], flipX = flipX.asInstanceOf[js.Any], flipY = flipY.asInstanceOf[js.Any], font = font.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], frameKey = frameKey.asInstanceOf[js.Any], letterSpacing = letterSpacing.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleMode = scaleMode.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], textureKey = textureKey.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.updateDynamic("origin.x")(originDotx.asInstanceOf[js.Any])
      __obj.updateDynamic("origin.y")(originDoty.asInstanceOf[js.Any])
      __obj.updateDynamic("scale.x")(scaleDotx.asInstanceOf[js.Any])
      __obj.updateDynamic("scale.y")(scaleDoty.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONBitmapText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JSONBitmapText] (val x: Self) extends AnyVal {
      
      inline def setAlign(value: Double): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setLetterSpacing(value: Double): Self = StObject.set(x, "letterSpacing", value.asInstanceOf[js.Any])
      
      inline def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocalBitmapTextSize] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RetroFontConfig] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TintConfig] (val x: Self) extends AnyVal {
      
      inline def setBottomLeft(value: Double): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomRight(value: Double): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setTopLeft(value: Double): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopRight(value: Double): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    }
  }
}

package typings.playcanvas.mod

import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the resource of a canvas font asset.
  *
  * @augments EventHandler
  * @ignore
  */
@JSImport("playcanvas", "CanvasFont")
@js.native
open class CanvasFont protected () extends EventHandler {
  /**
    * Create a new CanvasFont instance.
    *
    * @param {AppBase} app - The application.
    * @param {object} options - The font options.
    * @param {string} [options.fontName] - The name of the font. CSS font names are supported.
    * Defaults to 'Arial'.
    * @param {string} [options.fontWeight] - The weight of the font, e.g. 'normal', 'bold'.
    * Defaults to 'normal'.
    * @param {number} [options.fontSize] - The font size in pixels. Defaults to 32.
    * @param {Color} [options.color] - The font color.Defaults to white.
    * @param {number} [options.width] - The width of each texture atlas. Defaults to 512.
    * @param {number} [options.height] - The height of each texture atlas. Defaults to 512.
    * @param {number} [options.padding] - Amount of glyph padding in pixels that is added to each
    * glyph in the atlas. Defaults to 0.
    */
  def this(app: AppBase) = this()
  def this(app: AppBase, options: typings.playcanvas.anon.Color) = this()
  
  /**
    * @param {object} json - Font data.
    * @param {string} char - The character to add.
    * @param {number} charCode - The code point number of the character to add.
    * @param {number} x - The x position of the character.
    * @param {number} y - The y position of the character.
    * @param {number} w - The width of the character.
    * @param {number} h - The height of the character.
    * @param {number} xoffset - The x offset of the character.
    * @param {number} yoffset - The y offset of the character.
    * @param {number} xadvance - The x advance of the character.
    * @param {number} mapNum - The map number of the character.
    * @param {number} mapW - The width of the map.
    * @param {number} mapH - The height of the map.
    * @private
    */
  /* private */ var _addChar: Any = js.native
  
  /**
    * @param {Color} color - The color to covert.
    * @param {boolean} alpha - Whether to include the alpha channel.
    * @returns {string} The hex string for the color.
    * @private
    */
  /* private */ var _colorToRgbString: Any = js.native
  
  /**
    * @param {string[]} chars - A list of characters.
    * @param {string} fontName - The font name.
    * @param {number} width - The width of the texture atlas.
    * @param {number} height - The height of the texture atlas.
    * @returns {object} The font JSON object.
    * @private
    */
  /* private */ var _createJson: Any = js.native
  
  /**
    * @param {HTMLCanvasElement} canvas - The canvas used to render the font.
    * @param {string} clearColor - The color to clear the canvas with.
    * @returns {CanvasRenderingContext2D} - A 2D rendering contxt.
    * @private
    */
  /* private */ var _getAndClearContext: Any = js.native
  
  /**
    * Calculate some metrics that aren't available via the browser API, notably character height
    * and descent size.
    *
    * @param {string} text - The text to measure.
    * @returns {{ascent: number, descent: number, height: number}} The metrics of the text.
    * @private
    */
  /* private */ var _getTextMetrics: Any = js.native
  
  /**
    * Take a unicode string and produce the set of characters used to create that string.
    * e.g. "abcabcabc" -> ['a', 'b', 'c']
    *
    * @param {string} text - The unicode string to process.
    * @returns {string[]} The set of characters used to create the string.
    * @private
    */
  /* private */ var _normalizeCharsSet: Any = js.native
  
  /**
    * Renders an array of characters into one or more textures atlases.
    *
    * @param {string[]} charsArray - The list of characters to render.
    * @private
    */
  /* private */ var _renderAtlas: Any = js.native
  
  var app: AppBase = js.native
  
  var chars: String = js.native
  
  var color: Color = js.native
  
  /**
    * Render the necessary textures for all characters in a string to be used for the canvas font.
    *
    * @param {string} text - The list of characters to render into the texture atlas.
    */
  def createTextures(text: String): Unit = js.native
  
  /**
    * Destroys the font. This also destroys the textures owned by the font.
    */
  def destroy(): Unit = js.native
  
  var fontName: String = js.native
  
  var fontSize: Double = js.native
  
  var fontWeight: String = js.native
  
  var glyphSize: Double = js.native
  
  var intensity: Double = js.native
  
  var padding: Double = js.native
  
  /**
    * @param {CanvasRenderingContext2D} context - The canvas 2D context.
    * @param {string} char - The character to render.
    * @param {number} x - The x position to render the character at.
    * @param {number} y - The y position to render the character at.
    * @param {number} color - The color to render the character in.
    * @ignore
    */
  def renderCharacter(context: CanvasRenderingContext2D, char: String, x: Double, y: Double, color: Double): Unit = js.native
  
  var textures: js.Array[Texture] = js.native
  
  var `type`: String = js.native
  
  /**
    * Update the list of characters to include in the atlas to include those provided and
    * re-render the texture atlas to include all the characters that have been supplied so far.
    *
    * @param {string} text - The list of characters to add to the texture atlas.
    */
  def updateTextures(text: String): Unit = js.native
}

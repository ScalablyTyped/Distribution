package typings.pixiJs.mod

import typings.pixiText.anon.PartialITextStyle
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Text Object will create a line or multiple lines of text.
  *
  * The text is created using the [Canvas API](https://developer.mozilla.org/en-US/docs/Web/API/Canvas_API).
  *
  * The primary advantage of this class over BitmapText is that you have great control over the style of the text,
  * which you can change at runtime.
  *
  * The primary disadvantages is that each piece of text has it's own texture, which can use more memory.
  * When text changes, this texture has to be re-generated and re-uploaded to the GPU, taking up time.
  *
  * To split a line you can use '\n' in your text string, or, on the `style` object,
  * change its `wordWrap` property to true and and give the `wordWrapWidth` property a value.
  *
  * A Text can be created directly from a string and a style object,
  * which can be generated [here](https://pixijs.io/pixi-text-style).
  *
  * ```js
  * let text = new PIXI.Text('This is a PixiJS text',{fontFamily : 'Arial', fontSize: 24, fill : 0xff1010, align : 'center'});
  * ```
  * @memberof PIXI
  */
@JSImport("pixi.js", "Text")
@js.native
/**
  * @param text - The string that you would like the text to display
  * @param {object|PIXI.TextStyle} [style] - The style parameters
  * @param canvas - The canvas element for drawing text
  */
open class Text ()
  extends typings.pixiText.mod.Text {
  def this(text: String) = this()
  def this(text: Double) = this()
  def this(text: String, style: PartialITextStyle) = this()
  def this(text: String, style: typings.pixiText.mod.TextStyle) = this()
  def this(text: Double, style: PartialITextStyle) = this()
  def this(text: Double, style: typings.pixiText.mod.TextStyle) = this()
  def this(text: Unit, style: PartialITextStyle) = this()
  def this(text: Unit, style: typings.pixiText.mod.TextStyle) = this()
  def this(text: String, style: Unit, canvas: HTMLCanvasElement) = this()
  def this(text: String, style: PartialITextStyle, canvas: HTMLCanvasElement) = this()
  def this(text: String, style: typings.pixiText.mod.TextStyle, canvas: HTMLCanvasElement) = this()
  def this(text: Double, style: Unit, canvas: HTMLCanvasElement) = this()
  def this(text: Double, style: PartialITextStyle, canvas: HTMLCanvasElement) = this()
  def this(text: Double, style: typings.pixiText.mod.TextStyle, canvas: HTMLCanvasElement) = this()
  def this(text: Unit, style: Unit, canvas: HTMLCanvasElement) = this()
  def this(text: Unit, style: PartialITextStyle, canvas: HTMLCanvasElement) = this()
  def this(text: Unit, style: typings.pixiText.mod.TextStyle, canvas: HTMLCanvasElement) = this()
}
object Text {
  
  @JSImport("pixi.js", "Text")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * New rendering behavior for letter-spacing which uses Chrome's new native API. This will
    * lead to more accurate letter-spacing results because it does not try to manually draw
    * each character. However, this Chrome API is experimental and may not serve all cases yet.
    */
  /* static member */
  @JSImport("pixi.js", "Text.experimentalLetterSpacing")
  @js.native
  def experimentalLetterSpacing: Boolean = js.native
  inline def experimentalLetterSpacing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("experimentalLetterSpacing")(x.asInstanceOf[js.Any])
  
  /**
    * New behavior for `lineHeight` that's meant to mimic HTML text. A value of `true` will
    * make sure the first baseline is offset by the `lineHeight` value if it is greater than `fontSize`.
    * A value of `false` will use the legacy behavior and not change the baseline of the first line.
    * In the next major release, we'll enable this by default.
    */
  /* static member */
  @JSImport("pixi.js", "Text.nextLineHeightBehavior")
  @js.native
  def nextLineHeightBehavior: Boolean = js.native
  inline def nextLineHeightBehavior_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nextLineHeightBehavior")(x.asInstanceOf[js.Any])
}

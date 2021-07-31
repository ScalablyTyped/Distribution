package typings.pixiJs.global.PIXI

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A Text Object will create a line or multiple lines of text.
  *
  * The text is created using the [Canvas API](https://developer.mozilla.org/en-US/docs/Web/API/Canvas_API).
  *
  * The primary advantage of this class over BitmapText is that you have great control over the style of the next,
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
  *
  * @class
  * @extends PIXI.Sprite
  * @memberof PIXI
  */
@JSGlobal("PIXI.Text")
@js.native
class Text protected ()
  extends StObject
     with typings.pixiJs.PIXI.Text {
  def this(text: String) = this()
  def this(text: String, style: js.Any) = this()
  def this(text: String, style: typings.pixiJs.PIXI.TextStyle) = this()
  def this(text: String, style: js.Any, canvas: HTMLCanvasElement) = this()
  def this(text: String, style: Unit, canvas: HTMLCanvasElement) = this()
  def this(text: String, style: typings.pixiJs.PIXI.TextStyle, canvas: HTMLCanvasElement) = this()
}

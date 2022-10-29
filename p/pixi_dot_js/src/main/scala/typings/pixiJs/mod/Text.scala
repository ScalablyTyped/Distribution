package typings.pixiJs.mod

import typings.pixiSettings.libIcanvasMod.ICanvas
import typings.pixiText.anon.PartialITextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def this(text: String, style: typings.pixiText.libTextStyleMod.TextStyle) = this()
  def this(text: Double, style: PartialITextStyle) = this()
  def this(text: Double, style: typings.pixiText.libTextStyleMod.TextStyle) = this()
  def this(text: Unit, style: PartialITextStyle) = this()
  def this(text: Unit, style: typings.pixiText.libTextStyleMod.TextStyle) = this()
  def this(text: String, style: Unit, canvas: ICanvas) = this()
  def this(text: String, style: PartialITextStyle, canvas: ICanvas) = this()
  def this(text: String, style: typings.pixiText.libTextStyleMod.TextStyle, canvas: ICanvas) = this()
  def this(text: Double, style: Unit, canvas: ICanvas) = this()
  def this(text: Double, style: PartialITextStyle, canvas: ICanvas) = this()
  def this(text: Double, style: typings.pixiText.libTextStyleMod.TextStyle, canvas: ICanvas) = this()
  def this(text: Unit, style: Unit, canvas: ICanvas) = this()
  def this(text: Unit, style: PartialITextStyle, canvas: ICanvas) = this()
  def this(text: Unit, style: typings.pixiText.libTextStyleMod.TextStyle, canvas: ICanvas) = this()
}
/* static members */
object Text {
  
  @JSImport("pixi.js", "Text")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * New rendering behavior for letter-spacing which uses Chrome's new native API. This will
    * lead to more accurate letter-spacing results because it does not try to manually draw
    * each character. However, this Chrome API is experimental and may not serve all cases yet.
    */
  @JSImport("pixi.js", "Text.experimentalLetterSpacing")
  @js.native
  def experimentalLetterSpacing: Boolean = js.native
  inline def experimentalLetterSpacing_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("experimentalLetterSpacing")(x.asInstanceOf[js.Any])
}

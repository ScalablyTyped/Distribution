package typings.pixiDotJs.pixiDotJsMod

import typings.pixiDotJs.PIXI.TextStyleOptions
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pixi.js", "Text")
@js.native
class Text ()
  extends typings.pixiDotJs.PIXI.Text {
  def this(text: String) = this()
  def this(text: String, style: TextStyleOptions) = this()
  def this(text: String, style: TextStyleOptions, canvas: HTMLCanvasElement) = this()
}


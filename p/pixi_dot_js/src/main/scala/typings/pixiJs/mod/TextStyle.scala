package typings.pixiJs.mod

import typings.pixiJs.AnonAlign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A TextStyle Object contains information to decorate a Text objects.
  *
  * An instance can be shared between multiple Text objects; then changing the style will update all text objects using it.
  *
  * A tool can be used to generate a text style [here](https://pixijs.io/pixi-text-style).
  *
  * @class
  * @memberof PIXI
  */
@JSImport("pixi.js", "TextStyle")
@js.native
class TextStyle ()
  extends typings.pixiJs.PIXI.TextStyle {
  def this(style: AnonAlign) = this()
}


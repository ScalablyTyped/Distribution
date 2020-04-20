package typings.pixiJs.PIXI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A number, or a string containing a number.
  *
  * @memberof PIXI
  * @typedef IFontMetrics
  * @property {number} ascent - Font ascent
  * @property {number} descent - Font descent
  * @property {number} fontSize - Font size
  */
trait IFontMetrics extends js.Object {
  var ascent: Double
  var descent: Double
  var fontSize: Double
}

object IFontMetrics {
  @scala.inline
  def apply(ascent: Double, descent: Double, fontSize: Double): IFontMetrics = {
    val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFontMetrics]
  }
}


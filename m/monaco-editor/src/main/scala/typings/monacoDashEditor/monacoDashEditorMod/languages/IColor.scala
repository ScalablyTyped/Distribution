package typings.monacoDashEditor.monacoDashEditorMod.languages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IColor extends js.Object {
  /**
    * The alpha component in the range [0-1].
    */
  val alpha: Double
  /**
    * The blue component in the range [0-1].
    */
  val blue: Double
  /**
    * The green component in the range [0-1].
    */
  val green: Double
  /**
    * The red component in the range [0-1].
    */
  val red: Double
}

object IColor {
  @scala.inline
  def apply(alpha: Double, blue: Double, green: Double, red: Double): IColor = {
    val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], blue = blue.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IColor]
  }
}


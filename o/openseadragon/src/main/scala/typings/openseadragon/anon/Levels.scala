package typings.openseadragon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Levels extends js.Object {
  var levels: js.Array[Height]
  var `type`: String
}

object Levels {
  @scala.inline
  def apply(levels: js.Array[Height], `type`: String): Levels = {
    val __obj = js.Dynamic.literal(levels = levels.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Levels]
  }
}


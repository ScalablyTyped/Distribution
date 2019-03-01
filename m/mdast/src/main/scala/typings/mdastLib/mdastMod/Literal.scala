package typings
package mdastLib.mdastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Literal
  extends unistLib.unistMod.Literal {
  @JSName("value")
  var value_Literal: java.lang.String
}

object Literal {
  @scala.inline
  def apply(
    `type`: java.lang.String,
    value: java.lang.String,
    data: unistLib.unistMod.Data = null,
    position: unistLib.unistMod.Position = null
  ): Literal = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    if (data != null) __obj.updateDynamic("data")(data)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Literal]
  }
}


package typings.maxmind.decoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cursor extends js.Object {
  var offset: Double
  var value: js.Any
}

object Cursor {
  @scala.inline
  def apply(offset: Double, value: js.Any): Cursor = {
    val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Cursor]
  }
}


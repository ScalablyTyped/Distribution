package typings.moji.mojiMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MojisyuRegExp extends js.Object {
  var list: js.Array[String]
  var regexp: RegExp
}

object MojisyuRegExp {
  @scala.inline
  def apply(list: js.Array[String], regexp: RegExp): MojisyuRegExp = {
    val __obj = js.Dynamic.literal(list = list, regexp = regexp)
  
    __obj.asInstanceOf[MojisyuRegExp]
  }
}


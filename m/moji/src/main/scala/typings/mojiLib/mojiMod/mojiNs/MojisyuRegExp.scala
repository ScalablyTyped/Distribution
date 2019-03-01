package typings
package mojiLib.mojiMod.mojiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MojisyuRegExp extends js.Object {
  var list: js.Array[java.lang.String]
  var regexp: stdLib.RegExp
}

object MojisyuRegExp {
  @scala.inline
  def apply(list: js.Array[java.lang.String], regexp: stdLib.RegExp): MojisyuRegExp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("regexp")(regexp)
    __obj.asInstanceOf[MojisyuRegExp]
  }
}


package typings
package mojiLib.mojiMod

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
    val __obj = js.Dynamic.literal(list = list, regexp = regexp)
  
    __obj.asInstanceOf[MojisyuRegExp]
  }
}


package typings
package nedbLib.nedbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorCount extends js.Object {
  def exec(callback: js.Function2[/* err */ stdLib.Error, /* count */ scala.Double, scala.Unit]): scala.Unit
}

object CursorCount {
  @scala.inline
  def apply(exec: js.Function2[/* err */ stdLib.Error, /* count */ scala.Double, scala.Unit] => scala.Unit): CursorCount = {
    val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1(exec))
  
    __obj.asInstanceOf[CursorCount]
  }
}


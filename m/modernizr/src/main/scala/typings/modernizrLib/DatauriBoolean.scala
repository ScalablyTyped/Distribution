package typings
package modernizrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DatauriBoolean
  extends stdLib.Boolean {
  var over32kb: scala.Boolean
}

object DatauriBoolean {
  @scala.inline
  def apply(over32kb: scala.Boolean): DatauriBoolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("over32kb")(over32kb)
    __obj.asInstanceOf[DatauriBoolean]
  }
}


package typings
package msnodesqlLib.msnodesqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRawColumn extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object QueryRawColumn {
  @scala.inline
  def apply(name: java.lang.String = null): QueryRawColumn = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[QueryRawColumn]
  }
}


package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryConfig extends js.Object {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var text: java.lang.String
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object QueryConfig {
  @scala.inline
  def apply(text: java.lang.String, name: java.lang.String = null, values: js.Array[_] = null): QueryConfig = {
    val __obj = js.Dynamic.literal(text = text)
    if (name != null) __obj.updateDynamic("name")(name)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[QueryConfig]
  }
}


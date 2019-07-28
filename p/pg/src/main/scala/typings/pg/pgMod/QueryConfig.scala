package typings.pg.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryConfig extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var text: String
  var values: js.UndefOr[js.Array[_]] = js.undefined
}

object QueryConfig {
  @scala.inline
  def apply(text: String, name: String = null, values: js.Array[_] = null): QueryConfig = {
    val __obj = js.Dynamic.literal(text = text)
    if (name != null) __obj.updateDynamic("name")(name)
    if (values != null) __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[QueryConfig]
  }
}


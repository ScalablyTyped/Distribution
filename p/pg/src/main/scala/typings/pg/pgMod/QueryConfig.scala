package typings.pg.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryConfig[I /* <: js.Array[_] */] extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var text: String
  var values: js.UndefOr[I] = js.undefined
}

object QueryConfig {
  @scala.inline
  def apply[I /* <: js.Array[_] */](text: String, name: String = null, values: I = null): QueryConfig[I] = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryConfig[I]]
  }
}


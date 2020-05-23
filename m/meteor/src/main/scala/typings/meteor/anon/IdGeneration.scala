package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdGeneration extends js.Object {
  var connection: js.UndefOr[js.Object | Null] = js.undefined
  var idGeneration: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[js.Function | Null] = js.undefined
}

object IdGeneration {
  @scala.inline
  def apply(
    connection: js.UndefOr[Null | js.Object] = js.undefined,
    idGeneration: String = null,
    transform: js.UndefOr[Null | js.Function] = js.undefined
  ): IdGeneration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connection)) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (idGeneration != null) __obj.updateDynamic("idGeneration")(idGeneration.asInstanceOf[js.Any])
    if (!js.isUndefined(transform)) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdGeneration]
  }
}


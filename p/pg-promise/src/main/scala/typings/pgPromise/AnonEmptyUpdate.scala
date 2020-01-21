package typings.pgPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEmptyUpdate extends js.Object {
  var emptyUpdate: js.UndefOr[js.Any] = js.undefined
  var tableAlias: js.UndefOr[String] = js.undefined
  var valueAlias: js.UndefOr[String] = js.undefined
}

object AnonEmptyUpdate {
  @scala.inline
  def apply(emptyUpdate: js.Any = null, tableAlias: String = null, valueAlias: String = null): AnonEmptyUpdate = {
    val __obj = js.Dynamic.literal()
    if (emptyUpdate != null) __obj.updateDynamic("emptyUpdate")(emptyUpdate.asInstanceOf[js.Any])
    if (tableAlias != null) __obj.updateDynamic("tableAlias")(tableAlias.asInstanceOf[js.Any])
    if (valueAlias != null) __obj.updateDynamic("valueAlias")(valueAlias.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEmptyUpdate]
  }
}


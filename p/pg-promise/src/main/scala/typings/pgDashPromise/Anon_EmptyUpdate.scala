package typings.pgDashPromise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EmptyUpdate extends js.Object {
  var emptyUpdate: js.UndefOr[js.Any] = js.undefined
  var tableAlias: js.UndefOr[String] = js.undefined
  var valueAlias: js.UndefOr[String] = js.undefined
}

object Anon_EmptyUpdate {
  @scala.inline
  def apply(emptyUpdate: js.Any = null, tableAlias: String = null, valueAlias: String = null): Anon_EmptyUpdate = {
    val __obj = js.Dynamic.literal()
    if (emptyUpdate != null) __obj.updateDynamic("emptyUpdate")(emptyUpdate)
    if (tableAlias != null) __obj.updateDynamic("tableAlias")(tableAlias)
    if (valueAlias != null) __obj.updateDynamic("valueAlias")(valueAlias)
    __obj.asInstanceOf[Anon_EmptyUpdate]
  }
}


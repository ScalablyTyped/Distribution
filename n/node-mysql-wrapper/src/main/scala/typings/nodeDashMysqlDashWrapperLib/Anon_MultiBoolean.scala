package typings
package nodeDashMysqlDashWrapperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MultiBoolean extends js.Object {
  var multi: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_MultiBoolean {
  @scala.inline
  def apply(multi: js.UndefOr[scala.Boolean] = js.undefined): Anon_MultiBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multi)) __obj.updateDynamic("multi")(multi)
    __obj.asInstanceOf[Anon_MultiBoolean]
  }
}


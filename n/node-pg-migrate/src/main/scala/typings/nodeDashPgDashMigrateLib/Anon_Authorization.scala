package typings
package nodeDashPgDashMigrateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Authorization extends js.Object {
  var authorization: js.UndefOr[java.lang.String] = js.undefined
  var ifNotExists: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Authorization {
  @scala.inline
  def apply(authorization: java.lang.String = null, ifNotExists: js.UndefOr[scala.Boolean] = js.undefined): Anon_Authorization = {
    val __obj = js.Dynamic.literal()
    if (authorization != null) __obj.updateDynamic("authorization")(authorization)
    if (!js.isUndefined(ifNotExists)) __obj.updateDynamic("ifNotExists")(ifNotExists)
    __obj.asInstanceOf[Anon_Authorization]
  }
}


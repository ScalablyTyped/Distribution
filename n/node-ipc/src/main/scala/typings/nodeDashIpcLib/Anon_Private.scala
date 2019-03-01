package typings
package nodeDashIpcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Private extends js.Object {
  var `private`: js.UndefOr[java.lang.String] = js.undefined
  var public: js.UndefOr[java.lang.String] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Private {
  @scala.inline
  def apply(
    `private`: java.lang.String = null,
    public: java.lang.String = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Private = {
    val __obj = js.Dynamic.literal()
    if (`private` != null) __obj.updateDynamic("private")(`private`)
    if (public != null) __obj.updateDynamic("public")(public)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    __obj.asInstanceOf[Anon_Private]
  }
}


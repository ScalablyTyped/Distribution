package typings
package parseLib.ParseNs.ObjectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveAllOptions
  extends parseLib.ParseNs.ScopeOptions
     with parseLib.ParseNs.BatchSizeOption

object SaveAllOptions {
  @scala.inline
  def apply(
    batchSize: scala.Int | scala.Double = null,
    sessionToken: java.lang.String = null,
    useMasterKey: js.UndefOr[scala.Boolean] = js.undefined
  ): SaveAllOptions = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    __obj.asInstanceOf[SaveAllOptions]
  }
}


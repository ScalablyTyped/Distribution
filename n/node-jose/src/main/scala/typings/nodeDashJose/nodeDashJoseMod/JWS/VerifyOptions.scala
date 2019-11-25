package typings.nodeDashJose.nodeDashJoseMod.JWS

import typings.nodeDashJose.Anon_Exp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyOptions extends js.Object {
  var algorithms: js.UndefOr[js.Array[String]] = js.undefined
  var allowEmbeddedKey: js.UndefOr[Boolean] = js.undefined
  var handlers: Anon_Exp
}

object VerifyOptions {
  @scala.inline
  def apply(
    handlers: Anon_Exp,
    algorithms: js.Array[String] = null,
    allowEmbeddedKey: js.UndefOr[Boolean] = js.undefined
  ): VerifyOptions = {
    val __obj = js.Dynamic.literal(handlers = handlers.asInstanceOf[js.Any])
    if (algorithms != null) __obj.updateDynamic("algorithms")(algorithms.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmbeddedKey)) __obj.updateDynamic("allowEmbeddedKey")(allowEmbeddedKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[VerifyOptions]
  }
}


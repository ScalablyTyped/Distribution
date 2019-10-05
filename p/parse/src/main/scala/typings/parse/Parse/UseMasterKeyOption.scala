package typings.parse.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UseMasterKeyOption extends js.Object {
  /**
    * In Cloud Code and Node only, causes the Master Key to be used for this request.
    */
  var useMasterKey: js.UndefOr[Boolean] = js.undefined
}

object UseMasterKeyOption {
  @scala.inline
  def apply(useMasterKey: js.UndefOr[Boolean] = js.undefined): UseMasterKeyOption = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    __obj.asInstanceOf[UseMasterKeyOption]
  }
}


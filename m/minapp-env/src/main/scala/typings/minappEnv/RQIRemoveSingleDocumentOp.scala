package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.DB.IRemoveSingleDocumentOptions> */
trait RQIRemoveSingleDocumentOp extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.undefined
}

object RQIRemoveSingleDocumentOp {
  @scala.inline
  def apply(config: ICloudConfig = null): RQIRemoveSingleDocumentOp = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQIRemoveSingleDocumentOp]
  }
}


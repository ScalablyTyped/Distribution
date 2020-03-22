package typings.minappEnv

import typings.minappEnv.DB.IUpdateCondition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.DB.IUpdateSingleDocumentOptions> */
trait RQIUpdateSingleDocumentOp extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.undefined
  var data: IUpdateCondition
}

object RQIUpdateSingleDocumentOp {
  @scala.inline
  def apply(data: IUpdateCondition, config: ICloudConfig = null): RQIUpdateSingleDocumentOp = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQIUpdateSingleDocumentOp]
  }
}


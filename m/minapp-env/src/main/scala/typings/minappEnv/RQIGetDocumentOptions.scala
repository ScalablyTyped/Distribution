package typings.minappEnv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.DB.IGetDocumentOptions> */
trait RQIGetDocumentOptions extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.undefined
}

object RQIGetDocumentOptions {
  @scala.inline
  def apply(config: ICloudConfig = null): RQIGetDocumentOptions = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQIGetDocumentOptions]
  }
}


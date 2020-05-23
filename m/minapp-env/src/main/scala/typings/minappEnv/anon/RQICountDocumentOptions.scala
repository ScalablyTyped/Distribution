package typings.minappEnv.anon

import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.DB.ICountDocumentOptions> */
trait RQICountDocumentOptions extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.undefined
}

object RQICountDocumentOptions {
  @scala.inline
  def apply(config: ICloudConfig = null): RQICountDocumentOptions = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQICountDocumentOptions]
  }
}


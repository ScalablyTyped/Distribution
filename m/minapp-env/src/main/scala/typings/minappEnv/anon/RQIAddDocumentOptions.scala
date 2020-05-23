package typings.minappEnv.anon

import typings.minappEnv.DB.IDocumentData
import typings.minappEnv.ICloudConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined minapp-env.RQ<minapp-env.DB.IAddDocumentOptions> */
trait RQIAddDocumentOptions extends js.Object {
  var config: js.UndefOr[ICloudConfig] = js.undefined
  var data: IDocumentData
}

object RQIAddDocumentOptions {
  @scala.inline
  def apply(data: IDocumentData, config: ICloudConfig = null): RQIAddDocumentOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.asInstanceOf[RQIAddDocumentOptions]
  }
}


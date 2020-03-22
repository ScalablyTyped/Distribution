package typings.pollyjsNodeServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@pollyjs/node-server.@pollyjs/node-server.Config> */
trait PartialConfig extends js.Object {
  var apiNamespace: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var quiet: js.UndefOr[Boolean] = js.undefined
  var recordingSizeLimit: js.UndefOr[String] = js.undefined
  var recordingsDir: js.UndefOr[String] = js.undefined
}

object PartialConfig {
  @scala.inline
  def apply(
    apiNamespace: String = null,
    port: Int | Double = null,
    quiet: js.UndefOr[Boolean] = js.undefined,
    recordingSizeLimit: String = null,
    recordingsDir: String = null
  ): PartialConfig = {
    val __obj = js.Dynamic.literal()
    if (apiNamespace != null) __obj.updateDynamic("apiNamespace")(apiNamespace.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.asInstanceOf[js.Any])
    if (recordingSizeLimit != null) __obj.updateDynamic("recordingSizeLimit")(recordingSizeLimit.asInstanceOf[js.Any])
    if (recordingsDir != null) __obj.updateDynamic("recordingsDir")(recordingsDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfig]
  }
}


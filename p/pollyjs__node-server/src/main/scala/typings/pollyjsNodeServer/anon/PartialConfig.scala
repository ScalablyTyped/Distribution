package typings.pollyjsNodeServer.anon

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
    port: js.UndefOr[Double] = js.undefined,
    quiet: js.UndefOr[Boolean] = js.undefined,
    recordingSizeLimit: String = null,
    recordingsDir: String = null
  ): PartialConfig = {
    val __obj = js.Dynamic.literal()
    if (apiNamespace != null) __obj.updateDynamic("apiNamespace")(apiNamespace.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quiet)) __obj.updateDynamic("quiet")(quiet.get.asInstanceOf[js.Any])
    if (recordingSizeLimit != null) __obj.updateDynamic("recordingSizeLimit")(recordingSizeLimit.asInstanceOf[js.Any])
    if (recordingsDir != null) __obj.updateDynamic("recordingsDir")(recordingsDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfig]
  }
}


package typings.pollyjsNodeServer.mod

import typings.cors.mod.CorsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerConfig extends Config {
  var corsOptions: js.UndefOr[CorsOptions] = js.undefined
}

object ServerConfig {
  @scala.inline
  def apply(
    apiNamespace: String,
    port: Double,
    quiet: Boolean,
    recordingSizeLimit: String,
    recordingsDir: String,
    corsOptions: CorsOptions = null
  ): ServerConfig = {
    val __obj = js.Dynamic.literal(apiNamespace = apiNamespace.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], recordingSizeLimit = recordingSizeLimit.asInstanceOf[js.Any], recordingsDir = recordingsDir.asInstanceOf[js.Any])
    if (corsOptions != null) __obj.updateDynamic("corsOptions")(corsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerConfig]
  }
}


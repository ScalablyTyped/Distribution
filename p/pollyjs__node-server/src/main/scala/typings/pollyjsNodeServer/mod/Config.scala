package typings.pollyjsNodeServer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var apiNamespace: String
  var port: Double
  var quiet: Boolean
  var recordingSizeLimit: String
  var recordingsDir: String
}

object Config {
  @scala.inline
  def apply(
    apiNamespace: String,
    port: Double,
    quiet: Boolean,
    recordingSizeLimit: String,
    recordingsDir: String
  ): Config = {
    val __obj = js.Dynamic.literal(apiNamespace = apiNamespace.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], quiet = quiet.asInstanceOf[js.Any], recordingSizeLimit = recordingSizeLimit.asInstanceOf[js.Any], recordingsDir = recordingsDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}


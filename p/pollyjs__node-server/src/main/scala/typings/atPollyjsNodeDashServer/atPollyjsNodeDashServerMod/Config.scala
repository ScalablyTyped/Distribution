package typings.atPollyjsNodeDashServer.atPollyjsNodeDashServerMod

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
    val __obj = js.Dynamic.literal(apiNamespace = apiNamespace, port = port, quiet = quiet, recordingSizeLimit = recordingSizeLimit, recordingsDir = recordingsDir)
  
    __obj.asInstanceOf[Config]
  }
}


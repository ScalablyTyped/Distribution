package typings.nodeDashJsonDashDb.distLibJsonDBConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonDBConfig extends js.Object {
  var filename: String
  var humanReadable: Boolean
  var saveOnPush: Boolean
  var separator: String
}

object JsonDBConfig {
  @scala.inline
  def apply(filename: String, humanReadable: Boolean, saveOnPush: Boolean, separator: String): JsonDBConfig = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], humanReadable = humanReadable.asInstanceOf[js.Any], saveOnPush = saveOnPush.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JsonDBConfig]
  }
}


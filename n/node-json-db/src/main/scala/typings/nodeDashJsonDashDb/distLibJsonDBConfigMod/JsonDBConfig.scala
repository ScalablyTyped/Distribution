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
    val __obj = js.Dynamic.literal(filename = filename, humanReadable = humanReadable, saveOnPush = saveOnPush, separator = separator)
  
    __obj.asInstanceOf[JsonDBConfig]
  }
}


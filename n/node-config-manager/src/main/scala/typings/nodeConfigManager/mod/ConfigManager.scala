package typings.nodeConfigManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigManager extends js.Object {
  var method: js.Any = js.native
  def addConfig(configName: String): ConfigManager = js.native
  def count(): Double = js.native
  def get(key: String): String | Boolean = js.native
  def getConfig(configName: String): js.Any = js.native
  def init(options: Options): ConfigManager = js.native
  def removeConfig(configName: String): ConfigManager = js.native
  def set(key: String, value: String): ConfigManager = js.native
  def set(key: String, value: Boolean): ConfigManager = js.native
}


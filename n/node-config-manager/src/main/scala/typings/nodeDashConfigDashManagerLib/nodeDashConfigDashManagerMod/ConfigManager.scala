package typings
package nodeDashConfigDashManagerLib.nodeDashConfigDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigManager extends js.Object {
  var method: js.Any = js.native
  def addConfig(configName: java.lang.String): ConfigManager = js.native
  def count(): scala.Double = js.native
  def get(key: java.lang.String): java.lang.String | scala.Boolean = js.native
  def getConfig(configName: java.lang.String): js.Any = js.native
  def init(options: Options): ConfigManager = js.native
  def removeConfig(configName: java.lang.String): ConfigManager = js.native
  def set(key: java.lang.String, value: java.lang.String): ConfigManager = js.native
  def set(key: java.lang.String, value: scala.Boolean): ConfigManager = js.native
}


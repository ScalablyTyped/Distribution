package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojlogger", JSImport.Namespace)
@js.native
object ojloggerMod extends js.Object {
  var LEVEL_ERROR: Double = js.native
  var LEVEL_INFO: Double = js.native
  var LEVEL_LOG: Double = js.native
  var LEVEL_NONE: Double = js.native
  var LEVEL_WARN: Double = js.native
  def error(args: (js.Object | String | Double)*): Unit = js.native
  def info(args: (js.Object | String | Double)*): Unit = js.native
  def log(args: (js.Object | String | Double)*): Unit = js.native
  def option(): js.Any = js.native
  def option(key: js.UndefOr[scala.Nothing], value: js.Any): js.Any = js.native
  def option(key: String): js.Any = js.native
  def option(key: String, value: js.Any): js.Any = js.native
  def option(key: js.Object): js.Any = js.native
  def option(key: js.Object, value: js.Any): js.Any = js.native
  def warn(args: (js.Object | String | Double)*): Unit = js.native
}


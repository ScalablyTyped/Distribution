package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojlogger", JSImport.Namespace)
@js.native
object ojloggerMod extends js.Object {
  var LEVEL_ERROR: scala.Double = js.native
  var LEVEL_INFO: scala.Double = js.native
  var LEVEL_LOG: scala.Double = js.native
  var LEVEL_NONE: scala.Double = js.native
  var LEVEL_WARN: scala.Double = js.native
  def error(args: (js.Object | java.lang.String | scala.Double)*): scala.Unit = js.native
  def info(args: (js.Object | java.lang.String | scala.Double)*): scala.Unit = js.native
  def log(args: (js.Object | java.lang.String | scala.Double)*): scala.Unit = js.native
  def option(): js.Any = js.native
  def option(key: java.lang.String): js.Any = js.native
  def option(key: java.lang.String, value: js.Any): js.Any = js.native
  def option(key: js.Object): js.Any = js.native
  def option(key: js.Object, value: js.Any): js.Any = js.native
  def warn(args: (js.Object | java.lang.String | scala.Double)*): scala.Unit = js.native
}


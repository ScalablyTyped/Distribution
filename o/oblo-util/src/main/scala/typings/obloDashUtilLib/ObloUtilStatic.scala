package typings
package obloDashUtilLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObloUtilStatic extends js.Object {
  var debug: scala.Boolean = js.native
  def addslashes(str: java.lang.String): java.lang.String = js.native
  def clip(min: scala.Double, max: scala.Double, x: scala.Double): scala.Double = js.native
  def error(args: js.Any*): scala.Unit = js.native
  def log(args: js.Any*): scala.Unit = js.native
  def pad(c: java.lang.String, l: scala.Double, str: js.Any): java.lang.String = js.native
  def padZero(l: scala.Double, n: scala.Double): java.lang.String = js.native
  def readDate(dateStr: java.lang.String): stdLib.Date = js.native
  def replicate[X](n: scala.Double, x: X): js.Array[X] = js.native
  def setAttr($elt: jqueryLib.JQuery[stdLib.HTMLElement], attrName: java.lang.String, isSet: scala.Boolean): scala.Unit = js.native
  def showDate(date: stdLib.Date): java.lang.String = js.native
  def showJSON(json: js.Any): java.lang.String = js.native
  def showJSON(json: js.Any, indentStr: java.lang.String): java.lang.String = js.native
  def showJSON(json: js.Any, indentStr: java.lang.String, maxDepth: scala.Double): java.lang.String = js.native
  def showTime(date: stdLib.Date): java.lang.String = js.native
  def square(x: scala.Double): scala.Double = js.native
}


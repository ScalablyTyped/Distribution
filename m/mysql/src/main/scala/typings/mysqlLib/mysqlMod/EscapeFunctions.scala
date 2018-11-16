package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EscapeFunctions extends js.Object {
  def escape(value: js.Any): java.lang.String = js.native
  def escape(value: js.Any, stringifyObjects: scala.Boolean): java.lang.String = js.native
  def escape(value: js.Any, stringifyObjects: scala.Boolean, timeZone: java.lang.String): java.lang.String = js.native
  def escapeId(value: java.lang.String): java.lang.String = js.native
  def escapeId(value: java.lang.String, forbidQualified: scala.Boolean): java.lang.String = js.native
  def format(sql: java.lang.String, values: js.Array[_]): java.lang.String = js.native
  def format(sql: java.lang.String, values: js.Array[_], stringifyObjects: scala.Boolean): java.lang.String = js.native
  def format(
    sql: java.lang.String,
    values: js.Array[_],
    stringifyObjects: scala.Boolean,
    timeZone: java.lang.String
  ): java.lang.String = js.native
}


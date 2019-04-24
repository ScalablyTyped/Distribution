package typings
package mysqlLib.mysqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EscapeFunctions extends js.Object {
  /**
    * Escape an untrusted string to be used as a SQL value. Use this on user
    * provided data.
    * @param value Value to escape
    * @param stringifyObjects If true, don't convert objects into SQL lists
    * @param timeZone Convert dates from UTC to the given timezone.
    */
  def escape(value: js.Any): java.lang.String = js.native
  def escape(value: js.Any, stringifyObjects: scala.Boolean): java.lang.String = js.native
  def escape(value: js.Any, stringifyObjects: scala.Boolean, timeZone: java.lang.String): java.lang.String = js.native
  /**
    * Escape an untrusted string to be used as a SQL identifier (database,
    * table, or column name). Use this on user provided data.
    * @param value Value to escape.
    * @param forbidQualified Don't allow qualified identifiers (eg escape '.')
    */
  def escapeId(value: java.lang.String): java.lang.String = js.native
  def escapeId(value: java.lang.String, forbidQualified: scala.Boolean): java.lang.String = js.native
  /**
    * Safely format a SQL query containing multiple untrusted values.
    * @param sql Query, with insertion points specified with ? (for values) or
    * ?? (for identifiers)
    * @param values Array of objects to insert.
    * @param stringifyObjects If true, don't convert objects into SQL lists
    * @param timeZone Convert dates from UTC to the given timezone.
    */
  def format(sql: java.lang.String, values: js.Array[_]): java.lang.String = js.native
  def format(sql: java.lang.String, values: js.Array[_], stringifyObjects: scala.Boolean): java.lang.String = js.native
  def format(
    sql: java.lang.String,
    values: js.Array[_],
    stringifyObjects: scala.Boolean,
    timeZone: java.lang.String
  ): java.lang.String = js.native
}


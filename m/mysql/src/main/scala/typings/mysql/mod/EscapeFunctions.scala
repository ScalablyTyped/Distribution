package typings.mysql.mod

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
  def escape(value: js.Any): String = js.native
  def escape(value: js.Any, stringifyObjects: js.UndefOr[scala.Nothing], timeZone: String): String = js.native
  def escape(value: js.Any, stringifyObjects: Boolean): String = js.native
  def escape(value: js.Any, stringifyObjects: Boolean, timeZone: String): String = js.native
  /**
    * Escape an untrusted string to be used as a SQL identifier (database,
    * table, or column name). Use this on user provided data.
    * @param value Value to escape.
    * @param forbidQualified Don't allow qualified identifiers (eg escape '.')
    */
  def escapeId(value: String): String = js.native
  def escapeId(value: String, forbidQualified: Boolean): String = js.native
  /**
    * Safely format a SQL query containing multiple untrusted values.
    * @param sql Query, with insertion points specified with ? (for values) or
    * ?? (for identifiers)
    * @param values Array of objects to insert.
    * @param stringifyObjects If true, don't convert objects into SQL lists
    * @param timeZone Convert dates from UTC to the given timezone.
    */
  def format(sql: String, values: js.Array[_]): String = js.native
  def format(sql: String, values: js.Array[_], stringifyObjects: js.UndefOr[scala.Nothing], timeZone: String): String = js.native
  def format(sql: String, values: js.Array[_], stringifyObjects: Boolean): String = js.native
  def format(sql: String, values: js.Array[_], stringifyObjects: Boolean, timeZone: String): String = js.native
}


package typings.p5.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableRow extends js.Object {
  /**
    *   Retrieves a value from the TableRow's specified
    *   column. The column may be specified by either its
    *   ID or title.
    *   @param column columnName (string) or ID (number)
    */
  def get(column: String): String | Double = js.native
  def get(column: Double): String | Double = js.native
  /**
    *   Retrieves a Float value from the TableRow's
    *   specified column. The column may be specified by
    *   either its ID or title.
    *   @param column columnName (string) or ID (number)
    *   @return Float Floating point number
    */
  def getNum(column: String): Double = js.native
  def getNum(column: Double): Double = js.native
  /**
    *   Retrieves an String value from the TableRow's
    *   specified column. The column may be specified by
    *   either its ID or title.
    *   @param column columnName (string) or ID (number)
    *   @return String
    */
  def getString(column: String): String = js.native
  def getString(column: Double): String = js.native
  /**
    *   Stores a value in the TableRow's specified column.
    *   The column may be specified by either its ID or
    *   title.
    *   @param column Column ID (Number) or Title (String)
    *   @param value The value to be stored
    */
  def set(column: String, value: String): Unit = js.native
  def set(column: String, value: Double): Unit = js.native
  def set(column: Double, value: String): Unit = js.native
  def set(column: Double, value: Double): Unit = js.native
  def setNum(column: String, value: String): Unit = js.native
  /**
    *   Stores a Float value in the TableRow's specified
    *   column. The column may be specified by either its
    *   ID or title.
    *   @param column Column ID (Number) or Title (String)
    *   @param value The value to be stored as a Float
    */
  def setNum(column: String, value: Double): Unit = js.native
  def setNum(column: Double, value: String): Unit = js.native
  def setNum(column: Double, value: Double): Unit = js.native
  /**
    *   Stores a String value in the TableRow's specified
    *   column. The column may be specified by either its
    *   ID or title.
    *   @param column Column ID (Number) or Title (String)
    *   @param value The value to be stored as a String
    */
  def setString(column: String, value: String): Unit = js.native
  def setString(column: String, value: js.Object): Unit = js.native
  def setString(column: String, value: Boolean): Unit = js.native
  def setString(column: String, value: Double): Unit = js.native
  def setString(column: Double, value: String): Unit = js.native
  def setString(column: Double, value: js.Object): Unit = js.native
  def setString(column: Double, value: Boolean): Unit = js.native
  def setString(column: Double, value: Double): Unit = js.native
}


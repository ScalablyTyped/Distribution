package typings
package p5Lib.p5Mod.p5Ns

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
  def get(column: java.lang.String): java.lang.String | scala.Double = js.native
  /**
       *   Retrieves a value from the TableRow's specified
       *   column. The column may be specified by either its
       *   ID or title.
       *   @param column columnName (string) or ID (number)
       */
  def get(column: scala.Double): java.lang.String | scala.Double = js.native
  /**
       *   Retrieves a Float value from the TableRow's
       *   specified column. The column may be specified by
       *   either its ID or title.
       *   @param column columnName (string) or ID (number)
       *   @return Float Floating point number
       */
  def getNum(column: java.lang.String): scala.Double = js.native
  /**
       *   Retrieves a Float value from the TableRow's
       *   specified column. The column may be specified by
       *   either its ID or title.
       *   @param column columnName (string) or ID (number)
       *   @return Float Floating point number
       */
  def getNum(column: scala.Double): scala.Double = js.native
  /**
       *   Retrieves an String value from the TableRow's
       *   specified column. The column may be specified by
       *   either its ID or title.
       *   @param column columnName (string) or ID (number)
       *   @return String
       */
  def getString(column: java.lang.String): java.lang.String = js.native
  /**
       *   Retrieves an String value from the TableRow's
       *   specified column. The column may be specified by
       *   either its ID or title.
       *   @param column columnName (string) or ID (number)
       *   @return String
       */
  def getString(column: scala.Double): java.lang.String = js.native
  /**
       *   Stores a value in the TableRow's specified column.
       *   The column may be specified by either its ID or
       *   title.
       *   @param column Column ID (Number) or Title (String)
       *   @param value The value to be stored
       */
  def set(column: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
       *   Stores a value in the TableRow's specified column.
       *   The column may be specified by either its ID or
       *   title.
       *   @param column Column ID (Number) or Title (String)
       *   @param value The value to be stored
       */
  def set(column: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
       *   Stores a value in the TableRow's specified column.
       *   The column may be specified by either its ID or
       *   title.
       *   @param column Column ID (Number) or Title (String)
       *   @param value The value to be stored
       */
  def set(column: scala.Double, value: java.lang.String): scala.Unit = js.native
  /**
       *   Stores a value in the TableRow's specified column.
       *   The column may be specified by either its ID or
       *   title.
       *   @param column Column ID (Number) or Title (String)
       *   @param value The value to be stored
       */
  def set(column: scala.Double, value: scala.Double): scala.Unit = js.native
  /**
       *   Stores a Float value in the TableRow's specified
       *   column. The column may be specified by either its
       *   ID or title.
       *   @param column Column ID (Number) or Title (String)
       *   @param value The value to be stored as a Float
       */
  def setNum(column: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
       *   Stores a Float value in the TableRow's specified
       *   column. The column may be specified by either its
       *   ID or title.
       *   @param column Column ID (Number) or Title (String)
       *   @param value The value to be stored as a Float
       */
  def setNum(column: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
       *   Stores a Float value in the TableRow's specified
       *   column. The column may be specified by either its
       *   ID or title.
       *   @param column Column ID (Number) or Title (String)
       *   @param value The value to be stored as a Float
       */
  def setNum(column: scala.Double, value: java.lang.String): scala.Unit = js.native
  /**
       *   Stores a Float value in the TableRow's specified
       *   column. The column may be specified by either its
       *   ID or title.
       *   @param column Column ID (Number) or Title (String)
       *   @param value The value to be stored as a Float
       */
  def setNum(column: scala.Double, value: scala.Double): scala.Unit = js.native
  /**
       *   Stores a String value in the TableRow's specified
       *   column. The column may be specified by either its
       *   ID or title.
       *   @param column Column ID (Number) or Title (String)
       *   @param value The value to be stored as a String
       */
  def setString(column: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
       *   Stores a String value in the TableRow's specified
       *   column. The column may be specified by either its
       *   ID or title.
       *   @param column Column ID (Number) or Title (String)
       *   @param value The value to be stored as a String
       */
  def setString(column: java.lang.String, value: js.Object): scala.Unit = js.native
  /**
       *   Stores a String value in the TableRow's specified
       *   column. The column may be specified by either its
       *   ID or title.
       *   @param column Column ID (Number) or Title (String)
       *   @param value The value to be stored as a String
       */
  def setString(column: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  /**
       *   Stores a String value in the TableRow's specified
       *   column. The column may be specified by either its
       *   ID or title.
       *   @param column Column ID (Number) or Title (String)
       *   @param value The value to be stored as a String
       */
  def setString(column: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
       *   Stores a String value in the TableRow's specified
       *   column. The column may be specified by either its
       *   ID or title.
       *   @param column Column ID (Number) or Title (String)
       *   @param value The value to be stored as a String
       */
  def setString(column: scala.Double, value: java.lang.String): scala.Unit = js.native
  /**
       *   Stores a String value in the TableRow's specified
       *   column. The column may be specified by either its
       *   ID or title.
       *   @param column Column ID (Number) or Title (String)
       *   @param value The value to be stored as a String
       */
  def setString(column: scala.Double, value: js.Object): scala.Unit = js.native
  /**
       *   Stores a String value in the TableRow's specified
       *   column. The column may be specified by either its
       *   ID or title.
       *   @param column Column ID (Number) or Title (String)
       *   @param value The value to be stored as a String
       */
  def setString(column: scala.Double, value: scala.Boolean): scala.Unit = js.native
  /**
       *   Stores a String value in the TableRow's specified
       *   column. The column may be specified by either its
       *   ID or title.
       *   @param column Column ID (Number) or Title (String)
       *   @param value The value to be stored as a String
       */
  def setString(column: scala.Double, value: scala.Double): scala.Unit = js.native
}


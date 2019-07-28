package typings.p5.p5Mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Table extends js.Object {
  var columns: js.Array[String] = js.native
  var rows: js.Array[TableRow] = js.native
  /**
    *   Use addColumn() to add a new column to a Table
    *   object. Typically, you will want to specify a
    *   title, so the column may be easily referenced
    *   later by name. (If no title is specified, the new
    *   column's title will be null.)
    *   @param [title] title of the given column
    */
  def addColumn(): Unit = js.native
  def addColumn(title: String): Unit = js.native
  /**
    *   Use addRow() to add a new row of data to a
    *   p5.Table object. By default, an empty row is
    *   created. Typically, you would store a reference to
    *   the new row in a TableRow object (see newRow in
    *   the example above), and then set individual values
    *   using set(). If a p5.TableRow object is included
    *   as a parameter, then that row is duplicated and
    *   added to the table.
    *   @param [row] row to be added to the table
    *   @return the row that was added
    */
  def addRow(): TableRow = js.native
  def addRow(row: TableRow): TableRow = js.native
  /**
    *   Removes all rows from a Table. While all rows are
    *   removed, columns and column titles are maintained.
    */
  def clearRows(): Unit = js.native
  def findRow(value: String, column: String): TableRow = js.native
  /**
    *   Finds the first row in the Table that contains the
    *   value provided, and returns a reference to that
    *   row. Even if multiple rows are possible matches,
    *   only the first matching row is returned. The
    *   column to search may be specified by either its ID
    *   or title.
    *   @param value The value to match
    *   @param column ID number or title of the column to
    *   search
    */
  def findRow(value: String, column: Double): TableRow = js.native
  def findRows(value: String, column: String): js.Array[TableRow] = js.native
  /**
    *   Finds the rows in the Table that contain the value
    *   provided, and returns references to those rows.
    *   Returns an Array, so for must be used to iterate
    *   through all the rows, as shown in the example
    *   above. The column to search may be specified by
    *   either its ID or title.
    *   @param value The value to match
    *   @param column ID number or title of the column to
    *   search
    *   @return An Array of TableRow objects
    */
  def findRows(value: String, column: Double): js.Array[TableRow] = js.native
  /**
    *   Retrieves a value from the Table's specified row
    *   and column. The row is specified by its ID, while
    *   the column may be specified by either its ID or
    *   title.
    *   @param row row ID
    *   @param column columnName (string) or ID (number)
    */
  def get(row: Double, column: String): String | Double = js.native
  def get(row: Double, column: Double): String | Double = js.native
  /**
    *   Retrieves all table data and returns it as a
    *   multidimensional array.
    */
  def getArray(): js.Array[_] = js.native
  /**
    *   Retrieves all values in the specified column, and
    *   returns them as an array. The column may be
    *   specified by either its ID or title.
    *   @param column String or Number of the column to
    *   return
    *   @return Array of column values
    */
  def getColumn(column: String): js.Array[_] = js.native
  def getColumn(column: Double): js.Array[_] = js.native
  /**
    *   Returns the total number of columns in a Table.
    *   @return Number of columns in this table
    */
  def getColumnCount(): Double = js.native
  /**
    *   Retrieves a Float value from the Table's specified
    *   row and column. The row is specified by its ID,
    *   while the column may be specified by either its ID
    *   or title.
    *   @param row row ID
    *   @param column columnName (string) or ID (number)
    */
  def getNum(row: Double, column: String): Double = js.native
  def getNum(row: Double, column: Double): Double = js.native
  /**
    *   Retrieves all table data and returns as an object.
    *   If a column name is passed in, each row object
    *   will be stored with that attribute as its title.
    *   @param [headerColumn] Name of the column which
    *   should be used to title each row object (optional)
    */
  def getObject(): js.Object = js.native
  def getObject(headerColumn: String): js.Object = js.native
  /**
    *   Returns a reference to the specified p5.TableRow.
    *   The reference can then be used to get and set
    *   values of the selected row.
    *   @param rowID ID number of the row to get
    *   @return p5.TableRow object
    */
  def getRow(rowID: Double): TableRow = js.native
  /**
    *   Returns the total number of rows in a Table.
    *   @return Number of rows in this table
    */
  def getRowCount(): Double = js.native
  /**
    *   Gets all rows from the table. Returns an array of
    *   p5.TableRows.
    *   @return Array of p5.TableRows
    */
  def getRows(): js.Array[TableRow] = js.native
  /**
    *   Retrieves a String value from the Table's
    *   specified row and column. The row is specified by
    *   its ID, while the column may be specified by
    *   either its ID or title.
    *   @param row row ID
    *   @param column columnName (string) or ID (number)
    */
  def getString(row: Double, column: String): String = js.native
  def getString(row: Double, column: Double): String = js.native
  /**
    *   Finds the first row in the Table that matches the
    *   regular expression provided, and returns a
    *   reference to that row. Even if multiple rows are
    *   possible matches, only the first matching row is
    *   returned. The column to search may be specified by
    *   either its ID or title.
    *   @param regexp The regular expression to match
    *   @param column The column ID (number) or title
    *   (string)
    *   @return TableRow object
    */
  def matchRow(regexp: String, column: String): TableRow = js.native
  def matchRow(regexp: String, column: Double): TableRow = js.native
  def matchRow(regexp: RegExp, column: String): TableRow = js.native
  def matchRow(regexp: RegExp, column: Double): TableRow = js.native
  /**
    *   Finds the rows in the Table that match the regular
    *   expression provided, and returns references to
    *   those rows. Returns an array, so for must be used
    *   to iterate through all the rows, as shown in the
    *   example. The column to search may be specified by
    *   either its ID or title.
    *   @param regexp The regular expression to match
    *   @param [column] The column ID (number) or title
    *   (string)
    *   @return An Array of TableRow objects
    */
  def matchRows(regexp: String): js.Array[TableRow] = js.native
  def matchRows(regexp: String, column: String): js.Array[TableRow] = js.native
  def matchRows(regexp: String, column: Double): js.Array[TableRow] = js.native
  /**
    *   Use removeColumn() to remove an existing column
    *   from a Table object. The column to be removed may
    *   be identified by either its title (a String) or
    *   its index value (an int). removeColumn(0) would
    *   remove the first column, removeColumn(1) would
    *   remove the second column, and so on.
    *   @param column columnName (string) or ID (number)
    */
  def removeColumn(column: String): Unit = js.native
  def removeColumn(column: Double): Unit = js.native
  /**
    *   Removes a row from the table object.
    *   @param id ID number of the row to remove
    */
  def removeRow(id: Double): Unit = js.native
  /**
    *   Removes any of the specified characters (or
    *   "tokens"). If no column is specified, then the
    *   values in all columns and rows are processed. A
    *   specific column may be referenced by either its ID
    *   or title.
    *   @param chars String listing characters to be
    *   removed
    *   @param [column] Column ID (number) or name
    *   (string)
    */
  def removeTokens(chars: String): Unit = js.native
  def removeTokens(chars: String, column: String): Unit = js.native
  def removeTokens(chars: String, column: Double): Unit = js.native
  /**
    *   Stores a value in the Table's specified row and
    *   column. The row is specified by its ID, while the
    *   column may be specified by either its ID or title.
    *   @param row row ID
    *   @param column column ID (Number) or title (String)
    *   @param value value to assign
    */
  def set(row: Double, column: String, value: String): Unit = js.native
  def set(row: Double, column: String, value: Double): Unit = js.native
  def set(row: Double, column: Double, value: String): Unit = js.native
  def set(row: Double, column: Double, value: Double): Unit = js.native
  /**
    *   Stores a Float value in the Table's specified row
    *   and column. The row is specified by its ID, while
    *   the column may be specified by either its ID or
    *   title.
    *   @param row row ID
    *   @param column column ID (Number) or title (String)
    *   @param value value to assign
    */
  def setNum(row: Double, column: String, value: Double): Unit = js.native
  def setNum(row: Double, column: Double, value: Double): Unit = js.native
  /**
    *   Stores a String value in the Table's specified row
    *   and column. The row is specified by its ID, while
    *   the column may be specified by either its ID or
    *   title.
    *   @param row row ID
    *   @param column column ID (Number) or title (String)
    *   @param value value to assign
    */
  def setString(row: Double, column: String, value: String): Unit = js.native
  def setString(row: Double, column: Double, value: String): Unit = js.native
  /**
    *   Trims leading and trailing whitespace, such as
    *   spaces and tabs, from String table values. If no
    *   column is specified, then the values in all
    *   columns and rows are trimmed. A specific column
    *   may be referenced by either its ID or title.
    *   @param [column] Column ID (number) or name
    *   (string)
    */
  def trim(): Unit = js.native
  def trim(column: String): Unit = js.native
  def trim(column: Double): Unit = js.native
}


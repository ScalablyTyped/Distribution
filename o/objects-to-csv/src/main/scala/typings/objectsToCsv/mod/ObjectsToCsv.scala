package typings.objectsToCsv.mod

import typings.objectsToCsv.anon.AllColumns
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectsToCsv extends js.Object {
  
  /**
    * Private method to run the actual conversion of array of objects to CSV data.
    * @param data Data to be converted.
    * @param header Whether the first line should contain column headers.
    * @param allColumns Whether to check all items for column names.
    *   Uses only the first item if false.
    * @returns Data converted to a CSV string.
    */
  def convert(data: js.Array[js.Object]): js.Promise[String] = js.native
  def convert(data: js.Array[js.Object], header: js.UndefOr[scala.Nothing], allColumns: Boolean): js.Promise[String] = js.native
  def convert(data: js.Array[js.Object], header: Boolean): js.Promise[String] = js.native
  def convert(data: js.Array[js.Object], header: Boolean, allColumns: Boolean): js.Promise[String] = js.native
  
  /**
    * Holds data to be converted.
    */
  var data: js.Array[js.Object] = js.native
  
  /**
    * Saves the CSV file to the specified file.
    * @param filename The path and filename of the new CSV file.
    * @param options The options for writing to disk.
    * @param options.append Whether to append to file. Default is overwrite (false).
    * @param options.bom Append the BOM mark so that Excel shows
    * @param options.allColumns Whether to check all items for column names or only the first.  Default is the first.
    * @returns Data converted to a CSV string.
    */
  def toDisk(filename: String): js.Promise[String] = js.native
  def toDisk(filename: String, options: AllColumns): js.Promise[String] = js.native
  
  def toString(header: js.UndefOr[scala.Nothing], allColumns: Boolean): js.Promise[String] = js.native
  def toString(header: Boolean): js.Promise[String] = js.native
  def toString(header: Boolean, allColumns: Boolean): js.Promise[String] = js.native
}

package typings
package p5Lib.p5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p5", "Table")
@js.native
/**
  *   Table objects store data with multiple rows and
  *   columns, much like in a traditional spreadsheet.
  *   Tables can be generated from scratch, dynamically,
  *   or using data from an existing file.
  *
  *   @param [rows] An array of p5.TableRow objects
  */
class Table ()
  extends p5Lib.p5Mod.p5Ns.Table {
  def this(rows: js.Array[TableRow]) = this()
}


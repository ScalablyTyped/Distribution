package typings
package nodalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Columns extends js.Object {
  var columns: js.Array[nodalLib.nodalMod.IColumn]
  var table: java.lang.String
}

object Anon_Columns {
  @scala.inline
  def apply(columns: js.Array[nodalLib.nodalMod.IColumn], table: java.lang.String): Anon_Columns = {
    val __obj = js.Dynamic.literal(columns = columns, table = table)
  
    __obj.asInstanceOf[Anon_Columns]
  }
}


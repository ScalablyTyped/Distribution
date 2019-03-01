package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DragDrop extends js.Object {
  var drag: Anon_Nodes
  var drop: Anon_Background
}

object Anon_DragDrop {
  @scala.inline
  def apply(drag: Anon_Nodes, drop: Anon_Background): Anon_DragDrop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("drag")(drag)
    __obj.updateDynamic("drop")(drop)
    __obj.asInstanceOf[Anon_DragDrop]
  }
}


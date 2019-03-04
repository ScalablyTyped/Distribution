package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertElement[K2, D2] extends js.Object {
  def renderer(context: atOracleOraclejetLib.ojganttMod.ojGanttNs.RowAxisLabelRendererContext[K2, D2]): Anon_InsertElement
}

object Anon_ContextRendererAnonInsertElement {
  @scala.inline
  def apply[K2, D2](
    renderer: js.Function1[
      atOracleOraclejetLib.ojganttMod.ojGanttNs.RowAxisLabelRendererContext[K2, D2], 
      Anon_InsertElement
    ]
  ): Anon_ContextRendererAnonInsertElement[K2, D2] = {
    val __obj = js.Dynamic.literal(renderer = renderer)
  
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertElement[K2, D2]]
  }
}


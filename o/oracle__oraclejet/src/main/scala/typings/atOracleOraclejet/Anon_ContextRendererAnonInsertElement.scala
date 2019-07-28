package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojganttMod.ojGanttNs.RowAxisLabelRendererContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertElement[K2, D2] extends js.Object {
  def renderer(context: RowAxisLabelRendererContext[K2, D2]): Anon_InsertElement
}

object Anon_ContextRendererAnonInsertElement {
  @scala.inline
  def apply[K2, D2](renderer: RowAxisLabelRendererContext[K2, D2] => Anon_InsertElement): Anon_ContextRendererAnonInsertElement[K2, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertElement[K2, D2]]
  }
}


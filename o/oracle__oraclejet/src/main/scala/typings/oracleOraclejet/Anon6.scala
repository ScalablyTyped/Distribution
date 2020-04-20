package typings.oracleOraclejet

import typings.oracleOraclejet.ojganttMod.ojGantt.RowAxisLabelRendererContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon6[K2, D2] extends js.Object {
  def renderer(context: RowAxisLabelRendererContext[K2, D2]): AnonInsertElement
}

object Anon6 {
  @scala.inline
  def apply[K2, D2](renderer: RowAxisLabelRendererContext[K2, D2] => AnonInsertElement): Anon6[K2, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Anon6[K2, D2]]
  }
}


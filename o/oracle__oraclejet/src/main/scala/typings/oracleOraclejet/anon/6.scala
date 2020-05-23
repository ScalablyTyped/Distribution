package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojganttMod.ojGantt.RowAxisLabelRendererContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `6`[K2, D2] extends js.Object {
  def renderer(context: RowAxisLabelRendererContext[K2, D2]): InsertElement
}

object `6` {
  @scala.inline
  def apply[K2, D2](renderer: RowAxisLabelRendererContext[K2, D2] => InsertElement): `6`[K2, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`6`[K2, D2]]
  }
}


package typings.oracleOraclejet

import typings.oracleOraclejet.ojtreemapMod.ojTreemap.NodeContentContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon26[K, D] extends js.Object {
  def renderer(context: NodeContentContext[K, D]): AnonInsert
}

object Anon26 {
  @scala.inline
  def apply[K, D](renderer: NodeContentContext[K, D] => AnonInsert): Anon26[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon26[K, D]]
  }
}


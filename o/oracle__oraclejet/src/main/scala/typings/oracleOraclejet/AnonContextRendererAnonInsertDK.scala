package typings.oracleOraclejet

import typings.oracleOraclejet.ojtreemapMod.ojTreemap.NodeContentContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextRendererAnonInsertDK[K, D] extends js.Object {
  def renderer(context: NodeContentContext[K, D]): AnonInsert
}

object AnonContextRendererAnonInsertDK {
  @scala.inline
  def apply[K, D](renderer: NodeContentContext[K, D] => AnonInsert): AnonContextRendererAnonInsertDK[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[AnonContextRendererAnonInsertDK[K, D]]
  }
}


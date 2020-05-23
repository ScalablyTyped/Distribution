package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtreemapMod.ojTreemap.NodeContentContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `26`[K, D] extends js.Object {
  def renderer(context: NodeContentContext[K, D]): Insert
}

object `26` {
  @scala.inline
  def apply[K, D](renderer: NodeContentContext[K, D] => Insert): `26`[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`26`[K, D]]
  }
}


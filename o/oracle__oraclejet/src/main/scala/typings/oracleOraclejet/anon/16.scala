package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojsunburstMod.ojSunburst.RootNodeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `16`[K, D] extends js.Object {
  def renderer(context: RootNodeContext[K, D]): Insert
}

object `16` {
  @scala.inline
  def apply[K, D](renderer: RootNodeContext[K, D] => Insert): `16`[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`16`[K, D]]
  }
}


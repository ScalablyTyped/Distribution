package typings.oracleOraclejet

import typings.oracleOraclejet.ojsunburstMod.ojSunburst.RootNodeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon16[K, D] extends js.Object {
  def renderer(context: RootNodeContext[K, D]): AnonInsert
}

object Anon16 {
  @scala.inline
  def apply[K, D](renderer: RootNodeContext[K, D] => AnonInsert): Anon16[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon16[K, D]]
  }
}


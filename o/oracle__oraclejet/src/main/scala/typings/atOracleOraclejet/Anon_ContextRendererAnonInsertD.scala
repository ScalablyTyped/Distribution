package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojsunburstMod.ojSunburst.RootNodeContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRendererAnonInsertD[K, D] extends js.Object {
  def renderer(context: RootNodeContext[K, D]): Anon_Insert
}

object Anon_ContextRendererAnonInsertD {
  @scala.inline
  def apply[K, D](renderer: RootNodeContext[K, D] => Anon_Insert): Anon_ContextRendererAnonInsertD[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon_ContextRendererAnonInsertD[K, D]]
  }
}


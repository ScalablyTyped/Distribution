package typings.oracleOraclejet

import typings.oracleOraclejet.ojtagcloudMod.ojTagCloud.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon24[K] extends js.Object {
  def renderer(context: TooltipContext[K]): AnonInsert | AnonPreventDefault
}

object Anon24 {
  @scala.inline
  def apply[K](renderer: TooltipContext[K] => AnonInsert | AnonPreventDefault): Anon24[K] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon24[K]]
  }
}


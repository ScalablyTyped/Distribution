package typings.moji.mojiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MojisyuRange extends js.Object {
  var end: Double
  var start: Double
}

object MojisyuRange {
  @scala.inline
  def apply(end: Double, start: Double): MojisyuRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MojisyuRange]
  }
}


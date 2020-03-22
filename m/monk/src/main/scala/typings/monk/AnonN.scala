package typings.monk

import typings.monk.monkNumbers.`0`
import typings.monk.monkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonN extends js.Object {
  var n: Double
  var ok: `1` | `0`
}

object AnonN {
  @scala.inline
  def apply(n: Double, ok: `1` | `0`): AnonN = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonN]
  }
}


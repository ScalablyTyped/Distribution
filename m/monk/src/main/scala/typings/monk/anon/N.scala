package typings.monk.anon

import typings.monk.monkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait N extends js.Object {
  var n: Double
  var ok: `1` | typings.monk.monkNumbers.`0`
}

object N {
  @scala.inline
  def apply(n: Double, ok: `1` | typings.monk.monkNumbers.`0`): N = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[N]
  }
}


package typings.monk.anon

import typings.monk.monkNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NModified extends js.Object {
  var n: Double
  var nModified: Double
  var ok: `1` | typings.monk.monkNumbers.`0`
}

object NModified {
  @scala.inline
  def apply(n: Double, nModified: Double, ok: `1` | typings.monk.monkNumbers.`0`): NModified = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], nModified = nModified.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[NModified]
  }
}


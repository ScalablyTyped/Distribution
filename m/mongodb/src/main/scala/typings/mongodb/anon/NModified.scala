package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NModified extends js.Object {
  var n: Double
  var nModified: Double
  var ok: Double
}

object NModified {
  @scala.inline
  def apply(n: Double, nModified: Double, ok: Double): NModified = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], nModified = nModified.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[NModified]
  }
}


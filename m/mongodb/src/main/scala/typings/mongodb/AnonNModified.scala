package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNModified extends js.Object {
  var n: Double
  var nModified: Double
  var ok: Double
}

object AnonNModified {
  @scala.inline
  def apply(n: Double, nModified: Double, ok: Double): AnonNModified = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], nModified = nModified.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNModified]
  }
}


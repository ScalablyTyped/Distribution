package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNNModified extends js.Object {
  var n: Double
  var nModified: Double
  var ok: Double
}

object AnonNNModified {
  @scala.inline
  def apply(n: Double, nModified: Double, ok: Double): AnonNNModified = {
    val __obj = js.Dynamic.literal(n = n.asInstanceOf[js.Any], nModified = nModified.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNNModified]
  }
}


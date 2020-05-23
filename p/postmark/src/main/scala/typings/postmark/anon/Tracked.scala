package typings.postmark.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tracked extends js.Object {
  var Date: String
  var Tracked: Double
}

object Tracked {
  @scala.inline
  def apply(Date: String, Tracked: Double): Tracked = {
    val __obj = js.Dynamic.literal(Date = Date.asInstanceOf[js.Any], Tracked = Tracked.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tracked]
  }
}


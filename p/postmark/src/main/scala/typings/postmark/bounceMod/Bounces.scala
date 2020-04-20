package typings.postmark.bounceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bounces extends js.Object {
  var Bounces: js.Array[Bounce]
  var TotalCount: Double
}

object Bounces {
  @scala.inline
  def apply(Bounces: js.Array[Bounce], TotalCount: Double): Bounces = {
    val __obj = js.Dynamic.literal(Bounces = Bounces.asInstanceOf[js.Any], TotalCount = TotalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bounces]
  }
}


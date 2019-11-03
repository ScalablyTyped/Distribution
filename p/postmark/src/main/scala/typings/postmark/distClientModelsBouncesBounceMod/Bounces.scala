package typings.postmark.distClientModelsBouncesBounceMod

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
    val __obj = js.Dynamic.literal(Bounces = Bounces, TotalCount = TotalCount)
  
    __obj.asInstanceOf[Bounces]
  }
}


package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BounceID extends js.Object {
  var BounceID: Double
  var Summary: String
}

object Anon_BounceID {
  @scala.inline
  def apply(BounceID: Double, Summary: String): Anon_BounceID = {
    val __obj = js.Dynamic.literal(BounceID = BounceID, Summary = Summary)
  
    __obj.asInstanceOf[Anon_BounceID]
  }
}


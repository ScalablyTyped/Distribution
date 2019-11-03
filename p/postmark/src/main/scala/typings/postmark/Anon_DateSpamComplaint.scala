package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateSpamComplaint extends js.Object {
  var Date: String
  var SpamComplaint: Double
}

object Anon_DateSpamComplaint {
  @scala.inline
  def apply(Date: String, SpamComplaint: Double): Anon_DateSpamComplaint = {
    val __obj = js.Dynamic.literal(Date = Date, SpamComplaint = SpamComplaint)
  
    __obj.asInstanceOf[Anon_DateSpamComplaint]
  }
}


package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var Date: String
  var Sent: Double
}

object Anon_Date {
  @scala.inline
  def apply(Date: String, Sent: Double): Anon_Date = {
    val __obj = js.Dynamic.literal(Date = Date, Sent = Sent)
  
    __obj.asInstanceOf[Anon_Date]
  }
}


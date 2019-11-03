package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateTracked extends js.Object {
  var Date: String
  var Tracked: Double
}

object Anon_DateTracked {
  @scala.inline
  def apply(Date: String, Tracked: Double): Anon_DateTracked = {
    val __obj = js.Dynamic.literal(Date = Date, Tracked = Tracked)
  
    __obj.asInstanceOf[Anon_DateTracked]
  }
}


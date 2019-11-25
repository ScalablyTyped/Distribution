package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clicks extends js.Object {
  var Clicks: Double
  var Date: String
  var Unique: Double
}

object Anon_Clicks {
  @scala.inline
  def apply(Clicks: Double, Date: String, Unique: Double): Anon_Clicks = {
    val __obj = js.Dynamic.literal(Clicks = Clicks.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], Unique = Unique.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Clicks]
  }
}


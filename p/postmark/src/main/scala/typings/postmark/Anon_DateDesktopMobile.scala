package typings.postmark

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateDesktopMobile extends js.Object {
  var Date: String
  var Desktop: Double
  var Mobile: Double
  var Unknown: Double
}

object Anon_DateDesktopMobile {
  @scala.inline
  def apply(Date: String, Desktop: Double, Mobile: Double, Unknown: Double): Anon_DateDesktopMobile = {
    val __obj = js.Dynamic.literal(Date = Date, Desktop = Desktop, Mobile = Mobile, Unknown = Unknown)
  
    __obj.asInstanceOf[Anon_DateDesktopMobile]
  }
}


package typings.mobileDetect

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFullPattern extends js.Object {
  var fullPattern: RegExp
  var shortPattern: RegExp
  var tabletPattern: RegExp
}

object AnonFullPattern {
  @scala.inline
  def apply(fullPattern: RegExp, shortPattern: RegExp, tabletPattern: RegExp): AnonFullPattern = {
    val __obj = js.Dynamic.literal(fullPattern = fullPattern.asInstanceOf[js.Any], shortPattern = shortPattern.asInstanceOf[js.Any], tabletPattern = tabletPattern.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFullPattern]
  }
}


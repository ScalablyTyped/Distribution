package typings.nodemon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRe extends js.Object {
  var re: String
}

object AnonRe {
  @scala.inline
  def apply(re: String): AnonRe = {
    val __obj = js.Dynamic.literal(re = re.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRe]
  }
}


package typings.nedbLogger

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilename extends js.Object {
  var filename: String
}

object AnonFilename {
  @scala.inline
  def apply(filename: String): AnonFilename = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilename]
  }
}


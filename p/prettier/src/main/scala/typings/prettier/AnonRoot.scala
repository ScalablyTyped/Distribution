package typings.prettier

import typings.prettier.prettierStrings.root
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRoot extends js.Object {
  var `type`: root
}

object AnonRoot {
  @scala.inline
  def apply(`type`: root): AnonRoot = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRoot]
  }
}


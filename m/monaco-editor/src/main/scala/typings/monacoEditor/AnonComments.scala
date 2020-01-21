package typings.monacoEditor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComments extends js.Object {
  var comments: Boolean
  var other: Boolean
  var strings: Boolean
}

object AnonComments {
  @scala.inline
  def apply(comments: Boolean, other: Boolean, strings: Boolean): AnonComments = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], strings = strings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonComments]
  }
}


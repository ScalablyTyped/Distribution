package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContenttypeString extends js.Object {
  var `content-type`: String
}

object ContenttypeString {
  @scala.inline
  def apply(`content-type`: String): ContenttypeString = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContenttypeString]
  }
}


package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentLookupFailure extends js.Object {
  var error: String
  var key: String
}

object DocumentLookupFailure {
  @scala.inline
  def apply(error: String, key: String): DocumentLookupFailure = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLookupFailure]
  }
}


package typings.nano.mod

import typings.nano.anon.Rev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -------------------------------------
// Document scope request and response
// -------------------------------------
trait DocumentResponseRowMeta extends js.Object {
  var id: String
  var key: String
  var value: Rev
}

object DocumentResponseRowMeta {
  @scala.inline
  def apply(id: String, key: String, value: Rev): DocumentResponseRowMeta = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentResponseRowMeta]
  }
}


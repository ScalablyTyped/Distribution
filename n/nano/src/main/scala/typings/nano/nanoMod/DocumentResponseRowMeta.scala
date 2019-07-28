package typings.nano.nanoMod

import typings.nano.Anon_Rev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -------------------------------------
// Document scope request and response
// -------------------------------------
trait DocumentResponseRowMeta extends js.Object {
  var id: String
  var key: String
  var value: Anon_Rev
}

object DocumentResponseRowMeta {
  @scala.inline
  def apply(id: String, key: String, value: Anon_Rev): DocumentResponseRowMeta = {
    val __obj = js.Dynamic.literal(id = id, key = key, value = value)
  
    __obj.asInstanceOf[DocumentResponseRowMeta]
  }
}


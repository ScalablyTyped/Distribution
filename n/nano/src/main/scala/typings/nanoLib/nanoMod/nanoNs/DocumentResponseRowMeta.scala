package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// -------------------------------------
// Document scope request and response
// -------------------------------------
trait DocumentResponseRowMeta extends js.Object {
  var id: java.lang.String
  var key: java.lang.String
  var value: nanoLib.Anon_Rev
}

object DocumentResponseRowMeta {
  @scala.inline
  def apply(id: java.lang.String, key: java.lang.String, value: nanoLib.Anon_Rev): DocumentResponseRowMeta = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DocumentResponseRowMeta]
  }
}


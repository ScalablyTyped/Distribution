package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyId extends js.Object {
  var keyId: js.UndefOr[java.lang.String] = js.undefined
  var query: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_KeyId {
  @scala.inline
  def apply(keyId: java.lang.String = null, query: java.lang.String = null): Anon_KeyId = {
    val __obj = js.Dynamic.literal()
    if (keyId != null) __obj.updateDynamic("keyId")(keyId)
    if (query != null) __obj.updateDynamic("query")(query)
    __obj.asInstanceOf[Anon_KeyId]
  }
}


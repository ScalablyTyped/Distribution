package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchByKeysParameters[K] extends js.Object {
  var attributes: js.UndefOr[js.Array[java.lang.String | FetchAttribute]] = js.undefined
  var keys: stdLib.Set[K]
}

object FetchByKeysParameters {
  @scala.inline
  def apply[K](keys: stdLib.Set[K], attributes: js.Array[java.lang.String | FetchAttribute] = null): FetchByKeysParameters[K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("keys")(keys)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[FetchByKeysParameters[K]]
  }
}


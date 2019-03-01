package typings
package atOracleOraclejetLib.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchAttribute extends js.Object {
  var attributes: js.UndefOr[js.Array[java.lang.String | FetchAttribute]] = js.undefined
  var name: java.lang.String
}

object FetchAttribute {
  @scala.inline
  def apply(name: java.lang.String, attributes: js.Array[java.lang.String | FetchAttribute] = null): FetchAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[FetchAttribute]
  }
}


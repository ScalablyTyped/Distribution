package typings.atOracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchAttribute extends js.Object {
  var attributes: js.UndefOr[js.Array[String | FetchAttribute]] = js.undefined
  var name: String
}

object FetchAttribute {
  @scala.inline
  def apply(name: String, attributes: js.Array[String | FetchAttribute] = null): FetchAttribute = {
    val __obj = js.Dynamic.literal(name = name)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[FetchAttribute]
  }
}


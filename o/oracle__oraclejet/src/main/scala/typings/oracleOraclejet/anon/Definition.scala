package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Definition extends js.Object {
  var definition: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
}

object Definition {
  @scala.inline
  def apply(definition: String = null, source: String = null): Definition = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Definition]
  }
}


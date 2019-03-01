package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Definition extends js.Object {
  var definition: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Definition {
  @scala.inline
  def apply(definition: java.lang.String = null, source: java.lang.String = null): Anon_Definition = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Anon_Definition]
  }
}


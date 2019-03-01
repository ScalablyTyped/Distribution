package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefinitionSource extends js.Object {
  var definition: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var source: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Anon_DefinitionSource {
  @scala.inline
  def apply(definition: java.lang.String = null, source: java.lang.String = null): Anon_DefinitionSource = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition)
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[Anon_DefinitionSource]
  }
}


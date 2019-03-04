package typings
package atOracleOraclejetLib.ojcompositeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropertyChangedContext extends js.Object {
  var previousValue: js.Any
  var property: java.lang.String
  var subproperty: js.UndefOr[atOracleOraclejetLib.Anon_Path] = js.undefined
  var updatedFrom: atOracleOraclejetLib.atOracleOraclejetLibStrings.external | atOracleOraclejetLib.atOracleOraclejetLibStrings.internal
  var value: js.Any
}

object PropertyChangedContext {
  @scala.inline
  def apply(
    previousValue: js.Any,
    property: java.lang.String,
    updatedFrom: atOracleOraclejetLib.atOracleOraclejetLibStrings.external | atOracleOraclejetLib.atOracleOraclejetLibStrings.internal,
    value: js.Any,
    subproperty: atOracleOraclejetLib.Anon_Path = null
  ): PropertyChangedContext = {
    val __obj = js.Dynamic.literal(previousValue = previousValue, property = property, updatedFrom = updatedFrom.asInstanceOf[js.Any], value = value)
    if (subproperty != null) __obj.updateDynamic("subproperty")(subproperty)
    __obj.asInstanceOf[PropertyChangedContext]
  }
}


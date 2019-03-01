package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Path extends js.Object {
  var path: java.lang.String
  var previousValue: js.Any
  var value: js.Any
}

object Anon_Path {
  @scala.inline
  def apply(path: java.lang.String, previousValue: js.Any, value: js.Any): Anon_Path = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("previousValue")(previousValue)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Path]
  }
}


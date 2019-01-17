package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultParseFunction extends js.Object {
  var metadata: atOracleOraclejetLib.ojcompositeMod.Metadata
  var view: java.lang.String
  def parseFunction(
    value: java.lang.String,
    name: java.lang.String,
    meta: js.Object,
    defaultParseFunction: js.Function1[/* value */ java.lang.String, _]
  ): js.Any
  def viewModel(param0: atOracleOraclejetLib.ojcompositeMod.ViewModelContext): scala.Unit | js.Object
}


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

object Anon_DefaultParseFunction {
  @scala.inline
  def apply(
    metadata: atOracleOraclejetLib.ojcompositeMod.Metadata,
    parseFunction: (java.lang.String, java.lang.String, js.Object, js.Function1[/* value */ java.lang.String, _]) => js.Any,
    view: java.lang.String,
    viewModel: atOracleOraclejetLib.ojcompositeMod.ViewModelContext => scala.Unit | js.Object
  ): Anon_DefaultParseFunction = {
    val __obj = js.Dynamic.literal(metadata = metadata, parseFunction = js.Any.fromFunction4(parseFunction), view = view, viewModel = js.Any.fromFunction1(viewModel))
  
    __obj.asInstanceOf[Anon_DefaultParseFunction]
  }
}


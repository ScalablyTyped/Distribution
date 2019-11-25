package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojcompositeMod.Metadata
import typings.atOracleOraclejet.ojcompositeMod.ViewModelContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultParseFunction extends js.Object {
  var metadata: Metadata
  var view: String
  def parseFunction(
    value: String,
    name: String,
    meta: js.Object,
    defaultParseFunction: js.Function1[/* value */ String, _]
  ): js.Any
  def viewModel(param0: ViewModelContext): Unit | js.Object
}

object Anon_DefaultParseFunction {
  @scala.inline
  def apply(
    metadata: Metadata,
    parseFunction: (String, String, js.Object, js.Function1[/* value */ String, _]) => js.Any,
    view: String,
    viewModel: ViewModelContext => Unit | js.Object
  ): Anon_DefaultParseFunction = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], parseFunction = js.Any.fromFunction4(parseFunction), view = view.asInstanceOf[js.Any], viewModel = js.Any.fromFunction1(viewModel))
  
    __obj.asInstanceOf[Anon_DefaultParseFunction]
  }
}


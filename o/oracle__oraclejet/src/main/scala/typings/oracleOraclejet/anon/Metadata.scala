package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojcompositeMod.ViewModelContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metadata extends js.Object {
  var metadata: typings.oracleOraclejet.ojcompositeMod.Metadata
  var view: String
  def parseFunction(
    value: String,
    name: String,
    meta: js.Object,
    defaultParseFunction: js.Function1[/* value */ String, _]
  ): js.Any
  def viewModel(param0: ViewModelContext): Unit | js.Object
}

object Metadata {
  @scala.inline
  def apply(
    metadata: typings.oracleOraclejet.ojcompositeMod.Metadata,
    parseFunction: (String, String, js.Object, js.Function1[/* value */ String, _]) => js.Any,
    view: String,
    viewModel: ViewModelContext => Unit | js.Object
  ): Metadata = {
    val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any], parseFunction = js.Any.fromFunction4(parseFunction), view = view.asInstanceOf[js.Any], viewModel = js.Any.fromFunction1(viewModel))
    __obj.asInstanceOf[Metadata]
  }
}


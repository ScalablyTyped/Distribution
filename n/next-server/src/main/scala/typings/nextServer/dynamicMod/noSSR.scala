package typings.nextServer.dynamicMod

import typings.react.mod.ComponentClass
import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("next-server/dist/lib/dynamic", "noSSR")
@js.native
object noSSR extends js.Object {
  def apply[P](LoadableInitializer: LoadableFn[P], loadableOptions: LoadableOptions[P]): (ComponentClass[P, _]) | FunctionComponent[P] | js.Function0[Element] = js.native
}


package typings.nextDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibDynamicMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.nextDashServer.Anon_Default
  import typings.nextDashServer.Anon_HasErrorIsLoadingPastDelay
  import typings.nextDashServer.Anon_Loaded
  import typings.nextDashServer.Anon_Loader
  import typings.react.reactMod.ComponentType

  type DynamicOptions[P] = LoadableBaseOptions[P] with Anon_Loaded[P]
  type LoadableBaseOptions[P] = LoadableGeneratedOptions with Anon_HasErrorIsLoadingPastDelay[P]
  type LoadableComponent[P] = ComponentType[P]
  type LoadableFn[P] = js.Function1[/* opts */ LoadableOptions[P], ComponentType[P]]
  type LoadableOptions[P] = LoadableBaseOptions[P] with Anon_Loader
  type Loader[P] = js.Function0[LoaderComponent[P]] | LoaderComponent[P]
  type LoaderComponent[P] = js.Promise[ComponentType[P] | Anon_Default[P]]
  type LoaderMap = StringDictionary[js.Function0[Loader[js.Any]]]
}

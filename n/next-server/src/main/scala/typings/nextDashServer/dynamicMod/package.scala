package typings.nextDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dynamicMod {
  import typings.nextDashServer.Anon_Default
  import typings.react.reactMod.ComponentType
  import typings.reactDashLoadable.LoadableExportNs.LoadableComponent
  import typings.std.Exclude
  import typings.std.Pick

  type AsyncComponent[P] = js.Promise[ComponentType[P] | Anon_Default[P]]
  type AsyncComponentLoader[P] = js.Function0[AsyncComponent[P]]
  type DynamicComponent[P] = ComponentType[P] with LoadableComponent
  type LoadingComponentProps = typings.reactDashLoadable.LoadableExportNs.LoadingComponentProps
  type Omit[T, K] = Pick[T, Exclude[String, K]]
}

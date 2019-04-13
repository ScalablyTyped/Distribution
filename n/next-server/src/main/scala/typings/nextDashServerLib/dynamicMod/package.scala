package typings
package nextDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dynamicMod {
  type AsyncComponent[P] = js.Promise[reactLib.reactMod.ComponentType[P] | nextDashServerLib.Anon_Default[P]]
  type AsyncComponentLoader[P] = js.Function0[AsyncComponent[P]]
  type DynamicComponent[P] = reactLib.reactMod.ComponentType[P] with reactDashLoadableLib.LoadableExportNs.LoadableComponent
  type LoadingComponentProps = reactDashLoadableLib.LoadableExportNs.LoadingComponentProps
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
}

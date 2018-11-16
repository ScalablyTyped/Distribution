package typings
package nextDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dynamicMod {
  type AsyncComponent[P] = stdLib.Promise[reactLib.reactMod.ReactNs.ComponentType[P]]
  type AsyncComponentLoader[P] = js.Function0[AsyncComponent[P]]
  type DynamicComponent[P] = reactLib.reactMod.ReactNs.ComponentType[P] with reactDashLoadableLib.LoadableExportNs.LoadableComponent
  type LoadedModuleMapping = stdLib.Record[java.lang.String, reactLib.reactMod.ReactNs.ComponentType[js.Object]]
  type LoadingComponentProps = reactDashLoadableLib.LoadableExportNs.LoadingComponentProps
  type ModuleMapping = stdLib.Record[java.lang.String, AsyncComponent[js.Any]]
  type Omit[T, K] = stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]]
}

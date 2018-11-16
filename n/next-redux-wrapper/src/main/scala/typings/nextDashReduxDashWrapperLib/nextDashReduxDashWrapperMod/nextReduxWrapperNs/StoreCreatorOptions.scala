package typings
package nextDashReduxDashWrapperLib.nextDashReduxDashWrapperMod.nextReduxWrapperNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StoreCreatorOptions[TInitialState, TStateProps, TDispatchProps, TOwnProps, TMergedProps] extends Options {
  var isServer: scala.Boolean
  var query: js.UndefOr[js.Any] = js.undefined
  var req: js.UndefOr[nodeLib.httpMod.IncomingMessage] = js.undefined
  var res: js.UndefOr[nodeLib.httpMod.ServerResponse] = js.undefined
}


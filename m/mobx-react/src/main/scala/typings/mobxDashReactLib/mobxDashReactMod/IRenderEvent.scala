package typings
package mobxDashReactLib.mobxDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRenderEvent extends js.Object {
  var component: reactLib.reactMod.ReactNs.ReactElement[_]
  var event: mobxDashReactLib.mobxDashReactLibStrings.render | mobxDashReactLib.mobxDashReactLibStrings.destroy
  // Component instance
  var node: js.Any
  var renderTime: js.UndefOr[scala.Double] = js.undefined
  var totalTime: js.UndefOr[scala.Double] = js.undefined
}


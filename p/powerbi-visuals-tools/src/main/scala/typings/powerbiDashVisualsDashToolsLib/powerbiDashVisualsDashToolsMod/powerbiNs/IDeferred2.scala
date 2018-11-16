package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeferred2[TSuccess, TError] extends js.Object {
  var promise: IPromise2[TSuccess, TError] = js.native
  def reject(): scala.Unit = js.native
  def reject(reason: TError): scala.Unit = js.native
  def resolve(value: TSuccess): scala.Unit = js.native
}


package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RejectablePromise2[T, E] extends IPromise2[T, E] {
  def pending(): scala.Boolean = js.native
  def reject(): scala.Unit = js.native
  def reject(reason: E): scala.Unit = js.native
  def rejected(): scala.Boolean = js.native
  def resolved(): scala.Boolean = js.native
}


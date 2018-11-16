package typings
package nodeDashFibersLib.futureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Future extends js.Object {
  def detach(): scala.Unit = js.native
  def get(): js.Any = js.native
  def isResolved(): scala.Boolean = js.native
  def proxy(future: Future): scala.Unit = js.native
  def proxyErrors(futureOrList: js.Any): Future = js.native
  def resolve(fn: js.Function): scala.Unit = js.native
  def resolveSuccess(fn: js.Function): scala.Unit = js.native
  def resolver(): js.Function = js.native
  def `return`(): scala.Unit = js.native
  def `return`(result: js.Any): scala.Unit = js.native
  def `throw`(error: js.Any): scala.Unit = js.native
}


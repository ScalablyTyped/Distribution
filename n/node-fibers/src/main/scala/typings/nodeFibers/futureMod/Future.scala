package typings.nodeFibers.futureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Future extends js.Object {
  def detach(): Unit = js.native
  def get(): js.Any = js.native
  def isResolved(): Boolean = js.native
  def proxy(future: Future): Unit = js.native
  def proxyErrors(futureOrList: js.Any): Future = js.native
  def resolve(fn: js.Function): Unit = js.native
  def resolveSuccess(fn: js.Function): Unit = js.native
  def resolver(): js.Function = js.native
  def `return`(): Unit = js.native
  def `return`(result: js.Any): Unit = js.native
  def `throw`(error: js.Any): Unit = js.native
}


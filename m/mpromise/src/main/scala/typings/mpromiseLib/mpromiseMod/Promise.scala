package typings
package mpromiseLib.mpromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise[F, R] extends js.Object {
  def chain(promise: Promise[F, R]): Promise[F, R] = js.native
  def end(): scala.Unit = js.native
  def fulfill(args: F*): Promise[F, R] = js.native
  def onFulfill(callback: js.Function1[/* repeated */ F, scala.Unit]): Promise[F, R] = js.native
  def onReject(callback: js.Function1[/* err */ R, scala.Unit]): Promise[F, R] = js.native
  def onResolve(callback: IResolveFunction[F, R]): Promise[F, R] = js.native
  def reject(reason: R): Promise[F, R] = js.native
  def resolve(reason: R, arg: F): Promise[F, R] = js.native
  def resolve(reason: R, args: F*): Promise[F, R] = js.native
  def `then`[TRes](onFulfilled: js.Function1[/* repeated */ F, TRes | js.Thenable[TRes]]): Promise[TRes, R] = js.native
  def `then`[TRes](
    onFulfilled: js.Function1[/* repeated */ F, TRes | js.Thenable[TRes]],
    onRejected: js.Function1[/* err */ R, TRes | js.Thenable[TRes]]
  ): Promise[TRes, R] = js.native
}


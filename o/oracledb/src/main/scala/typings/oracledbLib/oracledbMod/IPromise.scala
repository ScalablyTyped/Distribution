package typings
package oracledbLib.oracledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPromise[T] extends js.Object {
  def `catch`[R](onReject: TFunc[_, R]): IPromise[R] = js.native
  def `then`[R](): IPromise[R] = js.native
  def `then`[R](onResolve: TFunc[T, R]): IPromise[R] = js.native
  def `then`[R](onResolve: TFunc[T, R], onReject: TFunc[_, R]): IPromise[R] = js.native
}


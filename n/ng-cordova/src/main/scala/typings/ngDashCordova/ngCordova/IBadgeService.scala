package typings.ngDashCordova.ngCordova

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBadgeService extends js.Object {
  def clear(): IPromise[_] = js.native
  def clear(callback: js.Function): IPromise[_] = js.native
  def clear(callback: js.Function, scope: js.Object): IPromise[_] = js.native
  def decrease(): IPromise[_] = js.native
  def decrease(count: Double): IPromise[_] = js.native
  def decrease(count: Double, callback: js.Function): IPromise[_] = js.native
  def decrease(count: Double, callback: js.Function, scope: js.Object): IPromise[_] = js.native
  def get(): IPromise[Double] = js.native
  def hasPermission(): IPromise[Boolean] = js.native
  def increase(): IPromise[_] = js.native
  def increase(count: Double): IPromise[_] = js.native
  def increase(count: Double, callback: js.Function): IPromise[_] = js.native
  def increase(count: Double, callback: js.Function, scope: js.Object): IPromise[_] = js.native
  def promptForPermission(): IPromise[_] = js.native
  def set(badge: Double): IPromise[_] = js.native
  def set(badge: Double, callback: js.Function): IPromise[_] = js.native
  def set(badge: Double, callback: js.Function, scope: js.Object): IPromise[_] = js.native
}


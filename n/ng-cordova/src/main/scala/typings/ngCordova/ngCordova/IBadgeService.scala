package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBadgeService extends StObject {
  
  def clear(): IPromise[js.Any] = js.native
  def clear(callback: js.Function): IPromise[js.Any] = js.native
  def clear(callback: js.Function, scope: js.Object): IPromise[js.Any] = js.native
  def clear(callback: Unit, scope: js.Object): IPromise[js.Any] = js.native
  
  def decrease(): IPromise[js.Any] = js.native
  def decrease(count: Double): IPromise[js.Any] = js.native
  def decrease(count: Double, callback: js.Function): IPromise[js.Any] = js.native
  def decrease(count: Double, callback: js.Function, scope: js.Object): IPromise[js.Any] = js.native
  def decrease(count: Double, callback: Unit, scope: js.Object): IPromise[js.Any] = js.native
  def decrease(count: Unit, callback: js.Function): IPromise[js.Any] = js.native
  def decrease(count: Unit, callback: js.Function, scope: js.Object): IPromise[js.Any] = js.native
  def decrease(count: Unit, callback: Unit, scope: js.Object): IPromise[js.Any] = js.native
  
  def get(): IPromise[Double] = js.native
  
  def hasPermission(): IPromise[Boolean] = js.native
  
  def increase(): IPromise[js.Any] = js.native
  def increase(count: Double): IPromise[js.Any] = js.native
  def increase(count: Double, callback: js.Function): IPromise[js.Any] = js.native
  def increase(count: Double, callback: js.Function, scope: js.Object): IPromise[js.Any] = js.native
  def increase(count: Double, callback: Unit, scope: js.Object): IPromise[js.Any] = js.native
  def increase(count: Unit, callback: js.Function): IPromise[js.Any] = js.native
  def increase(count: Unit, callback: js.Function, scope: js.Object): IPromise[js.Any] = js.native
  def increase(count: Unit, callback: Unit, scope: js.Object): IPromise[js.Any] = js.native
  
  def promptForPermission(): IPromise[js.Any] = js.native
  
  def set(badge: Double): IPromise[js.Any] = js.native
  def set(badge: Double, callback: js.Function): IPromise[js.Any] = js.native
  def set(badge: Double, callback: js.Function, scope: js.Object): IPromise[js.Any] = js.native
  def set(badge: Double, callback: Unit, scope: js.Object): IPromise[js.Any] = js.native
}

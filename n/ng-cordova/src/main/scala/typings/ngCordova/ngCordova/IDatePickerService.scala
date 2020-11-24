package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatePickerService extends js.Object {
  
  def show(): IPromise[Date] = js.native
  def show(options: DatePickerOptions): IPromise[Date] = js.native
}

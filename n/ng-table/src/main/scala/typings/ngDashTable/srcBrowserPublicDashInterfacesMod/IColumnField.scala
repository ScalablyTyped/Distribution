package typings.ngDashTable.srcBrowserPublicDashInterfacesMod

import typings.angular.angularMod.IScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IColumnField[T] extends js.Object {
  def apply(): T = js.native
  def apply(context: ColumnFieldContext): T = js.native
  def apply(value: T): Unit = js.native
  def assign($scope: IScope, value: T): Unit = js.native
}


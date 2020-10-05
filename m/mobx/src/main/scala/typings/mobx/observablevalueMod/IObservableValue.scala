package typings.mobx.observablevalueMod

import typings.mobx.interceptUtilsMod.IInterceptor
import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IObservableValue[T] extends js.Object {
  def get(): T = js.native
  def intercept(handler: IInterceptor[IValueWillChange[T]]): Lambda = js.native
  def observe(listener: js.Function1[/* change */ IValueDidChange[T], Unit]): Lambda = js.native
  def observe(listener: js.Function1[/* change */ IValueDidChange[T], Unit], fireImmediately: Boolean): Lambda = js.native
  def set(value: T): Unit = js.native
}


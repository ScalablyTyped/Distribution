package typings.mobx.libTypesInterceptDashUtilsMod

import typings.mobx.libUtilsUtilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/intercept-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hasInterceptors(interceptable: IInterceptable[_]): Boolean = js.native
  def interceptChange[T](interceptable: IInterceptable[T | Null]): T | Null = js.native
  def interceptChange[T](interceptable: IInterceptable[T | Null], change: T): T | Null = js.native
  def registerInterceptor[T](interceptable: IInterceptable[T], handler: IInterceptor[T]): Lambda = js.native
}


package typings.mobx.libTypesInterceptDashUtilsMod

import typings.mobx.libUtilsUtilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/intercept-utils", "registerInterceptor")
@js.native
object registerInterceptor extends js.Object {
  def apply[T](interceptable: IInterceptable[T], handler: IInterceptor[T]): Lambda = js.native
}


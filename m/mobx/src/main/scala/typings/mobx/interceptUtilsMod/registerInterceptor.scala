package typings.mobx.interceptUtilsMod

import typings.mobx.utilsMod.Lambda
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/types/intercept-utils", "registerInterceptor")
@js.native
object registerInterceptor extends js.Object {
  def apply[T](interceptable: IInterceptable[T], handler: IInterceptor[T]): Lambda = js.native
}


package typings.mobx.interceptUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mobx/lib/types/intercept-utils", "interceptChange")
@js.native
object interceptChange extends js.Object {
  def apply[T](interceptable: IInterceptable[T | Null]): T | Null = js.native
  def apply[T](interceptable: IInterceptable[T | Null], change: T): T | Null = js.native
}


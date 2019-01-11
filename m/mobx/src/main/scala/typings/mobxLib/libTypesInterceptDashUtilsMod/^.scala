package typings
package mobxLib.libTypesInterceptDashUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx/lib/types/intercept-utils", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def hasInterceptors(interceptable: mobxLib.libTypesInterceptDashUtilsMod.IInterceptable[_]): scala.Boolean = js.native
  def interceptChange[T](interceptable: mobxLib.libTypesInterceptDashUtilsMod.IInterceptable[T | scala.Null]): T | scala.Null = js.native
  def interceptChange[T](interceptable: mobxLib.libTypesInterceptDashUtilsMod.IInterceptable[T | scala.Null], change: T): T | scala.Null = js.native
  def registerInterceptor[T](
    interceptable: mobxLib.libTypesInterceptDashUtilsMod.IInterceptable[T],
    handler: mobxLib.libTypesInterceptDashUtilsMod.IInterceptor[T]
  ): mobxLib.libUtilsUtilsMod.Lambda = js.native
}


package typings.niceTry

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nice-try", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(): js.UndefOr[scala.Nothing] = js.native
  def apply(`val`: js.Any): js.UndefOr[scala.Nothing] = js.native
  def apply[T](fn: js.Function0[T]): js.UndefOr[T] = js.native
  
  def promise(): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def promise(`val`: js.Any): js.Promise[js.UndefOr[scala.Nothing]] = js.native
  def promise[T](fn: js.Function0[T | js.Thenable[T]]): js.Promise[js.UndefOr[T]] = js.native
}

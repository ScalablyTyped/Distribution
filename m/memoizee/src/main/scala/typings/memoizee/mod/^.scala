package typings.memoizee.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("memoizee", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply[F /* <: js.Function1[/* repeated */ js.Any, _] */](f: F): F with Memoized[F] = js.native
  def apply[F /* <: js.Function1[/* repeated */ js.Any, _] */](f: F, options: Options[F]): F with Memoized[F] = js.native
}

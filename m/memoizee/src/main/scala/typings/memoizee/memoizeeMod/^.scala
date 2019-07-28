package typings.memoizee.memoizeeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memoizee", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // tslint:disable-next-line ban-types
  def apply[F /* <: js.Function */](f: F): F with Memoized[F] = js.native
  def apply[F /* <: js.Function */](f: F, options: Options): F with Memoized[F] = js.native
}


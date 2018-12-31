package typings
package memoizeeLib.memoizeeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("memoizee", JSImport.Namespace)
@js.native
object memoizeeModMembers extends js.Object {
  // tslint:disable-next-line ban-types
  def apply[F /* <: js.Function */](f: F): F with memoizeeLib.memoizeeMod.memoizeeNs.Memoized[F] = js.native
  def apply[F /* <: js.Function */](f: F, options: memoizeeLib.memoizeeMod.memoizeeNs.Options): F with memoizeeLib.memoizeeMod.memoizeeNs.Memoized[F] = js.native
}


package typings.ono

import typings.ono.cjsTypesMod.ErrorLike
import typings.ono.cjsTypesMod.ErrorLikeConstructor
import typings.ono.cjsTypesMod.OnoConstructor
import typings.ono.cjsTypesMod.OnoSingleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/cjs/ono", JSImport.Namespace)
@js.native
object cjsOnoMod extends js.Object {
  @js.native
  class Ono[T /* <: ErrorLike */] protected ()
    extends typings.ono.cjsTypesMod.Ono[T] {
    def this(constructor: ErrorLikeConstructor[T]) = this()
  }
  
  val Ono: OnoConstructor = js.native
  val ono: OnoSingleton = js.native
}


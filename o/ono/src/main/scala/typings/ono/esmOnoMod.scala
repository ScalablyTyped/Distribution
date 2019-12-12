package typings.ono

import org.scalablytyped.runtime.TopLevel
import typings.ono.esmTypesMod.ErrorLike
import typings.ono.esmTypesMod.ErrorLikeConstructor
import typings.ono.esmTypesMod.OnoConstructor
import typings.ono.esmTypesMod.OnoSingleton
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/ono", JSImport.Namespace)
@js.native
object esmOnoMod extends js.Object {
  @js.native
  class Ono[T /* <: ErrorLike */] protected ()
    extends typings.ono.esmTypesMod.Ono[T] {
    def this(constructor: ErrorLikeConstructor[T]) = this()
  }
  
  val ono: OnoSingleton = js.native
  @js.native
  object Ono extends TopLevel[OnoConstructor]
  
}


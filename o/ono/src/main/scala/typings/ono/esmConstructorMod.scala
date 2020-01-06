package typings.ono

import org.scalablytyped.runtime.TopLevel
import typings.ono.esmTypesMod.ErrorLike
import typings.ono.esmTypesMod.ErrorLikeConstructor
import typings.ono.esmTypesMod.OnoConstructor
import typings.ono.esmTypesMod.OnoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/constructor", JSImport.Namespace)
@js.native
object esmConstructorMod extends js.Object {
  @js.native
  class Ono[T /* <: ErrorLike */] protected ()
    extends typings.ono.esmTypesMod.Ono[T] {
    def this(constructor: ErrorLikeConstructor[T]) = this()
    def this(constructor: ErrorLikeConstructor[T], options: OnoOptions) = this()
  }
  
  @js.native
  object Ono extends TopLevel[OnoConstructor]
  
}


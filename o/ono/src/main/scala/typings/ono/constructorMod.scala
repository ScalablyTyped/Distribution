package typings.ono

import org.scalablytyped.runtime.TopLevel
import typings.ono.typesMod.ErrorLike
import typings.ono.typesMod.ErrorLikeConstructor
import typings.ono.typesMod.OnoConstructor
import typings.ono.typesMod.OnoOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ono/esm/constructor", JSImport.Namespace)
@js.native
object constructorMod extends js.Object {
  @js.native
  class Ono[T /* <: ErrorLike */] protected ()
    extends typings.ono.typesMod.Ono[T] {
    def this(constructor: ErrorLikeConstructor[T]) = this()
    def this(constructor: ErrorLikeConstructor[T], options: OnoOptions) = this()
  }
  
  @js.native
  object Ono extends TopLevel[OnoConstructor]
  
}


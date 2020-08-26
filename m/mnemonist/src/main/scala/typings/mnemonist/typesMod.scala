package typings.mnemonist

import org.scalablytyped.runtime.Instantiable1
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mnemonist/utils/types", JSImport.Namespace)
@js.native
object typesMod extends js.Object {
  @js.native
  trait IArrayLike extends js.Object {
    var length: Double = js.native
    def slice(from: Double): IArrayLike = js.native
    def slice(from: Double, to: Double): IArrayLike = js.native
  }
  
  @js.native
  trait IArrayLikeConstructor
    extends Instantiable1[/* args (repeated) */ js.Any, ArrayLike]
  
  type ArrayLike = IArrayLike | ArrayBuffer
}


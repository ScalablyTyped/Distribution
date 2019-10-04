package typings.ono.cjsTypesMod

import org.scalablytyped.runtime.Instantiable1
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnoConstructor extends Instantiable1[/* constructor */ ErrorLikeConstructor[ErrorLike], Ono[ErrorLike]] {
  def apply[T /* <: ErrorLike */](constructor: ErrorLikeConstructor[T]): Ono[T] = js.native
  def toJSON(error: ErrorPOJO): ErrorPOJO = js.native
  /**
    * Returns an object containing all properties of the given Error object,
    * which can be used with `JSON.stringify()`.
    */
  def toJSON(error: Error): ErrorPOJO with Error = js.native
}


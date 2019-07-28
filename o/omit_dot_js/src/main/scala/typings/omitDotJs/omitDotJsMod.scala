package typings.omitDotJs

import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("omit.js", JSImport.Namespace)
@js.native
object omitDotJsMod extends js.Object {
  def default[T, K /* <: String */](obj: T, keys: js.Array[K]): Pick[T, Exclude[String, K]] = js.native
}


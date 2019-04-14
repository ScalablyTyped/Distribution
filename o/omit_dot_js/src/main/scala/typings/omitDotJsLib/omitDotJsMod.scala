package typings
package omitDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("omit.js", JSImport.Namespace)
@js.native
object omitDotJsMod extends js.Object {
  def default[T, K /* <: java.lang.String */](obj: T, keys: js.Array[K]): stdLib.Pick[T, stdLib.Exclude[java.lang.String, K]] = js.native
}


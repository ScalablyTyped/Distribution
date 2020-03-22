package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mongoMod {
  // Based on https://github.com/microsoft/TypeScript/issues/28791#issuecomment-443520161
  type UnionOmit[T, K /* <: java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[java.lang.String, K]]
}

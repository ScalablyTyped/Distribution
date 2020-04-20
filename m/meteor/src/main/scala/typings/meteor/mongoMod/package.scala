package typings.meteor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mongoMod {
  // Based on https://github.com/microsoft/TypeScript/issues/28791#issuecomment-443520161
  type UnionOmit[T, K /* <: /* keyof any */ java.lang.String */] = typings.std.Pick[T, typings.std.Exclude[/* keyof T */ java.lang.String, K]]
}

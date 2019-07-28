package typings

import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object objectDotOmit {
  type Omit[GType, GKeys /* <: String */] = Pick[GType, Exclude[String, GKeys]]
}

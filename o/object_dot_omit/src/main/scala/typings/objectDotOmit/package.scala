package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object objectDotOmit {
  import typings.std.Exclude
  import typings.std.Pick

  type Omit[GType, GKeys /* <: String */] = Pick[GType, Exclude[String, GKeys]]
}

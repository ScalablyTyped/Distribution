package typings

import typings.std.Exclude
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mongodb {
  type Default = js.Any
  // This line can be removed after minimum required TypeScript Version is above 3.5
  type Omit[T, K] = Pick[T, Exclude[String, K]]
}

package typings.ono

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esmTypesMod {
  import typings.std.Error

  type ErrorLike = Error | ErrorPOJO
  type MessageFormatter = js.Function2[/* message */ String, /* repeated */ js.Any, String]
}

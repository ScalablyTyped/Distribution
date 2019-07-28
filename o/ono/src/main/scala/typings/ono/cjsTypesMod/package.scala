package typings.ono

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cjsTypesMod {
  type ErrorLike = Error | ErrorPOJO
  type MessageFormatter = js.Function2[/* message */ String, /* repeated */ js.Any, String]
}

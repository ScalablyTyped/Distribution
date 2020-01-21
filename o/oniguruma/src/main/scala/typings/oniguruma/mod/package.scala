package typings.oniguruma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback[T] = js.Function2[/* error */ typings.std.Error, /* match */ T, scala.Unit]
}

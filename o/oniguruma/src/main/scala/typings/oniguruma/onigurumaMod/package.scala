package typings.oniguruma

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object onigurumaMod {
  import typings.std.Error

  type Callback[T] = js.Function2[/* error */ Error, /* match */ T, Unit]
}

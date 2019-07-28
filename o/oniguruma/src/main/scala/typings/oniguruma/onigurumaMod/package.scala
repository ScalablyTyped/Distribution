package typings.oniguruma

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object onigurumaMod {
  type Callback[T] = js.Function2[/* error */ Error, /* match */ T, Unit]
}

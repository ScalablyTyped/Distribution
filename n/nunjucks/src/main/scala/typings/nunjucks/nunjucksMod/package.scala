package typings.nunjucks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nunjucksMod {
  import typings.nunjucks.nunjucksMod.libNs.TemplateError

  type Callback[E, T] = js.Function2[/* err */ E | Null, /* res */ T | Null, Unit]
  type TemplateCallback[T] = js.Function2[/* err */ TemplateError | Null, /* res */ T | Null, Unit]
}

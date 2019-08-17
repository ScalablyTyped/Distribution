package typings.pngDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pngDotJsMod {
  import typings.std.Error

  type ParseCallback = js.Function2[/* err */ js.UndefOr[Error], /* png */ PNG, Unit]
}

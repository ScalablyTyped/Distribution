package typings.pngDotJs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pngDotJsMod {
  type ParseCallback = js.Function2[/* err */ js.UndefOr[Error], /* png */ PNG, Unit]
}

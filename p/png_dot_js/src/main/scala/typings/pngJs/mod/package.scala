package typings.pngJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ParseCallback = js.Function2[/* err */ js.UndefOr[typings.std.Error], /* png */ typings.pngJs.mod.PNG, scala.Unit]
}

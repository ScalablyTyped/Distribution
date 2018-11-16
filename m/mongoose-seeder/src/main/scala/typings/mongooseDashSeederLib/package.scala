package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mongooseDashSeederLib {
  type seedCallback = js.Function2[/* err */ js.Any, /* dbData */ js.Any, scala.Unit]
}

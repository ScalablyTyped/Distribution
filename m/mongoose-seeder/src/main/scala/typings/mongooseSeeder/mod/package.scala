package typings.mongooseSeeder

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type seedCallback = js.Function2[/* err */ js.Any, /* dbData */ js.Any, scala.Unit]
}

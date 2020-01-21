package typings.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object jsxMod {
  type Defaultize[Props, Defaults] = (typings.std.Partial[typings.std.Pick[Props, typings.std.Extract[java.lang.String, java.lang.String]]]) with (// Include the remaining properties from Props
  typings.std.Pick[Props, typings.std.Exclude[java.lang.String, java.lang.String]])
}

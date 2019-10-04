package typings.preact

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcJsxMod {
  import typings.std.Exclude
  import typings.std.Extract
  import typings.std.Partial
  import typings.std.Pick

  type Defaultize[Props, Defaults] = (Partial[Pick[Props, Extract[String, String]]]) with (Pick[Props, Exclude[String, String]])
}

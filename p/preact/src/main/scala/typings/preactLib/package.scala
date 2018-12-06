package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object preactLib {
  type Defaultize[Props, Defaults] = (stdLib.Partial[stdLib.Pick[Props, stdLib.Extract[java.lang.String, java.lang.String]]]) with (stdLib.Pick[Props, stdLib.Exclude[java.lang.String, java.lang.String]])
}

package typings.atNivoPie

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atNivoPieMod {
  type AccessorFunc = js.Function1[/* datum */ PieDatum, String]
  type ValueFormatter = js.Function1[/* value */ Double, String | Double]
}

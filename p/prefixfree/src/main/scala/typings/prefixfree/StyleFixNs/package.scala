package typings.prefixfree

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object StyleFixNs {
  type StyleFixer = js.Function3[/* css */ String, /* raw */ Boolean, /* element */ Element, String]
}

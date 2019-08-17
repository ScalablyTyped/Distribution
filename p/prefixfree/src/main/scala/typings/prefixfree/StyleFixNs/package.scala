package typings.prefixfree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object StyleFixNs {
  import typings.std.Element

  type StyleFixer = js.Function3[/* css */ String, /* raw */ Boolean, /* element */ Element, String]
}

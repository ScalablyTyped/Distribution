package typings.ol

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xmlMod {
  type Parser = js.Function2[/* p0 */ Element, /* p1 */ js.Array[js.Any], Unit]
  type Serializer = js.Function3[/* p0 */ Element, /* p1 */ js.Any, /* p2 */ js.Array[js.Any], Unit]
}

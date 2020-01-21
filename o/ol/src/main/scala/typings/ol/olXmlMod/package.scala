package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object olXmlMod {
  type Parser = js.Function2[/* p0 */ typings.std.Element, /* p1 */ js.Array[js.Any], scala.Unit]
  type Serializer = js.Function3[/* p0 */ typings.std.Element, /* p1 */ js.Any, /* p2 */ js.Array[js.Any], scala.Unit]
}

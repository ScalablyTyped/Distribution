package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object node {
  // TODO: change to `type NodeRequireFunction = (id: string) => any;` in next mayor version.
  type NodeRequireFunction = js.Function1[/* id */ java.lang.String, js.Any]
}

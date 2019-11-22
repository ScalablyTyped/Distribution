package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object node {
  import org.scalablytyped.runtime.StringDictionary

  type NodeRequireCache = StringDictionary[NodeModule]
  // TODO: change to `type NodeRequireFunction = (id: string) => any;` in next mayor version.
  type NodeRequireFunction = js.Function1[/* id */ java.lang.String, js.Any]
}

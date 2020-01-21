package typings.nodeRsa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Data = java.lang.String | js.Object | js.Array[js.Any]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.nodeRsa.mod.KeyComponentsPrivate
    - typings.nodeRsa.mod.KeyComponentsPublic
  */
  type Key = typings.nodeRsa.mod._Key | java.lang.String | typings.node.Buffer
}

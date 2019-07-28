package typings.nodeDashRsa

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashRsaMod {
  type Data = String | js.Object | js.Array[js.Any]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.nodeDashRsa.nodeDashRsaMod.KeyComponentsPrivate
    - typings.nodeDashRsa.nodeDashRsaMod.KeyComponentsPublic
  */
  type Key = _Key | String | Buffer
}

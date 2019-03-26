package typings
package nodeDashRsaLib.nodeDashRsaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object NodeRSANs {
  type Data = java.lang.String | js.Object | js.Array[js.Any]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - nodeLib.Buffer
    - KeyComponentsPrivate
    - KeyComponentsPublic
  */
  type Key = _Key | java.lang.String | nodeLib.Buffer
}

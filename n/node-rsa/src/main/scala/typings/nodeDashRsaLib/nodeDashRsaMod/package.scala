package typings
package nodeDashRsaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashRsaMod {
  type Data = java.lang.String | js.Object | js.Array[js.Any]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - nodeLib.Buffer
    - KeyComponentsPrivate
    - KeyComponentsPublic
  */
  type Key = _Key | java.lang.String | nodeLib.Buffer
}

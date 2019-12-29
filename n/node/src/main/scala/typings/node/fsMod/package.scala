package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsMod {
  import typings.node.Anon_EncodingFlagMode
  import typings.node.NodeJS.ErrnoException

  type NoParamCallback = js.Function1[/* err */ ErrnoException | Null, Unit]
  /**
    * Valid types for path values in "fs".
    */
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.node.urlMod.URL
  */
  type PathLike = _PathLike | String
  type WriteFileOptions = Anon_EncodingFlagMode | String | Null
}

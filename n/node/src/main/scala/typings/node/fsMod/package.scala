package typings.node

import typings.node.Anon_EncodingFlagMode
import typings.node.NodeJSNs.TypedArray
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fsMod {
  type BinaryData = DataView | TypedArray
  /**
    * Valid types for path values in "fs".
    */
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.node.urlMod.URL
  */
  type PathLike = _PathLike | java.lang.String
  type WriteFileOptions = Anon_EncodingFlagMode | java.lang.String | Null
}

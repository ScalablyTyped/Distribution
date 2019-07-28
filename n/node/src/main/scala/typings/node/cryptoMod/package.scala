package typings.node

import typings.node.NodeJSNs.TypedArray
import typings.std.DataView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cryptoMod {
  type Binary = TypedArray | DataView
  type BinaryLike = java.lang.String | Binary
  type CipherKey = BinaryLike | KeyObject
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.node.cryptoMod.KeyObject
  */
  type KeyLike = _KeyLike | java.lang.String
}

package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cryptoMod {
  import typings.node.NodeJS.TypedArray
  import typings.std.DataView

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

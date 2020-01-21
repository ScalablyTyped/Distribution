package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cryptoMod {
  type BinaryLike = java.lang.String | typings.node.NodeJS.ArrayBufferView
  type CipherKey = typings.node.cryptoMod.BinaryLike | typings.node.cryptoMod.KeyObject
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.node.Buffer
    - typings.node.cryptoMod.KeyObject
  */
  type KeyLike = typings.node.cryptoMod._KeyLike | java.lang.String
}

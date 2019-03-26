package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cryptoMod {
  type Binary = nodeLib.Buffer | nodeLib.NodeJSNs.TypedArray | stdLib.DataView
  type BinaryLike = java.lang.String | Binary
  type CipherKey = BinaryLike | KeyObject
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - nodeLib.Buffer
    - KeyObject
  */
  type KeyLike = _KeyLike | java.lang.String
}

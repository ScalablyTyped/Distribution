package typings
package pemLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pemMod {
  type Callback[T] = js.Function2[/* error */ js.Any, /* result */ T, js.Any]
  /* Rewritten from type alias, can be one of: 
    - pemLib.pemLibStrings.md5
    - pemLib.pemLibStrings.sha1
    - pemLib.pemLibStrings.sha256
    - java.lang.String
  */
  type HashFunction = _HashFunction | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - pemLib.pemLibStrings.aes128
    - pemLib.pemLibStrings.aes192
    - pemLib.pemLibStrings.aes256
    - pemLib.pemLibStrings.camellia128
    - pemLib.pemLibStrings.camellia192
    - pemLib.pemLibStrings.camellia256
    - pemLib.pemLibStrings.des
    - pemLib.pemLibStrings.des3
    - pemLib.pemLibStrings.idea
    - java.lang.String
  */
  type PrivateKeyCipher = _PrivateKeyCipher | java.lang.String
}

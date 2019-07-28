package typings.pem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pemMod {
  type Callback[T] = js.Function2[/* error */ js.Any, /* result */ T, js.Any]
  /* Rewritten from type alias, can be one of: 
    - typings.pem.pemStrings.md5
    - typings.pem.pemStrings.sha1
    - typings.pem.pemStrings.sha256
    - java.lang.String
  */
  type HashFunction = _HashFunction | String
  /* Rewritten from type alias, can be one of: 
    - typings.pem.pemStrings.aes128
    - typings.pem.pemStrings.aes192
    - typings.pem.pemStrings.aes256
    - typings.pem.pemStrings.camellia128
    - typings.pem.pemStrings.camellia192
    - typings.pem.pemStrings.camellia256
    - typings.pem.pemStrings.des
    - typings.pem.pemStrings.des3
    - typings.pem.pemStrings.idea
    - java.lang.String
  */
  type PrivateKeyCipher = _PrivateKeyCipher | String
}

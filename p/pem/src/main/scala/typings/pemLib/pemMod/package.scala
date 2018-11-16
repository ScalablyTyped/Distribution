package typings
package pemLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pemMod {
  type Callback[T] = js.Function2[/* error */ js.Any, /* result */ T, js.Any]
  type HashFunction = pemLib.pemLibStrings.md5 | pemLib.pemLibStrings.sha1 | pemLib.pemLibStrings.sha256 | java.lang.String
  type PrivateKeyCipher = pemLib.pemLibStrings.aes128 | pemLib.pemLibStrings.aes192 | pemLib.pemLibStrings.aes256 | pemLib.pemLibStrings.camellia128 | pemLib.pemLibStrings.camellia192 | pemLib.pemLibStrings.camellia256 | pemLib.pemLibStrings.des | pemLib.pemLibStrings.des3 | pemLib.pemLibStrings.idea | java.lang.String
}

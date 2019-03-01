package typings
package pemLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pemMod {
  type Callback[T] = js.Function2[/* error */ js.Any, /* result */ T, js.Any]
  type HashFunction = _HashFunction | java.lang.String
  type PrivateKeyCipher = _PrivateKeyCipher | java.lang.String
}

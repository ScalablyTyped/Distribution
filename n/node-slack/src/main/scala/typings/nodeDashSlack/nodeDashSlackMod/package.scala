package typings.nodeDashSlack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashSlackMod {
  type ResponseCallback = js.Function2[/* err */ js.Any, /* query */ Query, js.Any]
  type SendCallback = js.Function2[/* err */ js.Any, /* body */ js.Any, js.Any]
}

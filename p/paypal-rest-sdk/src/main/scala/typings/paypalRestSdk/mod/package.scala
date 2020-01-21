package typings.paypalRestSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type CallbackFunction[T] = js.Function2[/* err */ typings.paypalRestSdk.mod.SDKError, /* response */ T, js.Any]
}

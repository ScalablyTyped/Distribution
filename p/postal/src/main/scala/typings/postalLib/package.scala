package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object postalLib {
  type ICallback[T] = js.Function2[/* data */ T, /* envelope */ IEnvelope[T], scala.Unit]
}

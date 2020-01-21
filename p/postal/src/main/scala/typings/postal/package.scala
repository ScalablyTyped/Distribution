package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object postal {
  type ICallback[T] = js.Function2[/* data */ T, /* envelope */ typings.postal.IEnvelope[T], scala.Unit]
}

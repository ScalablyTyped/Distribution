package typings.oibackoff

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oibackoffMod {
  type BackoffIntermediate[A] = js.Function3[/* err */ A, /* tries */ Double, /* delay */ Double, Boolean]
}

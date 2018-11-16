package typings
package oibackoffLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object oibackoffMod {
  type BackoffIntermediate[A] = js.Function3[/* err */ A, /* tries */ scala.Double, /* delay */ scala.Double, scala.Boolean]
}

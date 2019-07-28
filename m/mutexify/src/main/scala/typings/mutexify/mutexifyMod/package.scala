package typings.mutexify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mutexifyMod {
  type Release = js.Function3[
    /* cb */ js.Function2[/* err */ js.UndefOr[js.Any], /* value */ js.UndefOr[js.Any], js.Any], 
    /* err */ js.Any, 
    /* value */ js.Any, 
    Unit
  ]
}

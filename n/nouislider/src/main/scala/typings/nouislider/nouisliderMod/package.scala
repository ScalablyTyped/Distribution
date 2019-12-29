package typings.nouislider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nouisliderMod {
  import typings.std.Partial

  type Callback = js.Function3[
    /* values */ js.Array[js.Any], 
    /* handle */ Double, 
    /* unencodedValues */ js.Array[Double], 
    Unit
  ]
  /**
    * Update options that can not be updated will be ignored without errors.
    * The value null can be used to unset a previously set value.
    */
  type UpdateOptions = Partial[Options]
}

package typings.nouislider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Callback = js.Function3[
    /* values */ js.Array[js.Any], 
    /* handle */ scala.Double, 
    /* unencodedValues */ js.Array[scala.Double], 
    scala.Unit
  ]
  /**
    * Update options that can not be updated will be ignored without errors.
    * The value null can be used to unset a previously set value.
    */
  type UpdateOptions = typings.std.Partial[typings.nouislider.mod.Options]
}

package typings.nodeDashValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ValidatorNs {
  type ValidateFn = js.Function2[
    /* value */ js.Any, 
    /* onError */ js.Function3[/* message */ String, /* childName */ String, /* childValie */ js.Any, Unit], 
    Unit
  ]
}

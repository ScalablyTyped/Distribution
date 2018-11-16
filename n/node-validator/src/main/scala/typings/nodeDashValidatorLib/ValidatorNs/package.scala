package typings
package nodeDashValidatorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ValidatorNs {
  type ValidateFn = js.Function2[
    /* value */ js.Any, 
    /* onError */ js.Function3[
      /* message */ java.lang.String, 
      /* childName */ java.lang.String, 
      /* childValie */ js.Any, 
      scala.Unit
    ], 
    scala.Unit
  ]
}

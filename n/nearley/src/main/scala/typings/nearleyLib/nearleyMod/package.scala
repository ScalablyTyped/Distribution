package typings
package nearleyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nearleyMod {
  type Postprocessor = js.Function3[
    /* data */ js.Array[js.Any], 
    /* reference */ scala.Double, 
    /* wantedBy */ js.Object, 
    scala.Unit
  ]
  type Token = java.lang.String | nearleyLib.Anon_Value
}

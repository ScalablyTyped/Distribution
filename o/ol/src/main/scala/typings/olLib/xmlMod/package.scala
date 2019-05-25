package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object xmlMod {
  type Parser = js.Function2[/* param0 */ stdLib.Element, /* param1 */ js.Array[js.Any], scala.Unit]
  type Serializer = js.Function3[
    /* param0 */ stdLib.Element, 
    /* param1 */ js.Any, 
    /* param2 */ js.Array[js.Any], 
    scala.Unit
  ]
}

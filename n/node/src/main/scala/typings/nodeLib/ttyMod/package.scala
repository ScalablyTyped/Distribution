package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ttyMod {
  /**
    * -1 - to the left from cursor
    *  0 - the entire line
    *  1 - to the right from cursor
    */
  type Direction = nodeLib.nodeLibNumbers.`-1` | nodeLib.nodeLibNumbers.`0` | nodeLib.nodeLibNumbers.`1`
}

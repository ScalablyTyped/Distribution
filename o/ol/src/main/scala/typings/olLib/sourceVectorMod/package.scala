package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sourceVectorMod {
  type LoadingStrategy = js.Function2[
    /* p0 */ olLib.extentMod.Extent, 
    /* p1 */ scala.Double, 
    js.Array[olLib.extentMod.Extent]
  ]
}

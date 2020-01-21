package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object rasterMod {
  type Operation = js.Function2[
    /* p0 */ js.Array[js.Array[scala.Double] | typings.std.ImageData], 
    /* p1 */ js.Object, 
    js.Array[scala.Double] | typings.std.ImageData
  ]
}

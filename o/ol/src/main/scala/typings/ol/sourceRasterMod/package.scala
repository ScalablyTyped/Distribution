package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sourceRasterMod {
  import typings.std.ImageData

  type Operation = js.Function2[
    /* p0 */ js.Array[js.Array[Double] | ImageData], 
    /* p1 */ js.Object, 
    js.Array[Double] | ImageData
  ]
}

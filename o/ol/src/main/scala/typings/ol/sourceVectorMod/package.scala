package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sourceVectorMod {
  import typings.ol.extentMod.Extent

  type LoadingStrategy = js.Function2[/* p0 */ Extent, /* p1 */ Double, js.Array[Extent]]
}

package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object renderMod {
  import typings.ol.featureMod.FeatureLike

  type OrderFunction = js.Function2[/* p0 */ FeatureLike, /* p1 */ FeatureLike, Double]
}

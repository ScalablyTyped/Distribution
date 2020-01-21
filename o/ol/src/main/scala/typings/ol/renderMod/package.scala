package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object renderMod {
  type OrderFunction = js.Function2[
    /* p0 */ typings.ol.olFeatureMod.FeatureLike, 
    /* p1 */ typings.ol.olFeatureMod.FeatureLike, 
    scala.Double
  ]
}

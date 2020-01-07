package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interactionTranslateMod {
  import typings.ol.featureMod.FeatureLike

  type FilterFunction = js.Function2[
    /* p0 */ FeatureLike, 
    /* p1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
    Boolean
  ]
}

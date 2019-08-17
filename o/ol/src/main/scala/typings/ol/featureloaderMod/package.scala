package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object featureloaderMod {
  import typings.ol.extentMod.Extent
  import typings.ol.sourceVectorMod.default

  type FeatureLoader = js.ThisFunction3[
    /* this */ default | typings.ol.vectorTileMod.default, 
    /* p0 */ Extent, 
    /* p1 */ Double, 
    /* p2 */ typings.ol.projProjectionMod.default, 
    Unit
  ]
  type FeatureUrlFunction = js.Function3[
    /* p0 */ Extent, 
    /* p1 */ Double, 
    /* p2 */ typings.ol.projProjectionMod.default, 
    String
  ]
}

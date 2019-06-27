package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object featureloaderMod {
  type FeatureLoader = js.ThisFunction3[
    /* this */ olLib.sourceVectorMod.default | olLib.vectorTileMod.default, 
    /* p1 */ olLib.extentMod.Extent, 
    /* p2 */ scala.Double, 
    /* p3 */ olLib.projProjectionMod.default, 
    scala.Unit
  ]
  type FeatureUrlFunction = js.Function3[
    /* p0 */ olLib.extentMod.Extent, 
    /* p1 */ scala.Double, 
    /* p2 */ olLib.projProjectionMod.default, 
    java.lang.String
  ]
}

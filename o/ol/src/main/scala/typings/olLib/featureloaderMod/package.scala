package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object featureloaderMod {
  type FeatureLoader = js.ThisFunction3[
    /* this */ olLib.sourceVectorMod.default | olLib.vectorTileMod.default, 
    /* param1 */ olLib.extentMod.Extent, 
    /* param2 */ scala.Double, 
    /* param3 */ olLib.projProjectionMod.default, 
    scala.Unit
  ]
  type FeatureUrlFunction = js.Function3[
    /* param0 */ olLib.extentMod.Extent, 
    /* param1 */ scala.Double, 
    /* param2 */ olLib.projProjectionMod.default, 
    java.lang.String
  ]
}

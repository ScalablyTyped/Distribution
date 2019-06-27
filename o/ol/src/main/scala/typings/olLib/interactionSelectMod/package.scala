package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interactionSelectMod {
  type FilterFunction = js.Function2[
    /* p0 */ olLib.featureMod.FeatureLike, 
    /* p1 */ olLib.layerLayerMod.default, 
    scala.Boolean
  ]
}

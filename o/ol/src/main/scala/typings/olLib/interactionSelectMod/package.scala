package typings
package olLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interactionSelectMod {
  type FilterFunction = js.Function2[
    /* param0 */ olLib.featureMod.FeatureLike, 
    /* param1 */ olLib.layerLayerMod.default, 
    scala.Boolean
  ]
}

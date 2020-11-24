package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object selectMod {
  
  type FilterFunction = js.Function2[
    /* p0 */ typings.ol.olFeatureMod.FeatureLike, 
    /* p1 */ typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default], 
    scala.Boolean
  ]
}

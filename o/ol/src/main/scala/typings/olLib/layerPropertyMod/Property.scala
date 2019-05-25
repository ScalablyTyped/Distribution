package typings
package olLib.layerPropertyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Property extends js.Object

@JSImport("ol/layer/Property", "Property")
@js.native
object Property extends js.Object {
  @js.native
  sealed trait EXTENT
    extends olLib.layerPropertyMod.Property
  
  @js.native
  sealed trait MAX_RESOLUTION
    extends olLib.layerPropertyMod.Property
  
  @js.native
  sealed trait MIN_RESOLUTION
    extends olLib.layerPropertyMod.Property
  
  @js.native
  sealed trait OPACITY
    extends olLib.layerPropertyMod.Property
  
  @js.native
  sealed trait SOURCE
    extends olLib.layerPropertyMod.Property
  
  @js.native
  sealed trait VISIBLE
    extends olLib.layerPropertyMod.Property
  
  @js.native
  sealed trait Z_INDEX
    extends olLib.layerPropertyMod.Property
  
}


package typings
package olLib.mapPropertyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MapProperty extends js.Object

@JSImport("ol/MapProperty", "MapProperty")
@js.native
object MapProperty extends js.Object {
  @js.native
  sealed trait LAYERGROUP
    extends olLib.mapPropertyMod.MapProperty
  
  @js.native
  sealed trait SIZE
    extends olLib.mapPropertyMod.MapProperty
  
  @js.native
  sealed trait TARGET
    extends olLib.mapPropertyMod.MapProperty
  
  @js.native
  sealed trait VIEW
    extends olLib.mapPropertyMod.MapProperty
  
}


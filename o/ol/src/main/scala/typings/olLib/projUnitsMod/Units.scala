package typings
package olLib.projUnitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Units extends js.Object

@JSImport("ol/proj/Units", "Units")
@js.native
object Units extends js.Object {
  @js.native
  sealed trait DEGREES
    extends olLib.projUnitsMod.Units
  
  @js.native
  sealed trait FEET
    extends olLib.projUnitsMod.Units
  
  @js.native
  sealed trait METERS
    extends olLib.projUnitsMod.Units
  
  @js.native
  sealed trait PIXELS
    extends olLib.projUnitsMod.Units
  
  @js.native
  sealed trait TILE_PIXELS
    extends olLib.projUnitsMod.Units
  
  @js.native
  sealed trait USFEET
    extends olLib.projUnitsMod.Units
  
}


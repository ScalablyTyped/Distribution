package typings.ol.projUnitsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Units extends js.Object

@JSImport("ol/proj/Units", "Units")
@js.native
object Units extends js.Object {
  @js.native
  sealed trait DEGREES extends Units
  
  @js.native
  sealed trait FEET extends Units
  
  @js.native
  sealed trait METERS extends Units
  
  @js.native
  sealed trait PIXELS extends Units
  
  @js.native
  sealed trait TILE_PIXELS extends Units
  
  @js.native
  sealed trait USFEET extends Units
  
}


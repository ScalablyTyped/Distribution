package typings.ol

import typings.ol.projUnitsMod.Units
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/proj/Units", JSImport.Namespace)
@js.native
object projUnitsMod extends js.Object {
  @js.native
  sealed trait Units extends js.Object
  
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
  
  @js.native
  object default extends js.Object {
    /* "degrees" */ val DEGREES: typings.ol.projUnitsMod.Units.DEGREES with String = js.native
    /* "ft" */ val FEET: typings.ol.projUnitsMod.Units.FEET with String = js.native
    /* "m" */ val METERS: typings.ol.projUnitsMod.Units.METERS with String = js.native
    /* "pixels" */ val PIXELS: typings.ol.projUnitsMod.Units.PIXELS with String = js.native
    /* "tile-pixels" */ val TILE_PIXELS: typings.ol.projUnitsMod.Units.TILE_PIXELS with String = js.native
    /* "us-ft" */ val USFEET: typings.ol.projUnitsMod.Units.USFEET with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Units with String] = js.native
  }
  
}


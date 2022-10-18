package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object projUnitsMod {
  
  /**
    * Projection units: 'degrees', 'ft', 'm', 'pixels', 'tile-pixels' or
    * 'us-ft'.
    */
  @JSImport("ol/proj/Units", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Units & String] = js.native
    
    /* "degrees" */ val DEGREES: typings.ol.projUnitsMod.Units.DEGREES & String = js.native
    
    /* "ft" */ val FEET: typings.ol.projUnitsMod.Units.FEET & String = js.native
    
    /* "m" */ val METERS: typings.ol.projUnitsMod.Units.METERS & String = js.native
    
    /* "pixels" */ val PIXELS: typings.ol.projUnitsMod.Units.PIXELS & String = js.native
    
    /* "tile-pixels" */ val TILE_PIXELS: typings.ol.projUnitsMod.Units.TILE_PIXELS & String = js.native
    
    /* "us-ft" */ val USFEET: typings.ol.projUnitsMod.Units.USFEET & String = js.native
  }
  
  @js.native
  sealed trait Units extends StObject
  /**
    * Projection units: 'degrees', 'ft', 'm', 'pixels', 'tile-pixels' or
    * 'us-ft'.
    */
  @JSImport("ol/proj/Units", "Units")
  @js.native
  object Units extends StObject {
    
    @js.native
    sealed trait DEGREES
      extends StObject
         with Units
    
    @js.native
    sealed trait FEET
      extends StObject
         with Units
    
    @js.native
    sealed trait METERS
      extends StObject
         with Units
    
    @js.native
    sealed trait PIXELS
      extends StObject
         with Units
    
    @js.native
    sealed trait TILE_PIXELS
      extends StObject
         with Units
    
    @js.native
    sealed trait USFEET
      extends StObject
         with Units
  }
}

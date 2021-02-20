package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unitsMod {
  
  /**
    * Projection units: 'degrees', 'ft', 'm', 'pixels', 'tile-pixels' or
    * 'us-ft'.
    */
  @JSImport("ol/proj/Units", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Units with String] = js.native
    
    /* "degrees" */ val DEGREES: typings.ol.unitsMod.Units.DEGREES with String = js.native
    
    /* "ft" */ val FEET: typings.ol.unitsMod.Units.FEET with String = js.native
    
    /* "m" */ val METERS: typings.ol.unitsMod.Units.METERS with String = js.native
    
    /* "pixels" */ val PIXELS: typings.ol.unitsMod.Units.PIXELS with String = js.native
    
    /* "tile-pixels" */ val TILE_PIXELS: typings.ol.unitsMod.Units.TILE_PIXELS with String = js.native
    
    /* "us-ft" */ val USFEET: typings.ol.unitsMod.Units.USFEET with String = js.native
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
}
